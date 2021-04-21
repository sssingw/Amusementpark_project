package amusement;

public class amuse_sort {

	
	public static String agetype(int agetype) {			//최종 내역에 저장할 나이 분류
		String age_type = "";
		
		if (agetype == amuse_const.adult) {
			age_type = "어른";
		} else if (agetype == amuse_const.student) {
			age_type = "청소년";
		} else if (agetype == amuse_const.child) {
			age_type = "어린이";
		} else if (agetype == amuse_const.senior) {
			age_type = "경로";
		} else if (agetype == amuse_const.baby) {
			age_type = "유아";				
	}
		return age_type;
	}
			
	public static String tickettype (int tickettype) {        //최종 내역에 저장할 권종 분류
		String ticket_type = "";
		
		if (tickettype == amuse_const.day) {
			ticket_type = "주간권";
		} else if (tickettype == amuse_const.night) {	
			ticket_type = "야간권";
		}
		return ticket_type;
	}
	
	public static String priortype (int priornum) {			//최종 내역에 저장할 우대사항 분류
		String prior_type = "";
		
		if (priornum == amuse_const.disabled) {
			prior_type = "우대적용 장애인";
		} else if (priornum == amuse_const.none) {
			prior_type = "우대적용 없음";
		} else if (priornum == amuse_const.national) {
			prior_type = "우대적용 국가 유공자";
		} else if (priornum == amuse_const.children) {
			prior_type = "우대적용 다자녀";
		} else if (priornum == amuse_const.pregnant) {
			prior_type = "우대적용 임산부";
		}		
		return prior_type;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

