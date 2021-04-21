package amusement;

public class amuse_price {

	
	public static int price (int tickettype, int agetype) {			//권종, 나이별 가격 
		int one_price = 0;	
		if (tickettype == amuse_const.day) {																	
			if (agetype == amuse_const.adult) {
				one_price = amuse_const.day_adult;			
			} else if (agetype == amuse_const.student) {
				one_price = amuse_const.day_student;
			} else if (agetype == amuse_const.child) {
				one_price = amuse_const.day_child;
			} else if (agetype == amuse_const.senior) {
				one_price = amuse_const.day_senior;
			} else if (agetype == amuse_const.baby) {
				one_price = amuse_const.day_baby;
			}
		if (tickettype == amuse_const.night) {
			if (agetype == amuse_const.adult) {
				one_price = amuse_const.night_adult;			
			} else if (agetype == amuse_const.student) {
				one_price = amuse_const.night_student;
			} else if (agetype == amuse_const.child) {
				one_price = amuse_const.night_child;
			} else if (agetype == amuse_const.senior) {
				one_price = amuse_const.night_senior;
			} else if (agetype == amuse_const.baby) {
				one_price = amuse_const.night_baby;
			}			
		}	
		}
		return one_price;
	}
			
		public static int discountprice(int priornum, int oneprice) {					//우대할인 적용된 1장 가격
	
			int discount_price = 0;
			
				if (priornum == amuse_const.none) 
					discount_price = oneprice;								
				if (priornum == amuse_const.disabled) 
					discount_price = oneprice - ( (oneprice * amuse_const.disabled_rate) / 100) ;
				if (priornum == amuse_const.national) 
					discount_price = oneprice - ( (oneprice * amuse_const.national_rate) / 100) ;
				if (priornum == amuse_const.children) 
					discount_price = oneprice - ( (oneprice * amuse_const.children_rate) / 100) ;
				if (priornum == amuse_const.pregnant) 
					discount_price = oneprice - ( (oneprice * amuse_const.pregnant_rate) / 100) ;		
				
				return discount_price;   
				}
		
			public static int finalPrice(int count, int discount_price)  {                   //수량 별 최종 가격
					int finalprice = 0;
					
					finalprice = discount_price * count;
					return finalprice;
			}

		}