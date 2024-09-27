import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Перевірка на (zip/zap)");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
          zzipZap(str);
        }
        public static  String zzipZap(String s){
        if(s.contains("zip") || s.contains("zap")){
            String i = s.replaceAll("[ia]","");
            System.out.println(i);
            return i;
        }
        System.out.println(s);
        return s;
    }
}