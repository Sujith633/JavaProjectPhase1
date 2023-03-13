package JavaFSDpro;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Phaseone {

	public static void main(String[] args) {
		Welcome.empdetails();
		Files fd = new Files();
		Application();
	}

	public static void Application() {
		Scanner obj = new Scanner(System.in);
		Files fd = new Files();

		while (true) {
			System.out.println("Enter your choice : ");
			System.out.println("1 - For Sorting the Files");
			System.out.println("2 - For Performing the File Operations");
			System.out.println("3 - For Exit");
			System.out.println("4 - For printing existing files");
			System.out.println("-----------------------------------------------");
			try {
				int ch = obj.nextInt();
				switch (ch) {
				case 1:
					fd.sort();
					break;
				case 2:
					System.out.println("Welcome to perform File Operations");
					System.out.println("1 - Add File");
					System.out.println("2 - Remove File");
					System.out.println("3 - Search File");
					System.out.println("-----------------------------------------------");

					int ch2 = obj.nextInt();
					Scanner obj1 = new Scanner(System.in);
					if (ch2 == 1) {
						System.out.println("Enter te file name to be added :");
						String af = obj1.nextLine();
						fd.addInput(af);
					} else if (ch2 == 2) {
						System.out.println("Enter te file name to be remove :");
						String rf = obj1.nextLine();
						fd.removeInput(rf);
					} else if (ch2 == 3) {
						System.out.println("Enter te file name to search :");
						String sf = obj1.nextLine();
						fd.searchInput(sf);
					} else {
						System.out.println("Invalid");
					}
					break;
				case 3:
					System.out.println("The program is Terminated");
					System.exit(0);
					break;
				case 4:
					fd.print();
					break;
				default:
					System.out.println("Invalid");
					break;
				}
			}catch(InputMismatchException x) {
				System.out.println("Wrong input type");
				System.exit(0);
			}catch (Exception e) {
				System.out.println(e.getCause());
				System.exit(0);
			}

		}
	}

}

class Welcome {
	static void empdetails() {
		System.out.println("---------------Welcome to Company Lockers Private Limited----------------");
		System.out.println("Developed by Sujith Reddy");
		System.out.println("Employee ID :       10843");
	}
}
