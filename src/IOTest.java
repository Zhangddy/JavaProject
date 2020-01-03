import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("D:\\test.txt");
            FileWriter fileWriter = new FileWriter("D:\\new.txt");
            int tmp = fileReader.read();
            while(tmp != -1) {
                fileWriter.write((char)tmp);
                tmp = fileReader.read();
            }
            fileReader.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
