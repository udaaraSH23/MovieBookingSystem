import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Window{

    JFrame fMnWnd, fAdmnLog;
    JPanel pMnWnd, pAdmn;
    JLabel lMnWndw,lAdUNm,lAdPs, bckGrdMn,bckGrdAd,lExt,lLgn;
    JButton bAdmn, bUsr, bLgn,bBackLgn;
    JTextField tfNme,tfPsw;

    Window(){
//        Main Window  WELCOME------------------------------------------------------------------------------------------
        fMnWnd = new JFrame("Movie Booking System-SKU Movies");
        fMnWnd.setSize(800,800);
        fMnWnd.setResizable(false);
        fMnWnd.setLayout(null);
        fMnWnd.setLocationRelativeTo(null);
        fMnWnd.setDefaultCloseOperation(EXIT_ON_CLOSE);

//Border----------
         Border bdrPM = BorderFactory.createRaisedBevelBorder();
//----------------
//Panel for frame1.................................................
        pMnWnd  = new JPanel(null);
        pMnWnd.setBackground(new Color(0x385095D2, true));
        pMnWnd.setBounds(100,100,600,600);
        pMnWnd.setBorder(bdrPM);
        fMnWnd.add(pMnWnd);
//label for panel 1................................................
        lMnWndw = new JLabel("WELCOME" );
        lMnWndw.setBounds(200,20,400,100);
        lMnWndw.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,32));
        lMnWndw.setForeground(new Color(0xFFFFFFFF, true));
        pMnWnd.add(lMnWndw);

        lExt = new JLabel("Developed by ECS|UOK" );
        lExt.setBounds(200,500,400,100);
        lExt.setFont(new Font("Cambria",Font.PLAIN,18));
        lExt.setForeground(new Color(0xFFFFFFFF, true));
        pMnWnd.add(lExt);
//Background Image...............................................................
        ImageIcon img = new ImageIcon(Window.class.getResource("Bckgrnd.jpg"));
        bckGrdMn = new JLabel();
        bckGrdMn.setBounds(0,0,800,800);
        bckGrdMn.setIcon(img);
        fMnWnd.add(bckGrdMn);

//buttton for admin.....................................................
        bAdmn = new JButton("Admin");
        bAdmn.setBounds(50,250,150,100);
        bAdmn.setFocusable(false);
        bAdmn.setFont(new Font("Cambria",Font.BOLD,18));
        bAdmn.setBackground(Color.BLACK);
        bAdmn.setForeground(Color.WHITE);
        bAdmn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fMnWnd.setVisible(false);
                fAdmnLog.setVisible(true);

            }
        });
        pMnWnd.add(bAdmn);
//button for User.............................................................
        bUsr = new JButton("User");
        bUsr.setBounds(400,250,150,100);
        bUsr.setFont(new Font("Cambria",Font.BOLD,18));
        bUsr.setBackground(Color.BLACK);
        bUsr.setForeground(Color.WHITE);
        bUsr.setFocusable(false);
        pMnWnd.add(bUsr);

        bUsr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fMnWnd.setVisible(false);
                Main.user.fUsr.setVisible(true);

            }
        });
        fMnWnd.setVisible(true);
//        Window for Admin Login=========================================================================================
        fAdmnLog = new JFrame("Admin Login");
        fAdmnLog.setSize(800,800);
        fAdmnLog.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fAdmnLog.setLayout(null);
        fAdmnLog.setLocationRelativeTo(null);
        fAdmnLog.setResizable(false);

        pAdmn = new JPanel();
        pAdmn.setBounds(100,50,600,600);
        pAdmn.setBackground(new Color(0x385095D2, true));
        pAdmn.setLayout(null);
        pAdmn.setBorder(bdrPM);
        fAdmnLog.add(pAdmn);

        lAdUNm = new JLabel("Username");
        lAdUNm.setBounds(150,130,100,50);
        lAdUNm.setFont(new Font("Cambria",Font.BOLD,18));
        lAdUNm.setForeground(Color.WHITE);

        bckGrdAd = new JLabel();
        bckGrdAd.setBounds(0,0,800,800);
        bckGrdAd.setIcon(img);
        fAdmnLog.add(bckGrdAd);

        pAdmn.add(lAdUNm);

        lAdPs = new JLabel("Password");
        lAdPs.setBounds(150,230,200,50);
        lAdPs.setForeground(Color.WHITE);
        lAdPs.setFont(new Font("Cambria",Font.BOLD,18));
        pAdmn.add(lAdPs);

        lLgn = new JLabel("Login");
        lLgn.setBounds(250,20,200,100);
        lLgn.setForeground(Color.WHITE);
        lLgn.setFont(new Font("Cambria",Font.BOLD,32));
        pAdmn.add(lLgn);

        bLgn = new JButton("Login");
        bLgn.setBounds(400,500,150,50);
        bLgn.setFocusable(false);
        bLgn.setBackground(Color.BLACK);
        bLgn.setForeground(Color.WHITE);
        pAdmn.add(bLgn);

        bBackLgn = new JButton("Back");
        bBackLgn.setFocusable(false);
        bBackLgn.setBounds(50,500,100,50);
        bBackLgn.setBackground(Color.BLACK);
        bBackLgn.setForeground(Color.WHITE);
        pAdmn.add(bBackLgn);

        tfNme = new JTextField();
        tfNme.setBounds(150,180,250,30);
        pAdmn.add(tfNme);

        tfPsw = new JPasswordField(15);
        tfPsw.setBounds(150,280,250,30);
        pAdmn.add(tfPsw);
//Button Functions===============================================================================================
        bLgn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(tfNme.getText().equals("Udara")&&tfPsw.getText().equals("12345")) {
                    tfNme.setText("");
                    tfPsw.setText("");
                    fAdmnLog.dispose();
                    Main.admin.fAdmn.setVisible(true);
                }
            }
        });
        bBackLgn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fAdmnLog.dispose();
                Main.mainW.fMnWnd.setVisible(true);
            }
        });

    }



}


