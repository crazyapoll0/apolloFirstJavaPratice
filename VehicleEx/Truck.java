package VehicleEx;

public class Truck extends Vehicle {

	double capa;

	public Truck(String model, int price, double capa) {
		super(model,price);
		this.capa = capa;
	}
	
	@Override
	public double calcTax() {
		if (capa > 10000) {
			return getPrice() * 0.04;
		} else if (capa < 10000 && capa >= 5000) {
			return getPrice() * 0.02;
		} else {
			return getPrice() * 0.01;
		}
	}

	// 추상화 시킨 적재중량 오버라이드 출력
	@Override
	public String getInfo() {
		return getModel() + ", 가격 :" + getPrice() + ", 적재 중량 :" + capa;
	}

}
