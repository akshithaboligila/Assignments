import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		if (num1>num2)
		{
			System.out.println("Subraction of num2 with num1 result "+(num2-num1));
		}
		else
		{
			System.out.println("Subraction of num1 with num2 result "+(num1-num2));
		}
scan.close();
	}

}
