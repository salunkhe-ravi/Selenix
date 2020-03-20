package runners;

public class Singleton {

	private static Singleton single = null;
		
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		if(single == null) {
			synchronized (Singleton.class) {
				single = new Singleton();
			}
		}
		
		return single;
	}
}
