package amusement;

public class amuse_Orderinfo {

	public String ticketsort;
	private String agesort;
	private int priornum;
	private int ticketNum;
	private int resultPrice;
	private int tickettype;
	private String Priorsort;
	
	public String getTicketsort(int tickettype) {
		if(tickettype == amuse_const.day) {
			this.ticketsort = "주간권";
		} else if (tickettype == amuse_const.night) {
			this.ticketsort = "야간권";
		}
		return ticketsort;
	}
	
	public void setTicketsort (int tickettype) {
		this.tickettype = tickettype;
	}
	public String getAgesort() {
		return agesort;
	}
	public void setAgesort (String agesort) {
		this.agesort = agesort;
	}
	public String getPriorsort(int priornum) {
		if(priornum == amuse_const.disabled) {
			this.Priorsort = "우대적용 장애인";
		} else if (priornum == amuse_const.none) {
			this.Priorsort = "우대적용 없음";			
		} else if (priornum == amuse_const.national) {
			this.Priorsort = "우대적용 국가유공자";
		} else if (priornum == amuse_const.children) {
			this.Priorsort = "우대적용 다자녀";
		} else if (priornum == amuse_const.pregnant) {
			this.Priorsort = "우대적용 임산부";
	}
		return Priorsort;
}
	
	public void setPriorsort (int priornum) {
		this.priornum = priornum;
	}
	public int getticketNum () {
		return ticketNum;
	}
	public void setticketNum (int ticketNum) {
		this.ticketNum = ticketNum;
	}
	public int getresultPrice () {
		return resultPrice;
	}
	public void setresultPrice(int resultPrice) {
		this.resultPrice = resultPrice;
	}
}
	
	
	
	
	
	
	
