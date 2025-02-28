import java.util.Scanner;
public class ejer7{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int n;
		System.out.println("Dime una calificación");
			n=teclado.nextInt();
		if (n<1 || n>12){
			System.out.println("Calificación incorrecta");
			}
	}
}