package amuse;

public class amuse_Orderinfo {

	public String tzone;
	public String sort;
	public int ticketNum;
	public int resultPrice;
	public int result;
	
	public String gettzone() {
		return tzone;
	}
	public void settzone(int tzone) {
		if (tzone == 1) {
			this.tzone = "주간권";
		} else if (tzone == 2) {
			this.tzone = "야간권";
		}
	}
	public String getsort() {
		return sort;		
	}
	public void setsort(String sort) {
		this.sort = sort;
	}
	public int getticketNum() {
		return ticketNum;
	}
	public void setticketNum (int ticketNum) {
		this.ticketNum = ticketNum;		
	}
	public int getresultPrice() {
		return resultPrice;
	}
	public void setresultPrice(int resultPrice) {
		this.resultPrice = resultPrice;
	}
	public int getresult() {
		return result;
	} 
	public void setresult (int result) {
		this.result = result;
	}
}
	
	
	
	
	

