import java.util.Scanner;
public class ejer1{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int n;
		System.out.println("Dime un numero");
			n=teclado.nextInt();
		if (n<0){
			System.out.println(n*(-1));
			}
	}
}