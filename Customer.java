import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Customer implements CustomerInterface{

    static int cstmrID;
    String cstmrNme;
    int cstmrAge;
    int cstmrMbNo;
    String cstmrEml;
    private String cstmrUsrNme;
    private String cstmrPw;
    String cstmrAdrs;

    Customer(String cstmrNme, int cstmrMbNo, String cstmrEml, String cstmrAdrs, int age) {
        this.cstmrNme = cstmrNme;
        this.cstmrMbNo = cstmrMbNo;
        this.cstmrEml = cstmrEml;
        this.cstmrAdrs = cstmrAdrs;
        this.cstmrAge = age;

        cstmrID++;


    }

    public void setUsrPassword(String usrNme, String pw) {
        this.cstmrUsrNme = usrNme;
        this.cstmrPw = pw;
    }//Set the password
    public static boolean valdUsrPasswrd(String x,String y) throws IOException {
        int i;
        boolean auth = false;
        try {
            File myObj = new File("UserDetails.txt");
            Scanner myRdr = new Scanner(myObj);
            while (myRdr.hasNextLine()) {
                String data = myRdr.nextLine();
                String[] check = data.split(" ");

                if (check[check.length-2].equals("UserName:"+x) & check[check.length-1].equals("Password:"+y)& !x.equals("") & !y.equals("")){
                    System.out.println(check.length-2);
                    auth = true;
                    break;
                } else{
                    auth = false;
                }

            }

                    myRdr.close();
            }
             catch(FileNotFoundException e){
                 JOptionPane.showMessageDialog(null,"Error Occured","Warning",JOptionPane.INFORMATION_MESSAGE);
                e.printStackTrace();
            }
            return auth;

    }//LOad The File and Check for Paswword validity
    public void addCustomer(Object obj) {
        try {
            FileWriter myWriter = new FileWriter("UserDetails.txt",true);
            myWriter.write(obj.toString());
            myWriter.write("\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        }//Write User Details

    @Override
    public String toString() {
        return "Name:"+this.cstmrNme+" "+"Age:"+this.cstmrAge+" "+"Mobile No:"+this.cstmrMbNo+" "+"Address:"+this.cstmrAdrs+" Email:"+this.cstmrEml+" "+"UserName:"+this.cstmrUsrNme+" "+"Password:"+this.cstmrPw;
    }//Details of Customers to String
}




