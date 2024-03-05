import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public void createFile() {
        try (FileWriter writer = new FileWriter("Toys")) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



    public void writeFile(String toyString) {
       try (FileWriter fWrite = new FileWriter("Toys", true)){
           fWrite.write(toyString + ";");
           fWrite.append("\n");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }

}