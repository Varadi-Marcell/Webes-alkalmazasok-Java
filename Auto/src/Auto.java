public class Auto {

	
	private final Kerek[] kerekek;
	private final Motor motor;
	private final String tipus;
	
	public Auto(Kerek[] kerekek, Motor motor, String tipus) {
		super();
		this.kerekek = kerekek;
		this.motor = motor;
		this.tipus = tipus;
	}

	@Override
	public String toString() {
		return "Auto [kerekek=" + kerekek[0].toString() + ", motor=" + motor.toString() + "tipus "+ tipus+ "]";
	}
	

	
	
	
}
