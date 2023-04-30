import javax.swing.*;
import java.util.*;
import java.io.*;
public class Movies implements MovieInterface,Serializable{

    public int movie_id;
    public String mvNme;
    public String mvLang;
    public String mvtpe;
    public double mvDrtn;
    public String mvDscp;

    public Movies(int mvID, String mvNme, String mvLang, String mvTpe, double mvDrtn, String mvDscp) {
        this.movie_id = mvID;
        this.mvNme = mvNme;
        this.mvLang = mvLang;
        this.mvtpe = mvTpe;
        this.mvDrtn = mvDrtn;
        this.mvDscp = mvDscp;

    }

    public void addMovie(String fNme, Object myobj) {

        Handler.fileWrite(fNme,myobj);

    }//Add Movie to relavent File

    public static Movies getMovie(String nme, int cls) {
        String fileNme = nme;
        int clss = cls;
        if (clss == 1) {
            try {
                FileInputStream fileIn = new FileInputStream(fileNme);
                ObjectInputStream in = new ObjectInputStream(fileIn);

                Movies ob1 = (Movies) in.readObject();

                in.close();
                fileIn.close();
                return ob1;
            } catch (IOException e) {
                e.printStackTrace();
                return new Movies(0, null, null, null, 0, null);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return new Movies(0, null, null, null, 0, null);
            }
        } else if (clss == 2) {
            try {
                FileInputStream fileIn = new FileInputStream(fileNme);
                ObjectInputStream in = new ObjectInputStream(fileIn);

                upcomingMovies ob1 = (upcomingMovies) in.readObject();

                in.close();
                fileIn.close();
                return ob1;
            } catch (IOException e) {
                e.printStackTrace();
                return new upcomingMovies(0, null, null, null, 0, null);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return new upcomingMovies(0, null, null, null, 0, null);
            }
        } else if(clss == 3) {
            try {
                FileInputStream fileIn = new FileInputStream(fileNme);
                ObjectInputStream in = new ObjectInputStream(fileIn);

                monthlySpecial ob1 = (monthlySpecial) in.readObject();

                in.close();
                fileIn.close();
                return ob1;
            } catch (IOException e) {
                e.printStackTrace();
                return new monthlySpecial(0, null, null, null, 0, null);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return new monthlySpecial(0, null, null, null, 0, null);
            }
        }
        else {
            return new Movies(0, null, null, null, 0, null);
        }
    }//Load Movie from files

    public String detailMovie() {
        return this.movie_id+" |  "+this.mvNme+" |  "+this.mvtpe+" |  "+this.mvLang+" |  "+this.mvDrtn+"min |  "+"Rating:"+this.mvDscp;
    }//Return Movie Details

}
class upcomingMovies extends Movies{
        upcomingMovies(int mvID,String mvNme,String mvLang,String mvTpe,double mvDrtn,String mvDscp){
            super(mvID,mvNme,mvLang,mvTpe,mvDrtn,mvDscp);
        }

}

class monthlySpecial extends Movies{
    monthlySpecial(int mvID,String mvNme,String mvLang,String mvTpe,double mvDrtn,String mvDscp){
        super(mvID,mvNme,mvLang,mvTpe,mvDrtn,mvDscp);
    }

}


