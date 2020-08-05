package com.obj.silsub.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectTest {
	
	public void fileSave() {
		Member marr[] = {
				new Member("user1" , "user11" , "김승진" , 30 , 'm'),
				new Member("user2" , "user12" , "황인선" , 48 , 'm'),
				new Member("user3" , "user13" , "김태룡" , 34, 'm')
		};
		try(ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("member.txt"));) {
			for(int i=0; i<marr.length; i++) {
				objOut.writeObject(marr[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void fileOpen() {
		Member[] marr = new Member[3];
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("member.txt"));){
			for(int i=0; i<marr.length; i++) {
				marr[i] = (Member) objIn.readObject();
			}
			for(Member ma : marr) {
				System.out.println(ma);
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
