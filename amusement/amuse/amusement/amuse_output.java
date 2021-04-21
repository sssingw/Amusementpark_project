package amusement;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class amuse_output {
		
			public static void printprice (int finalprice) {
					DecimalFormat df = new DecimalFormat("###,###,###,###,###");					
					int finalprice1 = 0;
					System.out.printf("%s, %s, %s\n, %s\n", "가격은" + df.format(finalprice1) + "입니다." + "감사합니다." );
			}																						//최종가격 출력하는 메서드
			
			public static void semiprint (String ticketsort, String agesort, int ticketnum, int totalprice, String priorsort) {
				System.out.printf(""%10s %10s %10d %10s X ticketsort + "-" + agesort + "X" + ticketnum + "=" + totalprice + "원" + priorsort);
			}
																									//중간내역 출력하는 메서드
			
			public static void printresult (int tickettype, int agetype, int finalprice , int priornum, int count, 
																ArrayList<amuse_Orderinfo>oi) throws IOException {
					System.out.println("=================Kopo Land=================");
					String text = "";
					for (int i = 0; i < oi.size(); i++) {
						amuse_Orderinfo info = oi.get(i);
						text = info.getTicketsort(tickettype) + "," + info.getAgesort() + "," + info.getticketNum() + "," + info.getresultPrice() 
									+ info.getPriorsort(priornum);
						System.out.println(text);
					}
			}																							//발권종료시 내역출력하는 메서드
			
			public static void savelist(int inputticket, String inputregnum, int pay_price, int inputcount, int inputpriornum,
					ArrayList<amuse_Orderinfo> oi) {		
				amuse_Orderinfo infoset = new amuse_Orderinfo();
				
				infoset.setTicketsort(inputticket);
				infoset.setAgesort(inputregnum);
				infoset.setticketNum(inputcount);
				infoset.setresultPrice(pay_price);
				infoset.setPriorsort(inputpriornum);					
				oi.add(infoset);
			}																								//amuse_Orderinfo의 객체를 생성하고 setter로 값을 저장
			
			public static void Ordersave(String ticketsort, String agesort, int resultPrice, int ticketNum, String Priorsort) throws IOException {			
				amuse_saveorder.list(String.valueOf(ticketsort));
				amuse_saveorder.list(String.valueOf(agesort));
				amuse_saveorder.list(String.valueOf(ticketNum));			
				amuse_saveorder.list(String.valueOf(resultPrice));
				amuse_saveorder.reason(Priorsort);
			}																								//amuse_saveorder의 list메서드를 이용해 각각의 값을 스트링으로 저장
	}
			
			

		
			
			

