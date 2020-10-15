package pck1;
import java.util.HashMap;

public class RaceResult {
	private HashMap<String, TimeDuration> resultTable;
	
	public RaceResult() {
		resultTable = new HashMap<String, TimeDuration>();
	}
	
	public void onNewResult(String tagNumber, TimeDuration resultTime) {
		resultTable.put(tagNumber, resultTime);
	}
	
	public void printResults() {
		for(String vStr : resultTable.keySet()) {
			System.out.println(vStr +resultTable.get(vStr).toString());
		}
	}
}
