package abstrakteKlasseAUTO;

public class LamborghiniUrus extends Auto {

	public LamborghiniUrus(int Geshwindigkeit1) {
		super(Geshwindigkeit1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int fahren() {
		// TODO Auto-generated method stub
		System.out.print("Der LamborghiniUrus f�hrt ");
		System.out.print(Geschwindigkeit);
		System.out.println(" km/h");
		return Geschwindigkeit;
	}

}
