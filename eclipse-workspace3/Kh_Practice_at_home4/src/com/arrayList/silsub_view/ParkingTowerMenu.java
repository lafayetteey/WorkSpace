package com.arrayList.silsub_view;

import java.util.ArrayList;
import java.util.Scanner;

import com.arrayList.silsub_controller.ParkingTowerManager;
import com.arrayList.silsub_model.Car;

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
			case 1: insertCar();break;
			case 2:selectList();break;
			case 3:deleteCar();break;
			case 4:searchCar();break;
			case 0: System.out.println("프로그램 종료"); break;
			default  : System.out.println("잘못입력하셨습니다. 재입력해주세요");
			}
		}
	}

	public void searchCar() {
		System.out.println("차주 입력");
		String owner = sc.next();
		ArrayList<Car> searchList = ptm.searhCar(owner);
		
		if(searchList.isEmpty()) {
			System.out.println("검색한 차량이 주차되어 있지 않습니다.");
		} else {
			for(int i=0; i<searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}

	public void deleteCar() {
		System.out.println("차량번호:");
		int carNum = sc.nextInt();
		int res = ptm.deleteCar(carNum);
		
		if(res > 0) {
			System.out.println("출차 완료.");
		} else {
			System.out.println("입력하신 차량이 주차되어 있지 않습니다.");
		}
	}

	public void insertCar() {
		System.out.println("차량 번호 :");
		int carNum = sc.nextInt();
		System.out.println("차량 타입(1. 경차 / 2. 세단 / 3. SUV / 4.트럭)");
		int carType =sc.nextInt();
		System.out.println("차주");
		String owner = sc.next();
		
		Car car = new Car(carNum , carType , owner);
		ptm.insertCar(car);
	}

	public void selectList() {
		ArrayList<Car> alist = ptm.selecList();	
		
		if(alist.isEmpty()) {
			System.out.println("주차된 차량이 없습니다.");
		} else {
			for(int i=0; i<alist.size(); i++) {
				System.out.println(alist.get(i).toString());
			}
		}
		
		
		
	}
}
