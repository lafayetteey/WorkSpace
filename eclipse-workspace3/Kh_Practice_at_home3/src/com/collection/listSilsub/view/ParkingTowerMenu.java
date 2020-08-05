package com.collection.listSilsub.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.collection.listSilsub.controller.ParkingTowerManager;
import com.collection.listSilsub.model.Car;

public class ParkingTowerMenu {
	Scanner sc = new Scanner(System.in);
	ParkingTowerManager ptm = new ParkingTowerManager();

	public void mainMenu() {
		int num = 0;
		while (num < 4) {
			System.out.println("====* 주차 타워 관리*====");
			System.out.println("1. 차량 주차");
			System.out.println("2. 전체 출력");
			System.out.println("0. 끝내기");
			System.out.println("메뉴 선택 : ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				insertCar();
				break;
			case 2:
				selectList();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 재 입력해주세요");
			}
		}
	}

	public void insertCar() {
		System.out.println("차량 번호 : ");
		int carNum = sc.nextInt();
		System.out.println("차량의 타입 (1. 경차 / 2. 세단 / 3. SUV / 4. 트럭) ");
		int carType = sc.nextInt();
		System.out.println("차주 이름 : ");
		String owner = sc.next();

		Car car = new Car(carNum, carType, owner);
		ptm.insertCar(car);
	}

	public void selectList() {
		ArrayList<Car> alist = ptm.selectList();

		if (alist.isEmpty()) {
			System.out.println("주차된 차량이 없습니다.");
		} else {
			for (int i = 0; i < alist.size(); i++) {
				System.out.println(alist.get(i).toString());
			}
		}
	}
}
