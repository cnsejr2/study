import java.util.*;

public class Main {

	static HashSet<Integer> set = new HashSet<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		int[] arr = new int[n];
		int[] output = new int[n];
		boolean[] visited = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		perm(arr, output, visited, 0, n, r);
		
		ArrayList<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		
		boolean flag = true;
		for (int i : list) {
			if (isPrime(i)) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println(-1);
		}
		
		sc.close();
	}
	
	// 소수 판별
    private static boolean isPrime(int num) {
    	
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
        	// num이 i로 나눈 나머지가 0이면 소수가 아님
            if (num % i == 0) {
                return false;
            }
        }
        System.out.print(num + " ");
        // 반복문을 무사히 마치면 소수
        return true;
    }

	private static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		// TODO Auto-generated method stub
		if (depth == r) {
			sum(output, r);
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				output[depth] = arr[i];
				perm(arr, output, visited, depth + 1, n, r);
				visited[i] = false;
			}
		}		
	}

	private static void sum(int[] output, int r) {
		// TODO Auto-generated method stub
		int s = 0;
		for (int i = 0; i < r; i++) {
			s += output[i];
		}
		set.add(s);
	}

}
