import java.io.FileNotFoundException;
import java.io.FileReader;

public class Read_File {
    public static void main(String[] args) throws Exception {
        FileReader f = new FileReader("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text1.txt");

        int i;
        while((i = f.read())!= - 1)
        {
            System.out.println(((char) i));
        }
    }
}
