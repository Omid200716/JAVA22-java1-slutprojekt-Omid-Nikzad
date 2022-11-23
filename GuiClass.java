import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiClass {
	
	
	static JFrame frame = new JFrame();
	static void createAndDisplay() {
		
//		FlowLayout layout = new FlowLayout();
		frame.setSize(1200, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout());
		
		
		
	for (int i = 0; i < 7; i++) {
		JPanel groupContainer = new JPanel();
		addContainer(groupContainer);
		groupContainer.setLayout(new BoxLayout(groupContainer, BoxLayout.PAGE_AXIS));
		frame.add(groupContainer);
	}
		
	
//	
//		frame.setLayout(layout);
//		frame.add(groupCountainer2);
		
		frame.setVisible(true);

		
	}  
	private static void addContainer(JPanel container) {
		
		
		
		JLabel labels1 = new JLabel(Date.start.getDayOfWeek()+ "");
		JLabel labels2 = new JLabel(Date.start.getMonth() + " " + Date.start.getDayOfMonth());
		
		if (Date.today.getDayOfMonth() == Date.start.getDayOfMonth()) {
			labels1.setForeground(Color.BLUE);
			labels2.setForeground(Color.blue);
			container.setBackground(Color.CYAN);
		}
		
		
		
		Date.start = Date.start.plusDays(1);
	
		
		JButton button1 = new JButton("Add event");
		JTextField text1 = new JTextField(15);
		text1.setPreferredSize(new Dimension (0, 50));
		text1.setMaximumSize(text1.getPreferredSize());
		
		
		labels1.setAlignmentX(Component.CENTER_ALIGNMENT);
		labels2.setAlignmentX(Component.CENTER_ALIGNMENT);
		button1.setAlignmentX(Component.CENTER_ALIGNMENT);
		text1.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
//		JLabel labels2 = new JLabel("This is label2");
//		JButton button2 = new JButton("Knapp2: ");
//		JTextField text2 = new JTextField(10);
//		JButton button3 = new JButton("Knapp3: ");
//		JTextField text3 = new JTextField(10);
//		
		addActionsListener(button1, container, text1);
//		addActionsListener(button2, container, countainer2, text2, labels2);
//		addActionsListener(button3, container, text3);
//		
		
		container.add(labels1);
		container.add(labels2);
		container.add(button1);
		container.add(text1);
		
//		countainer2.add(button3);
//		countainer2.add(text3);
//		frame.add(container);
		frame.setVisible(true);
//		
	}

	private static void addActionsListener(JButton button, JPanel container, JTextField text) {
		ActionListener actionButton = new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JLabel label = new JLabel(text.getText());
				container.add(label);
			
			
			
			
				frame.setVisible(true);
				
				
			}
			
		};
		button.addActionListener(actionButton);
		
	}
	

}





//JFrame frame = new JFrame();
//FlowLayout layout = new FlowLayout();
////BoxLayout layout = new BoxLayout(frame, 0);
//
//
//frame.setLayout(layout);
//frame.setSize(300, 400);
//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//
//
//JPanel panel = new JPanel();
//JLabel label = new JLabel( " How you doing ");
//JButton button = new JButton(" button 1");
//JButton button2 = new JButton(" button 2");
//JButton button3 = new JButton(" button 3");
//JTextField text = new JTextField("");
//
//
//
//addActionsListener(button, panel, frame);
//
//
//panel.add(label);
//panel.add(button);
//panel.add(button2);
//panel.add(button3);
//panel.add(text);
//frame.add(panel);
//
//
//
//
//frame.setVisible(true);
//
//
//}
//
//
//
//private static void addActionsListener(JButton b, JPanel p, JFrame f) {
//ActionListener action = new ActionListener() {
//	int j =0;
//	
//	
//	
//	
//	
//	
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		j++;
//		JLabel labels = new JLabel("new label");
//		System.out.println(labels.getText() + j);
//		p.add(labels);
//		
//		f.setVisible(true);
//		
//		
//		
//		
//		
//	}
//	
//};
//b.addActionListener(action);