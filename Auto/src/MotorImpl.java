
public class MotorImpl implements Motor {
	private final int loero;
	private final int ccm;
	
	public MotorImpl(int loero, int ccm) {
		super();
		this.loero = loero;
		this.ccm = ccm;
	}

	public int getCcm() {
		return ccm;
	}

	@Override
	public String toString() {
		return "MotorImpl [loero=" + loero + ", ccm=" + ccm + "]";
	}
	
}
