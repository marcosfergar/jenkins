import java.util.Scanner;
public class ejer3{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int n, m;
		System.out.println("Dime un numero");
			n=teclado.nextInt();
		System.out.println("Dime otro numero");
			m=teclado.nextInt();
		if (n==m){
			System.out.println("Los numeros son iguales");
			}
	}
}