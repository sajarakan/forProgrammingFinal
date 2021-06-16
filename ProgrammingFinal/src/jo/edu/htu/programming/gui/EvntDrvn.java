package jo.edu.htu.programming.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EvntDrvn {
	public static void main(String[] args) {

		
		JFrame s = new JFrame("Press A Button To Get A Fun Fact");
		
		JButton b1 = new JButton("Animals");
		JButton b2 = new JButton("Art");
		JButton b3 = new JButton("Programming");
		JButton b4 = new JButton("Space");
		
		b1.setBounds(30, 70, 190, 100);
		b2.setBounds(230, 70, 190, 100);
		b3.setBounds(30, 180, 190, 100);
		b4.setBounds(230, 180, 190, 100);
		
		s.add(b1);
		s.add(b2);
		s.add(b3);
		s.add(b4);
		
		
		
		s.setSize(460, 400);
		s.setLayout(null);
		s.setVisible(true);
		
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(s, "You have Chosen Animals!"
						+ " \n Did you know that Elephants are the only animals that can't jump?");
				;}		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e1) {
				JOptionPane.showMessageDialog(s, "You have Chosen Art!"
						+ " \n Art used to be an Olympic event back in 1912-1948");}		});
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) {
				JOptionPane.showMessageDialog(s,"You have Chosen Programming! "
						+ " \n The first computer program was created in 1883 by woman named Ada Lovelace");}		});
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e3) {
				JOptionPane.showMessageDialog(s,"You have Chosen Space!"
						+ "\n There are more stars in the universe than grains of sand on every beach on Earth!");}		});
	}

}