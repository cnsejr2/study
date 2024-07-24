import java.util.Scanner;

public class Main {
	
	static int n, m, max;
	static int[][] arr;
	static boolean[] visit;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m][2];
		visit = new boolean[n + 1];
		
		for (int i = 0; i < m; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		max = 0;
	
		find(0, 0);
		max *= 2;
		
		System.out.println(max < n ? max + 1 : max);
        
        sc.close();
	}

	private static void find(int index, int count) {
		// TODO Auto-generated method stub
		if (index >= m) {
			max = Math.max(max, count);
			return;
		}
		
		if (visit[arr[index][0]] || visit[arr[index][1]]) {
			find(index + 1, count);
		} else {
			visit[arr[index][0]] = true;
			visit[arr[index][1]] = true;
			
			find(index + 1, count + 1);
			
			visit[arr[index][0]] = false;
			visit[arr[index][1]] = false;
			
			find(index + 1, count);
			
		}
	}



}
