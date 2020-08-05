package com.hashmap.Silsub1.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.hashmap.Silsub1.model.Car;

public class ParkingTowerManager {
	Map<Integer, Car> carList = new HashMap<>();
	private int parkingNo;

	public ParkingTowerManager() {
	}

	public void insertCar(Car car) {
		carList.put(parkingNo, car);
		parkingNo++;
	}

	public Map<Integer, Car> selectMap() {
		return carList;
	}

	public int deleteCar(int carNum) {
		Car del = null;
		int key = 0;
		Set<Entry<Integer, Car>> carSet = carList.entrySet();
		Iterator<Entry<Integer, Car>> iter = carSet.iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer, Car> entrys = iter.next();
			if (entrys.getValue().getCarNum() == carNum) {
				del = entrys.getValue();
				key = entrys.getKey();
			}
		}
		carList.remove(key);
		if (del != null) {
			return 1;
		} else {
			return 0;
		}
	}

	public Map<Integer, Car> searchCar(String owner) {
		Map<Integer, Car> searchMap = new HashMap<>();
		Iterator<Entry<Integer, Car>> iter = searchMap.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer, Car> entry = iter.next();
				if (entry.getValue().getOwner().equals(owner)) {
					searchMap.put(entry.getKey(), entry.getValue());
			}
		}
		return searchMap;

	}

}
