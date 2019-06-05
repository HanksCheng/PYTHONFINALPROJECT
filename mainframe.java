import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainframe extends JFrame{
    private Container cp;
    private JPanel jp=new JPanel(new GridLayout(2,3,0,0));
    private JLabel jlb1=new JLabel("longitude");
    private JLabel jlb2=new JLabel("latitude");
    private TextField lg=new TextField();
    private TextField lat=new TextField();
    private JButton jbts=new JButton("Search");
    private JButton jbte=new JButton("Exit");
    private TextArea ta=new TextArea();
    public mainframe(){
        init();
    }
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout());
        this.setSize(800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jp.add(jlb1);
        jp.add(lg);
        jp.add(jbts);
        jp.add(jlb2);
        jp.add(lat);
        jp.add(jbte);
        cp.add(ta,BorderLayout.CENTER);
        jbte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        cp.add(jp,BorderLayout.NORTH);
    }
}