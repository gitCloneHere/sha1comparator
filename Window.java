package org.gitclonehere.hashcomparator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame {

	public Window() {

		// WindowSettings
		this.setTitle("SHA1 Comparator");
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Top Panel creation
		JPanel topPane = new JPanel();
		JLabel topText = new JLabel("Exptected CheckSum");
		final JTextField topTextField = new JTextField("Expected Checksum");
		topTextField.setPreferredSize(new Dimension(400, 30));
		topPane.add(topText);
		topPane.add(topTextField);
		
		// Middle Panel creation
		JPanel middlePane = new JPanel();
		JLabel middleText = new JLabel("File CheckSum");
		final JTextField middleTextField = new JTextField("Checksum");
		middleTextField.setPreferredSize(new Dimension(400, 30));
		middlePane.add(middleText);
		middlePane.add(middleTextField);
		
		// Bottom Panel creation
		JPanel bottomPane = new JPanel();
		final JLabel result = new JLabel("Result");
		JButton resultButton = new JButton("Check Result");
		bottomPane.add(result);
		bottomPane.add(resultButton);

		// Affichage des Pane
		this.setLayout(new GridLayout(3, 1));
		this.getContentPane().add(topPane);
		this.getContentPane().add(middlePane);
		this.getContentPane().add(bottomPane);
		
		resultButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String topInput = topTextField.getText();
				String middleInput = middleTextField.getText();
				Sha1comparator compare = new Sha1comparator(topInput, middleInput);
				result.setText(compare.getResult());
			}
		});

		// Visibility
		this.setVisible(true);
	}

}
