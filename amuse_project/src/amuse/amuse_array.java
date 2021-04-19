package amuse;

import java.io.IOException;
import java.util.ArrayList;

public class amuse_array {

	

		public static void print(int inputticket, String inputregnum, int pay_price, int inputcount, int inputpriornum,
				ArrayList<amuse_Orderinfo> orderListArray) {
			
			
			System.out.println("===============KOPO World==============");			
			String text = "";
				for (int i = 0; i < orderListArray.size(); i++) {
					amuse_Orderinfo info = orderListArray.get(i);
					text += info.gettzone() + ", " + info.getsort() + ", " +
							info.getticketNum() + ", " + info.getresultPrice() + ", " + info.getresult();
					System.out.println(text);
				}
		}
		
		
		public static void savelist(int inputticket, String inputregnum, int inputcount, int pay_price, int inputpriornum,
				ArrayList<amuse_Orderinfo> orderListArray) {
		
			amuse_Orderinfo infoset = new amuse_Orderinfo();
			
			infoset.settzone(inputticket);
			infoset.setsort(inputregnum);
			infoset.setticketNum(inputcount);
			infoset.setresultPrice(pay_price);
			infoset.setresult(inputpriornum);
				
			orderListArray.add(infoset);
		}
		}

