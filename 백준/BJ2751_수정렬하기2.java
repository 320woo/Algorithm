import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BJ2751_�������ϱ�2 {

	static int temp;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < T; i++) {
			list.add(sc.nextInt());
		}
		//Collections ������.
		Collections.sort(list);
		
		for (int i = 0; i < T; i++) {
			sb.append(list.get(i) + "\n");
		}
		
		System.out.println(sb);
	}

}
