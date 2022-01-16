import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Calculator implements ActionListener {
	boolean isOperatorClicked=false;
	double oldValue, newValue, result;
	String displayResult, operator;
	JFrame jf;
	JLabel jl;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton zerobutton;
	JButton dotbutton;
	JButton equalbutton;
	JButton plusbutton;
	JButton mulbutton;
	JButton divbutton;
	JButton minusbutton;
	JButton clearbutton;
	JButton backspace;
	JButton square;
	
	public Calculator() {
		jf=new JFrame("Calculator clone");
		jf.setSize(410, 500);
		jf.setLocation(400, 100);
		
		jl=new JLabel();
		jl.setBounds(30, 60, 342, 50);
		jl.setBackground(Color.white);
		jl.setOpaque(true);
		jl.setHorizontalAlignment(SwingConstants.RIGHT);
		jl.setForeground(Color.black);
		jl.setFont(new Font("Rockwell", Font.ITALIC, 20));
		Border border = BorderFactory.createLineBorder(Color.black, 2);
		jl.setBorder(border);
		jf.add(jl);
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(30, 130, 60, 60);
		sevenbutton.setFont(new Font("Arial",Font.ITALIC,20));
		sevenbutton.addActionListener(this);
		jf.add(sevenbutton);
		
		eightbutton=new JButton("8");
		eightbutton.setBounds(100, 130, 60, 60);
		eightbutton.setFont(new Font("Arial",Font.ITALIC,20));
		eightbutton.addActionListener(this);
		jf.add(eightbutton);
		
		ninebutton=new JButton("9");
		ninebutton.setBounds(170, 130, 60, 60);
		ninebutton.setFont(new Font("Arial",Font.ITALIC,20));
		ninebutton.addActionListener(this);
		jf.add(ninebutton);
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(30, 200, 60, 60);
		fourbutton.setFont(new Font("Arial",Font.ITALIC,20));
		fourbutton.addActionListener(this);
		jf.add(fourbutton);
		
		fivebutton=new JButton("5");
		fivebutton.setBounds(100, 200, 60, 60);
		fivebutton.setFont(new Font("Arial",Font.ITALIC,20));
		fivebutton.addActionListener(this);
		jf.add(fivebutton);
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(170, 200, 60, 60);
		sixbutton.setFont(new Font("Arial",Font.ITALIC,20));
		sixbutton.addActionListener(this);
		jf.add(sixbutton);
		
		onebutton=new JButton("1");
		onebutton.setBounds(30, 270, 60, 60);
		onebutton.setFont(new Font("Arial",Font.ITALIC,20));
		onebutton.addActionListener(this);
		jf.add(onebutton);
		
		twobutton=new JButton("2");
		twobutton.setBounds(100, 270, 60, 60);
		twobutton.setFont(new Font("Arial",Font.ITALIC,20));
		twobutton.addActionListener(this);
		jf.add(twobutton);
		
		threebutton=new JButton("3");
		threebutton.setBounds(170, 270, 60, 60);
		threebutton.setFont(new Font("Arial",Font.ITALIC,20));
		threebutton.addActionListener(this);
		jf.add(threebutton);
		
		dotbutton=new JButton(".");
		dotbutton.setBounds(30, 340, 60, 60);
		dotbutton.setFont(new Font("Arial",Font.ITALIC,20));
		dotbutton.addActionListener(this);
		jf.add(dotbutton);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(100, 340, 60, 60);
		zerobutton.setFont(new Font("Arial",Font.ITALIC,20));
		zerobutton.addActionListener(this);
		jf.add(zerobutton);
		
		equalbutton=new JButton("=");
		equalbutton.setBounds(170, 340, 60, 60);
		equalbutton.setFont(new Font("Arial",Font.ITALIC,20));
		equalbutton.addActionListener(this);
		jf.add(equalbutton);
		
		divbutton=new JButton("/");
		divbutton.setBounds(240, 130, 60, 60);
		divbutton.setFont(new Font("Arial",Font.ITALIC,20));
		divbutton.addActionListener(this);
		jf.add(divbutton);
		
		mulbutton=new JButton("x");
		mulbutton.setBounds(240, 200, 60, 60);
		mulbutton.setFont(new Font("Arial",Font.ITALIC,20));
		mulbutton.addActionListener(this);
		jf.add(mulbutton);
		
		minusbutton=new JButton("-");
		minusbutton.setBounds(240, 270, 60, 60);
		minusbutton.setFont(new Font("Arial",Font.ITALIC,20));
		minusbutton.addActionListener(this);
		jf.add(minusbutton);
		
		plusbutton=new JButton("+");
		plusbutton.setBounds(240, 340, 60, 60);
		plusbutton.setFont(new Font("Arial",Font.ITALIC,20));
		plusbutton.addActionListener(this);
		jf.add(plusbutton);
		
		clearbutton=new JButton("C");
		clearbutton.setBounds(311, 340, 60, 60);
		clearbutton.setFont(new Font("Arial",Font.ITALIC,20));
		clearbutton.addActionListener(this);		
		jf.add(clearbutton);
		
		backspace=new JButton("\uF0E7");
		backspace.setFont(new Font("Wingdings",Font.BOLD,18));
		backspace.setBounds(311, 270, 60, 60);
		backspace.addActionListener(this);
		jf.add(backspace);
		
		square=new JButton("X²");
		square.setFont(new Font("Arial",Font.BOLD,18));
		square.setBounds(310, 200, 60, 60);
		square.addActionListener(this);
		jf.add(square);
		
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenbutton) {
			if(isOperatorClicked) {
				jl.setText("7");
			}else {
				jl.setText(jl.getText()+"7");
			}
			
		}else if(e.getSource()==eightbutton) {
			if(isOperatorClicked) {
				jl.setText("8");
				isOperatorClicked=false;
			}else {
				jl.setText(jl.getText()+"8");
			}
			
		}else if(e.getSource()==ninebutton) {
			if(isOperatorClicked) {
				jl.setText("9");
				isOperatorClicked=false;
			}else {
				jl.setText(jl.getText()+"9");
			}
			
		}else if(e.getSource()==fourbutton) {
			if(isOperatorClicked) {
				jl.setText("4");
				isOperatorClicked=false;
			}else {
				jl.setText(jl.getText()+"4");
			}
			
		}else if(e.getSource()==fivebutton) {
			if(isOperatorClicked) {
				jl.setText("5");
				isOperatorClicked=false;
			}else {
				jl.setText(jl.getText()+"5");
			}
			
		}else if(e.getSource()==sixbutton) {
			if(isOperatorClicked) {
				jl.setText("6");
				isOperatorClicked=false;
			}else {
				jl.setText(jl.getText()+"6");
			}
			
		}else if(e.getSource()==onebutton) {
			if(isOperatorClicked) {
				jl.setText("1");
				isOperatorClicked=false;
			}else {
				jl.setText(jl.getText()+"1");
			}
			
		}else if(e.getSource()==twobutton) {
			if(isOperatorClicked) {
				jl.setText("2");
				isOperatorClicked=false;
			}else {
				jl.setText(jl.getText()+"2");
			}
			
		}else if(e.getSource()==threebutton) {
			if(isOperatorClicked) {
				jl.setText("3");
				isOperatorClicked=false;
			}else {
				jl.setText(jl.getText()+"3");
			}
			
		}else if(e.getSource()==zerobutton) {
			if(isOperatorClicked) {
				jl.setText("0");
				isOperatorClicked=false;
			}else {
				jl.setText(jl.getText()+"0");
			}
			
		}else if(e.getSource()==dotbutton) {
			jl.setText(jl.getText()+".");
		
		}else if(e.getSource()==plusbutton) {
			oldValue=Double.parseDouble(jl.getText());
			jl.setText("");
			operator="+";
			
		}else if(e.getSource()==mulbutton) {
			oldValue=Double.parseDouble(jl.getText());
			jl.setText("");
			operator="*";
			
		}else if(e.getSource()==divbutton) {
			oldValue=Double.parseDouble(jl.getText());
			jl.setText("");
			operator="/";
			
		}else if(e.getSource()==minusbutton) {
			oldValue=Double.parseDouble(jl.getText());
			jl.setText("");
			operator="-";	
				
		}else if(e.getSource()==clearbutton) {
			jl.setText("");
			
		}else if(e.getSource()==square) {
			oldValue=Double.parseDouble(jl.getText());
			jl.setText("");
			result=oldValue*oldValue;
			displayResult=String.format("%.2f", result);
			jl.setText(displayResult);
			
		}else if(e.getSource()==backspace) {
			String backSpace=null;
			if(jl.getText().length()>0) {
				StringBuilder str=new StringBuilder(jl.getText());
				str.deleteCharAt(jl.getText().length()-1);
				backSpace=str.toString();
				jl.setText(backSpace);
			}
			
		}else if(e.getSource()==equalbutton) {
			newValue=Double.parseDouble(jl.getText());
			if(operator=="+") {
				result=oldValue+newValue;
				displayResult=String.format("%.2f", result);
				jl.setText(displayResult);
			}else if(operator=="-") {
				result=oldValue-newValue;
				displayResult=String.format("%.2f", result);
				jl.setText(displayResult);
			}else if(operator=="*") {
				result=oldValue*newValue;
				displayResult=String.format("%.2f", result);
				jl.setText(displayResult);
			}else if(operator=="/") {
				result=oldValue/newValue;
				displayResult=String.format("%.2f", result);
				jl.setText(displayResult);
			}
		}
	}
}