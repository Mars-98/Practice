
import java.util.Scanner;
public class AplusB {
	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
        int a = std.nextInt();
        int b = std.nextInt();
        System.out.println(sum(a, b));
	}
	public static int sum(int a, int b) {
		return a+b;
	}
}
