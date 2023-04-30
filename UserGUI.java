import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Serializable;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class UserGUI implements Serializable {
    static JFrame fUsr;
    static JPanel pUsr,pNowSw,cntnr,pMnSpMv,pUpMv,pBckGusr,pBkMv,pSgnin,pCrteAccnt,pBookings,pCardPay,pSumma;
    static JLabel lMv1,lMv2,lMv3, lupMv1, lupMv2,lMnsp,lSignin,lUsrSign,lPassSign,lCrteAccq;
    static JLabel lBook,lBkNs,lBcUp,lBcMs;
    static JButton bnowSw, bupMv, bmnSpMv,bBack1,bBack2,bBack3,bBackMn,bSignIn,bBackSign,bCrteAcc, bBookMv1,bBookMv2,bBookMv3;
    static JButton bBookS,bBookBck;
    static  JButton bCreate,bCrtBck,bCrdbk,bCrdPay,bsumOk;
    static  JLabel lCrtAcc,lFname, lMbNo,lAge,lEmail,lAddress,lCrdTit,lCrdcrd,lCrdcvc,lCrddte,lcrdNme,lSummary,lSummThnx,lCrtUsrnme,lCrtPw,ltimDes,lsum1,lsum2,lpayamnt;
    static JTextField tfUsrnm, tfPass,tfFname,tfMbNo,tfAge,tfEmail,tfAddress,tfCrtUsrNme,tfcrtPw;
    JTextField tfPyNme,tfPyCNo1,tfPyCNo2,tfPyCNo3,tfPyCNo4,tfPyExp,tfPyCVC;

    static  JRadioButton jrBcMv1,jrBcMv2,jrBcMv3,jrBcUp1,jrBcUp2,jrBcMs,jrPycnf;
    CardLayout crd;


    UserGUI() {

        Border bdrUsr = BorderFactory.createRaisedBevelBorder();


        fUsr = new JFrame("Users");
        fUsr.setSize(800, 800);
        fUsr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fUsr.setLocationRelativeTo(null);
        fUsr.setResizable(false);

        //Background===================================================================

        ImageIcon imgusr = new ImageIcon(getClass().getResource("Bckgrnd.jpg"));

        pBckGusr = new JPanel(new BorderLayout()){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imgusr.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };

//Card 1-USER WINDOW=========================================================================================
        pUsr = new JPanel();
        pUsr.setBackground(new Color(0x385095D2, true));
        pUsr.setBorder(bdrUsr);
        pUsr.setLayout(null);

        bnowSw = new JButton("Now Showing");
        bnowSw.setBounds(200,100,150,50);
        bnowSw.setForeground(Color.WHITE);
        bnowSw.setBackground(Color.BLACK);
        bnowSw.setFocusable(false);
        pUsr.add(bnowSw);

        bupMv = new JButton("Upcoming Movies");
        bupMv.setBounds(200,200,150,50);
        bupMv.setForeground(Color.WHITE);
        bupMv.setBackground(Color.BLACK);
        bupMv.setFocusable(false);
        pUsr.add(bupMv);

        bmnSpMv = new JButton("Monthly Special");
        bmnSpMv.setBounds(200,300,150,50);
        bmnSpMv.setForeground(Color.WHITE);
        bmnSpMv.setBackground(Color.BLACK);
        bmnSpMv.setFocusable(false);
        pUsr.add(bmnSpMv);


        bBackMn = new JButton("BACK");
        bBackMn.setFocusable(false);
        bBackMn.setBounds(50,450,100,50);
        bBackMn.setForeground(Color.WHITE);
        bBackMn.setBackground(Color.BLACK);
        pUsr.add(bBackMn);

//Card 2-NOW SHOWING=================================================================================================
        pNowSw = new JPanel(null);
        pNowSw.setBackground(new Color(0x385095D2, true));
        pNowSw.setBorder(bdrUsr);

        ltimDes = new JLabel("------- 1: 0800-1000  2: 1200-1400 3: 1600-1800 -------");
        ltimDes.setBounds(50,30,450,50);
        ltimDes.setFont(new Font("Cambria",Font.BOLD,18));
        ltimDes.setForeground(Color.RED);
        pNowSw.add(ltimDes);

        lMv1 = new JLabel();
        lMv1.setBounds(100,100,400,100);
        lMv1.setFont(new Font("Cambria",Font.BOLD,16));
        lMv1.setForeground(Color.WHITE);
        pNowSw.add(lMv1);

        lMv2 = new JLabel();
        lMv2.setBounds(100,200,400,100);
        lMv2.setFont(new Font("Cambria",Font.BOLD,16));
        lMv2.setForeground(Color.WHITE);
        pNowSw.add(lMv2);

        lMv3 = new JLabel();
        lMv3.setBounds(100,300,400,100);
        lMv3.setFont(new Font("Cambria",Font.BOLD,16));
        lMv3.setForeground(Color.WHITE);
        pNowSw.add(lMv3);

        bBack1 = new JButton("BACK");
        bBack1.setFocusable(false);
        bBack1.setForeground(Color.WHITE);
        bBack1.setBackground(Color.BLACK);
        bBack1.setBounds(50,450,100,50);
        pNowSw.add(bBack1);
//Card 3-UPCOMING=====================================================================================
        pUpMv = new JPanel(null);
        pUpMv.setBackground(new Color(0x385095D2, true));
        pUpMv.setBorder(bdrUsr);

        lupMv1 = new JLabel();
        lupMv1.setBounds(100,100,400,100);
        lupMv1.setFont(new Font("Cambria",Font.BOLD,16));
        lupMv1.setForeground(Color.WHITE);
        pUpMv.add(lupMv1);

        lupMv2 = new JLabel();
        lupMv2.setBounds(100,200,400,100);
        lupMv2.setFont(new Font("Cambria",Font.BOLD,16));
        lupMv2.setForeground(Color.WHITE);
        pUpMv.add(lupMv2);

        bBack2 = new JButton("BACK");
        bBack2.setFocusable(false);
        bBack2.setForeground(Color.WHITE);
        bBack2.setBackground(Color.BLACK);
        bBack2.setBounds(50,450,100,50);
        pUpMv.add(bBack2);
//Card 4-MONTHLY SPECIAL====================================================================
        pMnSpMv = new JPanel(null);
        pMnSpMv.setBackground(new Color(0x385095D2, true));
        pMnSpMv.setBorder(bdrUsr);

        lMnsp = new JLabel("Movie 1");
        lMnsp.setBounds(100,100,400,100);
        lMnsp.setFont(new Font("Cambria",Font.BOLD,16));
        lMnsp.setForeground(Color.WHITE);
        pMnSpMv.add(lMnsp);

        bBack3 = new JButton("BACK");
        bBack3.setFocusable(false);
        bBack3.setForeground(Color.WHITE);
        bBack3.setBackground(Color.BLACK);
        bBack3.setBounds(50,450,100,50);
        pMnSpMv.add(bBack3);

//Card Book Movie===========================================================================
        pBkMv = new JPanel(null);
        pBkMv.setBackground(new Color(0x385095D2, true));
        pBkMv.setBorder(bdrUsr);



//Card Create Account========================================================================
        pCrteAccnt = new JPanel(null);
        pCrteAccnt.setBackground(new Color(0x385095D2, true));
        pCrteAccnt.setBorder(bdrUsr);

        lCrteAccq = new JLabel("Create Account");
        lCrteAccq.setBounds(200,20,250,100);
        lCrteAccq.setForeground(Color.WHITE);
        lCrteAccq.setFont(new Font("Cambria",Font.BOLD,32));
        pCrteAccnt.add(lCrteAccq);

        lFname = new JLabel("Name:");
        lFname.setBounds(100,100,200,50);
        lFname.setForeground(Color.WHITE);
        lFname.setFont(new Font("Cambria",Font.BOLD,18));
        pCrteAccnt.add(lFname);

        lMbNo = new JLabel("Mobile No:");
        lMbNo.setBounds(100,150,200,50);
        lMbNo.setForeground(Color.WHITE);
        lMbNo.setFont(new Font("Cambria",Font.BOLD,18));
        pCrteAccnt.add(lMbNo);

        lAge = new JLabel("Age:");
        lAge.setBounds(100,200,200,50);
        lAge.setForeground(Color.WHITE);
        lAge.setFont(new Font("Cambria",Font.BOLD,18));
        pCrteAccnt.add(lAge);

        lAddress = new JLabel("Address:");
        lAddress.setBounds(100,250,200,50);
        lAddress.setForeground(Color.WHITE);
        lAddress.setFont(new Font("Cambria",Font.BOLD,18));
        pCrteAccnt.add(lAddress);

        lEmail = new JLabel("Email:");
        lEmail.setBounds(100,300,200,50);
        lEmail.setForeground(Color.WHITE);
        lEmail.setFont(new Font("Cambria",Font.BOLD,18));
        pCrteAccnt.add(lEmail);

        lCrtUsrnme = new JLabel("User Name:");
        lCrtUsrnme.setBounds(100,350,200,50);
        lCrtUsrnme.setForeground(Color.WHITE);
        lCrtUsrnme.setFont(new Font("Cambria",Font.BOLD,18));
        pCrteAccnt.add(lCrtUsrnme);

        lCrtPw = new JLabel("Password:");
        lCrtPw.setBounds(100,400,200,50);
        lCrtPw.setForeground(Color.WHITE);
        lCrtPw.setFont(new Font("Cambria",Font.BOLD,18));
        pCrteAccnt.add(lCrtPw);



        tfFname = new JTextField();
        tfFname.setBounds(210,110,250,30);
        pCrteAccnt.add(tfFname);

        tfMbNo = new JTextField();
        tfMbNo.setBounds(210,160,250,30);
        pCrteAccnt.add(tfMbNo);

        tfAge = new JTextField();
        tfAge.setBounds(210,210,250,30);
        pCrteAccnt.add(tfAge);

        tfAddress = new JTextField();
        tfAddress.setBounds(210,260,250,30);
        pCrteAccnt.add(tfAddress);

        tfEmail = new JTextField();
        tfEmail.setBounds(210,310,250,30);
        pCrteAccnt.add(tfEmail);

        tfCrtUsrNme = new JTextField();
        tfCrtUsrNme.setBounds(210,360,250,30);
        pCrteAccnt.add(tfCrtUsrNme);

        tfcrtPw = new JTextField();
        tfcrtPw.setBounds(210,410,250,30);
        pCrteAccnt.add(tfcrtPw);


        bCrtBck = new JButton("Back");
        bCrtBck.setFocusable(false);
        bCrtBck.setBounds(50,450,100,50);
        bCrtBck.setBackground(Color.BLACK);
        bCrtBck.setForeground(Color.WHITE);
        pCrteAccnt.add(bCrtBck);

        bCreate = new JButton("Create");
        bCreate.setFocusable(false);
        bCreate.setBounds(450,450,100,50);
        bCreate.setBackground(Color.BLACK);
        bCreate.setForeground(Color.WHITE);
        pCrteAccnt.add(bCreate);

//Card Sign In===============================================================================
        pSgnin = new JPanel(null);
        pSgnin.setBackground(new Color(0x385095D2, true));
        pSgnin.setBorder(bdrUsr);

        lSignin = new JLabel("Sign in");
        lSignin.setBounds(250,20,200,100);
        lSignin.setForeground(Color.WHITE);
        lSignin.setFont(new Font("Cambria",Font.BOLD,32));
        pSgnin.add(lSignin);

        lCrteAccq = new JLabel("Don't have a Account?");
        lCrteAccq.setBounds(150,310,200,50);
        lCrteAccq.setForeground(Color.WHITE);
        lCrteAccq.setFont(new Font("Cambria",Font.BOLD,16));
        pSgnin.add(lCrteAccq);

        lUsrSign = new JLabel("Username");
        lUsrSign.setBounds(150,130,200,50);
        lUsrSign.setForeground(Color.WHITE);
        lUsrSign.setFont(new Font("Cambria",Font.BOLD,18));
        pSgnin.add(lUsrSign);

        lPassSign = new JLabel("Password");
        lPassSign.setBounds(150,230,200,50);
        lPassSign.setForeground(Color.WHITE);
        lPassSign.setFont(new Font("Cambria",Font.BOLD,18));
        pSgnin.add(lPassSign);

        bSignIn = new JButton("Sign in");
        bSignIn.setBounds(400,450,150,50);
        bSignIn.setFocusable(false);
        bSignIn.setBackground(Color.BLACK);
        bSignIn.setForeground(Color.WHITE);
        pSgnin.add(bSignIn);

        bCrteAcc = new JButton("Create Account");
        bCrteAcc.setFocusable(false);
        bCrteAcc.setBounds(150,350,150,30);
        bCrteAcc.setForeground(Color.WHITE);
        bCrteAcc.setBackground(Color.BLACK);
        pSgnin.add(bCrteAcc);

        bBackSign = new JButton("Back");
        bBackSign.setFocusable(false);
        bBackSign.setBounds(50,450,100,50);
        bBackSign.setBackground(Color.BLACK);
        bBackSign.setForeground(Color.WHITE);
        pSgnin.add(bBackSign);
        bBackSign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(cntnr,"User");
            }
        });

        tfUsrnm = new JTextField();
        tfUsrnm.setBounds(150,180,250,30);
        pSgnin.add(tfUsrnm);

        tfPass = new JPasswordField(15);
        tfPass.setBounds(150,280,250,30);
        pSgnin.add(tfPass);

//Booking Window============================================================================
        pBookings = new JPanel(null);
        pBookings.setBackground(new Color(0x385095D2, true));
        pBookings.setBorder(bdrUsr);

        lBook = new JLabel("Book");
        lBook.setBounds(250,20,200,50);
        lBook.setForeground(Color.WHITE);
        lBook.setFont(new Font("Cambria",Font.BOLD,32));
        pBookings.add(lBook);

        lpayamnt = new JLabel("One order per time || One Seat will be Rs 120.00");
        lpayamnt.setBounds(110,90,400,20);
        lpayamnt.setFont(new Font("Cambria",Font.BOLD,16));
        lpayamnt.setForeground(Color.green);
        pBookings.add(lpayamnt);

        lBkNs = new JLabel("Now Showing");
        lBkNs.setBounds(50,140,200,20);
        lBkNs.setFont(new Font("Cambria",Font.BOLD,16));
        lBkNs.setForeground(Color.WHITE);
        pBookings.add(lBkNs);

        lBcUp = new JLabel("Upcoming");
        lBcUp.setBounds(50,260,200,20);
        lBcUp.setFont(new Font("Cambria",Font.BOLD,16));
        lBcUp.setForeground(Color.WHITE);
        pBookings.add(lBcUp);

        lBcMs = new JLabel("Monthly Special");
        lBcMs.setBounds(50,360,200,20);
        lBcMs.setFont(new Font("Cambria",Font.BOLD,16));
        lBcMs.setForeground(Color.WHITE);
        pBookings.add(lBcMs);

        jrBcMv1 =new JRadioButton("Movie 1");
        jrBcMv1.setBounds(200,160,150,20);
        jrBcMv1.setBackground(new Color(0, 0, 0, 255));
        jrBcMv1.setForeground(Color.WHITE);
        pBookings.add(jrBcMv1);

        jrBcMv2 =new JRadioButton("Movie 2");
        jrBcMv2.setBounds(200,190,150,20);
        jrBcMv2.setBackground(new Color(0, 0, 0, 255));
        jrBcMv2.setForeground(Color.WHITE);
        pBookings.add(jrBcMv2);

        jrBcMv3 =new JRadioButton("Movie 3");
        jrBcMv3.setBounds(200,220,150,20);
        jrBcMv3.setBackground(new Color(0, 0, 0, 255));
        jrBcMv3.setForeground(Color.WHITE);
        pBookings.add(jrBcMv3);

        jrBcUp1 =new JRadioButton("Upcoming 1");
        jrBcUp1.setBounds(200,290,150,20);
        jrBcUp1.setBackground(new Color(0, 0, 0, 255));
        jrBcUp1.setForeground(Color.WHITE);
        pBookings.add(jrBcUp1);

        jrBcUp2 =new JRadioButton("Upcomind 2");
        jrBcUp2.setBounds(200,320,150,20);
        jrBcUp2.setBackground(new Color(0, 0, 0, 255));
        jrBcUp2.setForeground(Color.WHITE);
        pBookings.add(jrBcUp2);

        jrBcMs =new JRadioButton("Monthly Special");
        jrBcMs.setBounds(200,400,150,20);
        jrBcMs.setBackground(new Color(0, 0, 0, 255));
        jrBcMs.setForeground(Color.WHITE);
        pBookings.add(jrBcMs);

        ButtonGroup grpEdit = new ButtonGroup();
        grpEdit.add(jrBcMv1);
        grpEdit.add(jrBcMv2);
        grpEdit.add(jrBcMv3);
        grpEdit.add(jrBcUp1);
        grpEdit.add(jrBcUp1);
        grpEdit.add(jrBcMs);


        bBookS = new JButton("Book");
        bBookS.setFocusable(false);
        bBookS.setBounds(450,450,100,50);
        bBookS.setForeground(Color.WHITE);
        bBookS.setBackground(Color.BLACK);
        pBookings.add(bBookS);

        bBookBck = new JButton("Back");
        bBookBck.setFocusable(false);
        bBookBck.setBounds(50,450,100,50);
        bBookBck.setBackground(Color.BLACK);
        bBookBck.setForeground(Color.WHITE);
        pBookings.add(bBookBck);

        bBookBck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.previous(cntnr);
            }
        });

//Card CardPay
        pCardPay = new JPanel(null);
        pCardPay.setBackground(new Color(0x385095D2, true));
        pCardPay.setBorder(bdrUsr);

        lCrdTit = new JLabel("Paymnt");
        lCrdTit.setBounds(250,50,200,50);
        lCrdTit.setForeground(Color.WHITE);
        lCrdTit.setFont(new Font("Cambria",Font.BOLD,32));
        pCardPay.add(lCrdTit);

        lcrdNme = new JLabel("Name on the card");
        lcrdNme.setBounds(100,100,200,50);
        lcrdNme.setForeground(Color.WHITE);
        lcrdNme.setFont(new Font("Cambria",Font.BOLD,18));
        pCardPay.add(lcrdNme);

        lCrdcrd = new JLabel("Enter Card Number");
        lCrdcrd.setBounds(100,200,200,50);
        lCrdcrd.setForeground(Color.WHITE);
        lCrdcrd.setFont(new Font("Cambria",Font.BOLD,18));
        pCardPay.add(lCrdcrd);

        lCrdcvc = new JLabel("CVC");
        lCrdcvc.setBounds(360,300,100,50);
        lCrdcvc.setForeground(Color.WHITE);
        lCrdcvc.setFont(new Font("Cambria",Font.BOLD,18));
        pCardPay.add(lCrdcvc);

        lCrddte = new JLabel("Date Of Expiry");
        lCrddte.setBounds(100,300,200,50);
        lCrddte.setForeground(Color.WHITE);
        lCrddte.setFont(new Font("Cambria",Font.BOLD,18));
        pCardPay.add(lCrddte);

        tfPyNme = new JTextField();
        tfPyNme.setBounds(100,150,300,30);
        pCardPay.add(tfPyNme);

        tfPyCNo1 = new JTextField();
        tfPyCNo1.setBounds(100,250,50,30);
        pCardPay.add(tfPyCNo1);

        tfPyCNo2 = new JTextField();
        tfPyCNo2.setBounds(160,250,50,30);
        pCardPay.add(tfPyCNo2);

        tfPyCNo3 = new JTextField();
        tfPyCNo3.setBounds(220,250,50,30);
        pCardPay.add(tfPyCNo3);

        tfPyCNo4 = new JTextField();
        tfPyCNo4.setBounds(280,250,50,30);
        pCardPay.add(tfPyCNo4);

        tfPyCVC = new JTextField();
        tfPyCVC.setBounds(410,310,50,30);
        pCardPay.add(tfPyCVC);

        tfPyExp = new JTextField();
        tfPyExp.setBounds(240,310,50,30);
        pCardPay.add(tfPyExp);

        bCrdbk = new JButton("Back");
        bCrdbk.setFocusable(false);
        bCrdbk.setBounds(50,450,100,50);
        bCrdbk.setBackground(Color.BLACK);
        bCrdbk.setForeground(Color.WHITE);
        pCardPay.add(bCrdbk);

        bCrdPay = new JButton("Confirm and Pay");
        bCrdPay.setFocusable(false);
        bCrdPay.setBounds(400,450,150,50);
        bCrdPay.setBackground(Color.BLACK);
        bCrdPay.setForeground(Color.WHITE);
        pCardPay.add(bCrdPay);
//Card Summary============================================================================================
        pSumma = new JPanel(null);
        pSumma.setBackground(new Color(0x385095D2, true));
        pSumma.setBorder(bdrUsr);

        lSummThnx = new JLabel("Thank You");
        lSummThnx.setBounds(200,20,200,100);
        lSummThnx.setForeground(Color.WHITE);
        lSummThnx.setFont(new Font("Cambria",Font.BOLD,32));
        pSumma.add(lSummThnx);

        lSummary = new JLabel();
        lSummary.setBounds(50,150,450,50);
        lSummary.setForeground(Color.WHITE);
        lSummary.setFont(new Font("Cambria",Font.BOLD,18));
        pSumma.add(lSummary);

        lsum1 = new JLabel();
        lsum1.setBounds(50,200,500,50);
        lsum1.setForeground(Color.WHITE);
        lsum1.setFont(new Font("Cambria",Font.BOLD,18));
        pSumma.add(lsum1);

        lsum2 = new JLabel();
        lsum2.setBounds(50,250,500,50);
        lsum2.setForeground(Color.WHITE);
        lsum2.setFont(new Font("Cambria",Font.BOLD,18));
        pSumma.add(lsum2);

        bsumOk = new JButton("OK");
        bsumOk.setFocusable(false);
        bsumOk.setBounds(450,450,100,50);
        bsumOk.setBackground(Color.BLACK);
        bsumOk.setForeground(Color.WHITE);
        pSumma.add(bsumOk);

//Container==================================================================================
        crd = new CardLayout(100,100);
        cntnr = new JPanel(crd);
        cntnr.add(pUsr,"User");
        cntnr.add(pNowSw,"NowSW");
        cntnr.add(pUpMv,"Upcome");
        cntnr.add(pMnSpMv,"Monthly");
        cntnr.add(pSgnin, "signin");
        cntnr.add(pCrteAccnt,"crtAcc");
        cntnr.add(pBookings,"Bookings");
        cntnr.add(pCardPay,"Payments");
        cntnr.add(pSumma,"Summary");
        cntnr.setOpaque(false);
        pBckGusr.add(cntnr,BorderLayout.CENTER);
        fUsr.add(pBckGusr);

//Button Book
        bBookMv1 = new JButton("Book");
        bBookMv1.setFocusable(false);
        bBookMv1.setBounds(450,450,100,50);
        bBookMv1.setForeground(Color.WHITE);
        bBookMv1.setBackground(Color.BLACK);
        pNowSw.add(bBookMv1);

        bBookMv2 = new JButton("Book");
        bBookMv2.setFocusable(false);
        bBookMv2.setBounds(450,450,100,50);
        bBookMv2.setForeground(Color.WHITE);
        bBookMv2.setBackground(Color.BLACK);
        pUpMv.add(bBookMv2);

        bBookMv3 = new JButton("Book");
        bBookMv3.setFocusable(false);
        bBookMv3.setBounds(450,450,100,50);
        bBookMv3.setForeground(Color.WHITE);
        bBookMv3.setBackground(Color.BLACK);
        pMnSpMv.add(bBookMv3);




        ActionListener signin = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(cntnr,"signin");
            }
        };
        bBookMv1.addActionListener(signin);
        bBookMv2.addActionListener(signin);
        bBookMv3.addActionListener(signin);
//Button Functions===============================================================================
        bnowSw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(cntnr,"NowSW");
                Movies ob = (Movies)Movies.getMovie("Movie.ser",1);
                Movies ob1 = (Movies)Movies.getMovie("Movie1.ser",1);
                Movies ob2 = (Movies)Movies.getMovie("Movie2.ser",1);
                lMv1.setText(ob.detailMovie());
                lMv2.setText(ob1.detailMovie());
                lMv3.setText(ob2.detailMovie());
            }
        });

        bupMv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(cntnr,"Upcome");
                upcomingMovies ob = (upcomingMovies) Movies.getMovie("UpMovie1.ser",2);
                upcomingMovies ob1 = (upcomingMovies) Movies.getMovie("UpMovie2.ser",2);
                lupMv1.setText(ob.detailMovie());
                lupMv2.setText(ob1.detailMovie());

            }
        });

        bmnSpMv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(cntnr,"Monthly");
                monthlySpecial ob = (monthlySpecial) Movies.getMovie("MsMovie.ser",3);
                lMnsp.setText(ob.detailMovie());
            }
        });

        ActionListener back = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(cntnr,"User");
            }
        };
        bBack1.addActionListener(back);
        bBack2.addActionListener(back);
        bBack3.addActionListener(back);

        bBackMn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fUsr.setVisible(false);
                Main.mainW.fMnWnd.setVisible(true);
            }
        });

        bCrteAcc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(cntnr,"crtAcc");
            }
        });
        bCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer obj  = new Customer(tfFname.getText(),Integer.parseInt(tfMbNo.getText()),tfEmail.getText(),tfAddress.getText(),Integer.parseInt(tfAge.getText()));
                obj.setUsrPassword(tfCrtUsrNme.getText(), tfcrtPw.getText());
                obj.addCustomer(obj);
                JOptionPane.showMessageDialog(null,"Account Created Successfully","Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        bSignIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(Customer.valdUsrPasswrd(tfUsrnm.getText(), tfPass.getText())==true){
                        crd.show(cntnr,"Bookings");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Username Password Incorrect","Info",JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                finally {
                    jrBcMv1.setText("1: "+Movies.getMovie("Movie.ser",1).mvNme);
                    jrBcMv2.setText("2: "+Movies.getMovie("Movie1.ser",1).mvNme);
                    jrBcMv3.setText("3: "+Movies.getMovie("Movie2.ser",1).mvNme);
                    jrBcUp1.setText("1: "+upcomingMovies.getMovie("UpMovie1.ser",2).mvNme);
                    jrBcUp2.setText("2: "+upcomingMovies.getMovie("UpMovie2.ser",2).mvNme);
                    jrBcMs.setText("1: "+monthlySpecial.getMovie("MsMovie.ser",3).mvNme);
                }
            }
        });


        bCrtBck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.previous(cntnr);
            }
        });

        bCrdbk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.previous(cntnr);
            }
        });
        bsumOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(cntnr,"Bookings");
            }
        });
        bBookBck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.previous(cntnr);
            }
        });
        bBookS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                crd.show(cntnr,"Payments");
            }
        });
        bCrdPay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Hall h1;
                if(jrBcMv1.isSelected() == true ) {
                    h1 = Hall.checkHall("Movie.ser");
                    h1.seat = h1.addSeat(h1);
                }
                else if(jrBcMv2.isSelected() == true ) {
                    h1 = Hall.checkHall("Movie1.ser");
                    h1.seat = h1.addSeat(h1);
                }
                else if(jrBcMv3.isSelected() == true ) {
                    h1 = Hall.checkHall("Movie2.ser");
                    h1.seat = h1.addSeat(h1);
                } else if (jrBcUp1.isSelected()==true | jrBcUp2.isSelected()==true | jrBcMs.isSelected() == true) {

                    h1 = new Hall(0,null,null,null);
                } else {
                    h1 = new Hall(0,null,null,null);
                }

                Payments pay = new Payments(tfPyNme.getText(),tfPyCNo1.getText()+tfPyCNo2.getText()+tfPyCNo3.getText()+tfPyCNo4.getText(),tfPyCVC.getText(),tfPyExp.getText(),54.2);
                pay.savePaymnt(pay);
                Booking bk = new Booking(0,null,null,null,null);
//                Booking.writeBookingID();
                bk.loadBookingID();
                bk.setBkIdDteTpe();
                bk.hl = h1;
                bk.pay = pay;
                bk.addbooking(bk);

                Payments.summary(bk);

                crd.show(cntnr,"Summary");
            }
        });

        bsumOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(cntnr,"Bookings");
            }
        });
    }


}
