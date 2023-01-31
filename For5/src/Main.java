import java.util.Scanner;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static void main(String[] args) {
        try{

        System.out.printf("Выбери цвет");
        Scanner CC = new Scanner(System.in);
        int cho = CC.nextInt();

        switch (cho) {
            case 1:
                System.out.println(ANSI_RED + "This text is red!");
                break;
            case 2:
                System.out.println(ANSI_GREEN + "This text is Green!");
                break;
        }

        Scanner in = new Scanner(System.in);

        double price = in.nextDouble();

        for ( int i = 1; i <= 10; i++ ) {
            System.out.println(i*100 + " грамм = "+ price * i / 10 + " деняк");
        }
        }
        catch (Exception e) {
            System.out.println("Kto nagovnakodil? Ya");
        }
    }
}
