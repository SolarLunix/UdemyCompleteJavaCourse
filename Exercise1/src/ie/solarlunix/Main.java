package ie.solarlunix;

public class Main {
	public static void main(String[] args) {
		byte abit = 127;
		short ashort = 32767;
		int anint = 2147483647;
		long along = 50000 + 10*(abit + ashort + anint);
		System.out.println(along);
	}
}
