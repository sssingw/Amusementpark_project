package project;

import java.util.Scanner;

public class amuse_input {
	
	public static int Input_ticket(int num) {
				
		System.out.println("������ �����ϼ���");
		System.out.printf("%d. %s\n", amuse_const.day, "�ְ���");
		System.out.printf("%d. %s\n", amuse_const.night, "�߰���");
		
		Scanner sc = new Scanner (System.in);
		int input_type_num = sc.nextInt();
		
		return input_type_num;
		}
	
	public static String Input_regnum(String num) {
				
		Scanner sc = new Scanner (System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		String input_regnum = sc.next();
				
		return input_regnum;
	}
	
	public static int Input_count(int num) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�?  (�ִ� 10��)");
		int input_request_num = sc.nextInt();
		
		return input_request_num;
	}
	
	public static int Input_prior(int num) {
		
		Scanner sc = new Scanner (System.in);
		System.out.printf("%s\n %d. %s\n %d. %s\n %d. %s\n %d. %s\n %d. %s\n",
				"�������� �����ϼ���", amuse_const.none, "���� (���� ���� �ڵ�ó��)", amuse_const.disabled , "�����",
						amuse_const.national, "����������", amuse_const.children, "���ڳ�", amuse_const.pregnant, "�ӻ��");
		int input_prior_num = sc.nextInt();
		return input_prior_num;
	}

	
		
	}


