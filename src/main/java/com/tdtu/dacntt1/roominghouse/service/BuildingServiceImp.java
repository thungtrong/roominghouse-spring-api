package com.tdtu.dacntt1.roominghouse.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tdtu.dacntt1.roominghouse.exception.BuildingNotFoundException;
import com.tdtu.dacntt1.roominghouse.model.Building;
import com.tdtu.dacntt1.roominghouse.repo.BuildingRepository;
import com.tdtu.dacntt1.roominghouse.service.interfaces.BuildingService;

@Service
@Transactional
public class BuildingServiceImp implements BuildingService{
	private final BuildingRepository buildingRepo;
	
	@Autowired
	public BuildingServiceImp(BuildingRepository buildingRepository) {
		// TODO Auto-generated constructor stub
		this.buildingRepo = buildingRepository;
	}
	
	// CRUD	
	public Building addBuilding(Building building)
	{
		return buildingRepo.save(building);
	}
	
	public List<Building> getAllBuilding()
	{
		return buildingRepo.findAll();
	}
	
	public Building findBuildingById(Integer id) throws BuildingNotFoundException
	{
		return buildingRepo.findById(id).orElseThrow(
				() -> new BuildingNotFoundException(String.format("Not found building have a id = %s", id)));
	}
	
	public Building updateBuilding(Building building)
	{
		return buildingRepo.save(building);
	}
	
	public void deleteBuilding(Integer id)
	{
		buildingRepo.deleteById(id);
	}
	
}
