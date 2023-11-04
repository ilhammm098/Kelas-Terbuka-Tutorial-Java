import java.util.Scanner;
public class MenghitungLuas{
	public static void main(String[] args){
		int panjang, lebar, luas;
		Scanner userInput = new Scanner(System.in);

		System.out.println("Menghitung luas perasegi panjang");
		System.out.print("panjang = ");
		panjang = userInput.nextInt();
		System.out.print("lebar = ");
		lebar = userInput.nextInt();

		luas = panjang * lebar;

		System.out.println("Luas persegi panjang adalah " + luas +" cm");
	}
}