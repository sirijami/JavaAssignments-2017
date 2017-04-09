import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;


public class TwoNumbersCalculator {
	private JFrame frame = new JFrame("Two Numbers Calculator");
	private Container con = frame.getContentPane();
	private JPanel panel = new JPanel();
	private JTextField inputOne = new JTextField(5);
	private JTextField inputTwo = new JTextField(5);
	private JTextField output = new JTextField(15);
	private JButton calculateButton = new JButton("CALCULATE");
	private String[] operators = { "+", "*", "/", "-" };
	private JComboBox list = new JComboBox(operators);
	

	public static void main(String[] args) {		
		TwoNumbersCalculator calculate = new TwoNumbersCalculator();
		calculate.run();		
    }


	private void run() {
		ButtonListener buttonListen = new ButtonListener();
		calculateButton.addActionListener(buttonListen);		
		inputOne.addActionListener(buttonListen);
		inputTwo.addActionListener(buttonListen);
		output.setEditable(false);
		list.setEditable(false);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLocation(100,100);					
		con.add(panel);		
		panel.add(inputOne);
		panel.add(list);
		panel.add(inputTwo);
		panel.add(calculateButton);
		panel.add(output);
	    
    }
	
      class ButtonListener implements ActionListener{

		@Override
        public void actionPerformed(ActionEvent e) {
			if(!inputOne.equals("") && (!inputTwo.equals(""))){
				double numOne = (Double.parseDouble(inputOne.getText()));
				double numTwo = (Double.parseDouble(inputTwo.getText()));
				String symbol = (String) list.getSelectedItem();
				output.setText("" + TwoNumbersCalculator.calculate(numOne ,numTwo,symbol));
			}     
        }	
	}

	public static double calculate(double numOne, double numTwo, String symbol) {
		double result = 0;
		if(symbol.equals("+")) {
			result = numOne + numTwo;			
		} else if(symbol.equals("*")){
			result = numOne * numTwo;
		} else if(symbol.equals("-")) {
			if(numOne >= numTwo) {
				result = numOne - numTwo;				
			} else {
				result = -(numTwo - numOne);
			}			
		} else if(symbol.equals("/")){
			result = numOne / numTwo;
		}
	    return result;
    }


	


}
