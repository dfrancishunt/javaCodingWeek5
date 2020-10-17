package javaCodingWeek5;

public class App {

	public static void main(String[] args) {

		Logger AsLogger = new AsteriskLogger();		
		Logger SpLogger = new SpacedLogger();		
		
		AsLogger.Log("This building has to be at least... three times bigger than this!");
		AsLogger.Error("I am serious. And don't call me Shirley.");
		
		SpLogger.Log("We get the warhead and we hold the world ransom for: One million dollars.");
		SpLogger.Error("Leave the gun. Take the cannoli.");
		
	}

}
