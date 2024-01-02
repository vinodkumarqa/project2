package forloop1;

public class Forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int range=50;
		for(int i=1;i<=50;i++) {
			if(i%3==0 && i%5!=0){
				System.out.println("orange");
			}
			else if(i%5==0 && i%3!=0) {
		    	System.out.println("mango");
			}
			else if(i%3==0 && i%5==0){
		    	System.out.println("orangemango");
		    }
			 else {
			    	System.out.println(i);
			    }
			
		}

	}
}


