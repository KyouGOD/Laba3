import java.util.*;
public class StackInitializer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        char c= ' ';
        String c2 = "";
        Stack<String> words = new Stack<>();
        text = sc.nextLine();
        for (int i = 0; i < text.length();i++)
        {
            c = text.charAt(i);
            c2 = "" + c + "";
            words.push(c2);
        }
        for (int i = 0; i < text.length(); i++) System.out.print(words.pop());
    }
    }