package com.collection.hashMapSilsub.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.collection.hashMapSilsub.controller.ParkingTowerManager;
import com.collection.hashMapSilsub.model.Car;

public class ParkingTowerMenu {
	Scanner sc = new Scanner(System.in);
	ParkingTowerManager ptm = new ParkingTowerManager();

	public ParkingTowerMenu() {

	}

	public void mainMenu() {
		int num = 0;
		while(num<5) {
			System.out.println("=== * 주차 타워 관리 * ===");
			System.out.println("1. 차량 주차");
			System.out.println("2. 전체 출력");
			System.out.println("3. 차량 출차");
			System.out.println("4. 차량 검색");
			System.out.println("0. 끝내기");
			System.out.println();
			System.out.print("메뉴 선택 : ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				insertCar();
				break;
			case 2:
				selectMap();
				break;
			case 3:
				deleteCar();
				break;
			case 4:
				searchCar();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 선택하셨습니다. 다시 선택해 주세요");
			}
		} 
	}
	
	public void insertCar() {
		System.out.println("차량 번호 :" );
		int carNum = sc.nextInt();
		System.out.println("차량의 타입 (1. 경차 / 2. 세단 / 3. SUV / 4. 트럭)");
		int carType = sc.nextInt();
		System.out.println("차주 이름: ");
		String owner = sc.next();
		
		Car car = new Car(carNum , carType , owner);
		ptm.insertCar(car);
	}

	public void selectMap() {
		HashMap<Integer , Car> hmap = ptm.selectMap();
		if(hmap.isEmpty()) {
			System.out.println("주차된 차량이 없습니다.");
		} else {
			Iterator<Integer> keys = hmap.keySet().iterator();
			while( keys.hasNext()) {
				int key = keys.next();
				System.out.println("주차번호 : " + key + hmap.get(key).toString());
			}
		}
	}
	
	public void deleteCar() {
		System.out.println("출차 할 차량 번호 : ");
		int carNum = sc.nextInt();
		int res =ptm.deleteCar(carNum);
		
		if(res > 0) {
			System.out.println("차량 출차 완료");
		} else {
			System.out.println("입력하신 차량이 주차되어 있지 않습니다.");
		}
	}

	public void searchCar() {
		System.out.println("주차 차량 검색 (차주 입력) : ");
		String owner = sc.next();
		Map<Integer, Car> searchMap = ptm.searchMap(owner);
		if(searchMap.isEmpty()) {
			System.out.println("검색한 차량이 존재 하지 않습니다.");
		} else {
			Iterator iter = searchMap.entrySet().iterator();
			while(iter.hasNext()) {
				Map.Entry<Integer , Car> entry = (Entry<Integer, Car>) iter.next();
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	} 
}
