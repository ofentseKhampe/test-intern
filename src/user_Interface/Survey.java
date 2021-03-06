package user_Interface;

import data.DuplicateException;
import data.userPD;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author ofentse
 */
public class Survey extends javax.swing.JFrame {

    /**
     * Creates new form Survey
     */
    public Survey() {
        initComponents();
        groupButtonsEatOut();
        groupButtonsMovies();
        groupButtonsRadio();
        groupButtonsTv();
    }

    /*
     Grouping "I like to eat out radiobuttons"
     */
    public void groupButtonsEatOut() {

        ButtonGroup groupB = new ButtonGroup();

        groupB.add(rdbEatOut_1);
        groupB.add(rdbEatOut_2);
        groupB.add(rdbEatOut_3);
        groupB.add(rdbEatOut_4);
        groupB.add(rdbEatOut_5);
    }
    /*
     Grouping "I like to watch movies radiobuttons"
     */

    public void groupButtonsMovies() {

        ButtonGroup groupB = new ButtonGroup();

        groupB.add(rdbMovies_1);
        groupB.add(rdbMovies_2);
        groupB.add(rdbMovies_3);
        groupB.add(rdbMovies_4);
        groupB.add(rdbMovies_5);
    }
    /*
     Grouping "I like to watch TV radiobuttons"
     */

    public void groupButtonsTv() {

        ButtonGroup groupB = new ButtonGroup();

        groupB.add(rdbTV_1);
        groupB.add(rdbTV_2);
        groupB.add(rdbTV_3);
        groupB.add(rdbTV_4);
        groupB.add(rdbTV_5);
    }
    /*
     Grouping "I like to watch TV radiobuttons"
     */

    public void groupButtonsRadio() {

        ButtonGroup groupB = new ButtonGroup();

        groupB.add(rdbRadio_1);
        groupB.add(rdbRadio_2);
        groupB.add(rdbRadio_3);
        groupB.add(rdbRadio_4);
        groupB.add(rdbRadio_5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        chkPizza = new javax.swing.JCheckBox();
        chkPasta = new javax.swing.JCheckBox();
        chkOther = new javax.swing.JCheckBox();
        chkPap = new javax.swing.JCheckBox();
        chkChicken = new javax.swing.JCheckBox();
        chkBeef = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        txtfirstname = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rdbRadio_5 = new javax.swing.JRadioButton();
        rdbEatOut_5 = new javax.swing.JRadioButton();
        rdbMovies_5 = new javax.swing.JRadioButton();
        rdbTV_5 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rdbEatOut_4 = new javax.swing.JRadioButton();
        rdbMovies_4 = new javax.swing.JRadioButton();
        rdbTV_4 = new javax.swing.JRadioButton();
        rdbRadio_4 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        rdbEatOut_3 = new javax.swing.JRadioButton();
        rdbMovies_3 = new javax.swing.JRadioButton();
        rdbTV_3 = new javax.swing.JRadioButton();
        rdbRadio_3 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rdbEatOut_2 = new javax.swing.JRadioButton();
        rdbMovies_2 = new javax.swing.JRadioButton();
        rdbTV_2 = new javax.swing.JRadioButton();
        rdbRadio_2 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        rdbEatOut_1 = new javax.swing.JRadioButton();
        rdbMovies_1 = new javax.swing.JRadioButton();
        rdbTV_1 = new javax.swing.JRadioButton();
        rdbRadio_1 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnSubmit = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(123, 204, 182));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Take our survey");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Surname :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 79, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Personal Details :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 46, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("First Names :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 118, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Contact NO :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 157, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Date :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 196, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Age :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 235, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("What is your favourite food? (You can choose more than 1 answer)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 283, -1, -1));

        chkPizza.setBackground(new java.awt.Color(255, 255, 255));
        chkPizza.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkPizza.setText("Pizza");
        jPanel1.add(chkPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 318, -1, -1));

        chkPasta.setBackground(new java.awt.Color(255, 255, 255));
        chkPasta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkPasta.setText("Pasta");
        jPanel1.add(chkPasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 344, -1, -1));

        chkOther.setBackground(new java.awt.Color(255, 255, 255));
        chkOther.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkOther.setText("Other");
        jPanel1.add(chkOther, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 370, -1, -1));

        chkPap.setBackground(new java.awt.Color(255, 255, 255));
        chkPap.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkPap.setText("Pap and Wors");
        jPanel1.add(chkPap, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 370, -1, -1));

        chkChicken.setBackground(new java.awt.Color(255, 255, 255));
        chkChicken.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkChicken.setText("Chicken stir fry");
        jPanel1.add(chkChicken, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 318, -1, -1));

        chkBeef.setBackground(new java.awt.Color(255, 255, 255));
        chkBeef.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkBeef.setText("Beef stir fry");
        jPanel1.add(chkBeef, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 344, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("On a scale of 1 to 5 indicate whether you strongly agree to strongly disagree");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 423, -1, -1));

        txtSurname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(txtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 77, 234, -1));

        txtfirstname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 116, 234, -1));

        txtPhone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 155, 234, -1));

        txtDate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 194, 234, -1));

        txtAge.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 233, 234, -1));

        jPanel2.setBackground(new java.awt.Color(123, 204, 182));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 10));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Strongly disagree");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("(5)");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        jPanel9.add(rdbRadio_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        jPanel9.add(rdbEatOut_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel9.add(rdbMovies_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel9.add(rdbTV_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 110, 250));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Disagree");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setText("(4)");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        jPanel8.add(rdbEatOut_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel8.add(rdbMovies_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel8.add(rdbTV_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        jPanel8.add(rdbRadio_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 110, 250));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Neutral");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("(3)");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        jPanel7.add(rdbEatOut_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel7.add(rdbMovies_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel7.add(rdbTV_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        jPanel7.add(rdbRadio_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 110, 250));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Agree");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("(2)");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        jPanel6.add(rdbEatOut_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel6.add(rdbMovies_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel6.add(rdbTV_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        jPanel6.add(rdbRadio_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 110, 250));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("(1)");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("Strongly Agree");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel5.add(rdbEatOut_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel5.add(rdbMovies_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel5.add(rdbTV_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        jPanel5.add(rdbRadio_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 110, 250));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("I like to listen to the radio");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setText("I like to eat out");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setText("I like to watch movies");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setText("I like to watch Tv");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 200));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 446, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 714, 144, 36));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_logout_rounded_left_50px.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, 40));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/survey screen2.png"))); // NOI18N
        jPanel1.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        String surname, firstname, phone, date;

        String fav_food = "";
        String option_radio = "";
        String option_eat = "";
        String option_movies = "";
        String option_tv = "";
        String answer_eat = "";
        String answer_movies = "";
        String answer_tv = "";
        String answer_radio = "";

        int age;
        userPD objUser;
        try {
            surname = txtSurname.getText();
            firstname = txtfirstname.getText();
            phone = txtPhone.getText();
            date = txtDate.getText();
            age = Integer.parseInt(txtAge.getText());

            objUser = new userPD();

            //Favourite food
            if (chkPizza.isSelected()) {

                fav_food = "Pizza";
            } else if (chkPasta.isSelected()) {

                fav_food = "Pasta";
            } else if (chkPap.isSelected()) {

                fav_food = "Pap and Wors";
            } else if (chkChicken.isSelected()) {

                fav_food = "Chicken stir fry";
            } else if (chkBeef.isSelected()) {

                fav_food = "Beef stir fry";

            } else if (chkOther.isSelected()) {

                fav_food = "Others";
            } else {

                JOptionPane.showMessageDialog(this, "Please select your favourite meal !!");
            }

            if (rdbEatOut_1.isSelected()) {

                option_eat = "eat out";
                answer_eat = "Strongly agree";

            } else if (rdbEatOut_2.isSelected()) {

                option_eat = "eat out";
                answer_eat = "Agree";

            } else if (rdbEatOut_3.isSelected()) {

                option_eat = "eat out";
                answer_eat = "Neutral";

            } else if (rdbEatOut_4.isSelected()) {

                option_eat = "eat out";
                answer_eat = "Disagree";

            } else if (rdbEatOut_5.isSelected()) {

                option_eat = "eat out";
                answer_eat = " Strongly disagree";
            } else {

                JOptionPane.showMessageDialog(this, "Please select all options !!");
            }

            if (rdbMovies_1.isSelected()) {

                option_movies = "Movies";
                answer_movies = " Strongly agree";

            } else if (rdbMovies_2.isSelected()) {

                option_movies = "Movies";
                answer_movies = "Agree";
            } else if (rdbMovies_3.isSelected()) {

                option_movies = "Movies";
                answer_movies = "Neutral";
            } else if (rdbMovies_4.isSelected()) {

                option_movies = "Movies";
                answer_movies = "disagree";
            } else if (rdbMovies_5.isSelected()) {

                option_movies = "Movies";
                answer_movies = "Strongly disagree";
            } else {

                JOptionPane.showMessageDialog(this, "Please select all options !!");
            }

            if (rdbTV_1.isSelected()) {

                option_tv = "TV";
                answer_eat = " Strongly agree";

            } else if (rdbTV_2.isSelected()) {

                option_tv = "TV";
                answer_tv = " Agree";

            } else if (rdbTV_3.isSelected()) {

                option_tv = "TV";
                answer_tv = " Neutral";

            } else if (rdbTV_4.isSelected()) {

                option_tv = "TV";
                answer_tv = " Disagree";

            } else if (rdbTV_5.isSelected()) {

                option_tv = "TV";
                answer_tv = " Strongly disagree";
            } else {

                JOptionPane.showMessageDialog(this, "Please select all options !!");
            }

            if (rdbRadio_1.isSelected()) {

                option_radio = "Radio";
                answer_radio = " Strongly agree";
            } else if (rdbRadio_2.isSelected()) {

                option_radio = "Radio";
                answer_radio = "Agree";
            } else if (rdbRadio_3.isSelected()) {

                option_radio = "Radio";
                answer_radio = "Neutral";
            } else if (rdbRadio_4.isSelected()) {

                option_radio = "Radio";
                answer_radio = "Disagree";
            } else if (rdbRadio_5.isSelected()) {

                option_radio = "Radio";
                answer_radio = "Strongly agree";
            } else {

                JOptionPane.showMessageDialog(this, "Please select all options !!");
            }

            objUser = new userPD(surname, firstname, phone, date, age, fav_food, option_eat,
                    answer_eat, option_movies, answer_movies, option_tv, answer_tv,
                    option_radio, answer_radio);

            objUser.addUser(objUser);
            JOptionPane.showMessageDialog(this, "Data is sucessfully saved !!");

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (IllegalArgumentException | DuplicateException e) {

            txtSurname.requestFocus();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        
       dispose();
    }//GEN-LAST:event_jLabel24MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Survey().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox chkBeef;
    private javax.swing.JCheckBox chkChicken;
    private javax.swing.JCheckBox chkOther;
    private javax.swing.JCheckBox chkPap;
    private javax.swing.JCheckBox chkPasta;
    private javax.swing.JCheckBox chkPizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rdbEatOut_1;
    private javax.swing.JRadioButton rdbEatOut_2;
    private javax.swing.JRadioButton rdbEatOut_3;
    private javax.swing.JRadioButton rdbEatOut_4;
    private javax.swing.JRadioButton rdbEatOut_5;
    private javax.swing.JRadioButton rdbMovies_1;
    private javax.swing.JRadioButton rdbMovies_2;
    private javax.swing.JRadioButton rdbMovies_3;
    private javax.swing.JRadioButton rdbMovies_4;
    private javax.swing.JRadioButton rdbMovies_5;
    private javax.swing.JRadioButton rdbRadio_1;
    private javax.swing.JRadioButton rdbRadio_2;
    private javax.swing.JRadioButton rdbRadio_3;
    private javax.swing.JRadioButton rdbRadio_4;
    private javax.swing.JRadioButton rdbRadio_5;
    private javax.swing.JRadioButton rdbTV_1;
    private javax.swing.JRadioButton rdbTV_2;
    private javax.swing.JRadioButton rdbTV_3;
    private javax.swing.JRadioButton rdbTV_4;
    private javax.swing.JRadioButton rdbTV_5;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
