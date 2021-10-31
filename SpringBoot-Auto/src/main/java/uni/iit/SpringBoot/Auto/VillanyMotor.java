package uni.iit.SpringBoot.Auto;

public class VillanyMotor implements Motor {
	private final int teljesitmeny;
	private final int feszultseg;

	public VillanyMotor(int teljesitmeny, int feszultseg) {
		this.teljesitmeny = teljesitmeny;
		this.feszultseg = feszultseg;
	}

	@Override
	public String toString() {
		return "Villanymotor [teljesitmeny=" + teljesitmeny + ", feszultseg=" + feszultseg + "]";
	}
}
