package amusement;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class amuse_main {	
		public static void main(String[] args)  throws IOException {			
			ArrayList <amuse_Orderinfo> oi =  new ArrayList<amuse_Orderinfo>();		
			int inputticket = 0;
			String inputregnum = "";
			int age_type1 = 0;
			int inputcount = 0; 
			int one_price = 0;
			int inputpriornum = 0;
			int discountprice = 0;
			int finalprice = 0;
			String ticketsort = "";
			String agesort = "";
			String priorsort = "";
			
			while (true) {				

					inputticket = amuse_input.Input_ticket_type();			 															//권종호출		
					inputregnum = amuse_input.Input_regist_num();	 																//민번 호출		
					age_type1 = amuse_age.ageProcess(inputregnum);   																//나이계산
					inputcount = amuse_input.Input_count();                  																//수량 호출									
					one_price = amuse_price.price(inputticket, age_type1);															//권종과 나이별 1장 가격
					inputpriornum = amuse_input.Input_prior_type();																	//우대사항 호출
					discountprice = amuse_price.discountprice(inputpriornum, one_price);   							//우대할인 적용된 1장 가격
					finalprice = amuse_price.finalPrice(inputcount, discountprice); 											//수량따른 최종 가격호출					
					ticketsort = amuse_sort.tickettype(inputticket);																		//저장하기 위해 권종분류
					agesort = amuse_sort.agetype(age_type1);																				//저장하기 위해 나이 분류
					priorsort = amuse_sort.priortype(inputpriornum);																	//저장하기 위해 우대 분류
					
					amuse_output.semiprint(ticketsort, agesort, inputcount, finalprice, priorsort);					//중간 내역 출력					
					amuse_output.Ordersave(ticketsort, agesort, finalprice, inputcount, priorsort);					// 파일 저장			
					amuse_output.savelist(inputticket, agesort, finalprice, inputcount, inputpriornum, oi);		// 총 리스트 저장																							
					int continue_num = amuse_input.continue_process();															//계속 발권할지 말지 결정
					if (continue_num == amuse_const.exit) {																					//종료시 while 종료
							break;
					}
			}
			amuse_output.printresult(inputticket, age_type1, finalprice, inputpriornum, inputcount, oi); 	//최종결과 출력		
				}
						
		}
	
