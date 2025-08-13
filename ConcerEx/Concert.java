package ConcerEx;

public class Concert {
	private String singerName;
	private final int capa;						//수용인원
	private int soldNum = 0;					//팔린 티켓 수
	private final int onPrice;					//인터넷 티켓 가격	
	private final int offPrice;					//오프라인 티켓 가격
	private int totalSales = 0;					//총 판매 금액
	private boolean validOnline = true;			//인터넷 판매 가능 여부		

	public Concert(String singerName, int capa, int onPrice, int offPrice) {	//생성자
		this.singerName = singerName; 	
		this.capa = capa; 	
		this.onPrice = onPrice;	
		this.offPrice = offPrice;	
	}	
	
	public void finalReport() {
		
	}

	//gettter
	public String getSingerName() {	return singerName;	}
	public int getCapa() {	return capa;	}
	public int getSoldNum() {	return soldNum;	}
	public int getOnPrice() {	return onPrice;	}
	public int getOffPrice() {	return offPrice;	} 
	public int getTotalSales() { return totalSales; }
	public boolean getValidOnline() { return validOnline; }
	
	//팔린 티켓 수 구하기
	public int getRest() {
		return (capa - soldNum);
	}
		
	//setter
	public void setSingerName(String singerName) {	this.singerName = singerName;	}
	public void setCapa(int capa) {		this.capa = capa;	}
	public void setSoldNum(int soldNum) {	this.soldNum = soldNum;	}
	public void setOnPrice(int onPrice) {	this.onPrice = onPrice;	}
	public void setOffPrice(int offPrice) {		this.offPrice = offPrice;	}
	public void setTotalSales(int totalSales) {		this.totalSales = totalSales;	}
	public void setValidOnline(boolean validOnline) {	this.validOnline = validOnline;	}
	public void validateAndSale(int purchases) {
		if(purchases > this.getReset()) {	
			System.out.println("죄송합니다. 판매를 완료할 수 없습니다.");
			return;
		} int totalPrice = this.getValidOnline()? purchases*onPrice:
	}
	
	@Override 		//오버라이드
	public String toString() {
		return "Concert [singerName=" + singerName + ", capa=" + capa + ", soldNum=" + soldNum + ", onPrice=" + onPrice
				+ ", offPrice=" + offPrice + ", totalSales=" + totalSales + ", validOnline=" + validOnline + "]";
	}		
		
}
