
public class Homework {

	public static void main(String[] args) {
		
	
		for(int i=0;i<5;i++) {
			for(int k=1;k<5-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}	
}
