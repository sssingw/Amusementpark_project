package amusement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class amuse_mysql {

	
	private Connection conn;
	private Statement stmt;
	public void data() {			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
		         Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/amuse", "root", "652424");
		         
		         Statement stmt = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();			}
}
	
	public void addTodata(amuse_Orderinfo orderinfo) {     //각자 클래스에서 클래스맞게 입력
		try {
			String str = "INSERT INFO `report_amuse` (`date`, `type`, `age`, `count`, `price`, `advantage`)"
					+ "VALUES (now(), "
					+ "'" + orderinfo.getTicketsort(0) + "',"
					+ "'" + orderinfo.getAgesort() + "'," 
					+ "'" + orderinfo.getticketNum() + "',"
					+ "'" + orderinfo.getresultPrice() + "',"
					+ "'" + orderinfo.getPriorsort(0)
					+ "');";
					System.out.println(str);
					stmt.execute(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	
	

