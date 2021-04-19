package amuse;

import java.text.DecimalFormat;

public class amuse_main {
			
		public static void main(String[] args) {
		
			DecimalFormat df = new DecimalFormat ( "###,###,###,###,###" );
			while(true) {
				
					int inputticket = amuse_input.Input_ticket_type();
									
					if(!(inputticket == 1 || inputticket == 2)) {
						continue;	
					}	
					
					String inputregnum = amuse_input.Input_regist_num();		
					if (inputregnum.length() > 14) {
						continue;	
					}	
					
					int age_type1 = amuse_age.ageProcess(inputregnum);

					int inputcount = amuse_input.Input_count();
									
					int inputpriornum = amuse_input.Input_prior_type();

					int pay_price = 0;
					if (inputticket == amuse_const.day) {
						pay_price = amuse_price.Day_priceProcess(age_type1, inputpriornum, inputcount);
						System.out.printf("%s %s %s\n", "가격은", df.format(pay_price), "입니다.");

					} else if (inputticket == amuse_const.night) {
						pay_price = amuse_price.Night_priceProcess(age_type1, inputpriornum, inputcount);
						System.out.printf("%s %s %s\n", "가격은", df.format(pay_price), "입니다.");
					}
					
					int continue_sel = amuse_input.continue_process();

					if(continue_sel == 2) {
						System.out.println("종료합니다.");
						break;
					}
			}
		}
	}

