package com.test.oi.part04_objectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjStream {
	public void fileSave() {
		Member[] marr = {
		 new Member("user1","1233" , "홍길동" , "kh@gmail.com" , 27 , 'm' ),
		 new Member("user2","1234" , "김승진" , "kh1@gmail.com" , 33 , 'm' ),
		 new Member("user1","1235" , "김길순" , "kh2@gmail.com" , 30 , 'm' )
		};
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("member.txt"));){
			for(int i=0; i<marr.length; i++) {
				objOut.writeObject(marr[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		Member[] marr = new Member[3];
		try(ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("member.txt"));) {
			for(int i=0; i<marr.length; i++) {
				marr[i] = (Member)objIn.readObject();
			}
			for(Member mar : marr) {
				System.out.println(mar);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
