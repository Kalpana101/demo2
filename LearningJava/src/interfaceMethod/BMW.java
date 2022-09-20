package interfaceMethod;

public class BMW implements Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW starts");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW stop");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("BMW refuel");
	}

}
