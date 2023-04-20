import javax.swing.*;
import java.util.*;
import java.io.*;
public class Movies implements Serializable{
    public int movie_id;
    public String mvNme;
    public String mvLang;
    public String mvtpe;
    public double mvDrtn;
    public String mvDscp;
    public Movies(int mvID,String mvNme,String mvLang,String mvTpe,double mvDrtn,String mvDscp){
        this.movie_id =mvID;
        this.mvNme = mvNme;
        this.mvLang = mvLang;
        this.mvtpe = mvTpe;
        this.mvDrtn = mvDrtn;
        this.mvDscp = mvDscp;

    }
    public static void editMovie() {
        
        try (FileOutputStream fileOut = new FileOutputStream("person.txt")) {

            // Create an object output stream
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            // Write the object to file
            objectOut.writeObject(Main.mv);

            // Close the object output stream and file output stream
            objectOut.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Open a file input stream to read the object from the file
            FileInputStream fileIn = new FileInputStream("person.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Read the object from the file and cast it to the appropriate class
            Movies ob1 = (Movies) in.readObject();

            // Close the input stream
            in.close();
            fileIn.close();

            // Do something with the object
            UserGUI.lMv1.setText(ob1.mvNme);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public void searchMovie(){}
class upcomingMovies extends Movies{
        upcomingMovies(int mvID,String mvNme,String mvLang,String mvTpe,double mvDrtn,String mvDscp){
            super(mvID,mvNme,mvLang,mvTpe,mvDrtn,mvDscp);
        }
//    public static void editMovie(){
//
//    }
}

class monthlySpecial extends Movies{
        monthlySpecial(int mvID,String mvNme,String mvLang,String mvTpe,double mvDrtn,String mvDscp){
            super(mvID,mvNme,mvLang,mvTpe,mvDrtn,mvDscp);
        }
//    public static void editMovie(){
//        UserGUI.lMnsp.setText(Main.mv.mvNme+"  "+Main.mv.mvtpe);
//    }
    }
    @Override
    public String toString() {
        return "Movies{" +
                "movie_id=" + movie_id +
                ", mvNme='" + mvNme + '\'' +
                ", mvLang='" + mvLang + '\'' +
                ", mvtpe='" + mvtpe + '\'' +
                ", mvDrtn=" + mvDrtn +
                ", mvDscp='" + mvDscp + '\'' +
                '}';
    }
}
