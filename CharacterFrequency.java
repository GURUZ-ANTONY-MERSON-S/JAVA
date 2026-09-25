import java.util.Scanner;
import java.util.HashSet;

class CharacterFrequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String str=sc.next();
		int freq[]=new int[26];
		HashSet <Character> set=new HashSet<>();

		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			freq[ch- 'a']++;
			set.add(ch);
		}
		for(char ch: set) {
			System.out.println(ch+" - "+freq[ch - 'a']);
		}
	}
}