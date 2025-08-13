package VehicleEx;

public class Car extends Vehicle {

	private int engine;

	public Car(String model, int price, int engine) {		//생성자
		super(model,price);
		this.engine = engine;
	}
	
	@Override
	public double calcTax() {
		if (engine >= 3000) {
			return getPrice() * 0.05;
		} else if (engine < 3000 && engine >= 1500) {
			return getPrice() * 0.03;
		} else {
			return getPrice() * 0.01;
		}
	}

	// 추상화 시킨 배기량 오버라이드 출력
	@Override
	public String getInfo() {
		return getModel() + ", 가격 :" + getPrice() + ", 배기량 :" + engine;
	}
}
