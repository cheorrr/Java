package HomeworkAndReview0109;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			ch[i] = str.charAt(ch.length-i-1);
			System.out.print(ch[i]);
		}
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			for(int i=0;i<token.length();i++) {
				ch = token.toCharArray();
				if(i==0) {
					ch[i] = (char) (ch[i]-32);
				}System.out.print(ch[i]);
			}System.out.print(" ");
		}
		
	}
}
