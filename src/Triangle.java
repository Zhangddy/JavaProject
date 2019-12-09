import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        func(n);
        scanner.close();
    }
    public static  void func(int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(' ');
            }
            if (i == 0) {
                System.out.println('*');
            }
            else {
                System.out.print('*');
                for (int k = 0; k < i * 2 - 1; k++) {
                    System.out.print(' ');
                }
                System.out.println('*');
            }

        }
        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print('*');
        }
        System.out.printf("\n");
    }
    ;
}

