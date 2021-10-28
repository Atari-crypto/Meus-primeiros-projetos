package aula3;
public class ex1 {

	public static void main(String[] args) {
		short num1 = 2;
		int num2 = 3;
		num2=num1;
		long num3= 234234234;
		num2=(int)num3;
		
		int infoentrada= 8;
		double infoconvertida=(double)infoentrada;
		
		boolean passeiprova = true;
		System.out.println( !passeiprova );
		boolean euestudei = false;
		System.out.println( passeiprova && euestudei );
		System.out.println( passeiprova || euestudei );
		System.out.println( !passeiprova || euestudei );
		System.out.println( !passeiprova || !euestudei );
		
	}
		
}