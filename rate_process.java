package amuse;

public class rate_process {

	public static int day_rateprocess (int age_type, int pri_type) {  //주간일 때
		amuse_Input ai = new amuse_Input();
		age_process ag = new age_process();
		double price = 0;
		
		if (ag.ageType(age_type) == constvalue.adult) {  //대인일때
			if (ai.Input_prior(pri_type) == constvalue.none) {
				price = constvalue.day_adult;
			} else if (ai.Input_prior(pri_type) == constvalue.disabled)  {
				price = constvalue.day_adult - (constvalue.day_adult * constvalue.disabled_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.national)  {
				price = constvalue.day_adult - (constvalue.day_adult * constvalue.national_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.children)  {
				price = constvalue.day_adult - (constvalue.day_adult * constvalue.children_rate);	
			} else if (ai.Input_prior(pri_type) == constvalue.pregnant)  {
				price = constvalue.day_adult - (constvalue.day_adult * constvalue.pregnant_rate);
				
		} else if (ag.ageType(age_type) == constvalue.student) {   //청소년일때
			if (ai.Input_prior(pri_type) == constvalue.none) {
				price = constvalue.day_student;
			} else if (ai.Input_prior(pri_type) == constvalue.disabled)  {
				price = constvalue.day_student - (constvalue.day_student * constvalue.disabled_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.national)  {
				price = constvalue.day_student - (constvalue.day_student * constvalue.national_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.children)  {
				price = constvalue.day_student - (constvalue.day_student * constvalue.children_rate);	
			} else if (ai.Input_prior(pri_type) == constvalue.pregnant)  {
				price = constvalue.day_student - (constvalue.day_student * constvalue.pregnant_rate);
				
		} else if (ag.ageType(age_type) == constvalue.child) {   //소인일때
			if (ai.Input_prior(pri_type) == constvalue.none) {
				price = constvalue.day_child;
			} else if (ai.Input_prior(pri_type) == constvalue.disabled)  {
				price = constvalue.day_child - (constvalue.day_child * constvalue.disabled_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.national)  {
				price = constvalue.day_child - (constvalue.day_child * constvalue.national_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.children)  {
				price = constvalue.day_child - (constvalue.day_child * constvalue.children_rate);	
			} else if (ai.Input_prior(pri_type) == constvalue.pregnant)  {
				price = constvalue.day_child - (constvalue.day_child * constvalue.pregnant_rate);
				
		} else if (ag.ageType(age_type) == constvalue.senior) {   //경로일때
				price = constvalue.day_old;
			} else if (ai.Input_prior(pri_type) == constvalue.disabled)  {
				price = constvalue.day_old - (constvalue.day_old * constvalue.disabled_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.national)  {
				price = constvalue.day_old - (constvalue.day_old * constvalue.national_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.children)  {
				price = constvalue.day_old - (constvalue.day_old * constvalue.children_rate);	
			} else if (ai.Input_prior(pri_type) == constvalue.pregnant)  {
				price = constvalue.day_old - (constvalue.day_old * constvalue.pregnant_rate);
					
		} else if (ag.ageType(age_type) == constvalue.baby) { 
				price = constvalue.day_baby;						//유아일때
		}
				
			
			
			
			return 	
		}

	
	
	
	public static int night_rate (int num1, int num2) { //야간일때
		//대인
		if (19 <= ag.ageProcess && age <= 64) {
			if ()
	
	
	
	
	}
		if () {  //주간권이면서 대인 청소년 소인 경로인 경우 각각의 한명의 가격
	
			대인일때 우대사항없을 경우의 가격
			대인일때 장애인일 경우의 가격
			대인일때 국가유공자일경우의 가격
			대인일때 다자녀일경우의 가격
			대인일때 임산부일 경우의 가격
		
		
		
		
		
		
		}

		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		else if() {
						//야간권이면서 대인 청소년 소인 경로인 경우의 각각의 한명의 가격
		}
		
		
		
		
		
		
		
		
}
