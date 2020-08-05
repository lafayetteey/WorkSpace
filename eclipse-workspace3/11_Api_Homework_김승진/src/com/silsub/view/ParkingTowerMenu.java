package com.silsub.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.silsub.controller.ParkingTowerManager;
import com.silsub.model.Car;

public class ParkingTowerMenu {
	Scanner sc = new Scanner(System.in);
	ParkingTowerManager ptm = new ParkingTowerManager();

	public ParkingTowerMenu() {
	}

	public void mainMenu() {
		int num = 0;
		System.out.println("=== * 주차 타원 관리 * ===");
		while (true) {
			System.out.println("1. 차량 주차");
			System.out.println("2. 전체 출력");
			System.out.println("3. 출차");
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
				break;
			default:
				System.out.println("잘못입력하셨습니다. 재입력해주세요");
			}
		}
	}

	private void insertCar() {
		System.out.println("차량 번호");
		int carNum = sc.nextInt();
		System.out.println("차량타입 : 1. 경차  / 2. 세단 / 3. SUV / 4. 트럭");
		int carType = sc.nextInt();
		System.out.println("차주");
		String owner = sc.next();
		Car car = new Car(carNum, carType, owner);
		ptm.insertCar(car);
	}

	private void selectMap() {
		HashMap<Integer, Car> alist = ptm.selectMap();

		if (alist.isEmpty()) {
			System.out.println("주자된 차량이 없습니다.");
		} else {
			Set<Entry<Integer, Car>> setent = alist.entrySet();
			Iterator<Entry<Integer, Car>> iter = setent.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next().toString());
			}
		}
	}

	private void deleteCar() {
		System.out.println("차량 번호");
		int carNum = sc.nextInt();
		int res = ptm.deleteCar(carNum);

		if (res != 0) {
			System.out.println("차량 출차 완료");
		} else {
			System.out.println("입력하신 차량이 주차되어 있지 않습니다.");
		}

	}

	private void searchCar() {
		System.out.println("주차 차량 검색(차주입력) : ");
		String owner = sc.next();
		ptm.searchMap(owner);
		int key =0 ;
		Car car = null;
		
		Map<Integer, Car> searchMap = ptm.searchMap(owner);
		
		if (searchMap == null) {
			System.out.println("검색한 차량이 주차되어 있지 않습니다");
		} else {
			Set<Map.Entry<Integer, Car>> setList = searchMap.entrySet();
			Iterator<Map.Entry<Integer , Car>> iter = setList.iterator();
			while(iter.hasNext()) {
				Map.Entry<Integer, Car> mList = iter.next();
				key = mList.getKey();
				car = mList.getValue();
				System.out.println(key);
				System.out.println(car);
			}
		}

	}
}
