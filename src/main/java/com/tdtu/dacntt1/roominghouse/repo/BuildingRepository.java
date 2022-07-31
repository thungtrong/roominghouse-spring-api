package com.tdtu.dacntt1.roominghouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.tdtu.dacntt1.roominghouse.model.Building;

public interface BuildingRepository extends JpaRepository<Building, Integer> {
}
