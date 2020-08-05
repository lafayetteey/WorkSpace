package com.arryList.silsub.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.arrayList.silsub_controller.ParkingTowerManager;
import com.arrayList.silsub_model.Car;

public class ParkingTowerMenu {
	Scanner sc = new Scanner(System.in);
	ParkingTowerManager ptm = new ParkingTowerManager();
	
	public ParkingTowerMenu() {}
	
	public void mainMenu() {
		
		int num = sc.nextInt();
		while(true) {
			System.out.println("===* 주차 타워 관리 *===");
			System.out.println("1. 차량 주차");
			System.out.println("2. 전체 출력");
			System.out.println("0. 끝내기");
			System.out.println("메뉴 선택 : ");
			switch(num) {
			case 1 : insertCar(); break;
			case 2 : selectList(); break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : 
				System.out.println("잘못 입력했습니다. 재 입력해주세요");
			}
		}
		
	}
	public void insertCar() {
		System.out.println("차량번호 :");
		int carNum = sc.nextInt();
		System.out.println("차량의 타입(1. 경차 / 2.세단 / 3.SUV /4.트럭)");
		int carType = sc.nextInt();		
		System.out.println("차주");
		String owner = sc.next();
		
		Car car = new Car(carNum , carType , owner);
		ptm.insertCar(car);	
	}
	public void selectList() {
		ArrayList<Car> alist = ptm.selecList();
		
		if(alist.isEmpty() ) {
			System.out.println("주차된 차량이 없습니다.");
		} else {
			for(int i=0; i<alist.size(); i++) {
				System.out.println(alist.get(i).toString());
			}
		}
	}
}
