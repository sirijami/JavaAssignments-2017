import java.awt.Container;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CelsiusFahrenheitConverter {
	private JFrame frame = new JFrame("CelsiusFahrenheitConverter");
	private Container con = frame.getContentPane();
	private JTextField input = new JTextField(20);
	private JTextField output = new JTextField(20);
	private JButton convertButton = new JButton("CONVERT");
	private JPanel panel = new JPanel();
	private String[] options = {"toCelsius" , "toFahrenheit"};
	private JComboBox list = new JComboBox(options);
	

	public static void main(String[] args) {
		CelsiusFahrenheitConverter cfc = new CelsiusFahrenheitConverter();
		cfc.run();	
	}

	private void run() {
		ButtonListener buttonListen = new ButtonListener();
		convertButton.addActionListener(buttonListen);		
		input.addActionListener(buttonListen);
		output.setEditable(false);
		list.setEditable(false);
		
		frame.setSize(50, 50);
		frame.setVisible(true);
		frame.setLocation(100,100);			
		con.add(panel);		
		panel.add(input);
		panel.add(list);
		panel.add(convertButton);
		panel.add(output);
		
    }
	
    class ButtonListener implements ActionListener{

		@Override
      public void actionPerformed(ActionEvent e) {
			if(!input.equals("")){
				double numOne = (Double.parseDouble(input.getText()));
				String symbol = (String) list.getSelectedItem();
				output.setText("" + CelsiusFahrenheitConverter.calculate(numOne,symbol));
			}  
		}
    }

	public static double calculate(double numOne, String symbol) {
		double result = 0;
		if(symbol.equals("toCelsius")) {
			result =  (numOne - 32) * 5/9;
		} else if (symbol.equals("toFahrenheit")) {
			result =  numOne * 9/5 + 32;
		}
	    return result;
    }
    
}

