package project;


import java.util.Calendar;
import java.util.Date;


public class amuse_age {
				
	Calendar cd = Calendar.getInstance();
	Date d = new Date();


	public static int ageProcess(String regnum) {			
		int year_process2 = 0;		
		String sub_regnum = regnum.substring(0,2);
		String sub_regnum1 = sub_regnum.substring(0,1);
		
		if (sub_regnum1.equals("0")) {
			String year_process1 = "20" + sub_regnum;
			year_process2 = Integer.parseInt(year_process1);
			

		} else {
			String year_process1 = "19" + sub_regnum;
			year_process2 = Integer.parseInt(year_process1);
			
		} 
		return year_process2;	
	}

	public static int ageType(int age_year) {		
		int age = 2021 - age_year + 1;
		int age_type = 0;
		
			if (19 <= age && age <= 64) {
				age_type = 1; 
			} else if (13 <= age && age <= 18) {			
				age_type = amuse_const.student;
			} else if (3 <= age && age <= 12) {
				age_type = amuse_const.child;
			} else if (65 <= age) {
				age_type = amuse_const.senior;
			} else if (age <= 2) {
				age_type = amuse_const.baby;
			}			
		return age_type;
	}
}