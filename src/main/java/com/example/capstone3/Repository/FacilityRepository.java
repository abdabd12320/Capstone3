package com.example.capstone3.Repository;

import com.example.capstone3.Model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacilityRepository extends JpaRepository<Facility,Integer> {

    Facility findFacilityById(Integer id);

    List<Facility> findFacilityByCity(String city);
}