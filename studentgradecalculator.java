package student_grade_calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class result extends JFrame implements ActionListener{
	  String name;
	  double mark1,mark2,mark3,mark4,mark5,total1,average,average_percentage;
	  JButton Back,cancel;
	  result(String name,double mark1,double mark2,double mark3,double mark4,double mark5,double total1,double average_percentage){
		 this.name=name;
		 this.mark1=mark1;
		 this.mark2=mark2;
		 this.mark3=mark3;
		 this.mark4=mark4;
		 this.mark5=mark5;
		 this.total1=total1;
		 this.average_percentage=average_percentage;
		 setLayout(null);
		 getContentPane().setBackground(Color.white);
		 JLabel lb=new JLabel("Student Marks Details");
		 lb.setBounds(120,30,350,30);
		 lb.setFont(new Font("Raleway",Font.BOLD,30));
		 add(lb);
		 JLabel label_name=new JLabel("Student Name");
		 label_name.setBounds(50,90,200,30);
		 label_name.setFont(new Font("Raleway",Font.BOLD,20));
		 add(label_name);
		 JLabel label_name2=new JLabel(name);
		 label_name2.setBounds(260,90,200,30);
		 label_name2.setFont(new Font("Raleway",Font.BOLD,20));
		 add(label_name2);
		 JLabel subject=new JLabel("Subject");
	     subject.setBounds(50,140,100,30);
	     subject.setFont(new Font("Raleway",Font.BOLD,20));
	     add(subject);
	     JLabel total_marks=new JLabel("Total Marks");
	     total_marks.setBounds(170,140,150,30);
	     total_marks.setFont(new Font("Raleway",Font.BOLD,20));
	     add(total_marks);
	     JLabel marks_obtained=new JLabel("Marks Obtained");
	     marks_obtained.setBounds(320,140,150,30);
	     marks_obtained.setFont(new Font("Raleway",Font.BOLD,20));
	     add(marks_obtained);
		 JLabel maths=new JLabel("Maths");
	     maths.setBounds(50,190,150,30);
	     maths.setFont(new Font("Raleway",Font.BOLD,20));
	     add(maths);
	     JLabel maths_total=new JLabel("100");
	     maths_total.setBounds(190,190,150,30);
	     maths_total.setFont(new Font("Raleway",Font.BOLD,20));
	     add(maths_total);
	     JLabel maths_ob=new JLabel(""+mark1);
	     maths_ob.setBounds(380,190,150,30);
	     maths_ob.setFont(new Font("Raleway",Font.BOLD,20));
	     add(maths_ob);
	     JLabel Science=new JLabel("Science");
	     Science.setBounds(50,240,150,30);
	    Science.setFont(new Font("Raleway",Font.BOLD,20));
	     add(Science);
	     JLabel science_total=new JLabel("100");
	     science_total.setBounds(190,240,150,30);
	     science_total.setFont(new Font("Raleway",Font.BOLD,20));
	     add(science_total);
	     JLabel science_ob=new JLabel(""+mark2);
	     science_ob.setBounds(380,240,150,30);
	     science_ob.setFont(new Font("Raleway",Font.BOLD,20));
	     add(science_ob);
	     JLabel english=new JLabel("English");
	     english.setBounds(50,290,150,30);
	    english.setFont(new Font("Raleway",Font.BOLD,20));
	     add(english);
	     JLabel english_total=new JLabel("100");
	     english_total.setBounds(190,290,150,30);
	     english_total.setFont(new Font("Raleway",Font.BOLD,20));
	     add(english_total);
	     JLabel english_ob=new JLabel(""+mark3);
	    english_ob.setBounds(380,290,150,30);
	     english_ob.setFont(new Font("Raleway",Font.BOLD,20));
	     add(english_ob);
	     JLabel social=new JLabel("Social");
	     social.setBounds(50,340,150,30);
	    social.setFont(new Font("Raleway",Font.BOLD,20));
	     add(social);
	     JLabel social_total=new JLabel("100");
	     social_total.setBounds(190,340,150,30);
	     social_total.setFont(new Font("Raleway",Font.BOLD,20));
	     add(social_total);
	     JLabel social_ob=new JLabel(""+mark4);
		 social_ob.setBounds(380,340,150,30);
		 social_ob.setFont(new Font("Raleway",Font.BOLD,20));
		 add(social_ob);
	     JLabel hindi=new JLabel("Hindi");
	     hindi.setBounds(50,390,150,30);
	    hindi.setFont(new Font("Raleway",Font.BOLD,20));
	     add(hindi);
	     JLabel hindi_total=new JLabel("100");
	     hindi_total.setBounds(190,390,150,30);
	     hindi_total.setFont(new Font("Raleway",Font.BOLD,20));
	     add(hindi_total);
	     JLabel hindi_ob=new JLabel(""+mark5);
		 hindi_ob.setBounds(380,390,150,30);
		 hindi_ob.setFont(new Font("Raleway",Font.BOLD,20));
		 add(hindi_ob);
	     JLabel tot=new JLabel("Total Marks Obtained");
	     tot.setBounds(50,440,250,30);
	    tot.setFont(new Font("Raleway",Font.BOLD,20));
	     add(tot);
	     JLabel tot_marks=new JLabel(""+total1);
	     tot_marks.setBounds(340,440,250,30);
		 tot_marks.setFont(new Font("Raleway",Font.BOLD,20));
		 add(tot_marks);
	     JLabel aver=new JLabel("Average Percentage");
	     aver.setBounds(50,490,250,30);
		 aver.setFont(new Font("Raleway",Font.BOLD,20));
		 add(aver);
		 JLabel aver_per=new JLabel(""+average_percentage+"%");
	     aver_per.setBounds(340,490,250,30);
		 aver_per.setFont(new Font("Raleway",Font.BOLD,20));
		 add(aver_per);
		 JLabel grade=new JLabel("Overall Grade");
	     grade.setBounds(50,540,150,30);
		 grade.setFont(new Font("Raleway",Font.BOLD,20));
		 add(grade);
		 JLabel grade_dis=new JLabel();
		 grade_dis.setBounds(300,540,150,30);
		 grade_dis.setFont(new Font("Raleway",Font.BOLD,20));
		 add(grade_dis);
		 if(average_percentage<=100 && average_percentage>90) {
			 grade_dis.setText("\""+"O"+"\"");
		 }
		 else if(average_percentage<=90 && average_percentage>80) {
			 grade_dis.setText("\""+"A+"+"\"");
		 }
		 else if(average_percentage<=80 && average_percentage>70) {
			 grade_dis.setText("\""+"A"+"\"");
		 }
		 else if(average_percentage<=70 && average_percentage>60) {
			 grade_dis.setText("\""+"B+"+"\"");
		 }
		 else if(average_percentage<=60 && average_percentage>50) {
			 grade_dis.setText("\""+"B"+"\"");
		 }
		 else if(average_percentage<=50 && average_percentage>40) {
			 grade_dis.setText("\""+"C+"+"\"");
		 }
		 else if(average_percentage<=40 && average_percentage>30) {
			 grade_dis.setText("\""+"C"+"\"");
		 }
		 else if(average_percentage<=30) {
			 grade_dis.setText("\""+"F"+"\"");
		 }
		 Back=new JButton("Back");
		 Back.setBounds(50,590,100,30);
		 Back.setFont(new Font("Raleway",Font.BOLD,15));
		 add(Back);
		Back.addActionListener(this);
		 cancel=new JButton("Cancel");
		 cancel.setBounds(200,590,100,30);
		 cancel.setFont(new Font("Raleway",Font.BOLD,15));
		 add(cancel);
		 cancel.addActionListener(this);
		 
		 setSize(600,700);
	     setVisible(true);
	     setLocation(400,70);
		  
	  }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Back) {
			setVisible(false);
			new student_grade_calculator();
		}
		else if(e.getSource()==cancel) {
			System.exit(0);
		}
		
	}
	  
}
public class student_grade_calculator extends JFrame implements ActionListener{
	JTextField name,mark1_text,mark2_text,mark3_text,mark4_text,mark5_text;
	JButton b3,b1,b2;
    student_grade_calculator(){
    	setLayout(null);
    	
    	getContentPane().setBackground(Color.white);
    	
    	JLabel lb=new JLabel("Student Grade Calculation");
    	lb.setBounds(100,20,400,50);
    	lb.setFont(new Font("Raleway",Font.BOLD,30));
    	add(lb);
    	JLabel student_name=new JLabel("Student Name");
    	student_name.setBounds(50,100,150,30);
    	student_name.setFont(new Font("Raleway",Font.BOLD,20));
    	add(student_name);
    	name=new JTextField();
    	name.setBounds(220,100,300,30);
    	name.setFont(new Font("Raleway",Font.BOLD,17));
    	add(name);
    	JLabel mark1=new JLabel("Maths");
    	mark1.setBounds(50,150,150,30);
    	mark1.setFont(new Font("Raleway",Font.BOLD,20));
    	add(mark1);
    	mark1_text=new JTextField();
    	mark1_text.setBounds(150,150,250,30);
    	mark1_text.setFont(new Font("Raleway",Font.BOLD,17));
    	add(mark1_text);
    	JLabel mark2=new JLabel("Science");
    	mark2.setBounds(50,200,150,30);
    	mark2.setFont(new Font("Raleway",Font.BOLD,20));
    	add(mark2);
    	mark2_text=new JTextField();
    	mark2_text.setBounds(150,200,250,30);
    	mark2_text.setFont(new Font("Raleway",Font.BOLD,17));
    	add(mark2_text);
    	JLabel mark3=new JLabel("English");
    	mark3.setBounds(50,250,150,30);
    	mark3.setFont(new Font("Raleway",Font.BOLD,20));
    	add(mark3);
    	mark3_text=new JTextField();
    	mark3_text.setBounds(150,250,250,30);
    	mark3_text.setFont(new Font("Raleway",Font.BOLD,17));
    	add(mark3_text);
    	JLabel mark4=new JLabel("Social");
    	mark4.setBounds(50,300,150,30);
    	mark4.setFont(new Font("Raleway",Font.BOLD,20));
    	add(mark4);
    	mark4_text=new JTextField();
    	mark4_text.setBounds(150,300,250,30);
    	mark4_text.setFont(new Font("Raleway",Font.BOLD,17));
    	add(mark4_text);
    	JLabel mark5=new JLabel("Hindi");
    	mark5.setBounds(50,350,150,30);
    	mark5.setFont(new Font("Raleway",Font.BOLD,20));
    	add(mark5);
    	mark5_text=new JTextField();
    	mark5_text.setBounds(150,350,250,30);
    	mark5_text.setFont(new Font("Raleway",Font.BOLD,17));
    	add(mark5_text);
    	b1=new JButton("Calculate");
    	b1.setFont(new Font("Raleway",Font.BOLD,15));
    	b1.setBounds(100,420,100,40);
    	b1.addActionListener( this);
    	add(b1);
        b2=new JButton("Clear");
    	b2.setFont(new Font("Raleway",Font.BOLD,15));
    	b2.setBounds(240,420,100,40);
    	b2.addActionListener( this);
    	add(b2);
    	 b3=new JButton("Cancel");
    	b3.setFont(new Font("Raleway",Font.BOLD,15));
    	b3.setBounds(380,420,100,40);
    	b3.addActionListener( this);
    	add(b3);
    	setSize(600,550);
    	setVisible(true);
    	setLocation(400,120);
    
    	
    }
    @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    	if(e.getSource()==b1) {
    		String student_name=name.getText();
    		double mark1=Double.parseDouble(mark1_text.getText());
    		double mark2=Double.parseDouble(mark2_text.getText());
    		double mark3=Double.parseDouble(mark3_text.getText());
    		double mark4=Double.parseDouble(mark4_text.getText());
    		double mark5=Double.parseDouble(mark5_text.getText());
    		double total=(mark1+mark2+mark3+mark4+mark5);
    		double average_percentage=((total/500)*100);
    		result rs=new result(student_name,mark1,mark2,mark3,mark4,mark5,total,average_percentage);
    		setVisible(false);
    		
    	}
    	else if(e.getSource()==b2) {
    		mark1_text.setText("");
    		mark2_text.setText("");
    		mark3_text.setText("");
    		name.setText("");
    	}
    	else if(e.getSource()==b3) {
    		System.exit(0);
    	}
		
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new student_grade_calculator();

	}
	

}

