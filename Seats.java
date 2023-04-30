import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Seats implements Serializable,SeatsInterface
{
    public int seat_number;
    public String seat_Descptn;
//Constructer For Seat Class
    public Seats(int seat_number,String seat_Descptn)
    {
        this.seat_number=seat_number;
        this.seat_Descptn=seat_Descptn;
    }

    //Read the filled seat from file and Increment it.Assign seat number to Booking and Save seat number to file
    public void asignseat(String fnme){
    int seats =0;
    Hall has = new Hall(0,null,null,null);

        try {
            FileInputStream fileIn = new FileInputStream(fnme);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Hall ob1 = (Hall) in.readObject();
            seats = ob1.seat.seat_number;
            has = ob1;
            in.close();
            fileIn.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        this.seat_number = seats+1;
        has.seat.seat_number = seats+1;

        Handler.fileWrite(fnme,has);
    }

    //Count filled Seats in the hall
    public static int countseat(String fnme){
        int seats =0;
        try {
            FileInputStream fileIn = new FileInputStream(fnme);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Hall ob1 = (Hall) in.readObject();
            seats = ob1.seat.seat_number;
            in.close();
            fileIn.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return seats;
    }
//Description of seat : No and Description
    @Override
    public String toString() {
        return "Seat Number:"+this.seat_number+" Description:"+this.seat_Descptn;
    }
}
