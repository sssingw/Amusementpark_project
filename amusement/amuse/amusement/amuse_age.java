package amusement;

import java.util.Calendar;
import java.util.Date;
public class amuse_age {

	public static int ageProcess (String reg_String) {		
		int year_process2 = 0;																			//첫번째 나온 연도를 정수형으로 변환해 저장할 변수
		int year_process3 = 0;																			//연도를 나이 범위에 맞춰 나온 타입을 저장할 변수
		String sub_regnum = reg_String.substring(0,2);									//입력받은 민번을 앞에 두자리만 짤라 저장
		String sub_regnum1 = sub_regnum.substring(0,1);								//짜른 두자리의 맨 앞자리만 짤라 저장

		if (sub_regnum1.equals("0")) {																//짜른 맨앞자리가 0이면
			String year_process1 = "20" + sub_regnum;										//짜른 앞에 두자리 앞에 20을 붙여 저장		
			year_process2 = Integer.parseInt(year_process1);							//20을 붙인 값을 정수형으로 변환해 저장
			year_process3 = amuse_age.ageType(year_process2);					//범위별 타입을 나눠주는 메서드 agetype에 넣어 타입 저장

		} else {																										//짜른 맨앞자리가 0이 아니면
			String year_process1 = "19" + sub_regnum;										//짜른 앞에 두자리 앞에 19을 붙여 저장
			year_process2 = Integer.parseInt(year_process1);							//19를 붙인 값을 정수형으로 변환해 저장
			year_process3 = amuse_age.ageType(year_process2);					//범위별 타입을 나눠주는 메서드 agetype에 넣어 타입 저장
		} 
			return year_process3;	   																	//범위별 타입을 반환
		}
	public static int ageType(int age_year) {													
		int age = amuse_const.year - age_year + 1;											//받은 연도에 1을 더해 현재 연도에서 빼줌
		int age_type = 0;																						//반환할 값을 넣은 변수

			if (19 <= age && age <= 64) {																//나이가 19~64일 경우 타입 1번 반환
				age_type = 1; 
			} else if (13 <= age && age <= 18) {													//나이가 13~18일 경우 타입 2번 반환
				age_type = amuse_const.student;	
			} else if (3 <= age && age <= 12) {														//나이가 3~12일 경우 타입 3번 반환
				age_type = amuse_const.child;
			} else if (65 <= age) {																			//나이가 65이상일 경우 타입 4번 반환
				age_type = amuse_const.senior;
			} else if (age <= 2) {																				//나이가 2살 이하일 경우 타입 5번 반환
				age_type = amuse_const.baby;
			}			
		return age_type;
	}
}