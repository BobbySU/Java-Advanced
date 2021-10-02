import java.io.File;

public class GetFolderSize08 {
    public static void main(String[] args) {

        File folder = new File("Exercises Resources");
        File[] in = folder.listFiles();

        int sum = 0;
        for (File e : in) {
            sum += e.length();
        }
        System.out.println("Folder size: " + sum);
    }
}
