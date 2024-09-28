import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = scanner.nextInt();

       newString(repeat(str,num),num);

    }
    public static String repeat(String s,int num){
        String result = s.substring(s.length() - num);
        return result;
    }

    public static StringBuffer newString (String str, int num){
        String result = str.substring(str.length() - num);
        StringBuffer newResult = new StringBuffer("");
        for (int i = 0; i <= num; i++){
            newResult.append(result);
        }
        System.out.println(newResult);
        return newResult;
    }
}