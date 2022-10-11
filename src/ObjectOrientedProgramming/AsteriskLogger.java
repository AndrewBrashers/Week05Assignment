package ObjectOrientedProgramming;

public class AsteriskLogger 
implements Logger{
	public void Log(String msg) {
		System.out.println("***" + msg + "***");
	}
	
	public void Error(String msg) {
		String s = "*";
		String t = s.repeat(msg.length()+ 13);
		System.out.println(t);
		System.out.println("***ERROR: " + msg + "***");
		System.out.println(t);
	}
	
	
}
