package com.collection.listSilsub.controller;

import java.util.ArrayList;
import java.util.List;

import com.collection.listSilsub.model.Car;

public class ParkingTowerManager {
	ArrayList<Car> carList = new ArrayList<>();

	public ParkingTowerManager() {
	}
	

	public void insertCar(Car car) {
		int lastNo = 0;
		try {
			lastNo = carList.get(carList.size() -1).getParkingNum()+1;
		} catch (IndexOutOfBoundsException e) {
			lastNo = 1;
		}
	}
	
	public ArrayList<Car> selectList() {
		
		return carList;
	}

	public int deleteCar(int carNum) {
		Car del = null;
		for(int i=0; i<carList.size(); i++) {
			if(carList.get(i).getCarNum() == carNum) {
				del = carList.remove(i);
			}
		}
		if(del != null) {
			return 1;
		} else {
			return 0;
		}
	}


	public List<Car> searchCar(String owner) {
		List<Car> searchList = new ArrayList<>();
		for(int i=0; i<carList.size(); i++) {
			if(carList.get(i).getOwner().equals(owner)) {
				searchList.add(carList.get(i));			
			}
		}
		return searchList;
	}
}
