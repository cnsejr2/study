import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static char[] wordArr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int tc=0;tc<TC;tc++) {
			String word = br.readLine();
			wordArr = word.toCharArray();
			
			if(nextPermutation()) {
				for (int i=0;i<word.length();i++) {
					sb.append(wordArr[i]);
				}
				sb.append("\n");
			} else sb.append(word+"\n");
		}
		System.out.println(sb);
	}
	
	static boolean nextPermutation() {
    	// 1. 교환 위치 찾기
		int i = wordArr.length-1;
		while(i>0 && wordArr[i-1]>=wordArr[i]) --i;
		if (i==0) return false;  // i가 0이라면 정렬 끝으로 다음 순열이 없으므로 false 리턴
		
        // 2. 교환할 위치 찾기
		int j = wordArr.length-1;
		while(wordArr[i-1]>=wordArr[j]) --j;
		
        // 3. 교환
		char temp = wordArr[i-1];
		wordArr[i-1] = wordArr[j];
		wordArr[j] = temp;
		
        // 4. 교환 위치 이후 값 정렬
		int k = wordArr.length-1;
		while(i<k) {
			temp = wordArr[i];
			wordArr[i] = wordArr[k];
			wordArr[k] = temp;
			++i; --k;
		}
		return true;
    }
}