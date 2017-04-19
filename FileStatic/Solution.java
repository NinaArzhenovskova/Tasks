import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            String s;
            while ((s=reader.readLine()) != null) {
                lines.add(s);
            }
            reader.close();
        }
            catch (FileNotFoundException e) {}
            catch (IOException e) {}
    }
        
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
