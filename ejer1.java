import java.util.Scanner;
public class ejer1{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int edad;
		System.out.println("Dime tu edad");
			edad=teclado.nextInt();
		if (edad>=18){
			System.out.println("Eres mayor de edad");
			}
	}
}