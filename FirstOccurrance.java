import java.util.Scanner;
import java.util.Arrays;
class FirstOccurrance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String string=sc.next();
		string=string.toUpperCase();
		int freq[]=new int[26];

		for(int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				freq[ch - 'A']++;
			}
		}

		for(int i=0; i<string.length(); i++) {
			if(Character.isLetter(string.charAt(i))) {
				if(freq[string.charAt(i)-'A']==1) {
					System.out.println(string.charAt(i));
					return;
				}

			}
		}
		System.out.println("No unique character found");
		sc.close();
	}
}