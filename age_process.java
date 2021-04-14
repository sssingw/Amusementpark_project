package amuse;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class age_process {

	Calendar cd = Calendar.getInstance();
	Date d = new Date();
	
	
	public static int ageProcess(String regnum) {	
		amuse_Input ai = new amuse_Input();
		age_process ag = new age_process();
		int year_process2 = 0;
		int age_type = 0;
		String sub_regnum = ai.Input_regnum(regnum).substring(0,1);
		
		if (sub_regnum.equals("0")) {
			String year_process1 = "20" + sub_regnum;
			year_process2 = Integer.parseInt(year_process1);
			ag.ageType(year_process2);
			
		} else {
			String year_process1 = "19" + sub_regnum;
			year_process2 = Integer.parseInt(year_process1);
			ag.ageType(year_process2);
		} 
		return year_process2;	
	}
	
	public static int ageType(int age_year) {
		age_process ag = new age_process();
		int age = 2021 - age_year + 1;
		int age_type = 0;
			if (19 <= age && age <= 64) {
				age_type = constvalue.adult; 
			} else if (13 <= age && age <= 18) {			
				age_type = constvalue.student;
			} else if (3 <= age && age <= 12) {
				age_type = constvalue.child;
			} else if (65 <= age) {
				age_type = constvalue.senior;
			} else if (age <= 2) {
				age_type = constvalue.baby;
			}			
		return age_type;
	}
}
	

