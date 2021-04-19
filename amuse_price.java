package amuse;


public class amuse_price {

	public static int Day_priceProcess (int age_type, int prior_type, int count) {

		int one_price = 0;
		int count_price = 0;
		if (age_type == amuse_const.adult) {
				if (prior_type == amuse_const.none) 
					one_price = amuse_const.day_adult ; 					//�����϶� ������ ������											
				if (prior_type == amuse_const.disabled) 
					one_price = amuse_const.day_adult - ( (amuse_const.day_adult * amuse_const.disabled_rate) / 100) ;
				if (prior_type == amuse_const.national) 
					one_price = amuse_const.day_adult - ( (amuse_const.day_adult * amuse_const.national_rate) / 100) ;
				if (prior_type == amuse_const.children) 
					one_price = amuse_const.day_adult - ( (amuse_const.day_adult * amuse_const.children_rate) / 100) ;
				if (prior_type == amuse_const.pregnant) 
					one_price = amuse_const.day_adult - ( (amuse_const.day_adult * amuse_const.pregnant_rate) / 100) ;		
		}

		if (age_type == amuse_const.student) {
			if (prior_type == amuse_const.none) 
				one_price = amuse_const.day_student ; 					//û�ҳ��϶� ������ ������ 											
			if (prior_type == amuse_const.disabled) 
				one_price = amuse_const.day_student- ( (amuse_const.day_student * amuse_const.disabled_rate) / 100) ;
			if (prior_type == amuse_const.national) 
				one_price = amuse_const.day_student - ( (amuse_const.day_student * amuse_const.national_rate) / 100) ;
			if (prior_type == amuse_const.children) 
				one_price = amuse_const.day_student - ( (amuse_const.day_student * amuse_const.children_rate) / 100) ;
			if (prior_type == amuse_const.pregnant) 
				one_price = amuse_const.day_student - ( (amuse_const.day_student * amuse_const.pregnant_rate) / 100) ;		
	}

		if (age_type == amuse_const.child) {
			if (prior_type == amuse_const.none) 
				one_price = amuse_const.day_child ; 					//�����϶� ������ ������										
			if (prior_type == amuse_const.disabled) 
				one_price = amuse_const.day_child - ( (amuse_const.day_child * amuse_const.disabled_rate) / 100) ;
			if (prior_type == amuse_const.national) 
				one_price = amuse_const.day_child - ( (amuse_const.day_child * amuse_const.national_rate) / 100) ;
			if (prior_type == amuse_const.children) 
				one_price = amuse_const.day_child - ( (amuse_const.day_child * amuse_const.children_rate) / 100) ;
			if (prior_type == amuse_const.pregnant) 
				one_price = amuse_const.day_child - ( (amuse_const.day_child * amuse_const.pregnant_rate) / 100) ;		
	}

		if (age_type == amuse_const.senior) {
			if (prior_type == amuse_const.none) 
				one_price = amuse_const.day_senior ; 					//����϶� ������ ������										
			if (prior_type == amuse_const.disabled) 
				one_price = amuse_const.day_senior - ( (amuse_const.day_senior * amuse_const.disabled_rate) / 100) ;
			if (prior_type == amuse_const.national) 
				one_price = amuse_const.day_senior - ( (amuse_const.day_senior * amuse_const.national_rate) / 100) ;
			if (prior_type == amuse_const.children) 
				one_price = amuse_const.day_senior - ( (amuse_const.day_senior * amuse_const.children_rate) / 100) ;
			if (prior_type == amuse_const.pregnant) 
				one_price = amuse_const.day_senior - ( (amuse_const.day_senior * amuse_const.pregnant_rate) / 100) ;		
	}

		if (age_type == amuse_const.baby) {
			if (prior_type == amuse_const.none) 
				one_price = amuse_const.day_baby ; 					//�����϶� ������ ������											
			if (prior_type == amuse_const.disabled) 
				one_price = amuse_const.day_baby - ( (amuse_const.day_baby * amuse_const.disabled_rate) / 100) ;
			if (prior_type == amuse_const.national) 
				one_price = amuse_const.day_baby - ( (amuse_const.day_baby * amuse_const.national_rate) / 100) ;
			if (prior_type == amuse_const.children) 
				one_price = amuse_const.day_baby - ( (amuse_const.day_baby * amuse_const.children_rate) / 100) ;
			if (prior_type == amuse_const.pregnant) 
				one_price = amuse_const.day_baby - ( (amuse_const.day_baby * amuse_const.pregnant_rate) / 100) ;		
	}
		count_price = one_price * count;
		return count_price;
	}

	public static int Night_priceProcess (int age_type, int prior_type, int count) {

		int one_price = 0;
		int count_price = 0;

		if (age_type == amuse_const.adult) {
				if (prior_type == amuse_const.none) 
					one_price = amuse_const.night_adult ; 					//�����϶� ������ ������											
				if (prior_type == amuse_const.disabled) 
					one_price = amuse_const.night_adult - ( (amuse_const.night_adult * amuse_const.disabled_rate) / 100) ;
				if (prior_type == amuse_const.national) 
					one_price = amuse_const.night_adult - ( (amuse_const.night_adult * amuse_const.national_rate) / 100) ;
				if (prior_type == amuse_const.children) 
					one_price = amuse_const.night_adult - ( (amuse_const.night_adult * amuse_const.children_rate) / 100) ;
				if (prior_type == amuse_const.pregnant) 
					one_price = amuse_const.night_adult - ( (amuse_const.night_adult * amuse_const.pregnant_rate) / 100) ;		
		}

		if (age_type == amuse_const.student) {
			if (prior_type == amuse_const.none) 
				one_price = amuse_const.night_student ; 					//û�ҳ��϶� ������ ������ 											
			if (prior_type == amuse_const.disabled) 
				one_price = amuse_const.night_student - ( (amuse_const.night_student * amuse_const.disabled_rate) / 100) ;
			if (prior_type == amuse_const.national) 
				one_price = amuse_const.night_student - ( (amuse_const.night_student * amuse_const.national_rate) / 100) ;
			if (prior_type == amuse_const.children) 
				one_price = amuse_const.night_student - ( (amuse_const.night_student * amuse_const.children_rate) / 100) ;
			if (prior_type == amuse_const.pregnant) 
				one_price = amuse_const.night_student - ( (amuse_const.night_student * amuse_const.pregnant_rate) / 100) ;		
	}

		if (age_type == amuse_const.child) {
			if (prior_type == amuse_const.none) 
				one_price = amuse_const.night_child ; 					//�����϶� ������ ������										
			if (prior_type == amuse_const.disabled) 
				one_price = amuse_const.night_child - ( (amuse_const.night_child * amuse_const.disabled_rate) / 100) ;
			if (prior_type == amuse_const.national) 
				one_price = amuse_const.night_child - ( (amuse_const.night_child * amuse_const.national_rate) / 100) ;
			if (prior_type == amuse_const.children) 
				one_price = amuse_const.night_child - ( (amuse_const.night_child * amuse_const.children_rate) / 100) ;
			if (prior_type == amuse_const.pregnant) 
				one_price = amuse_const.night_child - ( (amuse_const.night_child * amuse_const.pregnant_rate) / 100) ;		
	}

		if (age_type == amuse_const.senior) {
			if (prior_type == amuse_const.none) 
				one_price = amuse_const.night_senior ; 					//����϶� ������ ������										
			if (prior_type == amuse_const.disabled) 
				one_price = amuse_const.night_senior - ( (amuse_const.night_senior * amuse_const.disabled_rate) / 100) ;
			if (prior_type == amuse_const.national) 
				one_price = amuse_const.night_senior - ( (amuse_const.night_senior * amuse_const.national_rate) / 100) ;
			if (prior_type == amuse_const.children) 
				one_price = amuse_const.night_senior - ( (amuse_const.night_senior * amuse_const.children_rate) / 100) ;
			if (prior_type == amuse_const.pregnant) 
				one_price = amuse_const.night_senior - ( (amuse_const.night_senior * amuse_const.pregnant_rate) / 100) ;		
	}

		if (age_type == amuse_const.baby) {
			if (prior_type == amuse_const.none) 
				one_price = amuse_const.night_baby ; 					//�����϶� ������ ������											
			if (prior_type == amuse_const.disabled) 
				one_price = amuse_const.night_baby - ( (amuse_const.night_baby * amuse_const.disabled_rate) / 100) ;
			if (prior_type == amuse_const.national) 
				one_price = amuse_const.night_baby - ( (amuse_const.night_baby * amuse_const.national_rate) / 100) ;
			if (prior_type == amuse_const.children) 
				one_price = amuse_const.night_baby - ( (amuse_const.night_baby * amuse_const.children_rate) / 100) ;
			if (prior_type == amuse_const.pregnant) 
				one_price = amuse_const.night_baby - ( (amuse_const.night_baby * amuse_const.pregnant_rate) / 100) ;		
	}
		count_price = one_price * count;
		return count_price;
	}
}