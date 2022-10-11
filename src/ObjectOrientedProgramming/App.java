package ObjectOrientedProgramming;

public class App {
	public static void main(String[] args) {
		var msg = "Hello";
		var al = new AsteriskLogger();
		al.Log(msg);
		al.Error(msg);
		
		var sl = new SpacedLogger();
		sl.Log(msg);
		sl.Error(msg);
	}

}
