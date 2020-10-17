package javaCodingWeek5;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String Log) {
		String newString = "***" + Log + "***";
		System.out.println(newString);
	}

	@Override
	public void Error(String Error) {
		int countLen = Error.length() + 15;
		String boxLine = "";
		for(int i = 0; i < countLen; i++) {
			boxLine += "*";
		}
		String newString = boxLine + "\n*** ERROR: " + Error + " ***\n" + boxLine;
		System.out.println(newString);
	}

}
