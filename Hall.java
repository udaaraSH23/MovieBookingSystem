import javax.swing.*;
import java.io.*;

public class Hall implements Serializable,HallInteface{
    int hlNo;
    String hlDscp;
    Movies mv;
    Seats seat;

    Hall(int hlNo,String hlDscp,Movies mv,Seats seat){
        this.hlNo = hlNo;
        this.hlDscp = hlDscp;
        this.mv = mv;
        this.seat = seat;
    }


    //Check Which Hall Specific Movie is in and return the specific hall
    public static Hall checkHall(String fnme){

        Movies mv = Movies.getMovie(fnme,1);
        Hall h1 = loadHall("Hall1.ser");
        Hall h2 = loadHall("Hall2.ser");
        Hall h3 = loadHall("Hall3.ser");
            if(mv.mvNme.equals(h1.mv.mvNme)){
                return h1;
            } else if (mv.mvNme.equals(h2.mv.mvNme)) {
                return h2;
            } else if (mv.mvNme.equals(h3.mv.mvNme)) {
                return h3;
            }
            else {
                return new Hall(0,null,null,null);
            }

    }
    //
    public void saveHall(String fNme,Hall myobj){
        Handler.fileWrite(fNme,myobj);
    }//Save hall object to file
    public static Hall loadHall(String nme){
        try {
            FileInputStream fileIn = new FileInputStream(nme);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Hall ob1 = (Hall) in.readObject();

            in.close();
            fileIn.close();
            return ob1;
        } catch (IOException e) {
            e.printStackTrace();
            return new Hall(0, null, null,null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return new Hall(0, null, null,null);
        }


    }//Load Hall object from file
    public void setHall(Movies asi,int hall){
          int hld = hall;
         switch (hld){
             case 1:
                 this.mv = asi;
                 break;

             case 2:
                 this.mv = asi;
                 break;

             case 3:
                 this.mv = asi;
                 break;
         }
        this.mv = asi;
         JOptionPane.showMessageDialog(null,"Movie added to Hall","Info",JOptionPane.INFORMATION_MESSAGE);

    }//Assign Movie to a Hall

    public Seats addSeat(Hall h){

        Seats s = new Seats(0,null);
        if(h.hlNo == 1){
         s.asignseat("Hall1.ser");
         return s;
        }
        else if(h.hlNo == 2){
            s.asignseat("Hall2.ser");
            return s;
        }
        else if(h.hlNo == 1){
            s.asignseat("Hall3.ser");
            return s;
        }
        else{
            return s;
        }
    }//Add seat to Hall and Increment Seat Number
    @Override
    public String toString() {
        return "Hall No:"+this.hlNo+" Hall Description"+this.hlDscp;
    }
}
