package amuse;

import java.util.Scanner;

public class amuse_input {


	public static int Input_ticket_type () {				                    //������ �Է¹޴� �޼���
		System.out.println("������ �����ϼ���");
		System.out.printf("%d. %s\n", amuse_const.day, "�ְ���");
		System.out.printf("%d. %s\n", amuse_const.night, "�߰���");		
		Scanner sc = new Scanner (System.in);
		int input_type_num = sc.nextInt();

		while (true) {
			if ((input_type_num == amuse_const.day) || (input_type_num == amuse_const.night)) {	
				break;
			} else {					
				System.out.println("�Է¿���! �ٽ� �Է����ּ���");
				break;
			}  		
			
		} return input_type_num;
	}

	public static String Input_regist_num () {							//�ֹι�ȣ�� �Է¹޴� �޼���(���ڿ���ȯ)
		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		Scanner sc = new Scanner (System.in);	
		String input_reg_string = sc.next();

		while(true) {
			if (input_reg_string.length() > 14) {
				System.out.println("�Է¿���! �ٽ� �Է����ּ���");
				break;
			} else {	
				break;
			}
			
		} 
		return input_reg_string;
	}


	public static int Input_count() {												//������ �Է¹޴� �޼���
		Scanner sc = new Scanner (System.in);
		System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�?  (�ִ� 10��)");
		int input_request_num = sc.nextInt();

		while (true) {
			if (input_request_num >=  11 || input_request_num <= 0) {
				System.out.println("�Է¿���! �ٽ� �Է����ּ���");
				break;
			} else {	
				break;
			}			
		}
		return input_request_num;
	}


	public static int Input_prior_type () {												//�������� �Է¹޴� �޼���
		Scanner sc = new Scanner (System.in);
		System.out.printf("%s\n %d. %s\n %d. %s\n %d. %s\n %d. %s\n %d. %s\n",
				"�������� �����ϼ���", amuse_const.none, "���� (���� ���� �ڵ�ó��)", amuse_const.disabled , "�����",
						amuse_const.national, "����������", amuse_const.children, "���ڳ�", amuse_const.pregnant, "�ӻ��");
		int input_prior_num = sc.nextInt();

		while(true) {
			if ((input_prior_num < amuse_const.none) || (input_prior_num > amuse_const.pregnant)) {
				System.out.println("�Է¿���! �ٽ� �Է����ּ���");
				break;
			} else {	
				break;
			}
			
		}
		return input_prior_num;
	}
	
	public static int continue_process () {
		System.out.println();
		System.out.printf("������ �����ϼ���\n");
		System.out.printf("1. Ƽ�� �߱�\n");
		System.out.printf("2. ����\n");		
		Scanner sc = new Scanner (System.in);	
		int input_num = sc.nextInt();
		
		while (true) {
			if(input_num == 1 || input_num == 2) {
				break;
			} else {
				System.out.println("�Է¿���! �ٽ��Է����ּ���");
			}
		}
		return input_num;		
	}
}

