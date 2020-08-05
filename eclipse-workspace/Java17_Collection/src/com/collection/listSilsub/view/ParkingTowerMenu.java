package com.collection.listSilsub.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.collection.listSilsub.controller.ParkingTowerManager;
import com.collection.listSilsub.model.Car;

public class ParkingTowerMenu {
	Scanner sc = new Scanner(System.in);
	ParkingTowerManager ptm = new ParkingTowerManager();
	
	public ParkingTowerMenu() {
		
	}
	public void mainMenu() {
		int num = 0;
		do {
			System.out.println("=== * 주차 타원 관리 * ===");
			System.out.println("1. 차량 주차");
			System.out.println("2. 전체 출력");
			System.out.println("3. 출차");
			System.out.println("4. 차량 검색");
			System.out.println("0. 끝내기");
			System.out.println();
			System.out.print("메뉴 선택 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : insertCar(); break;
			
			case 2 : selectList(); break;
			
			case 3 : deleteCar(); break;
			
			case 4 : searchCar(); break;
			
			case 0 : 
				System.out.println("프로그램 종료");
				return;
			}
		} while(num < 4);
		
		
		
	}
	private void searchCar() {
		System.out.println("주차 차량 검색(차주 입력) : " );
		String owner = sc.next();
		List searchList = ptm.searchCar(owner);
		if(searchList.isEmpty()) {
			System.out.println("검색한 차량이 존재 하지 않습니다."); 
		} else {
			for(int i=0; i<searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}
//	public void deleteCar() {
//		ArrayList<Car> own = ptm.selectList();
//		System.out.println("출차 시킬 차량번호 입력 : ");
//		int carNum = sc.nextInt();
//		int res = ptm.deleteCar(carNum);
//		
//		if(res >0) {
//			System.out.println("차량 출차 완료");
//		} else {
//			System.out.println("입력하신 차량이 주차되어있지 않습니다.");
//		}
//	
//	}
	public void insertCar() {
		System.out.println("차량 번호 :");
		int carNum = sc.nextInt();
		System.out.println("차량 타입(1.경차 / 2. 세단 / 3. SUV / 4.트럭)");
		int carType = sc.nextInt();
		System.out.println("차주 : ");
		String owner = sc.next();
		
		Car car = new Car(carNum , carType , owner);
		ptm.insertCar(car);
		
	}
	public void selectList() {
		ArrayList<Car> clist = ptm.selectList();
		if(clist.isEmpty()) {
			System.out.println("주차 된 차량이 없습니다.");
		} else {
			for(int i=0; i<clist.size(); i++) {
				System.out.println(clist.get(i).toString());
			}
		}
	}
	public void deleteCar() {
		System.out.println("출차 시킬 차량의 차주 입력");
		String owner = sc.next();
		ArrayList<Car> clist = ptm.selectList();
		for(int i=0; i<clist.size(); i++) {
			if(clist.get(i).getOwner().equals(owner)) {
				clist.remove(i);
			}
		}
	}
}
