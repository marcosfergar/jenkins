import java.util.Scanner;
public class ejer6{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int n;
		System.out.println("Dime un numero");
			n=teclado.nextInt();
		if (n<=10 && n>=0){
			System.out.println("Calificación correcta");
			}
	}
}