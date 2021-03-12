import java.io.*;
import java.util.Scanner;

public class Copy {
    public static void copy(File a, File b) throws IOException {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);

        try {

            int n;

            while ((n = in.read()) != -1) {

                out.write(n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {

                in.close();
            }

            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");
    }

    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        File x = new File("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text1.txt");

        File y = new File("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text2.txt");

        copy(x, y);
    }
}

