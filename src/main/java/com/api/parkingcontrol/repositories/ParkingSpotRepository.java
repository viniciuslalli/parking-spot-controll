package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

// Uma interface para fornecer uma abstração de acesso a dados.

// Indetificador é o UUID
// Model é o ParkingSpotModel

//JPARepository já possui metodos prontos para transações com o banco de dados: Ex, uma listagem de um recurso, salvar, deletar, atualizar.

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
        boolean existsByLicencePlateCar(String licensePlateCar);
        boolean existsByParkingSpotNumber(String parkingSpotNumber);
        boolean existsByApartmentAndBlock(String apartment, String block);
}
