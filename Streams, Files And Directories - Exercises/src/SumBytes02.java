import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes02 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("input.txt");

        byte[] all = Files.readAllBytes(path);
        long sum =0;
        for (byte e:all) {
            if (e!=10&&e!=13){
                sum+=e;
            }
        }
        System.out.println(sum);
    }
}
