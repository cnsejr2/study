import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static char black = '*';
	static char white = '.';
	static int[] dx = { 0, -1, 0, 1, 0};
	static int[] dy = { 0, 0, 1, 0, -1};
	static int size = 3;
	static int INF = 987654321;
	static char[][] mat;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			mat = new char[size][size];
			for (int j = 0; j < size; j++) {
				String s = br.readLine();
				for (int k = 0; k < size; k++) {
					mat[j][k] = s.charAt(k);
				}
			}
			System.out.println(dfs(0, 0));
		}
		
	}
	private static int dfs(int y, int x) {
		// TODO Auto-generated method stub
		int result = INF;
		
		if (y == size) {
			for(int i = 0 ; i < size ; i++){
                for(int j = 0 ; j < size ; j++){
                    if(mat[i][j] == black){
                        return INF;
                    }
                }
            }
            return 0;
		}
		
		int nextY = y;
		int nextX = x + 1;
		if (nextX >= size) {
			nextY = y + 1;
			nextX = 0;
		}
		
		result = Math.min(result, dfs(nextY, nextX));
		
		for (int k = 0; k < 5; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			if (ny >= 0 && ny < size && nx >= 0 && nx < size) {
				if (mat[ny][nx] == black) {
					mat[ny][nx] = white;
				} else {
					mat[ny][nx] = black;
				}
			}
		}
		
		result = Math.min(result, dfs(nextY, nextX) + 1);
		for (int k = 0; k < 5; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			
			if (ny >= 0 && ny < size && nx >= 0 && nx < size) {
				if (mat[ny][nx] == black) {
					mat[ny][nx] = white;
				} else {
					mat[ny][nx] = black;
				}
			}
		}
		return result;
	}
	
	
	
}
