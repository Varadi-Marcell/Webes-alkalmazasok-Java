import java.util.ArrayList;
import java.util.List;

public class AutoTest {

	public static void main(String[] args) {
		Motor motor16 = new MotorImpl(180,1600);
		
		Auto opelAstra = new Auto(get4kerek(),motor16,"Opel Astra");
		
		System.out.println(opelAstra);
	}

	private static Kerek[] get4kerek() {
		Kerek[] kerekek = new Kerek[4];
		for (int i = 0; i < 4; i++) {
			kerekek[i] = new KerekImpl(205,15,5);
			
		}
		return kerekek;
	}
}
//hazi springben megcsinálni
