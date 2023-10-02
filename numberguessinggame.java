package number_guess;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
public class number_guessing extends JFrame implements ActionListener{
	JLabel l,l1;
	JTextField t1;
	JButton b1,b2;
	Random ran=new Random();
	int number=ran.nextInt(100)+1,chance=15,tryCount=0;
	number_guessing(){
		
		setLayout(null);
		l=new JLabel("Enter Your Number:");
		l.setBounds(10,20,300,30);
        l.setFont(new Font("Raleway",Font.BOLD,20));
		add(l);
		t1=new JTextField();
		t1.setFont(new Font("Raleway",Font.BOLD,15));
		t1.setBounds(10,50,340,30);
		add(t1);
		b1=new JButton("Check");
		b1.setBounds(70,100,90,30);
		b1.addActionListener(this);
		add(b1);
		b2=new JButton("Exit");
		b2.setBounds(210,100,90,30);
		b2.addActionListener(this);
		add(b2);
		setSize(400,200);
		setLocation(300,200);
		setVisible(true);
		getContentPane().setBackground(Color.white);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2) {
			System.exit(0);
		}
		else if(e.getSource()==b1) {
			int n=Integer.valueOf(t1.getText());
			tryCount+=1;
			chance=chance-1;
			if(n==number) {
			int response=JOptionPane.showConfirmDialog(this,"Correct!You Won,Your score is "+tryCount+", Do you want to continue?","Confirm", JOptionPane.YES_NO_OPTION);
			if(response==JOptionPane.YES_OPTION) {
				chance=15;
				tryCount=0;
				t1.setText("");
			}
			else if(response==JOptionPane.NO_OPTION) {
				System.exit(0);
			}
			
			}
			else if(n<number && chance>0) {
				JOptionPane.showMessageDialog(null, "Lower Number!You Have "+chance+" chances");
				t1.setText("");
			}
			else if(n>number && chance>0) {
				JOptionPane.showMessageDialog(null, "Higher Number!You Have "+chance+" chances");
				t1.setText("");
				
			}
			else if(chance==0) {
				int response=JOptionPane.showConfirmDialog(this,"Out of Chances, Do you want to continue?","Confirm", JOptionPane.YES_NO_OPTION);
				if(response==JOptionPane.YES_OPTION) {
					chance=15;
					tryCount=0;
					t1.setText("");
				}
				else if(response==JOptionPane.NO_OPTION) {
					System.exit(0);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new number_guessing();


	}
	
	

}
