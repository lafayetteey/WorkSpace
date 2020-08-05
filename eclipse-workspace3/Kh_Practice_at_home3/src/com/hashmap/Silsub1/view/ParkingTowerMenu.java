package com.hashmap.Silsub1.view;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.hashmap.Silsub1.controller.ParkingTowerManager;
import com.hashmap.Silsub1.model.Car;

public class ParkingTowerMenu {
	Scanner sc = new Scanner(System.in);
	ParkingTowerManager ptm = new ParkingTowerManager();

	public void mainMenu() {
		int num =0;
		while(true) {
			System.out.println("==주차 타워 관리==");
			System.out.println("1. 차량 주차");
			System.out.println("2. 전체 출력");
			System.out.println("3. 차량 출차");
			System.out.println("4. 주차 차량 검색");
			System.out.println("0. 끝내기");
			System.out.println();
			System.out.println("메뉴 선택 : ");			
			num = sc.nextInt();
			
			switch(num) {
			case 1 : insertCar(); break;
			case 2 : selectMap(); break;
			case 3 : deleteCar(); break;
			case 4 : searchCar(); break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : 
				System.out.println("잘못 선택하셨습니다. 다시 선택 해주세요");		
			}
		}
	}
	
	public void insertCar() {
		System.out.println("차량번호 ");
		int carNum = sc.nextInt();
		System.out.println("차량 타입(1. 경차 / 2. 세단 / 3. SUV / 4. 트럭) ");
		int carType = sc.nextInt();
		System.out.println("차주 : ");
		String owner = sc.next();
		Car car = new Car(carNum , carType , owner);
		ptm.insertCar(car);
	}
	
	public void selectMap() {
		Map<Integer, Car> mlist = ptm.selectMap();
		if(mlist.isEmpty() ) {
			System.out.println("주차된 차량이 없습니다.");
		} else {
			Iterator<Entry<Integer, Car>> carlist = mlist.entrySet().iterator();
			while(carlist.hasNext())
				System.out.println(carlist.next().toString());
		}
	}
	public void deleteCar() {
		System.out.println("출차 시킬 차량 번호 : ");
		int carNum = sc.nextInt();
		int res = 0;
		ptm.deleteCar(carNum);
		if(res > 0) {
			System.out.println("입력하신 차량이 주차되어 있지 않습니다.");
		} else {
			System.out.println("출차 완료");
		}
	}
	public void searchCar() {
		System.out.println("차주 입력 :");
		String owner = sc.next();
		ptm.searchCar(owner);
		
		Map<Integer, Car > searchMap = ptm.searchCar(owner);
		if(searchMap.isEmpty()) {
			System.out.println("검색한 차량이 주차되어 있지 않습니다");
		} else {
			Iterator iter = searchMap.entrySet().iterator();
			while(iter.hasNext()) {
				System.out.println(iter.toString());
			}
		}
			
		
	}
	
}
