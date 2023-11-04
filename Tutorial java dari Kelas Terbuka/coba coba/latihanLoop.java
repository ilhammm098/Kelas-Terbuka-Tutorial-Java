import java.util.*;
public class latihanLoop{
	public static void main(String[] args){
		Scanner inputUser = new Scanner(System.in);

		System.out.print("masukkan jumlaa baris : ");
		int rows = inputUser.nextInt();
		System.out.println("## Printing the pattern ##");

		for(int i = 1; i <= rows; i++){
			for(int j = rows; j > i; j--){
				System.out.print(" ");
			}
			for(int k = 1; k <= (i * 2); k++){
				System.out.print("*");
			}
			System.out.println();
	}
	for(int i = rows-1; i >= 1; i--){
		for(int j = rows-1; j >= i; j--){
			System.out.print("*");
		}
		System.out.println();
	}
}
	
}