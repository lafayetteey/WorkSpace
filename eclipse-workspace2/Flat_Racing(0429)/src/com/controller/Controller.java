package com.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.model.money;

public class Controller {

	
	public static ArrayList<String> list = new ArrayList();
	
	
	public void pm(money mo) {

		//배팅인원수
		int all = mo.getP1()+mo.getP2()+mo.getP3()+mo.getP4();
		mo.setAll(all);
		
		//총배팅금액
		int allm = mo.getAll()*500;
		mo.setAllm(allm);
				
		int a;
		int b;
		int c;
		int d;
				
		String p1m;
		String p2m;
		String p3m;
		String p4m;

		if(mo.getP1() == 0) {
			p1m = "선택자 없음";
		}else {
			a = mo.getAllm()/mo.getP1();
			p1m= ""+a+"원 수령"+"\n";		
		}
		
		if(mo.getP2() == 0){
			p2m = "선택자 없음";
		}else {
			b = mo.getAllm()/mo.getP2();
			p2m=""+b+"원 수령"+"\n";
		}
		
		if(mo.getP3() == 0) {
			p3m = "선택자 없음";
		}else {
			c = mo.getAllm()/mo.getP3();
			p3m=""+c+"원 수령"+"\n";
		}
		
		if(mo.getP4() == 0) {
			p4m = "선택자 없음";
		}else {
			d = mo.getAllm()/mo.getP4();
			p4m =""+d+"원 수령"+"\n";
		}
		
		

		mo.setP1m(p1m);
		mo.setP2m(p2m);
		mo.setP3m(p3m);
		mo.setP4m(p4m);
		
		list.add(p1m);
		list.add(p2m);
		list.add(p3m);
		list.add(p4m);
		
	}


	public StringBuilder fileOpen() {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader
					(new FileReader("race.txt"));
			
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append("\n");
				sb.append(line);
				System.out.println(sb);
			}	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return sb;
	}
		


	public String rank(money mo) {
	
		
		String rank ="";
		String r =mo.getMoney();
		System.out.println("r:"+r);
		switch(r) {
		
		case "피카츄": 
			rank =""+ r+" 우승입니다. "+list.get(0) ;
			break;
		case "캐터피": 
			rank =""+ r+" 우승입니다. "+list.get(1);
			break;
		case "토개피": 
			rank =""+ r+" 우승입니다. "+list.get(2) ;
			break;
		case "롱스톤": 
			rank =""+ r+" 우승입니다. "+list.get(3) ;
			break;
		}
		
		return rank;
	
	}


}	
		

