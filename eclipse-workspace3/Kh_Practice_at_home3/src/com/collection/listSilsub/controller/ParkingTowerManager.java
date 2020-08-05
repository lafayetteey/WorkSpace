package com.collection.listSilsub.controller;

import java.util.ArrayList;

import com.collection.listSilsub.model.Car;

public class ParkingTowerManager {
	ArrayList<Car> carList = new ArrayList<>();

	public void insertCar(Car car) {
		int lastNo =0;
		try {
			 lastNo = carList.get(carList.size() -1).getParkingNum() +1;
		} catch (IndexOutOfBoundsException e) {
			lastNo = 1;
		}
		car.setParkingNum(lastNo);
		carList.add(car);
	}
	
	
	public ArrayList<Car> selectList() {
		return carList;
	}
	
	
}
