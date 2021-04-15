package project;

public class amuse_price {

	
	public static int day_rateprocess (int age_type, int pri_type, int count) {  //주간일 때
		int real_price = 0;		
		
		if (amuse_age.ageType(age_type) == amuse_const.adult) {  //대인일때
			real_price = amuse_dayrate.adult_priorProcess(amuse_input.Input_prior(pri_type));
						
		} else if (amuse_age.ageType(age_type) == amuse_const.student) {   //청소년일때
			real_price = amuse_dayrate.student_priorProcess(amuse_input.Input_prior(pri_type));
			
		} else if (amuse_age.ageType(age_type) == amuse_const.child) {   //소인일때
			real_price = amuse_dayrate.child_priorProcess(amuse_input.Input_prior(pri_type));
			
		} else if (amuse_age.ageType(age_type) == amuse_const.senior) {   //경로일때			
			real_price = amuse_dayrate.senior_priorProcess(amuse_input.Input_prior(pri_type));
					
		} else if (amuse_age.ageType(age_type) == amuse_const.baby) { 
			real_price = amuse_dayrate.baby_priorProcess(amuse_input.Input_prior(pri_type));	//유아일때
		}			
		
		return real_price * amuse_input.Input_count(count); 
	}
			
				
	public static int night_rateprocess (int age_type, int pri_type, int count) { //야간일때
		int real_price = 0;
		
		if (amuse_age.ageType(age_type) == amuse_const.adult) {  //대인일때
			real_price = amuse_dayrate.adult_priorProcess(amuse_input.Input_prior(pri_type));
			
		} else if (amuse_age.ageType(age_type) == amuse_const.student) {   //청소년일때
			real_price = amuse_dayrate.student_priorProcess(amuse_input.Input_prior(pri_type));
			
		} else if (amuse_age.ageType(age_type) == amuse_const.child) {   //소인일때
			real_price = amuse_dayrate.child_priorProcess(amuse_input.Input_prior(pri_type));
			
		} else if (amuse_age.ageType(age_type) == amuse_const.senior) {   //경로일때			
			real_price = amuse_dayrate.senior_priorProcess(amuse_input.Input_prior(pri_type));
					
		} else if (amuse_age.ageType(age_type) == amuse_const.baby) { 
			real_price = amuse_dayrate.baby_priorProcess(amuse_input.Input_prior(pri_type));  //유아일때
		}				
		return real_price * amuse_input.Input_count(count); 
	}			
}

		
		
	