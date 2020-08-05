package com.test.oi.part04_objectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStream  {

	public void fileSave() {
		Member[] marr = {
				new Member("user01" , "pass01" , "임꺽정", "Lim@khAcademy.com" , 19 , '남'),
				new Member("user02" , "pass02" , "이순신", "Lee@khAcademy.com" , 25 , '남') ,
				new Member("user03" , "pass03" , "홍길동", "Hong@khAcademy.com" , 33 , '남')			
		};
		
		try( ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("member.dat"))) {
			for(int i=0; i<marr.length; i++) {
				objOut.writeObject(marr[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		Member[] marr = new Member[3];
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("member.dat"))){
			for(int i=0; i<marr.length; i++) {
				marr[i] = (Member)objIn.readObject();
			}
			
			for(Member m : marr) {
				System.out.println(m);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
