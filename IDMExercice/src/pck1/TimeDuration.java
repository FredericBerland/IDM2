package pck1;

public class TimeDuration {
	
	private int nbSec;
	
	public TimeDuration(int nbSec) throws BadBadValueException {
		if(nbSec<0) {
			throw new BadBadValueException();
		}
		this.nbSec = nbSec;
	}
	
	@Override
	public String toString() {
		String fStr = "";
		int duration=this.nbSec;
		if(duration/3600 > 0) {
			int h = this.nbSec/3600;
			duration -= h*3600;
			fStr += ""+h+"h ";
		}
		if(duration/60 > 0) {
			int m = this.nbSec/60;
			duration -= m*60;
			fStr += ""+m+"m ";
		}
		else if(fStr != "") {
			fStr +="0m ";
		}
		
		fStr += ""+duration+"s";
		return fStr;
	}
}
