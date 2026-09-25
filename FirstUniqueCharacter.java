import java.util.Scanner;

class FirstUniqueCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String str=sc.nextLine();
		str=str.toLowerCase();

		int freq[] = new int[26];
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			freq[ch - 'a']++;
		}

		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(freq[ch - 'a']==1) {
				System.out.println(ch);
				return;
			}
		}
		System.out.println("No non repeating character found");
	}
}