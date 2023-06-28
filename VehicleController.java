package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.module.Vehicle;
import com.example.demo.module.VehicleAdmin;
import com.example.demo.service.VehicleService;

//---------------------------------------------Start---------------------------------------------------//
@CrossOrigin(origins = "http://127.0.0.1:5500") // <- Permission Allowed for this Origin
@RestController
public class VehicleController {

	@Autowired
	VehicleService vSer;
	
//-----------------------------------------Login--------------------------------------------//
	@GetMapping("login") // 
	ResponseEntity<VehicleAdmin> home(@RequestBody String data, String password) {
		return new ResponseEntity<VehicleAdmin>(vSer.logIn(data, password), HttpStatus.FOUND);
	}
	
//-----------------------------------------Add--------------------------------------------//
	@PostMapping("addVehicle")
	ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vel){
		return new ResponseEntity<Vehicle>(vSer.addVehicle(vel),HttpStatus.CREATED);
	}
	
//-----------------------------------------Delete-----------------------------------------//
	@DeleteMapping("deleteById")
	ResponseEntity<Vehicle> deleteById(@RequestHeader Integer vId){
		return new ResponseEntity<Vehicle>(vSer.deleteById(vId), HttpStatus.ACCEPTED);
	}
	
//-----------------------------------------Find------------------------------------------//
	@GetMapping("findAll")
	ResponseEntity<List<Vehicle>> findAll(){
		return new ResponseEntity<List<Vehicle>>(vSer.findAll(), HttpStatus.FOUND);
	}
	
	@GetMapping("findById") // @RequestParam -> it will show the input Details in URL
	ResponseEntity<Vehicle> findById(@RequestHeader Integer vId){
		return new ResponseEntity<Vehicle>(vSer.findById(vId), HttpStatus.FOUND);
	}
	
	@GetMapping("findByColor") // @RequestHeader -> it will not show the input Details in URL(Privacy)
	ResponseEntity<List<Vehicle>> findByColor(@RequestHeader String vColor){
		return new ResponseEntity<List<Vehicle>>(vSer.findByColor(vColor), HttpStatus.FOUND);
	}
	
	@GetMapping("findByPriceMoreThan")
	ResponseEntity<List<Vehicle>> findByPriceMoreThan(@RequestHeader Double vPrice){
		return new ResponseEntity<List<Vehicle>>(vSer.findByPriceMoreThan(vPrice), HttpStatus.FOUND);
	}
	
	@GetMapping("findByPriceLessThan")
	ResponseEntity<List<Vehicle>> findByPriceLessThan(@RequestHeader Double vPrice){
		return new ResponseEntity<List<Vehicle>>(vSer.findByPriceLessThan(vPrice), HttpStatus.FOUND);
	}
	
//-----------------------------------------Sort------------------------------------------//
	@GetMapping("sortByVprice")
	ResponseEntity<List<Vehicle>> sortByPrice(){
		return new ResponseEntity<List<Vehicle>>(vSer.sortByPrice(), HttpStatus.FOUND);
	}
	
	@GetMapping("sortByPriceColor")
	ResponseEntity<List<Vehicle>> sortByPriceColor(){
		return new ResponseEntity<List<Vehicle>>(vSer.sortByPriceColor(), HttpStatus.FOUND);
	}
	
//-----------------------------------------Update----------------------------------------//
	@PutMapping("updateVehicle")
	ResponseEntity<Vehicle> updateVehicle(@RequestBody Vehicle vel){
		return new ResponseEntity<Vehicle>(vSer.updateVehicle(vel), HttpStatus.ACCEPTED);
	}

	@PutMapping("updateName")
	ResponseEntity<Vehicle> updateName(@RequestBody Vehicle v1){
		return new ResponseEntity<Vehicle>(vSer.updateName(v1), HttpStatus.ACCEPTED);
	}
	
	@PutMapping("updateModel")
	ResponseEntity<Vehicle> updateModel(@RequestBody Vehicle v1){
		return new ResponseEntity<Vehicle>(vSer.updateModel(v1), HttpStatus.ACCEPTED);
	}
	
	@PutMapping("updateColor")
	ResponseEntity<Vehicle> updateColor(@RequestBody Vehicle v1){
		return new ResponseEntity<Vehicle>(vSer.updateColor(v1), HttpStatus.ACCEPTED);
	}
	
	@PutMapping("updatePrice")
	ResponseEntity<Vehicle> updatePrice(@RequestBody Vehicle v1){
		return new ResponseEntity<Vehicle>(vSer.updatePrice(v1), HttpStatus.ACCEPTED);
	}
	
	@PutMapping("updateImage")
	ResponseEntity<Vehicle> updateImage(@RequestBody Vehicle v1){
		return new ResponseEntity<Vehicle>(vSer.updateImage(v1), HttpStatus.ACCEPTED);
	}
	
}
//-------------------------------------------------------End-------------------------------------------------------//
