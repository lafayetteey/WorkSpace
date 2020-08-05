package com.collection.listSilsub.view;

import java.util.List;
import java.util.Scanner;

import com.collection.listSilsub.controller.PTManagerbyTeacher;
import com.collection.listSilsub.model.Car;

public class PTMenubyTeacher {
	Scanner sc = new Scanner(System.in);
	PTManagerbyTeacher ptm = new PTManagerbyTeacher();

	public void mainMenu() {
		int num = 0;
		do {
		
		System.out.println("===주차 타워 관리===");
		System.out.println("1. 차량 주차");
		System.out.println("2. 전체 출력");
		System.out.println("0. 끝내기");
		System.out.println();
		System.out.println("메뉴선택");
		num = sc.nextInt();
		
		switch(num) {
		case 1: 
			insertCar();
			break;
		case 2:
			selectList();
			break;
		case 0:
			System.out.println("프로그램 종료");
			return;
			}
		}while (num < 3);
		
		
		}

	public void insertCar() {
		System.out.println("차량번호 : ");
		int carNum = sc.nextInt();
		System.out.println("1. 경차 2.세단 3.SUV 4.트럭");
		int carType = sc.nextInt();
		System.out.println("차주: ");
		String owner = sc.next();
		
		Car car = new Car(carNum , carType , owner);
		ptm.insert(car);
	}

	public void selectList() {
		List<Car> searchList = ptm.selectList();
		if(searchList.isEmpty()) {
			System.out.println("주차된 차량이 없습니다.");
		} else {
			for(int i=0; i<searchList.size(); i++) {
				System.out.println(searchList.get(i).toString());
			}
		}
		
	}
}
