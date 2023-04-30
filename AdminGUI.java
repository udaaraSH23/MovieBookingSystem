
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminGUI {
    JFrame fAdmn;
    JButton bEdit,bViwBkng, bBackMn,bBack1,bBack2,beditMv,bHallChnge;
    JPanel pEdit,pViwBkng,pAdmnGui,cardAdmn,backgPanel,pEditSlt,pHlchne;
    JTextField  tfmovie_id,tfmvNme,tfmvLang,tfmvtpe,tfmvDrtn,tfmvDscp;
    CardLayout cd1;
    JLabel jEmvID,jEmvNme,jEmvLang,jEmType,jEmvdrn,jEmvdsc,jEditSltTi,jEditSlNS,jEditSlUp,jEditSlMs,jHlChgeTit,jHlChge1,jHlChge2,jBckTitle,jBckInfo;
    JButton bEditSltb,bEditSltBck,bHllOk,bHllbck;
    JRadioButton jrMv1,jrMv2,jrMv3,jrUp1,jrUp2,jrMs;

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

        jHlChgeTit = new JLabel("Change Hall:");
        jHlChgeTit.setBounds(10,100,50,20);
        jHlChgeTit.setForeground(Color.WHITE);
        pHlchne.add(jHlChgeTit);

        jHlChge1 = new JLabel("Select Movie");
        jHlChge1.setBounds(10,250,50,20);
        jHlChge1.setForeground(Color.WHITE);
        pHlchne.add(jHlChge1);

        jHlChge2 = new JLabel("Edit Hall:");
        jHlChge2.setBounds(10,300,50,20);
        jHlChge2.setForeground(Color.WHITE);
        pHlchne.add(jHlChge2);

        String[] mvies = {"mv1","mv2","mv3"};
        String[] halls = {"h1","h2","h3"};

        jcMv = new JComboBox(mvies);
        jcMv.setBounds(100,200,100,50);
        pHlchne.add(jcMv);

        jcHll = new JComboBox(halls);
        jcHll.setBounds(300,200,100,50);
        pHlchne.add(jcHll);


        bHllbck = new JButton("BACK");
        bHllbck.setBounds(100,400,100,50);
        bHllbck.setBackground(Color.BLACK);
        bHllbck.setForeground(Color.WHITE);
        bHllbck.setFocusable(false);
        pHlchne.add(bHllbck);

        bHllOk = new JButton("BACK");
        bHllOk.setBounds(400,400,100,50);
        bHllOk.setBackground(Color.BLACK);
        bHllOk.setForeground(Color.WHITE);
        bHllOk.setFocusable(false);
        pHlchne.add(bHllOk);

//Card Edit-Select================================================================================================
        pEditSlt = new JPanel(null);
        pEditSlt.setBackground(new Color(0x385095D2, true));
        pEditSlt.setBorder(bdrAdmn);

        jEditSltTi = new JLabel("Edit Movies:");
        jEditSltTi.setBounds(10,100,50,20);
        jEditSltTi.setForeground(Color.WHITE);
        pEditSlt.add(jEditSltTi);

        jEditSlNS = new JLabel("Now Showing");
        jEditSlNS.setBounds(10,200,50,20);
        jEditSlNS.setForeground(Color.WHITE);
        pEditSlt.add(jEditSlNS);

        jEditSlUp = new JLabel("Upcoming");
        jEditSlUp.setBounds(10,300,50,20);
        jEditSlUp.setForeground(Color.WHITE);
        pEditSlt.add(jEditSlUp);

        jEditSlMs = new JLabel("Monthly Special");
        jEditSlMs.setBounds(10,100,50,20);
        jEditSlMs.setForeground(Color.WHITE);
        pEditSlt.add(jEditSlMs);

        bEditSltBck = new JButton("BACK");
        bEditSltBck.setBounds(100,400,100,50);
        bEditSltBck.setBackground(Color.BLACK);
        bEditSltBck.setForeground(Color.WHITE);
        bEditSltBck.setFocusable(false);
        pEditSlt.add(bEditSltBck);

        bEditSltb = new JButton("Edit");
        bEditSltb.setBounds(400,400,100,50);
        bEditSltb.setBackground(Color.BLACK);
        bEditSltb.setForeground(Color.WHITE);
        bEditSltb.setFocusable(false);
        pEditSlt.add(bEditSltb);


        jrMv1 =new JRadioButton("Movie 1");
        jrMv1.setBounds(10,40,50,20);
        pEditSlt.add(jrMv1);

        jrMv2 =new JRadioButton("Movie 2");
        jrMv2.setBounds(10,60,50,20);
        pEditSlt.add(jrMv2);

        jrMv3 =new JRadioButton("Movie 3");
        jrMv3.setBounds(10,80,50,20);
        pEditSlt.add(jrMv3);

        jrUp1 =new JRadioButton("Upcoming 1");
        jrUp1.setBounds(10,150,50,20);
        pEditSlt.add(jrUp1);

        jrUp2 =new JRadioButton("Upcomind 2");
        jrUp2.setBounds(10,170,50,20);
        pEditSlt.add(jrUp2);

        jrMs =new JRadioButton("Monthly Special");
        jrMs.setBounds(10,220,50,20);
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
        bBack1.setBounds(100,400,100,50);
        bBack1.setBackground(Color.BLACK);
        bBack1.setForeground(Color.WHITE);
        bBack1.setFocusable(false);
        pEdit.add(bBack1);

        beditMv = new JButton("Edit");
        beditMv.setBounds(400,450,100,50);
        beditMv.setBackground(Color.BLACK);
        beditMv.setForeground(Color.WHITE);
        beditMv.setFocusable(false);
        pEdit.add(beditMv);


//Labels PEDIT---------------------------------------------------------------
        jEmvID = new JLabel("ID:");
        jEmvID.setBounds(10,100,50,20);
        jEmvID.setForeground(Color.WHITE);
        pEdit.add(jEmvID);

        jEmvNme = new JLabel("Name:");
        jEmvNme.setBounds(10,150,50,20);
        jEmvNme.setForeground(Color.WHITE);
        pEdit.add(jEmvNme);

        jEmvLang = new JLabel("Lang:");
        jEmvLang.setBounds(10,200,50,20);
        jEmvLang.setForeground(Color.WHITE);
        pEdit.add(jEmvLang);

        jEmType = new JLabel("Type:");
        jEmType.setBounds(10,250,50,20);
        jEmType.setForeground(Color.WHITE);
        pEdit.add(jEmType);

        jEmvdrn = new JLabel("Duration:");
        jEmvdrn.setBounds(10,300,50,20);
        jEmvdrn.setForeground(Color.WHITE);
        pEdit.add(jEmvdrn);

        jEmvdsc = new JLabel("Description: ");
        jEmvdsc.setBounds(10,350,50,20);
        jEmvdsc.setForeground(Color.WHITE);
        pEdit.add(jEmvdsc);
//TF-PEDIT---------------------------------------------------------------------------
        tfmovie_id = new JTextField();
        tfmovie_id.setBounds(100,100,100,30);
        pEdit.add(tfmovie_id);

        tfmvNme = new JTextField();
        tfmvNme.setBounds(100,150,100,30);
        pEdit.add(tfmvNme);

        tfmvLang = new JTextField();
        tfmvLang.setBounds(100,200,100,30);
        pEdit.add(tfmvLang);

        tfmvtpe = new JTextField();
        tfmvtpe.setBounds(100,250,100,30);
        pEdit.add(tfmvtpe);

        tfmvDrtn = new JTextField();
        tfmvDrtn.setBounds(100,300,100,30);
        pEdit.add(tfmvDrtn);

        tfmvDscp = new JTextField();
        tfmvDscp.setBounds(100,350,100,30);
        pEdit.add(tfmvDscp);


//Button func PEDIT----------------------------------------------------------------
        beditMv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Main.mv.movie_id = Integer.parseInt(tfmovie_id.getText());
            Main.mv.mvNme = tfmvNme.getText();
            Main.mv.mvLang = tfmvLang.getText();
            Main.mv.mvtpe = tfmvtpe.getText();
            Main.mv.mvDrtn = Double.parseDouble(tfmvDrtn.getText());
            Main.mv.mvDscp=tfmvDscp.getText();

            Movies.editMovie();
            JOptionPane.showMessageDialog(null,"Movie was Edited","Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

//Card 3-View Booking==============================================================================================
        pViwBkng = new JPanel(null);
        pViwBkng.setBackground(new Color(0x385095D2, true));
        pViwBkng.setBorder(bdrAdmn);

        bBack2 = new JButton("BACK");
        bBack2.setBounds(100,400,100,50);
        bBack2.setFocusable(false);
        bBack2.setBackground(Color.BLACK);
        bBack2.setForeground(Color.WHITE);
        pViwBkng.add(bBack2);

        jBckTitle = new JLabel("Booking Information");
        jBckTitle.setBounds(10,300,50,20);
        jBckTitle.setForeground(Color.WHITE);
        pViwBkng.add(jBckTitle);

        jBckInfo = new JLabel("Booking Information");
        jBckInfo.setBounds(50,300,100,100);
        jBckInfo.setForeground(Color.WHITE);
        pViwBkng.add(jBckInfo);


//Container============================================================================================
        cd1 = new CardLayout(100,100);
        cardAdmn = new JPanel(cd1);

        cardAdmn.add(pAdmnGui,"AdminPan");
        cardAdmn.add(pEdit,"Edit");
        cardAdmn.add(pViwBkng,"ViewBook");
        cardAdmn.add(pEditSlt,"EditSelect");
        cardAdmn.add(pHlchne,"HallChange");
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


        bEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cd1.show(cardAdmn,"EditSelect");

            }
        });
        bViwBkng.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cd1.show(cardAdmn,"ViewBook");
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
    }

}
