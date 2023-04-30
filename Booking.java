import javax.swing.*;
import java.io.*;
import java.security.SecureRandom;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Booking implements Serializable,BookingInterface {

    private static final long serialVersionUID = 1L;
    int bkngId;
    String bkngTpe;
    String bkngDte;
    String bkngDscrp;
    Payments pay;
    Hall hl;

    Booking(int bkngId,String bkngTpe,String bkngDte,Payments pay,Hall hl){
        this.bkngId = bkngId;
        this.bkngTpe = bkngTpe;
        this.bkngDte = bkngDte;
        this.pay = pay;
        this.hl = hl;

    }
    //write Booking Details to Files
    public void addbooking(Booking bk){
        try {
            FileWriter myWriter = new FileWriter("BookingDetails.txt",true);
            myWriter.write(bk.toString());
            myWriter.write("\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writeBookingID() {

        Booking bkiwrite = new Booking(0, null, null, null, null);
        Handler.fileWrite("Booking.ser",bkiwrite);
    }

    public void loadBookingID(){
        Booking bkn = new Booking(0,null,null,null,null);
        int bkId = 0;
        try {
            FileInputStream fileIn = new FileInputStream("Booking.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Booking ob1 = (Booking) in.readObject();
            bkId = ob1.bkngId;
            bkn = ob1;
            in.close();
            fileIn.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        this.bkngId = bkId +1;
        bkn.bkngId = bkId+1;

        try
                (FileOutputStream fileOut = new FileOutputStream("Booking.ser")) {

            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(bkn);
            objectOut.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//    Set ID and Date and Type for Booking
    public void setBkIdDteTpe(){
        //Set The Date and Time
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalTime timef = time.withSecond(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm"); // create formatter for HH:MM format
        String formattedTime = timef.format(formatter);

        this.bkngDte = date.toString()+" "+formattedTime;

        //Set the Booking type

        if(UserGUI.jrBcMv1.isSelected()==true | UserGUI.jrBcMv2.isSelected()==true | UserGUI.jrBcMv3.isSelected()==true){
            this.bkngTpe = "Now Showing";
        }
        else if(UserGUI.jrBcUp1.isSelected()==true |UserGUI.jrBcUp2.isSelected()==true){
            this.bkngTpe = "Upcoming";
        } else if (UserGUI.jrBcMs.isSelected() == true) {
            this.bkngTpe = "Monthly special";
        }
        else {
            this.bkngTpe = "";
        }
    }
    @Override
    public String toString() {
        return "BKID:"+this.bkngId+" BKDate:"+this.bkngDte+" BKTpe:"+this.bkngTpe+" BKDesc:"
                +this.bkngDscrp+"||MovieDetail:"+this.hl.mv.mvNme+" "+this.hl.mv.mvtpe+"||Customer Detail"+"||Payment: "+this.pay.toString()+" "+this.hl.seat.seat_number;
    }//Print Details
    public static int countBookings(){
        int cont = 0;
        try {
            FileInputStream fileIn = new FileInputStream("Booking.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Booking ob1 = (Booking) in.readObject();
            cont =  ob1.bkngId;
            in.close();
            fileIn.close();

        } catch (IOException e) {
            e.printStackTrace();
            return  0;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
        return cont;
    }
    public static void bookingInfo(){


        AdminGUI.jBckInfo1.setText("Movie:"+Movies.getMovie("Movie.ser",1).mvNme+" -- Hall 1"+" -- No.of Seats: "+Seats.countseat("Hall1.ser"));
        AdminGUI.jBckInfo2.setText("Movie:"+Movies.getMovie("Movie1.ser",1).mvNme+" -- Hall 2"+" -- No.of Seats:"+Seats.countseat("Hall2.ser"));
        AdminGUI.jBckInfo3.setText("Movie:"+Movies.getMovie("Movie2.ser",1).mvNme+" --Hall 3"+" -- No.of Seats:"+Seats.countseat("Hall3.ser"));
        AdminGUI.lToalBking.setText("Total Bookings: "+countBookings());
    }
}
