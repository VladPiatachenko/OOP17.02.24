import java.io.*;

public class Main {
public static void main(String[] args) throws IOException {
    File filename = new File("tmp.txt");
    BufferedReader reader = new BufferedReader(new FileReader(filename));
    try {
        String s;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }
    }
    finally {
        if (reader != null)
            reader.close();
    }


}
}

