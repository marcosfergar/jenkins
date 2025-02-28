import java.util.Scanner;
public class ejer5{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int n, m, b;
		System.out.println("Dime un numero");
			n=teclado.nextInt();
		System.out.println("Dime otro numero");
			m=teclado.nextInt();
		if (n>m){
			b=n;
			n=m;
			m=b;
			}
			System.out.println(n+" "+m);
	}
}