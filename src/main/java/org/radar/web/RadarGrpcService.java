package org.radar.web;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.radar.dao.entities.Radar;
import org.radar.dao.repositories.RadarRepository;
import org.radar.feign.ImmatriculationRestController;
import org.radar.feign.InfracRestController;
import org.radar.model.Infraction;
import org.radar.model.Vehicle;
import org.radar.services.stubs.RadarServiceBuffer;
import org.radar.services.stubs.RadarServiceGrpc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@GrpcService
public class RadarGrpcService extends RadarServiceGrpc.RadarServiceImplBase {

    private final RadarRepository radarRepository;
    private final InfracRestController infracRestController;
    private final ImmatriculationRestController immatriculationRestController;

    public RadarGrpcService(RadarRepository radarRepository, InfracRestController infracRestController, ImmatriculationRestController immatriculationRestController) {
        this.radarRepository = radarRepository;
        this.infracRestController = infracRestController;
        this.immatriculationRestController = immatriculationRestController;
    }

    @Override
    public void getVehicleInfo(RadarServiceBuffer.RadarRequest request, StreamObserver<RadarServiceBuffer.Vehicle> responseObserver) {
        String radarId = request.getRadarId();
        String vehicle_license = request.getVehicleLicense();
        Double vehicle_velocity = request.getVehicleVelocity();
        System.out.println("test1");
        if (radarRepository.existsById(radarId)) {
            System.out.println("test2");
            Radar radar = radarRepository.findById(radarId).get();
            //System.out.println(vehicle_velocity + "to: " + radar.getMax_velocity());
            Vehicle vehicle = immatriculationRestController.getVehicle(vehicle_license);
            if (vehicle_velocity > radar.getMax_velocity()) {
                System.out.println("test3");
                RadarServiceBuffer.Vehicle vehicler = RadarServiceBuffer.Vehicle.newBuilder()
                        .setLicenseId(vehicle_license)
                        .setBrand(vehicle.getBrand())
                        .setFiscalPower(vehicle.getFiscalHorsepower())
                        .setModel(vehicle.getModel())
                        .setOwner(RadarServiceBuffer.Owner.newBuilder()
                                .setId(vehicle.getOwner().getId())
                                .setName(vehicle.getOwner().getName())
                                .setBirthDate(vehicle.getOwner().getBirthDate())
                                .setEmail(vehicle.getOwner().getEmail())
                                .build())
                        .build();
                responseObserver.onNext(vehicler);
                Infraction infraction = Infraction.builder()
                        .date(String.valueOf(LocalDate.now()))
                        .radar_id(radar.getId())
                        .radar_max_velocity(radar.getMax_velocity())
                        .vehicle_license(vehicle_license)
                        .vehicle_velocity(vehicle_velocity)
                        .cost(500.00)
                        .build();
                infracRestController.saveInfraction(infraction);


            }
        }
        responseObserver.onCompleted();
    }

}