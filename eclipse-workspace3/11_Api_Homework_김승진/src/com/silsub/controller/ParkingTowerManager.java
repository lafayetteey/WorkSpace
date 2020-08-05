package com.silsub.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.silsub.model.Car;

public class ParkingTowerManager {
	HashMap<Integer , Car> carMap = new HashMap<>();
	private int parkingNum;
	
	public void insertCar(Car car) {
		carMap.put(parkingNum, car);
		parkingNum++;
	}

	public HashMap<Integer , Car> selectMap() {
		return carMap;
	}

	public int deleteCar(int carNum) {
		Car del = null;
		int key = 0;
		Set<Entry<Integer, Car>> setList = carMap.entrySet();
		Iterator<Entry<Integer, Car>> iter = setList.iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer, Car> mapList = iter.next();
			if(mapList.getValue().getCarNum() == carNum) {
				key = mapList.getKey();
				del = mapList.getValue();
			}
		}
		carMap.remove(key);
		if(del != null) {
			return 1;
		} else {
			return 0;
		}
	}

	public Map<Integer, Car> searchMap(String owner) {
		int key = 0;
		Car car = null;
		Map<Integer , Car> searchMap = new HashMap<>();
		Iterator<Entry<Integer, Car>> setList = searchMap.entrySet().iterator();
		while(setList.hasNext()) {
			Map.Entry<Integer, Car> mapList = setList.next();
				key = mapList.getKey();
				car = mapList.getValue();
		}
		if(car.getOwner().equals(owner)) {
			searchMap.put(key, car);
			return searchMap;
		} else {
			return null;
		}
	}
	
}
