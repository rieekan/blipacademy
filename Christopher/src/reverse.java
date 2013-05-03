import java.util.*;

public class reverse {
	public static void main(String[] args) {
		int n = 0;
		int b = 0;

		String str = " ";
		Scanner keyboard = new Scanner(System.in);
		System.out.print("how many arrays do you want? -->");
		n = keyboard.nextInt();
		keyboard.nextLine();
		String[] a = new String[n];
		System.out.print("you want " + n + " Array's? That's fine by me.");
		System.out.println(" ");

		// array comand stucture
		{

			for (int s = 0; s < n; s++) {
				str = keyboard.nextLine();
				a[s] = str;
			}
			System.out.println(" ");

			for (int s = 0; s < n; s++) {
				System.out.print(a[s]);
				System.out.print(" ");
			}
			System.out.println(" ");

			for (int s = n - 1; s >= 0; s--) {
				System.out.print(a[s] + " ");
			}
			System.out.println(" ");
		}

	}
}