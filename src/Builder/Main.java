package Builder;

public class Main {

	public static void main(String[] args) {
		
		Director dir = new Director();
		
		PhoneBuilder phoneBuilder = new PhoneBuilder(null);
		dir.buildBudgetPhone(phoneBuilder);
		Phone myPhone = phoneBuilder.getResult();
		
		System.out.println(myPhone);
		
		PhoneBuilder flagShipBuilder = new PhoneBuilder(null);
		dir.buildFlagShip(flagShipBuilder);
		Phone flagshipPhone = flagShipBuilder.getResult();
		
		System.out.println(flagshipPhone .toString());
	}

}
