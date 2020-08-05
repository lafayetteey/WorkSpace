package com.arryList.silsub.controller;

import java.util.ArrayList;

import com.arrayList.silsub_model.Car;

public class ParkingTowerManager {
	ArrayList<Car> carList = new ArrayList<>();
	
	public ParkingTowerManager() {}
	public void insertCar(Car car)  {
		int lastNo = 0;
		try {
			lastNo = carList.get(carList.size()-1).getParkingNum();
		} catch (Exception e) {
			lastNo =1;
		} 
	}
	public ArrayList<Car> selectList() {
		return carList;
		
	}
}
