public class Tabuada{
	public void getTabuada(){
	
		int i;
		int j;
		
		for(i = 1; i <= 10; i++){
			System.out.println("Tabuada do " + i + ": ");
			for(j = 1; j <= 10; j++){
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println("=-=-=-=-=-=-=");
		}
	}
}
