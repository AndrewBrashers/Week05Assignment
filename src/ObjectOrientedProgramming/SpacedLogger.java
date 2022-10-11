package ObjectOrientedProgramming;

public class SpacedLogger
implements Logger{
	public void Log(String msg) {
		System.out.println(msg.replace("", " ").trim());
	}
	
	public void Error(String msg) {
		System.out.println("ERROR: " + msg.replace("", " ").trim());
	}
}
