import java.util.Scanner;

public class BJ10872_���丮�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int result = factory(num);
		System.out.println(result);
	}

	private static int factory(int num) {

		if (num == 0) return 1;
		
		return num * factory(num - 1);
	}
}
