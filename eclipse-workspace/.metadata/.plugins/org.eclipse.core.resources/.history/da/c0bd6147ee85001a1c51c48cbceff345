package com.collection.hashMapSilsub.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.collection.hashMapSilsub.model.Car;

public class ParkingTowerManager {
	HashMap<Integer, Car> carMap = new HashMap<>();
	int parkingNo = 0;

	public ParkingTowerManager() {
	}

	public void insertCar(Car car) {
		carMap.put(parkingNo, car);
		parkingNo++;
	}
	

	public HashMap<Integer, Car> selectMap() {
		return carMap;
	}

	public int deleteCar(int carNum) {
		int[] iarr = new int[100];
		int res =0;
		int i=0;
		int count = 0;
		
		for (Map.Entry<Integer, Car> entry : carMap.entrySet()) {
			Car car = entry.getValue();
			int num = entry.getKey();
			if(car.getCarNum() == carNum) {
				iarr[i] = num;
				i++;
				res=1;
				count++;
			}
		}
		for(int j=0; j < count; j++) {
			carMap.remove(iarr[j]);
		}
		return res;
	}
		
	
	public int deleteCar1(int carNum) {
		Car del = null;
		int key = 0;
		
		Set<Entry<Integer, Car>> entry = carMap.entrySet();
		Iterator<Entry<Integer , Car>> iter = entry.iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer, Car> entrys = iter.next();
			if(entrys.getValue().getCarNum()==carNum) {
				del = entrys.getValue();
				key = entrys.getKey();
			}
		}
		carMap.remove(key);
		
		if (del != null) {
			return 1;
		} else {
			return 0;
		}
	}

	public Map<Integer, Car> searchMap(String owner) {
		Map<Integer, Car> searchMap = new HashMap<>();
		Iterator<Entry<Integer, Car>> keys = carMap.entrySet().iterator();
		while (keys.hasNext()) {
			Map.Entry<Integer, Car> entry = (Map.Entry<Integer, Car>) keys.next();
			if(entry.getValue().getOwner().equals(owner)) {
				searchMap.put(entry.getKey(), entry.getValue());
			}
		}

		return searchMap;
	}

}
