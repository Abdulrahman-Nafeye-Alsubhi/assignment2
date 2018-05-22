
import java.awt.Dimension;
import java.io.File;
import javax.swing.*;

public class ProfileViewUI extends JFrame {
    
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    
    public ProfileViewUI(int selectedIndex) {
        initComponents();
        Profile userProfile = FileDataHandler.profiles.get(selectedIndex);
        this.jTextField1.setText(userProfile.getName());
        this.jTextField2.setText(userProfile.getStatus());
        this.jTextField3.setText(userProfile.getAge() + "");
        this.jTextField4.setText(userProfile.getGender());
        this.jTextField5.setText(userProfile.getType() + "");
        this.jTextField6.setText(userProfile.getState());
        File f = new File(userProfile.getProfilePicture());
        if (f.exists()) {
            jLabel1.setIcon(new ImageIcon(userProfile.getProfilePicture()));
        }
        String[] relationships = new String[userProfile.getRelationships().size()];
        for (int i = 0; i < userProfile.getRelationships().size(); i++) {
            relationships[i] = userProfile.getRelationships().get(i).toString();
            System.out.println(relationships[i]);
        }
        getContentPane().remove(jComboBox1);
        this.jComboBox1 = new JComboBox<>(relationships);
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(260, 220, 180, 20);
        setLocationRelativeTo(null);
    }
    
    private void initComponents() {
        
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jLabel8 = new JLabel();
        jComboBox1 = new JComboBox<>();
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Profile");
        setMinimumSize(new Dimension(500, 300));
        getContentPane().setLayout(null);
        
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/notfound.jpg")));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 30, 140, 210);
        
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 40, 80, 14);
        
        jLabel3.setText("Status");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 70, 80, 14);
        
        jLabel4.setText("Age");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 100, 90, 14);
        
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 130, 90, 14);
        
        jLabel6.setText("Type");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 160, 90, 14);
        
        jLabel7.setText("State");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 190, 90, 14);
        
        jTextField1.setEditable(false);
        
        getContentPane().add(jTextField1);
        jTextField1.setBounds(260, 40, 180, 20);
        
        jTextField2.setEditable(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(260, 70, 180, 20);
        
        jTextField3.setEditable(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(260, 100, 180, 20);
        
        jTextField4.setEditable(false);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(260, 130, 180, 20);
        
        jTextField5.setEditable(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(260, 160, 180, 20);
        
        jTextField6.setEditable(false);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(260, 190, 180, 20);
        
        jLabel8.setText("Relationsips");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(160, 220, 90, 14);
        
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(260, 220, 180, 20);
        
        pack();
    }
    
}
