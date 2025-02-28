import java.util.Scanner;
public class ejer9{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int n, m, b;
		System.out.println("Dime un angulo");
			n=teclado.nextInt();
		System.out.println("Dime otro angulo");
			m=teclado.nextInt();
		System.out.println("Dime otro angulo");
			b=teclado.nextInt();
		if ((n+m+b)!=180){
			System.out.println("Error en la entrada");
			}
	}
}