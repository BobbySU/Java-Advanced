import java.io.*;

public class WriteEveryThirdLine05 {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        FileInputStream input = new FileInputStream(path);
        FileOutputStream out = new FileOutputStream("05.WriteEveryThirdLineOutput.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        BufferedWriter writer = new BufferedWriter(new PrintWriter("05.WriteEveryThirdLineOutput.txt"));

        String line = reader.readLine();
        int count = 1;
        while (line != null) {
            if (count % 3 == 0) {
                writer.write(line + System.lineSeparator());
            }
            line = reader.readLine();
            count++;
        }
        input.close();
        out.close();
        writer.close();
    }
}
