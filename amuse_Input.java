package project;

import java.util.Scanner;

public class amuse_input {
	
	public static int Input_ticket(int num) {
				
		System.out.println("권종을 선택하세요");
		System.out.printf("%d. %s\n", amuse_const.day, "주간권");
		System.out.printf("%d. %s\n", amuse_const.night, "야간권");
		
		Scanner sc = new Scanner (System.in);
		int input_type_num = sc.nextInt();
		
		return input_type_num;
		}
	
	public static String Input_regnum(String num) {
				
		Scanner sc = new Scanner (System.in);
		System.out.println("주민번호를 입력하세요");
		String input_regnum = sc.next();
				
		return input_regnum;
	}
	
	public static int Input_count(int num) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("몇 개를 주문하시겠습니까?  (최대 10개)");
		int input_request_num = sc.nextInt();
		
		return input_request_num;
	}
	
	public static int Input_prior(int num) {
		
		Scanner sc = new Scanner (System.in);
		System.out.printf("%s\n %d. %s\n %d. %s\n %d. %s\n %d. %s\n %d. %s\n",
				"우대사항을 선택하세요", amuse_const.none, "없음 (나이 우대는 자동처리)", amuse_const.disabled , "장애인",
						amuse_const.national, "국가유공자", amuse_const.children, "다자녀", amuse_const.pregnant, "임산부");
		int input_prior_num = sc.nextInt();
		return input_prior_num;
	}

	
		
	}


