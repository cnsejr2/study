import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	static class Nation implements Comparable<Nation> {
		int num, gold, silver, bronze;
		
		public Nation(int num, int gold, int silver, int bronze) {
			this.num = num;
			this.gold = gold;
			this.silver = silver;
			this.bronze = bronze;
		}

		@Override
		public int compareTo(Nation o) {
			if (this.gold == o.gold) {
				if (this.silver == o.silver) {
					return o.bronze - this.bronze;
				} else {
					return o.silver - this.silver;
				}
			} else {
				return o.gold - this.gold;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		ArrayList<Nation> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			StringTokenizer tmp = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(tmp.nextToken());
			int gold = Integer.parseInt(tmp.nextToken());
			int silver = Integer.parseInt(tmp.nextToken());
			int bronze = Integer.parseInt(tmp.nextToken());
			
			Nation nation = new Nation(num, gold, silver, bronze);
			list.add(nation);
		}
		
		Collections.sort(list);
		
		int rate = 1;
		int cnt = 1;
		
		if (list.get(0).num == t) {
			System.out.println(1);
			return;
		}
		
		for (int i = 1; i < n; i++) {
			Nation prev = list.get(i - 1);
			Nation cur = list.get(i);
			
			if ((prev.gold != cur.gold) || (prev.silver != cur.silver) || (prev.bronze != cur.bronze)) {
				rate += cnt;
				cnt = 1;
			} else {
				cnt++;
			}
			if (cur.num == t) {
				System.out.println(rate);
				break;
			}
		}
		

	}

}
