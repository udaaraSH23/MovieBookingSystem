import java.io.*;

public class Handler {
    public static void fileWrite(String fnme,Object has){
        try
                (FileOutputStream fileOut = new FileOutputStream(fnme)) {

            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(has);
            objectOut.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
