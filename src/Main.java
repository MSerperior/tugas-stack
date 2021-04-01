import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int data;
		Stack stack = new Stack();
		stack.fillTestData();
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while (exit) {
			menu();
			System.out.print("Menu yang dipilih : ");
			int in = input.nextInt();
			switch (in) {
				case 1:
					System.out.println("\n=========================");
					System.out.println("| T A M B A H   D A T A |");
                    System.out.println("| Masukkan data :       |");
                    data = input.nextInt();
                    stack.push(data);
					break;
			
				case 2:
					System.out.println("\n=========================");
					System.out.println("|  A M B I L   D A T A  |");
					System.out.print("| Data	: ");
					data = stack.pop();
					if(data == -1) {
						System.out.println("stack kosong" + " ".repeat(2) + "|\n");
					}else {
						System.out.println(data + " ".repeat(14-(String.valueOf(data).length())) + "|\n");
					}
					break;
			
				case 3:
					System.out.println("\n=========================");
					System.out.println("|D A T A   T E R A T A S|");
                    System.out.println("|Data : " + stack.peek() + " ".repeat(14) + "|\n");
					break;
			
				case 4:
					System.out.println("\n=========================");
					System.out.println("|  S E M U A   D A T A  |");
					show(stack);
					break;
			
				case 5:
					System.out.println("\n=========================");
					System.out.println("|   B U A T   B A R U   |");
					stack.clear();
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

	private static void show(Stack stack){
		int[] st = stack.getStack();
		for (int i = stack.getPtr(); i >=0; i--) {
			System.out.println("|‾‾‾‾‾|");
			System.out.printf("| %- 3d |\n",st[i]);
		}
		System.out.println("‾‾‾‾‾‾‾");
	}

}
