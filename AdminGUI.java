import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class AdminGUI {
    JFrame fAdmn;
    JButton bEdit,bViwBkng, bBackMn,bBack1,bBack2,beditMv,bHallChnge,bReset,bChngeUsrPW,bChngeConfm,bChngeBck;
    JPanel pEdit,pViwBkng,pAdmnGui,cardAdmn,backgPanel,pEditSlt,pHlchne,pUsrPswChn;
    public static JTextField  tfmovie_id,tfmvNme,tfmvLang,tfmvtpe,tfmvDrtn,tfmvDscp,tfoldusr,tfnewusr,tfoldpass,tfnewpass;
    CardLayout cd1;
    static JLabel jEmvID,jEmvNme,jEmvLang,jEmType,jEmvdrn,jEmvdsc,jEditSltTi,jEditSlNS,jEditSlUp,jEditSlMs,jHlChgeTit,jHlChge1,jHlChge2,jBckTitle, jBckInfo1,jBckInfo2,jBckInfo3;
    static JLabel jAdminpanDs,lEditDes,lToalBking,loldusr,lnewusr,loldPw,lnewPw,lChangeusrPass;
    static JButton bEditSltb,bEditSltBck,bHllOk,bHllbck;
    static JRadioButton jrMv1,jrMv2,jrMv3,jrUp1,jrUp2,jrMs;



    JComboBox jcMv,jcHll;



    AdminGUI(){
        fAdmn = new JFrame("Admin");
        fAdmn.setSize(800,800);
        fAdmn.setResizable(false);
        fAdmn.setLocationRelativeTo(null);
        fAdmn.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Border bdrAdmn = BorderFactory.createRaisedBevelBorder();
        ImageIcon bckAdmn = new ImageIcon(getClass().getResource("Bckgrnd.jpg"));


//Card1 -Admin Panel================================================================================================
        pAdmnGui = new JPanel(null);
        pAdmnGui.setBackground(new Color(0x385095D2, true));
        pAdmnGui.setBorder(bdrAdmn);

        jAdminpanDs = new JLabel("-------------- Welcome to Admin Panel --------------");
        jAdminpanDs.setBounds(90,30,400,50);
        jAdminpanDs.setForeground(Color.WHITE);
        jAdminpanDs.setFont(new Font("Cambria",Font.BOLD,18));
        pAdmnGui.add(jAdminpanDs);


        bEdit = new JButton("Edit movie");
        bEdit.setBounds(200,100,150,50);
        bEdit.setBackground(Color.BLACK);
        bEdit.setForeground(Color.WHITE);
        bEdit.setFocusable(false);
        pAdmnGui.add(bEdit);

        bViwBkng = new JButton("View Bookings");
        bViwBkng.setFocusable(false);
        bViwBkng.setBounds(200,200,150,50);
        bViwBkng.setBackground(Color.BLACK);
        bViwBkng.setForeground(Color.WHITE);
        pAdmnGui.add(bViwBkng);

        bHallChnge = new JButton("Change Hall");
        bHallChnge.setBounds(200,300,150,50);
        bHallChnge.setBackground(Color.BLACK);
        bHallChnge.setForeground(Color.WHITE);
        bHallChnge.setFocusable(false);
        pAdmnGui.add(bHallChnge);

        bChngeUsrPW = new JButton("Change Admin info");
        bChngeUsrPW.setBounds(200,400,150,50);
        bChngeUsrPW.setBackground(Color.BLACK);
        bChngeUsrPW.setForeground(Color.WHITE);
        bChngeUsrPW.setFocusable(false);
        pAdmnGui.add(bChngeUsrPW);

        bBackMn = new JButton("Back");
        bBackMn.setFocusable(false);
        bBackMn.setBounds(50,450,100,50);
        bBackMn.setBackground(Color.BLACK);
        bBackMn.setForeground(Color.WHITE);
        bBackMn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.admin.fAdmn.setVisible(false);
                Main.mainW.fMnWnd.setVisible(true);
            }
        });
        pAdmnGui.add(bBackMn);

//Card Hall change===============================================================================================
        pHlchne = new JPanel(null);
        pHlchne.setBackground(new Color(0x385095D2, true));
        pHlchne.setBorder(bdrAdmn);

        jHlChgeTit = new JLabel("Change Hall");
        jHlChgeTit.setBounds(200,20,250,100);
        jHlChgeTit.setForeground(Color.WHITE);
        jHlChgeTit.setFont(new Font("Cambria",Font.BOLD,32));
        pHlchne.add(jHlChgeTit);

        jHlChge1 = new JLabel("Select Movie :");
        jHlChge1.setBounds(130,120,400,100);
        jHlChge1.setForeground(Color.WHITE);
        jHlChge1.setFont(new Font("Cambria",Font.BOLD,18));
        pHlchne.add(jHlChge1);

        jHlChge2 = new JLabel("Select Hall :");
        jHlChge2.setBounds(130,250,400,100);
        jHlChge2.setForeground(Color.WHITE);
        jHlChge2.setFont(new Font("Cambria",Font.BOLD,18));
        pHlchne.add(jHlChge2);

        String[] mvies = {"Movie 1","Movie 2","Movie 3"};
        String[] halls = {"Hall 1","Hall 2","Hall 3"};

        jcMv = new JComboBox(mvies);
        jcMv.setBounds(220,220,150,25);
        pHlchne.add(jcMv);

        jcHll = new JComboBox(halls);
        jcHll.setBounds(220,370,150,25);
        pHlchne.add(jcHll);


        bHllbck = new JButton("BACK");
        bHllbck.setBounds(50,450,100,50);
        bHllbck.setBackground(Color.BLACK);
        bHllbck.setForeground(Color.WHITE);
        bHllbck.setFocusable(false);
        pHlchne.add(bHllbck);

        bHllOk = new JButton("Change Hall");
        bHllOk.setBounds(400,450,150,50);
        bHllOk.setBackground(Color.BLACK);
        bHllOk.setForeground(Color.WHITE);
        bHllOk.setFocusable(false);
        pHlchne.add(bHllOk);
//Panel Password Username Change
        pUsrPswChn = new JPanel(null);
        pUsrPswChn.setBackground(new Color(0x385095D2, true));
        pUsrPswChn.setBorder(bdrAdmn);

        lChangeusrPass = new JLabel("Change");
        lChangeusrPass.setBounds(230,20,350,100);
        lChangeusrPass.setForeground(Color.WHITE);
        lChangeusrPass.setFont(new Font("Cambria",Font.BOLD,32));
        pUsrPswChn.add(lChangeusrPass);

        loldusr = new JLabel("Old User Name :");
        loldusr.setBounds(50,100,200,20);
        loldusr.setFont(new Font("Cambria",Font.BOLD,16));
        loldusr.setForeground(Color.WHITE);
        pUsrPswChn.add(loldusr);

        lnewusr = new JLabel("New User Name :");
        lnewusr.setBounds(50,190,200,20);
        lnewusr.setFont(new Font("Cambria",Font.BOLD,16));
        lnewusr.setForeground(Color.WHITE);
        pUsrPswChn.add(lnewusr);

        loldPw = new JLabel("Old Password :");
        loldPw.setBounds(50,270,200,20);
        loldPw.setFont(new Font("Cambria",Font.BOLD,16));
        loldPw.setForeground(Color.WHITE);
        pUsrPswChn.add(loldPw);

        lnewPw = new JLabel("New Password :");
        lnewPw.setBounds(50,360,200,20);
        lnewPw.setFont(new Font("Cambria",Font.BOLD,16));
        lnewPw.setForeground(Color.WHITE);
        pUsrPswChn.add(lnewPw);

        tfoldusr = new JTextField();
        tfoldusr.setBounds(160,130,250,30);
        pUsrPswChn.add(tfoldusr);

        tfnewusr = new JTextField();
        tfnewusr.setBounds(160,210,250,30);
        pUsrPswChn.add(tfnewusr);

        tfoldpass = new JTextField();
        tfoldpass.setBounds(160,300,250,30);
        pUsrPswChn.add(tfoldpass);

        tfnewpass = new JTextField();
        tfnewpass.setBounds(160,390,250,30);
        pUsrPswChn.add(tfnewpass);

        bChngeConfm = new JButton("Change");
        bChngeConfm.setBounds(450,450,100,50);
        bChngeConfm.setBackground(Color.BLACK);
        bChngeConfm.setForeground(Color.WHITE);
        bChngeConfm.setFocusable(false);
        pUsrPswChn.add(bChngeConfm);

        bChngeBck = new JButton("Back");
        bChngeBck.setBounds(50,450,100,50);
        bChngeBck.setBackground(Color.BLACK);
        bChngeBck.setForeground(Color.WHITE);
        bChngeBck.setFocusable(false);
        pUsrPswChn.add(bChngeBck);


//Card Edit-Select================================================================================================
        pEditSlt = new JPanel(null);
        pEditSlt.setBackground(new Color(0x385095D2, true));
        pEditSlt.setBorder(bdrAdmn);

        jEditSltTi = new JLabel("Edit Movies");
        jEditSltTi.setBounds(200,20,250,100);
        jEditSltTi.setForeground(Color.WHITE);
        jEditSltTi.setFont(new Font("Cambria",Font.BOLD,32));
        pEditSlt.add(jEditSltTi);

        jEditSlNS = new JLabel("Now Showing");
        jEditSlNS.setBounds(50,130,200,20);
        jEditSlNS.setFont(new Font("Cambria",Font.BOLD,16));
        jEditSlNS.setForeground(Color.WHITE);
        pEditSlt.add(jEditSlNS);

        jEditSlUp = new JLabel("Upcoming");
        jEditSlUp.setBounds(50,250,200,20);
        jEditSlUp.setFont(new Font("Cambria",Font.BOLD,16));
        jEditSlUp.setForeground(Color.WHITE);
        pEditSlt.add(jEditSlUp);

        jEditSlMs = new JLabel("Monthly Special");
        jEditSlMs.setBounds(50,350,200,20);
        jEditSlMs.setFont(new Font("Cambria",Font.BOLD,16));
        jEditSlMs.setForeground(Color.WHITE);
        pEditSlt.add(jEditSlMs);

        bEditSltBck = new JButton("BACK");
        bEditSltBck.setBounds(50,450,100,50);
        bEditSltBck.setBackground(Color.BLACK);
        bEditSltBck.setForeground(Color.WHITE);
        bEditSltBck.setFocusable(false);
        pEditSlt.add(bEditSltBck);

        bEditSltb = new JButton("Edit");
        bEditSltb.setBounds(450,450,100,50);
        bEditSltb.setBackground(Color.BLACK);
        bEditSltb.setForeground(Color.WHITE);
        bEditSltb.setFocusable(false);
        pEditSlt.add(bEditSltb);


        jrMv1 =new JRadioButton();
        jrMv1.setBounds(200,150,150,20);
        jrMv1.setBackground(new Color(0, 0, 0, 255));
        jrMv1.setForeground(Color.WHITE);
        pEditSlt.add(jrMv1);

        jrMv2 =new JRadioButton();
        jrMv2.setBounds(200,180,150,20);
        jrMv2.setBackground(new Color(0, 0, 0, 255));
        jrMv2.setForeground(Color.WHITE);
        pEditSlt.add(jrMv2);

        jrMv3 =new JRadioButton();
        jrMv3.setBounds(200,210,150,20);
        jrMv3.setBackground(new Color(0, 0, 0, 255));
        jrMv3.setForeground(Color.WHITE);
        pEditSlt.add(jrMv3);

        jrUp1 =new JRadioButton();
        jrUp1.setBounds(200,280,150,20);
        jrUp1.setBackground(new Color(0, 0, 0, 255));
        jrUp1.setForeground(Color.WHITE);
        pEditSlt.add(jrUp1);

        jrUp2 =new JRadioButton();
        jrUp2.setBounds(200,310,150,20);
        jrUp2.setBackground(new Color(0, 0, 0, 255));
        jrUp2.setForeground(Color.WHITE);
        pEditSlt.add(jrUp2);

        jrMs =new JRadioButton();
        jrMs.setBounds(200,390,150,20);
        jrMs.setBackground(new Color(0, 0, 0, 255));
        jrMs.setForeground(Color.WHITE);
        pEditSlt.add(jrMs);

        ButtonGroup grpEdit = new ButtonGroup();
        grpEdit.add(jrMv1);
        grpEdit.add(jrMv2);
        grpEdit.add(jrMv3);
        grpEdit.add(jrUp1);
        grpEdit.add(jrUp2);
        grpEdit.add(jrMs);





//Card 2 -Edit panel===============================================================================================
        pEdit = new JPanel(null);
        pEdit.setBackground(new Color(0x385095D2, true));
        pEdit.setBorder(bdrAdmn);

        bBack1 = new JButton("BACK");
        bBack1.setBounds(50,450,100,50);
        bBack1.setBackground(Color.BLACK);
        bBack1.setForeground(Color.WHITE);
        bBack1.setFocusable(false);
        pEdit.add(bBack1);

        beditMv = new JButton("Edit");
        beditMv.setBounds(450,450,100,50);
        beditMv.setBackground(Color.BLACK);
        beditMv.setForeground(Color.WHITE);
        beditMv.setFocusable(false);
        pEdit.add(beditMv);


//Labels PEDIT---------------------------------------------------------------
        lEditDes = new JLabel("--------- Please Fill Fields ---------");
        lEditDes.setBounds(160,30,350,50);
        lEditDes.setForeground(Color.WHITE);
        lEditDes.setFont(new Font("Cambria",Font.BOLD,18));
        pEdit.add(lEditDes);


        jEmvID = new JLabel("ID:");
        jEmvID.setBounds(50,120,100,20);
        jEmvID.setFont(new Font("Cambria",Font.BOLD,16));
        jEmvID.setForeground(Color.WHITE);
        pEdit.add(jEmvID);

        jEmvNme = new JLabel("Name:");
        jEmvNme.setBounds(50,170,100,20);
        jEmvNme.setFont(new Font("Cambria",Font.BOLD,16));
        jEmvNme.setForeground(Color.WHITE);
        pEdit.add(jEmvNme);

        jEmvLang = new JLabel("Lang:");
        jEmvLang.setBounds(50,220,100,20);
        jEmvLang.setFont(new Font("Cambria",Font.BOLD,16));
        jEmvLang.setForeground(Color.WHITE);
        pEdit.add(jEmvLang);

        jEmType = new JLabel("Type:");
        jEmType.setBounds(50,270,100,20);
        jEmType.setFont(new Font("Cambria",Font.BOLD,16));
        jEmType.setForeground(Color.WHITE);
        pEdit.add(jEmType);

        jEmvdrn = new JLabel("Duration:");
        jEmvdrn.setBounds(50,320,100,20);
        jEmvdrn.setFont(new Font("Cambria",Font.BOLD,16));
        jEmvdrn.setForeground(Color.WHITE);
        pEdit.add(jEmvdrn);

        jEmvdsc = new JLabel("Description: ");
        jEmvdsc.setBounds(50,370,100,20);
        jEmvdsc.setFont(new Font("Cambria",Font.BOLD,16));
        jEmvdsc.setForeground(Color.WHITE);
        pEdit.add(jEmvdsc);
//TF-PEDIT---------------------------------------------------------------------------
        tfmovie_id = new JTextField();
        tfmovie_id.setBounds(200,120,150,30);
        pEdit.add(tfmovie_id);

        tfmvNme = new JTextField();
        tfmvNme.setBounds(200,170,150,30);
        pEdit.add(tfmvNme);

        tfmvLang = new JTextField();
        tfmvLang.setBounds(200,220,150,30);
        pEdit.add(tfmvLang);

        tfmvtpe = new JTextField();
        tfmvtpe.setBounds(200,270,150,30);
        pEdit.add(tfmvtpe);

        tfmvDrtn = new JTextField();
        tfmvDrtn.setBounds(200,320,150,30);
        pEdit.add(tfmvDrtn);

        tfmvDscp = new JTextField();
        tfmvDscp.setBounds(200,370,150,30);
        pEdit.add(tfmvDscp);




//Card 3-View Booking==============================================================================================
        pViwBkng = new JPanel(null);
        pViwBkng.setBackground(new Color(0x385095D2, true));
        pViwBkng.setBorder(bdrAdmn);

        bBack2 = new JButton("BACK");
        bBack2.setBounds(50,450,100,50);
        bBack2.setFocusable(false);
        bBack2.setBackground(Color.BLACK);
        bBack2.setForeground(Color.WHITE);
        pViwBkng.add(bBack2);

        bReset = new JButton("Reset");
        bReset.setBounds(450,450,100,50);
        bReset.setFocusable(false);
        bReset.setBackground(Color.red);
        bReset.setForeground(Color.BLACK);
        pViwBkng.add(bReset);

        jBckTitle = new JLabel("Booking Information");
        jBckTitle.setBounds(150,20,350,100);
        jBckTitle.setForeground(Color.WHITE);
        jBckTitle.setFont(new Font("Cambria",Font.BOLD,32));
        pViwBkng.add(jBckTitle);

        jBckInfo1 = new JLabel();
        jBckInfo1.setBounds(50,150,450,50);
        jBckInfo1.setForeground(Color.WHITE);
        jBckInfo1.setFont(new Font("arial",Font.BOLD,18));
        pViwBkng.add(jBckInfo1);

        jBckInfo2 = new JLabel();
        jBckInfo2.setBounds(50,210,450,50);
        jBckInfo2.setForeground(Color.WHITE);
        jBckInfo2.setFont(new Font("arial",Font.BOLD,18));
        pViwBkng.add(jBckInfo2);

        jBckInfo3 = new JLabel();
        jBckInfo3.setBounds(50,270,450,50);
        jBckInfo3.setForeground(Color.WHITE);
        jBckInfo3.setFont(new Font("arial",Font.BOLD,18));
        pViwBkng.add(jBckInfo3);

        lToalBking = new JLabel();
        lToalBking.setBounds(200,350,400,50);
        lToalBking.setForeground(Color.WHITE);
        lToalBking.setFont(new Font("Cambria",Font.BOLD,24));
        pViwBkng.add(lToalBking);


//Container============================================================================================
        cd1 = new CardLayout(100,100);
        cardAdmn = new JPanel(cd1);

        cardAdmn.add(pAdmnGui,"AdminPan");
        cardAdmn.add(pEdit,"Edit");
        cardAdmn.add(pViwBkng,"ViewBook");
        cardAdmn.add(pEditSlt,"EditSelect");
        cardAdmn.add(pHlchne,"HallChange");
        cardAdmn.add(pUsrPswChn,"Change");
        cardAdmn.setOpaque(false);
//=================================================================================================

            backgPanel = new JPanel(new BorderLayout()){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bckAdmn.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };

        backgPanel.add(cardAdmn,BorderLayout.CENTER);

        fAdmn.add(backgPanel);

        //Button func PEDIT----------------------------------------------------------------
        beditMv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jrMv1.isSelected() == true){
                    Movies myobj = new Movies(Integer.parseInt(AdminGUI.tfmovie_id.getText()), AdminGUI.tfmvNme.getText(), AdminGUI.tfmvLang.getText(), AdminGUI.tfmvtpe.getText(), Double.parseDouble(AdminGUI.tfmvDrtn.getText()), AdminGUI.tfmvDscp.getText());
                    myobj.addMovie("Movie.ser",myobj);
                } else if (jrMv2.isSelected() == true) {
                    Movies myobj = new Movies(Integer.parseInt(AdminGUI.tfmovie_id.getText()), AdminGUI.tfmvNme.getText(), AdminGUI.tfmvLang.getText(), AdminGUI.tfmvtpe.getText(), Double.parseDouble(AdminGUI.tfmvDrtn.getText()), AdminGUI.tfmvDscp.getText());
                    myobj.addMovie("Movie1.ser",myobj);
                }
                else if (jrMv3.isSelected() == true) {
                    Movies myobj = new Movies(Integer.parseInt(AdminGUI.tfmovie_id.getText()), AdminGUI.tfmvNme.getText(), AdminGUI.tfmvLang.getText(), AdminGUI.tfmvtpe.getText(), Double.parseDouble(AdminGUI.tfmvDrtn.getText()), AdminGUI.tfmvDscp.getText());
                    myobj.addMovie("Movie2.ser",myobj);
                }
                else if (jrUp1.isSelected() == true) {
                    upcomingMovies myobj = new upcomingMovies(Integer.parseInt(AdminGUI.tfmovie_id.getText()), AdminGUI.tfmvNme.getText(), AdminGUI.tfmvLang.getText(), AdminGUI.tfmvtpe.getText(), Double.parseDouble(AdminGUI.tfmvDrtn.getText()), AdminGUI.tfmvDscp.getText());
                    myobj.addMovie("UpMovie1.ser",myobj);
                }
                else if (jrUp2.isSelected() == true) {
                    upcomingMovies myobj = new upcomingMovies(Integer.parseInt(AdminGUI.tfmovie_id.getText()), AdminGUI.tfmvNme.getText(), AdminGUI.tfmvLang.getText(), AdminGUI.tfmvtpe.getText(), Double.parseDouble(AdminGUI.tfmvDrtn.getText()), AdminGUI.tfmvDscp.getText());
                    myobj.addMovie("UpMovie2.ser",myobj);
                }
                else if (jrMs.isSelected() == true) {
                    monthlySpecial myobj = new monthlySpecial(Integer.parseInt(AdminGUI.tfmovie_id.getText()), AdminGUI.tfmvNme.getText(), AdminGUI.tfmvLang.getText(), AdminGUI.tfmvtpe.getText(), Double.parseDouble(AdminGUI.tfmvDrtn.getText()), AdminGUI.tfmvDscp.getText());
                    myobj.addMovie("MsMovie.ser",myobj);
                }

                JOptionPane.showMessageDialog(null,"Movie Changed Successfully","Info",JOptionPane.INFORMATION_MESSAGE);
                cd1.show(cardAdmn,"EditSelect");
            }
        });

        bEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cd1.show(cardAdmn,"EditSelect");
                jrMv1.setText("1: "+Movies.getMovie("Movie.ser",1).mvNme);
                jrMv2.setText("2: "+Movies.getMovie("Movie1.ser",1).mvNme);
                jrMv3.setText("3: "+Movies.getMovie("Movie2.ser",1).mvNme);
                jrUp1.setText("1: "+upcomingMovies.getMovie("UpMovie1.ser",2).mvNme);
                jrUp2.setText("2: "+upcomingMovies.getMovie("UpMovie2.ser",2).mvNme);
                jrMs.setText("1: "+monthlySpecial.getMovie("MsMovie.ser",3).mvNme);

            }
        });
        bViwBkng.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cd1.show(cardAdmn,"ViewBook");
                Booking.bookingInfo();
            }
        });
        ActionListener back = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cd1.show(cardAdmn,"AdminPan");
            }
        };
        bBack1.addActionListener(back);
        bBack2.addActionListener(back);

        bEditSltBck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cd1.show(cardAdmn,"AdminPan");
            }
        });

        bEditSltb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cd1.show(cardAdmn,"Edit");
            }
        });

        bHllbck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cd1.show(cardAdmn,"AdminPan");
            }
        });

        bHallChnge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cd1.show(cardAdmn,"HallChange");


            }
        });
        bHllOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jcMv.getSelectedIndex() == 0 & jcHll.getSelectedIndex() ==0){
                    Movies mvi = Movies.getMovie("Movie.ser",1);
                    Hall ha = new Hall(0,null,null,null);
                    ha = Hall.loadHall("Hall1.ser");
                    ha.setHall(mvi,1);
                    ha.saveHall("Hall1.ser",ha);
                }
                else if(jcMv.getSelectedIndex() == 0 & jcHll.getSelectedIndex() ==1){
                    Movies mvi = Movies.getMovie("Movie.ser",1);
                    Hall ha = new Hall(0,null,null,null);
                    ha = Hall.loadHall("Hall2.ser");
                    ha.setHall(mvi,2);
                    ha.saveHall("Hall2.ser",ha);
                }
                else if(jcMv.getSelectedIndex() == 0 & jcHll.getSelectedIndex() ==2){
                    Movies mvi = Movies.getMovie("Movie.ser",1);
                    Hall ha = new Hall(0,null,null,null);
                    ha = Hall.loadHall("Hall3.ser");
                    ha.setHall(mvi,3);
                    ha.saveHall("Hall3.ser",ha);
                }
                else if(jcMv.getSelectedIndex() == 1 & jcHll.getSelectedIndex() ==0){
                    Movies mvi = Movies.getMovie("Movie1.ser",1);
                    Hall ha = new Hall(0,null,null,null);
                    ha = Hall.loadHall("Hall1.ser");
                    ha.setHall(mvi,1);
                    ha.saveHall("Hall1.ser",ha);
                }
                else if(jcMv.getSelectedIndex() == 1 & jcHll.getSelectedIndex() ==1){
                    Movies mvi = Movies.getMovie("Movie1.ser",1);
                    Hall ha = new Hall(0,null,null,null);
                    ha = Hall.loadHall("Hall2.ser");
                    ha.setHall(mvi,2);
                    ha.saveHall("Hall2.ser",ha);
                }
                else if(jcMv.getSelectedIndex() == 1 & jcHll.getSelectedIndex() ==2){
                    Movies mvi = Movies.getMovie("Movie1.ser",1);
                    Hall ha = new Hall(0,null,null,null);
                    ha = Hall.loadHall("Hall3.ser");
                    ha.setHall(mvi,3);
                    ha.saveHall("Hall3.ser",ha);
                }
                else if(jcMv.getSelectedIndex() == 2 & jcHll.getSelectedIndex() ==0){
                    Movies mvi = Movies.getMovie("Movie2.ser",1);
                    Hall ha = new Hall(0,null,null,null);
                    ha = Hall.loadHall("Hall1.ser");
                    ha.setHall(mvi,1);
                    ha.saveHall("Hall1.ser",ha);
                }
                else if(jcMv.getSelectedIndex() == 2 & jcHll.getSelectedIndex() ==1){
                    Movies mvi = Movies.getMovie("Movie2.ser",1);
                    Hall ha = new Hall(0,null,null,null);
                    ha = Hall.loadHall("Hall2.ser");
                    ha.setHall(mvi,2);
                    ha.saveHall("Hall2.ser",ha);
                }
                else if(jcMv.getSelectedIndex() == 2 & jcHll.getSelectedIndex() ==2){
                    Movies mvi = Movies.getMovie("Movie2.ser",1);
                    Hall ha = new Hall(0,null,null,null);
                    ha = Hall.loadHall("Hall3.ser");
                    ha.setHall(mvi,3);
                    ha.saveHall("Hall3.ser",ha);
                }

            }
        });

        bReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Booking.writeBookingID();

                Hall h1 =new Hall(1,"AC",null,new Seats(0,""));
                Hall h2 =new Hall(2,"Non - AC",null,new Seats(0,""));
                Hall h3 =new Hall(3,"Semi AC",null,new Seats(0,""));

                h1.saveHall("Hall1.ser",h1);
                h1.saveHall("Hall2.ser",h2);
                h1.saveHall("Hall3.ser",h3);

                cd1.show(cardAdmn,"AdminPan");


            }
        });

        bChngeUsrPW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cd1.show(cardAdmn,"Change");

            }
        });

        bChngeBck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cd1.show(cardAdmn,"AdminPan");
            }
        });

        bChngeConfm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(tfoldusr.getText().equals(new Admin().getUsername())&&tfoldpass.getText().equals(new Admin().getPassword())) {
                    Admin a = new Admin();
                    a.setUsername(tfnewusr.getText());
                    a.setPassword(tfnewpass.getText());

                }
                else {
                    JOptionPane.showMessageDialog(null,"Please Enter Correct Username Password","Info",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

}
