import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        char [] charA = a.toCharArray();
        char [] charB = b.toCharArray();
        mix(charA,charB);
    }

    public static String mix(char[]a,char[]b) {
        StringBuilder newMix = new StringBuilder();

        for (int i = 0; i <= a.length; i++) {
            newMix.append(a[i]);
            newMix.append(b[i]);
            System.out.println(newMix);
        }
    return newMix.toString();
    }
}