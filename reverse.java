import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.print("Please enter a word: ");
        String oword = kb.nextLine();
        String word = oword.toUpperCase();
        int length = word.length();
        int i = 0;
        while (i < length)
        {
            System.out.println(word.substring(i,length));
            length--;
        }

    }

}
