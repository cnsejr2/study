import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean[] check = new boolean[26];
		
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String[] str = sc.nextLine().split(" ");
			if (str.length == 1) {
				boolean isFind = false;
				for (int j = 0; j < str[0].length(); j++) {
					char ch = str[0].charAt(j);
					ch = Character.toLowerCase(ch);
					int now = ch;
					if (!check[now - 'a'] && !isFind) {
						check[now - 'a'] = true;
						System.out.print("[" + str[0].charAt(j) + "]");
						isFind = true;
					} else {
						System.out.print(str[0].charAt(j));
					}
				}
				System.out.println();
			} else {
				int j = 0;
				boolean isFind = false;
				for (j = 0; j < str.length; j++) {
					char ch = str[j].charAt(0);
					ch = Character.toLowerCase(ch);
					int now = ch;
					if (!check[now - 'a'] && !isFind) {
						check[now - 'a'] = true;
						isFind = true;
						break;
					} 
				}
				
				if (isFind) {
					for (int k = 0; k < str.length; k++) {
						if (k == j) {
							System.out.print("[" + str[k].charAt(0) + "]");
							for (int z = 1; z < str[k].length(); z++) {
								System.out.print(str[k].charAt(z));
							}
							System.out.print(" ");
						} else {
							System.out.print(str[k] + " ");
						}
					}
					System.out.println();
				} else {
					isFind = false;
					for (int k = 0; k < str.length; k++) {
						for (int z = 0; z < str[k].length(); z++) {
							char ch = str[k].charAt(z);
							ch = Character.toLowerCase(ch);
							int now = ch;
							if (!check[now - 'a'] && !isFind) {
								check[now - 'a'] = true;
								System.out.print("[" + str[k].charAt(z) + "]");
								isFind = true;
							} else {
								System.out.print(str[k].charAt(z));
							}
						}
						System.out.print(" ");
					}
					System.out.println();
				}
			}
		}
		
		sc.close();
		
	}

}
