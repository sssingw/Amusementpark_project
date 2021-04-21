package amusement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class amuse_saveorder {

	static File file = new File("C:\\Users\\성원\\Desktop\\test.txt");        //파일경로지정
	static FileWriter fw = null;
	static BufferedWriter br = null;
	static Calendar cal = Calendar.getInstance();
	
	public static void head() throws IOException {																	
		String title = "날짜 권종 연령구분 수량 가격 우대사항 ";											
		fw = new FileWriter(file);																				
		br = new BufferedWriter(new FileWriter(file));	
		if (file.exists() == false){																					//파일이 존재하면 title적지않고 출력
			br.newLine();
			br.close();	
		} else {																												//파일이 존재하지 않으면 title적고 출력
			br.write(title);
			br.newLine();
			br.close();
		} 
	}
	
	public static void date() throws IOException {												//날짜 입력 메서드
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");								
		fw = new FileWriter(file, true);	
		br = new BufferedWriter(fw);
		br.write(df.format(cal.getTime()) + ", ");
		br.close();
	}
	
	public static void list(String str) throws IOException {									//내용을 저장할 메서드
		fw = new FileWriter(file, true);
		br = new BufferedWriter(fw);
		br.write(str + ", ");
		br.close();		
	}
	
	public static void reason(String str) throws IOException {							// 우대 이유 입력
		fw = new FileWriter(file, true);
		br = new BufferedWriter(fw);
		br.write(str);
		br.newLine();
		br.close();		
	}	
}


