import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Stack stack = new Stack();
		stack.fillTestData();
		Scanner input = new Scanner(System.in);
		menu();
		boolean exit = true;
		while (exit) {
			System.out.print("Menu yang dipilih : ");
			int in = input.nextInt();
			switch (in) {
				case 1:
					System.out.println("\n=========================");
					System.out.println("| T A M B A H   D A T A |");
					break;
			
				case 2:
					System.out.println("\n=========================");
					System.out.println("|  A M B I L   D A T A  |");				
					break;
			
				case 3:
					System.out.println("\n=========================");
					System.out.println("|D A T A   T E R A T A S|");
					break;
			
				case 4:
					System.out.println("\n=========================");
					System.out.println("|  S E M U A   D A T A  |");
					break;
			
				case 5:
					System.out.println("\n=========================");
					System.out.println("|	B U A T   B A R U	|");
					break;
			
				case 6:
					exit = false;
					break;
			
				default:
					System.err.println("\n<-- input salah -->");
					break;
			}
		}
	}

	private static void menu(){
		System.out.println("=========================");
		System.out.println("|        M E N U        |");
		System.out.println("=========================");
		System.out.println("|1.| Tambah Data        |");
		System.out.println("|2.| Ambil Data         |");
		System.out.println("|3.| Lihat Data Teratas |");
		System.out.println("|4.| Lihat Semua Data   |");
		System.out.println("|5.| Buat Stack Baru    |");
		System.out.println("|6.| Keluar             |");
	}

}
