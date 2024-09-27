import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //System.out.println(str.charAt(0+2));
     checkBolean(str);

    }
    public static boolean checkBolean(String str){
        int result = str.indexOf("xyz");
        if(result > 1 && result <=result +2){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
    }
