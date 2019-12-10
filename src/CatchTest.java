import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CatchTest {

    public static int func() throws FileNotFoundException {
        File file = new File("d:/test.txt");
        Scanner scanner = new Scanner(file);
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        try {
            func();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
