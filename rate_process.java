package amuse;

public class rate_process {

	public static int day_rateprocess (int age_type, int pri_type) {  //�ְ��� ��
		amuse_Input ai = new amuse_Input();
		age_process ag = new age_process();
		double price = 0;
		
		if (ag.ageType(age_type) == constvalue.adult) {  //�����϶�
			if (ai.Input_prior(pri_type) == constvalue.none) {
				price = constvalue.day_adult;
			} else if (ai.Input_prior(pri_type) == constvalue.disabled)  {
				price = constvalue.day_adult - (constvalue.day_adult * constvalue.disabled_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.national)  {
				price = constvalue.day_adult - (constvalue.day_adult * constvalue.national_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.children)  {
				price = constvalue.day_adult - (constvalue.day_adult * constvalue.children_rate);	
			} else if (ai.Input_prior(pri_type) == constvalue.pregnant)  {
				price = constvalue.day_adult - (constvalue.day_adult * constvalue.pregnant_rate);
				
		} else if (ag.ageType(age_type) == constvalue.student) {   //û�ҳ��϶�
			if (ai.Input_prior(pri_type) == constvalue.none) {
				price = constvalue.day_student;
			} else if (ai.Input_prior(pri_type) == constvalue.disabled)  {
				price = constvalue.day_student - (constvalue.day_student * constvalue.disabled_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.national)  {
				price = constvalue.day_student - (constvalue.day_student * constvalue.national_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.children)  {
				price = constvalue.day_student - (constvalue.day_student * constvalue.children_rate);	
			} else if (ai.Input_prior(pri_type) == constvalue.pregnant)  {
				price = constvalue.day_student - (constvalue.day_student * constvalue.pregnant_rate);
				
		} else if (ag.ageType(age_type) == constvalue.child) {   //�����϶�
			if (ai.Input_prior(pri_type) == constvalue.none) {
				price = constvalue.day_child;
			} else if (ai.Input_prior(pri_type) == constvalue.disabled)  {
				price = constvalue.day_child - (constvalue.day_child * constvalue.disabled_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.national)  {
				price = constvalue.day_child - (constvalue.day_child * constvalue.national_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.children)  {
				price = constvalue.day_child - (constvalue.day_child * constvalue.children_rate);	
			} else if (ai.Input_prior(pri_type) == constvalue.pregnant)  {
				price = constvalue.day_child - (constvalue.day_child * constvalue.pregnant_rate);
				
		} else if (ag.ageType(age_type) == constvalue.senior) {   //����϶�
				price = constvalue.day_old;
			} else if (ai.Input_prior(pri_type) == constvalue.disabled)  {
				price = constvalue.day_old - (constvalue.day_old * constvalue.disabled_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.national)  {
				price = constvalue.day_old - (constvalue.day_old * constvalue.national_rate);
			} else if (ai.Input_prior(pri_type) == constvalue.children)  {
				price = constvalue.day_old - (constvalue.day_old * constvalue.children_rate);	
			} else if (ai.Input_prior(pri_type) == constvalue.pregnant)  {
				price = constvalue.day_old - (constvalue.day_old * constvalue.pregnant_rate);
					
		} else if (ag.ageType(age_type) == constvalue.baby) { 
				price = constvalue.day_baby;						//�����϶�
		}
				
			
			
			
			return 	
		}

	
	
	
	public static int night_rate (int num1, int num2) { //�߰��϶�
		//����
		if (19 <= ag.ageProcess && age <= 64) {
			if ()
	
	
	
	
	}
		if () {  //�ְ����̸鼭 ���� û�ҳ� ���� ����� ��� ������ �Ѹ��� ����
	
			�����϶� �����׾��� ����� ����
			�����϶� ������� ����� ����
			�����϶� �����������ϰ���� ����
			�����϶� ���ڳ��ϰ���� ����
			�����϶� �ӻ���� ����� ����
		
		
		
		
		
		
		}

		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		else if() {
						//�߰����̸鼭 ���� û�ҳ� ���� ����� ����� ������ �Ѹ��� ����
		}
		
		
		
		
		
		
		
		
}
