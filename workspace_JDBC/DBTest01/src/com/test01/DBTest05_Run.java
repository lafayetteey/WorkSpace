package com.test01;

import java.sql.SQLException;

public class DBTest05_Run {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DBTest05 db = new DBTest05();
		
		db.insert();
		//db.delete();
		//db.selectAll();
		//db.selectOne();
	}

}
