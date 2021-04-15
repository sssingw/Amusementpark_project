package project;

public class amuse_dayrate {

	
	public static int adult_priorProcess(int pri_type) {
		
		int price_process = 0;
		
		if (amuse_input.Input_prior(pri_type) == amuse_const.none) {
			price_process = amuse_const.day_adult;
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.disabled)  {
			price_process = (int)(amuse_const.day_adult - (amuse_const.day_adult * amuse_const.disabled_rate));
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.national)  {
			price_process = (int)(amuse_const.day_adult - (amuse_const.day_adult * amuse_const.national_rate));
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.children)  {
			price_process = (int)(amuse_const.day_adult - (amuse_const.day_adult * amuse_const.children_rate));	
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.pregnant)  {
			price_process = (int)(amuse_const.day_adult - (amuse_const.day_adult * amuse_const.pregnant_rate));					
		}
		return price_process;
	}
	
	public static int student_priorProcess(int pri_type) {
		
		int price_process = 0;
			
		if (amuse_input.Input_prior(pri_type) == amuse_const.none) {
			price_process = amuse_const.day_student;
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.disabled)  {
			price_process = (int)(amuse_const.day_student - (amuse_const.day_student * amuse_const.disabled_rate));
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.national)  {
			price_process = (int)(amuse_const.day_student - (amuse_const.day_student * amuse_const.national_rate));
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.children)  {
			price_process = (int)(amuse_const.day_student - (amuse_const.day_student * amuse_const.children_rate));	
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.pregnant)  {
			price_process = (int)(amuse_const.day_student - (amuse_const.day_student * amuse_const.pregnant_rate));					
		}
		return price_process;
	}
			
	public static int child_priorProcess(int pri_type) {
		
		int price_process = 0;
			
		if (amuse_input.Input_prior(pri_type) == amuse_const.none) {
			price_process = amuse_const.day_child;
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.disabled)  {
			price_process = (int)(amuse_const.day_child - (amuse_const.day_child * amuse_const.disabled_rate));
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.national)  {
			price_process = (int)(amuse_const.day_child - (amuse_const.day_child * amuse_const.national_rate));
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.children)  {
			price_process = (int)(amuse_const.day_child - (amuse_const.day_child * amuse_const.children_rate));	
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.pregnant)  {
			price_process = (int)(amuse_const.day_child - (amuse_const.day_child * amuse_const.pregnant_rate));					
		} 
		return price_process;
	}
	
	public static int senior_priorProcess(int pri_type) {
	
		int price_process = 0;
			
		if (amuse_input.Input_prior(pri_type) == amuse_const.none) {
			price_process = amuse_const.day_senior;
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.disabled)  {
			price_process = (int)(amuse_const.day_senior - (amuse_const.day_senior * amuse_const.disabled_rate));
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.national)  {
			price_process = (int)(amuse_const.day_senior - (amuse_const.day_senior * amuse_const.national_rate));
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.children)  {
			price_process = (int)(amuse_const.day_senior - (amuse_const.day_senior * amuse_const.children_rate));	
		} else if (amuse_input.Input_prior(pri_type) == amuse_const.pregnant)  {
			price_process = (int)(amuse_const.day_senior - (amuse_const.day_senior * amuse_const.pregnant_rate));					
		}
		return price_process;
	}
	
	public static int baby_priorProcess(int pri_type) {
		
		int price_process = 0;	
		return price_process;
	}
	
	
}
