package project;

public class amuse_price {

	
	public static int day_rateprocess (int age_type, int pri_type, int count) {  //�ְ��� ��
		int real_price = 0;		
		
		if (amuse_age.ageType(age_type) == amuse_const.adult) {  //�����϶�
			real_price = amuse_dayrate.adult_priorProcess(amuse_input.Input_prior(pri_type));
						
		} else if (amuse_age.ageType(age_type) == amuse_const.student) {   //û�ҳ��϶�
			real_price = amuse_dayrate.student_priorProcess(amuse_input.Input_prior(pri_type));
			
		} else if (amuse_age.ageType(age_type) == amuse_const.child) {   //�����϶�
			real_price = amuse_dayrate.child_priorProcess(amuse_input.Input_prior(pri_type));
			
		} else if (amuse_age.ageType(age_type) == amuse_const.senior) {   //����϶�			
			real_price = amuse_dayrate.senior_priorProcess(amuse_input.Input_prior(pri_type));
					
		} else if (amuse_age.ageType(age_type) == amuse_const.baby) { 
			real_price = amuse_dayrate.baby_priorProcess(amuse_input.Input_prior(pri_type));	//�����϶�
		}			
		
		return real_price * amuse_input.Input_count(count); 
	}
			
				
	public static int night_rateprocess (int age_type, int pri_type, int count) { //�߰��϶�
		int real_price = 0;
		
		if (amuse_age.ageType(age_type) == amuse_const.adult) {  //�����϶�
			real_price = amuse_dayrate.adult_priorProcess(amuse_input.Input_prior(pri_type));
			
		} else if (amuse_age.ageType(age_type) == amuse_const.student) {   //û�ҳ��϶�
			real_price = amuse_dayrate.student_priorProcess(amuse_input.Input_prior(pri_type));
			
		} else if (amuse_age.ageType(age_type) == amuse_const.child) {   //�����϶�
			real_price = amuse_dayrate.child_priorProcess(amuse_input.Input_prior(pri_type));
			
		} else if (amuse_age.ageType(age_type) == amuse_const.senior) {   //����϶�			
			real_price = amuse_dayrate.senior_priorProcess(amuse_input.Input_prior(pri_type));
					
		} else if (amuse_age.ageType(age_type) == amuse_const.baby) { 
			real_price = amuse_dayrate.baby_priorProcess(amuse_input.Input_prior(pri_type));  //�����϶�
		}				
		return real_price * amuse_input.Input_count(count); 
	}			
}

		
		
	