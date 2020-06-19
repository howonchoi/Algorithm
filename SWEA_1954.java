import java.util.Scanner;

class SWEA_1954
{
	public static void main(String args[]) throws Exception
	{
		/*
		   �Ʒ��� �޼ҵ� ȣ���� ������ ǥ�� �Է�(Ű����) ��� input.txt ���Ϸκ��� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�.
		   �������� �ۼ��� �ڵ带 �׽�Ʈ �� ��, ���Ǹ� ���ؼ� input.txt�� �Է��� ������ ��,
		   �� �ڵ带 ���α׷��� ó�� �κп� �߰��ϸ� ���� �Է��� ������ �� ǥ�� �Է� ��� ���Ϸκ��� �Է��� �޾ƿ� �� �ֽ��ϴ�.
		   ���� �׽�Ʈ�� ������ ������ �Ʒ� �ּ��� ����� �� �޼ҵ带 ����ϼŵ� �����ϴ�.
		   ��, ä���� ���� �ڵ带 �����Ͻ� ������ �ݵ�� �� �޼ҵ带 ����ų� �ּ� ó�� �ϼž� �մϴ�.
		 */
		//System.setIn(new FileInputStream("res/input.txt"));

		/*
		   ǥ���Է� System.in ���κ��� ��ĳ�ʸ� ����� �����͸� �о�ɴϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case<=T; test_case++) {
			int N = sc.nextInt();
			int[][] map = new int[N][N];
			int[][] visit = new int[N][N];
			int y = 0;
			int x = 0;
			int n = 1;
			int end = N*N + 1;
			while(true) {
				while(x<N && visit[y][x] != 1) {
					map[y][x] = n;
					visit[y][x] = 1;
					x = x + 1;
					n++;
				}
				if(end == n) break;
				
				x -= 1;
				y += 1;
				while(y<N && visit[y][x] != 1) {
					map[y][x] = n;
					visit[y][x] = 1;
					y = y +1;
					n++;
				}
				if(end== n) break;
				
				y -= 1;
				x -= 1;
				while(x >= 0 && visit[y][x]!= 1) {
					map[y][x] = n;
					visit[y][x] = 1;
					x = x -1;
					n++;
				}
				if(end==n) break;
				
				x += 1;
				y -= 1;
				while(y >= 0 && visit[y][x] != 1 ) {
					map[y][x] = n;
					visit[y][x] = 1;
					y = y-1;
					n++;
				}
				if(end==n) break;
				
				y += 1;
				x += 1;
			}
			
			System.out.println("#"+test_case);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(map[i][j]+" ");
				}
				System.out.println("");
			}
			
		}
	}
}