import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Перевірка на (.xyz)");
        Scanner scanner = new Scanner(System.in);
       String str = scanner.nextLine();
        checkSimbol(str);

        }


      public static boolean  checkSimbol (String s){

        if (s.contains(".xyz")){
              System.out.println("false");
              return false;
          }
          System.out.println("true");
        return true;
    }
}