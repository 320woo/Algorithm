import java.util.*;

public class BJ2447_�����10 {

	static char[][] arr;
	private static void star(int a, int b, int n) {
		int div = 0;
		
		//����ؼ� �޾ƿ� n�� 1�� ��쿡 ��� *�� ä���ش�.
		if (n == 1) {
			arr[a][b] = '*';
			return;
		}
		
		div = n / 3;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1) continue;
				//��� ����, ��ǥ �������ִ� ��� ����
				star(a + (div * i), b + (div * j), div);
			}
		}

	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		arr = new char[N][N];

		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], ' ');
		}
		
		star(0, 0, N);

		for(int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
