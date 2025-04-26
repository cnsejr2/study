import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static HashMap<String, Integer> code = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		String[] word = new String[n];
		for (int i = 0; i < n; i++) {
			word[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			int ten = 1;
			String[] array_word = new String[word[i].length()];
			array_word = word[i].split("");
			for (int j = word[i].length() -1; j >= 0; j--) {
				if (code.get(array_word[j]) != null) {
					code.put(array_word[j], code.get(array_word[j]) + ten);
				} else {
					code.put(array_word[j], ten);
				}	
				ten *= 10;
			}
			
		}
		
		// Map.Entry 리스트 작성
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(code.entrySet());

		// 비교함수 Comparator를 사용하여 오름차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 오름 차순 정렬
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});

//		System.out.println("내림 차순 정렬");
		// 결과 출력
		int sum = 0;
		int max = 9;
		for(Entry<String, Integer> entry : list_entries) {
			sum += (entry.getValue() * max);
			max--;
//			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println(sum);
		sc.close();
	}

}
