package abstrakteKlasseAUTO;

public class McLaren720s extends Auto {

	public McLaren720s(int Geshwindigkeit1) {
		super(Geshwindigkeit1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int fahren() {
		// TODO Auto-generated method stub
		System.out.println("Der McLaren720s fährt "+ Geschwindigkeit +" km/h");
		
		return Geschwindigkeit;
	}

}
