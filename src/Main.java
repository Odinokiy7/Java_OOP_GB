import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Init_Step.Init();

        while (true) {
            ConsoleView.view();
            sc.nextLine();
            Init_Step.Step();
        }
    }

}
