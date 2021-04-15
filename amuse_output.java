package project;

public class amuse_output {

	
	public static void checkTicket (int ticket, String regnum, int prior) {
		
		if (amuse_input.Input_ticket(ticket) == amuse_const.day) {
			if (amuse_age.ageType(amuse_age.ageProcess(regnum)) == amuse_const.adult) {
				amuse_dayrate.adult_priorProcess(amuse_input.Input_prior(prior));
			} else if (amuse_age.ageType(amuse_age.ageProcess(regnum)) == amuse_const.student) {
				amuse_dayrate.student_priorProcess(amuse_input.Input_prior(prior));
			} else if (amuse_age.ageType(amuse_age.ageProcess(regnum)) == amuse_const.child) {
				amuse_dayrate.child_priorProcess(amuse_input.Input_prior(prior));
			} else if (amuse_age.ageType(amuse_age.ageProcess(regnum)) == amuse_const.senior) {
				amuse_dayrate.senior_priorProcess(amuse_input.Input_prior(prior));
			} else if (amuse_age.ageType(amuse_age.ageProcess(regnum)) == amuse_const.baby) {
				amuse_dayrate.baby_priorProcess(amuse_input.Input_prior(prior));
			}

			
		} else if (ticket == amuse_const.night) {
				if (amuse_age.ageType(amuse_age.ageProcess(regnum)) == amuse_const.adult) {
					amuse_nightrate.adult_priorProcess(amuse_input.Input_prior(prior));
				} else if (amuse_age.ageType(amuse_age.ageProcess(regnum)) == amuse_const.student) {
					amuse_nightrate.student_priorProcess(amuse_input.Input_prior(prior));
				} else if (amuse_age.ageType(amuse_age.ageProcess(regnum)) == amuse_const.child) {
					amuse_nightrate.child_priorProcess(amuse_input.Input_prior(prior));
				} else if (amuse_age.ageType(amuse_age.ageProcess(regnum)) == amuse_const.senior) {
					amuse_nightrate.senior_priorProcess(amuse_input.Input_prior(prior));
				} else if (amuse_age.ageType(amuse_age.ageProcess(regnum)) == amuse_const.baby) {
					amuse_nightrate.baby_priorProcess(amuse_input.Input_prior(prior));
				}
		}   //각 할인이 적용된 1명의 가격불러오기
		
	
		
		
		
	}
		
		
	}

