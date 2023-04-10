import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class UserGUI {
    static JFrame fUsr;
    static JPanel pUsr,pNowSw,cntnr,pMnSpMv,pUpMv,pBckGusr,pBkMv,pSgnin,pCrteAccnt;
    static JLabel lMv1,lMv2,lMv3, lupMv1, lupMv2,lMnsp,lSignin,lUsrSign,lPassSign,lCrteAccq;
    static JButton bnowSw, bupMv, bmnSpMv,bBack1,bBack2,bBack3,bBackMn,bSignIn,bBackSign,bCrteAcc, bBookMv1,bBookMv2,bBookMv3;
    static  JButton bCreate,bCrtBck;
    static  JLabel lCrtAcc,lFname,lLname,lAge,lEmail,lAddress;
    static JTextField tfUsrnm, tfPass,tfFname,tfLname,tfAge,tfEmail,tfAddress;

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

        lMv1 = new JLabel("Movie 1"+Movies.class.toString());
        lMv1.setBounds(100,100,400,100);
        lMv1.setForeground(Color.WHITE);
        pNowSw.add(lMv1);

        lMv2 = new JLabel("Movie 2");
        lMv2.setBounds(100,200,100,100);
        pNowSw.add(lMv2);

        lMv3 = new JLabel("Movie 3");
        lMv3.setBounds(100,300,100,100);
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

        lupMv1 = new JLabel("");
        lupMv1.setBounds(100,100,100,100);
        pUpMv.add(lupMv1);

        lupMv2 = new JLabel("Movie 2");
        lupMv2.setBounds(100,200,100,100);
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
        lMnsp.setBounds(100,100,100,100);
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

        lFname = new JLabel("First Name:");
        lFname.setBounds(100,100,200,50);
        lFname.setForeground(Color.WHITE);
        lFname.setFont(new Font("Cambria",Font.BOLD,18));
        pCrteAccnt.add(lFname);

        lLname = new JLabel("Last Name:");
        lLname.setBounds(100,150,200,50);
        lLname.setForeground(Color.WHITE);
        lLname.setFont(new Font("Cambria",Font.BOLD,18));
        pCrteAccnt.add(lLname);

        lAge = new JLabel("Age:");
        lAge.setBounds(100,200,200,50);
        lAge.setForeground(Color.WHITE);
        lAge.setFont(new Font("Cambria",Font.BOLD,18));
        pCrteAccnt.add(lAge);

        lAddress = new JLabel("Address");
        lAddress.setBounds(100,250,200,50);
        lAddress.setForeground(Color.WHITE);
        lAddress.setFont(new Font("Cambria",Font.BOLD,18));
        pCrteAccnt.add(lAddress);

        lEmail = new JLabel("Email");
        lEmail.setBounds(100,300,200,50);
        lEmail.setForeground(Color.WHITE);
        lEmail.setFont(new Font("Cambria",Font.BOLD,18));
        pCrteAccnt.add(lEmail);

        tfFname = new JTextField();
        tfFname.setBounds(210,110,250,30);
        pCrteAccnt.add(tfFname);

        tfLname = new JTextField();
        tfLname.setBounds(210,160,250,30);
        pCrteAccnt.add(tfLname);

        tfAge = new JTextField();
        tfAge.setBounds(210,210,250,30);
        pCrteAccnt.add(tfAge);

        tfAddress = new JTextField();
        tfAddress.setBounds(210,260,250,30);
        pCrteAccnt.add(tfAddress);

        tfEmail = new JTextField();
        tfEmail.setBounds(210,310,250,30);
        pCrteAccnt.add(tfEmail);


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
//Container==================================================================================
        crd = new CardLayout(100,100);
        cntnr = new JPanel(crd);
        cntnr.add(pUsr,"User");
        cntnr.add(pNowSw,"NowSW");
        cntnr.add(pUpMv,"Upcome");
        cntnr.add(pMnSpMv,"Monthly");
        cntnr.add(pSgnin,"signin");
        cntnr.add(pCrteAccnt,"crtAcc");
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
            }
        });

        bupMv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(cntnr,"Upcome");
            }
        });

        bmnSpMv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(cntnr,"Monthly");
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
                new Window();
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

            }
        });
        bCrtBck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.previous(cntnr);
            }
        });
    }

    public static void edit(String u){
        lMv1.setText(u);
    }
}
