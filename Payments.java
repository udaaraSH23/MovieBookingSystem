import java.io.*;

public class Payments implements PaymentInterface {
    String cardno;
    String NmeOnCrd;
    String cvc;
    String exDte;
    static double pymntAmnt = 120.00;

    Seats seat;

    Payments(String nmeOnCrd,String cardno,String cvc,String exDte,double pymntAmnt){
        this.NmeOnCrd = nmeOnCrd;
        this.cardno = cardno;
        this.cvc = cvc;
        this.exDte = exDte;
        this.pymntAmnt = pymntAmnt;

    }

    public void savePaymnt(Payments pay){
        try {
            FileWriter myWriter = new FileWriter("Payment.txt",true);
            myWriter.write(pay.toString());
            myWriter.write("\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//Save the payment Details

    public static void summary(Booking bk){
        UserGUI.lSummary.setText("Movie: "+bk.hl.mv.mvNme+" Hall No: "+bk.hl.hlNo+" Seat Number: "+bk.hl.seat.seat_number);
        UserGUI.lsum1.setText("Booking Id: "+bk.bkngId+" Date,time: "+bk.bkngDte);
        UserGUI.lsum2.setText("Payment Amount = Rs 120.00");
    }


    @Override
    public String toString() {
        return  "PaymentAmount: "+pymntAmnt+this.pymntAmnt+" Card Name,No,CVC,ExpDte:"
                +this.NmeOnCrd+" "+this.cardno+""+this.cvc+" "+this.exDte;
    }
}
