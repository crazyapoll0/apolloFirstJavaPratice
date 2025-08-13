package VehicleEx;

abstract public class Vehicle {
	private String model; 			//필드 선언
	private int price;

	Vehicle(String model, int price) {		//생성자 추가
		this.model = model;
		this.price = price;
	}
	
	// 모델 getter, setter
	public String getModel() { 
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// 가격 getter,setter
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// String getInfo() ; 추상 메서드
	abstract String getInfo();

	// double calcTax() ; 추상 메서드
	abstract double calcTax();
	
}
