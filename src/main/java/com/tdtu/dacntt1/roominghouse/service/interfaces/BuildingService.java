package com.tdtu.dacntt1.roominghouse.service.interfaces;

import java.util.List;

import com.tdtu.dacntt1.roominghouse.exception.BuildingNotFoundException;
import com.tdtu.dacntt1.roominghouse.model.Building;

public interface BuildingService {
	public Building addBuilding(Building building);
	
	public List<Building> getAllBuilding();
	
	
	public Building findBuildingById(Integer id) throws BuildingNotFoundException;
	
	
	public Building updateBuilding(Building building);
	
	
	public void deleteBuilding(Integer id);
	
}
