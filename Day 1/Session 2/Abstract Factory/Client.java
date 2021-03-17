
public class Client {
	public void clientSide() {
		
		//Audi
		Tire audiTire = FactoryMaker.getFactory("audi").makeTire();
		System.out.println(audiTire.getTireModel());
		
		Headlight audiHeadlight = FactoryMaker.getFactory("mercedes").makeHeadlight();
		System.out.println(audiHeadlight.getHeadlightModel());
		
		//Mercedes
		Tire mercedesTire = FactoryMaker.getFactory("mercedes").makeTire();
		System.out.println(mercedesTire.getTireModel());
		
		Headlight mercedesHeadlight = FactoryMaker.getFactory("mercedes").makeHeadlight();
		System.out.println(mercedesHeadlight.getHeadlightModel());
		
		
	}

}
