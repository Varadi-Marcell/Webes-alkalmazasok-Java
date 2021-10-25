
public class Villanymotor implements Motor {
	
	private final int teljesitmeny;
	private final int feszultseg;
	private final String tipus;
	
	public Villanymotor(int teljesitmeny, int feszultseg, String tipus) {
		super();
		this.teljesitmeny = teljesitmeny;
		this.feszultseg = feszultseg;
		this.tipus = tipus;
	}

	@Override
	public String toString() {
		return "Villanymotor [teljesitmeny=" + teljesitmeny + ", feszultseg=" + feszultseg + "]";
	}
	
	
}
