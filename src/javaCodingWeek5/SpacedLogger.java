package javaCodingWeek5;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String Log) {
		System.out.println(SpacedOut(Log));
	}

	@Override
	public void Error(String Error) {
		System.out.println("ERROR: " + SpacedOut(Error));
	}

	public String SpacedOut(String Text) {
		int n = 1;
		StringBuilder newString = new StringBuilder(Text);
		int idx = newString.length() - n;
		while (idx > 0){
			newString.insert(idx, " ");
		   idx = idx - n;
		}		
		return newString.toString();
	}
		
}
