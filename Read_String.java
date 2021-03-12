import java.nio.file.*;;
public class Read_String
{
    public static String readFileAsString(String f)throws Exception
    {
        String d = "";
        d = new String(Files.readAllBytes(Paths.get(f)));
        return d;
    }

    public static void main(String[] args) throws Exception
    {
        String d = readFileAsString("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text1.txt");
        System.out.println(d);
    }
} 