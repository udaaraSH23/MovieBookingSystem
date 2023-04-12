import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminGUI {
    JFrame fAdmn;
    JButton bEdit,bViwBkng, bBackMn,bBack1,bBack2,beditMv;
    JPanel pEdit,pViwBkng,pAdmnGui,cardAdmn,backgPanel;
    JTextField  tfmovie_id,tfmvNme,tfmvLang,tfmvtpe,tfmvDrtn,tfmvDscp;
    CardLayout cd1;
    JLabel jEmvID,jEmvNme,jEmvLang,jEmType,jEmvdrn,jEmvdsc;



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
//            Main.mv.movie_id = Integer.parseInt(tfmovie_id.getText());
//            Main.mv.mvNme = "tfmvNme.getText()";
//            Main.mv.mvLang = tfmvLang.getText();
//            Main.mv.mvtpe = tfmvtpe.getText();
//            Main.mv.mvDrtn = Float.parseFloat(tfmvDrtn.getText());
//            Main.mv.mvDscp=tfmvDscp.getText();
                System.out.println(Main.no);
                Main.no = 45;
                System.out.println(Main.no);
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
//Container============================================================================================
        cd1 = new CardLayout(100,100);
        cardAdmn = new JPanel(cd1);

        cardAdmn.add(pAdmnGui,"AdminPan");
        cardAdmn.add(pEdit,"Edit");
        cardAdmn.add(pViwBkng,"ViewBook");
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
                cd1.show(cardAdmn,"Edit");

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
    }

}
