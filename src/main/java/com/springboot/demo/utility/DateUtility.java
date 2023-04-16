package com.springboot.demo.utility;

import java.sql.Timestamp;
import java.util.Date;

public class DateUtility {

	public DateUtility() {
		// TODO Auto-generated constructor stub
	}
	
	public static Date getCurrentDate() {
		return new Date();
	}
	
	public static Timestamp getCurrentTimestamp() {
		return new Timestamp(System.currentTimeMillis());
	}

}
