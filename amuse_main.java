package project;

import java.util.Scanner;

public class amuse_main {

	public static void main(String[] args) {

			
		int inputticket = 0;
		amuse_input.Input_ticket(inputticket);

		String inputregnum = "";
		amuse_input.Input_regnum(inputregnum);					
		int age_type = amuse_age.ageType(amuse_age.ageProcess(inputregnum));

		int inputcount = 0;
		amuse_input.Input_count(inputcount);

		int inputpriornum = 0;
		amuse_input.Input_prior(inputpriornum);
				
//		amuse_output.checkTicket(inputticket, inputregnum, inputpriornum);
		
		int price = 0;
		if (inputticket == amuse_const.day) {
			price = amuse_price.day_rateprocess(age_type, inputpriornum, inputcount);
		} else {
			price = amuse_price.night_rateprocess(age_type, inputpriornum, inputcount);
		}
			System.out.println("������ " + price + "�Դϴ�.");	
		System.out.println("�����մϴ�.");
		
		
	 	
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
	
		
	
	}
	}
	


