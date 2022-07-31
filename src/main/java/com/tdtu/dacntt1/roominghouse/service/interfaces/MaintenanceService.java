package com.tdtu.dacntt1.roominghouse.service.interfaces;

import java.util.List;

import com.tdtu.dacntt1.roominghouse.exception.MaintenanceNotFoundException;
import com.tdtu.dacntt1.roominghouse.model.Maintenance;


public interface MaintenanceService {
	public static final int pageSize=10;
	public static final String sortBy="id";
	
	public Maintenance addBuilding(Maintenance maintenance);
	
	public List<Maintenance> getAllBuilding();
	
	
	public Maintenance findBuildingById(Integer id) throws MaintenanceNotFoundException;
	
	
	public Maintenance updateBuilding(Maintenance maintenance);
	
	
	public void deleteBuilding(Integer id);
}
