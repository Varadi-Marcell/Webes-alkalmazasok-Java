package uni.iit.SpringBoot.Auto;

public class AutoImpl {
	private final Motor motor;
	private final Kerek[] kerekek;
	private final String tipus;

	public AutoImpl(Motor motor, Kerek[] kerekek, String tipus) {
		this.motor = motor;
		this.kerekek = kerekek;
		this.tipus = tipus;
	}

	@Override
	public String toString() {
		return "AutoImpl{" + "motor=" + motor.toString() + ", kerekek=" + kerekek[0].toString() + ", tipus='" + tipus + '\'' + '}';
	}

}
