package pck1;
public class Test {
	public static void main(String args[]) throws BadBadValueException {
		try {
			TimeDuration tm = new TimeDuration(-2);
		}
		catch(BadBadValueException e) {
			e.printStackTrace();
		}
		
		TimeDuration tm1 = new TimeDuration(0);
		TimeDuration tm2 = new TimeDuration(732);
		TimeDuration tm3 = new TimeDuration(7242);
		
		System.out.println(tm1.toString());
		System.out.println(tm2.toString());
		System.out.println(tm3.toString());
		
		RaceResult raceResult = new RaceResult();
		raceResult.onNewResult("number 1 ", tm1);
		raceResult.onNewResult("number 2 ", tm2);
		raceResult.onNewResult("number 3 ", tm3);
		raceResult.printResults();
	}
}
