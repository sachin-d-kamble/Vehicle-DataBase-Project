package com.example.demo.service;

import java.util.List;

import com.example.demo.module.Vehicle;
import com.example.demo.module.VehicleAdmin;
//-----------------------------------------Start--------------------------------------------//
public interface VehicleService {

//----------------------Login--------------------------------//
	
	VehicleAdmin logIn(String data, String password);
	
//----------------------Add--------------------------------//
	
	Vehicle addVehicle(Vehicle vel);
	
//----------------------Delete--------------------------------//
	
	Vehicle deleteById(Integer vId);
	
//----------------------Find--------------------------------//
	
	List<Vehicle> findAll();
	
	Vehicle findById(Integer vId);
	
	List<Vehicle> findByColor(String vColor);
	
	List<Vehicle> findByPriceMoreThan(Double vPrice);
	
	List<Vehicle> findByPriceLessThan(Double vPrice);
	
//------------------------Sort------------------------------//

	List<Vehicle> sortByPrice();
	
	List<Vehicle> sortByPriceColor(); // Find By Color -> FrontEnd
	
//----------------------Update-----------------------------//
	
	Vehicle updateVehicle(Vehicle vel);
	
	Vehicle updateName(Vehicle v1);
	
	Vehicle updateModel(Vehicle v1);
	
	Vehicle updateColor(Vehicle v1);
	
	Vehicle updatePrice(Vehicle v1);
	
	Vehicle updateImage(Vehicle v1);
	/* 
	 
	 
	 
	 
	 */
}
//-----------------------------------------End--------------------------------------------//

