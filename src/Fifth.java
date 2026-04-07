/*Priyan types a word in an online test, but sometimes he presses backspace shown as #.
His friend also types another word using the same broken keyboard.
After all typing and deletions are done, both final results must be compared.
A backspace removes the previous character, but if nothing is there, it does nothing.
Help Priyan check whether both typed results are finally the same.
Task:
Given two strings containing lowercase letters and #, compare final strings after processing backspaces.
Example:
Input:
ab#c
ad#c
Output: Yes
*/


import java.util.*;

public class Fifth {

    public static String pro(String str) {
        Stack<Character> obj = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (!obj.isEmpty()) {
                    obj.pop(); // remove previous char
                }
            } else {
                obj.push(ch); // add character
            }
        }

        // build final string
        StringBuilder builder = new StringBuilder();
        for (char c : obj) {
            builder.append(c);
        }

        return builder.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String c = pro(a);
        String d = pro(b);

        if(c.equals(d)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}