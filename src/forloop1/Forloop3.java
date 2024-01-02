package forloop1;

public class Forloop3 {
	public static void main(String[] args) {
		int n=1;
		boolean prime=true;
		for( int i=2;i<=n;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
		System.out.println("it is prime");
		}
		else {
		System.out.println("it is not prime");
		}
	}

}
