package uni.iit.SpringBoot.Auto;

public class MotorImpl {
	private final int loero;
	private final int ccm;

	public MotorImpl(int loero, int ccm) {
		this.loero = loero;
		this.ccm = ccm;
	}

	@Override
	public String toString() {
		return "MotorImpl [loero=" + loero + ", ccm=" + ccm + "]";
	}
}
