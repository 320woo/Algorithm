
import java.util.Scanner;

public class BJ2775_�γ�ȸ���̵��׾� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			
			int floor = sc.nextInt();
			int ho = sc.nextInt();
			
			int[][] apt = new int[floor+1][15];
			for (int j = 1; j <= 14; j++) {
				apt[0][j] = j;
//				System.out.println(apt[0][j]);
			}
			
			
			//�׳� ����Ʈ �ο����� �� ������ش�. ��� �״�� �������. 
			for (int k = 1; k <= floor; k++) {
				for (int j = 1; j <= 14; j++) {
					for (int l = j; l > 0; l--) {						
						apt[k][j] += apt[k-1][l];
					}
				}
			}

//			for (int j = 0; j <= floor; j++) {
//				System.out.print(j + "�� : ");
//				for (int k = 1; k <= 14; k++) {
//					System.out.print(apt[j][k] + " ");
//				}
//				System.out.println("");
//			}
			
			System.out.println(apt[floor][ho]);
			
		}
		
	}

}
