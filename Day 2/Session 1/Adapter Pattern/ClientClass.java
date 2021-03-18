
public class ClientClass {
	public static void main(String[] args) {
		Movable bugattiVeyron = new BugattiVeyron();
		
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImplement(bugattiVeyron);
		System.out.println(bugattiVeyronAdapter.getSpeed());
	}
	
}
