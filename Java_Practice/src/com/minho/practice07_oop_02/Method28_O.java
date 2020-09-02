package com.minho.practice07_oop_02;

import java.awt.*;
import java.awt.event.*;

/*
 * 
 * 
 * 
 */

public class Method28_O {

	

	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	} // main
}
