package com.tdtu.dacntt1.roominghouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdtu.dacntt1.roominghouse.exception.BuildingNotFoundException;
import com.tdtu.dacntt1.roominghouse.model.Building;
import com.tdtu.dacntt1.roominghouse.service.BuildingServiceImp;

@RestController
@RequestMapping("api/buildings")
public class BuldingController {
	
	private final BuildingServiceImp buildingService;
	
	@Autowired
	public BuldingController(BuildingServiceImp buildingService) {
		super();
		this.buildingService = buildingService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Building> addBuilding(@RequestBody Building building)
	{
		building = buildingService.addBuilding(building);
		return new ResponseEntity<Building>(building, HttpStatus.CREATED); 
	}
	
	@GetMapping("/all")
	public ResponseEntity<Iterable<Building>> findAllBuildind()
	{
		Iterable<Building> buildings = buildingService.getAllBuilding();
		return new ResponseEntity<Iterable<Building>>(buildings, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Building> findBuildingById(@PathVariable Integer id)
	{
		Building building;
		try {
			building = buildingService.findBuildingById(id);
		} catch (BuildingNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<Building>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Building>(building, HttpStatus.OK);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Building> updateBuiding(@RequestBody Building building)
	{
		building = buildingService.updateBuilding(building);
		return new ResponseEntity<Building>(building, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteBuildingById(@PathVariable Integer id)
	{
		buildingService.deleteBuilding(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
