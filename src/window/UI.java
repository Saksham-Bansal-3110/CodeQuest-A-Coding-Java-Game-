package window;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import window.Game.choiceHandler;

public class UI {
	JFrame window;
	JPanel titleNamePanel, startButtonPanel, LevelNamePanel, LevelPanel;
	JButton startButton, menuButton, Level1,Level2,Level3,Level4,Level5,Level6,Level7,Level8,Level9;
	JLabel titleNameLabel, LevelLabel;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);
	
	public void createUI(choiceHandler cHandler) {
		
		//Window
		window = new JFrame();
		window.setSize(800 , 600);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		//Title Screen
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100,100,600,150);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("Code Quest");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300,400,200,100);
		startButtonPanel.setBackground(Color.black);
		startButtonPanel.setLayout(new GridLayout(2,1));
		
	    startButton = new JButton("START");
	    startButton.setBackground(Color.black);
	    startButton.setForeground(Color.white);
	    startButton.setFont(normalFont);
	    startButton.setFocusPainted(false);
	    startButton.setActionCommand("start");
	    startButton.addActionListener(cHandler);
	    
	    menuButton = new JButton("Menu");
	    menuButton.setBackground(Color.black);
	    menuButton.setForeground(Color.white);
	    menuButton.setFont(normalFont);
	    menuButton.setFocusPainted(false);
	    menuButton.setActionCommand("menu");
	    startButton.addActionListener(cHandler);
	    
		startButtonPanel.add(startButton);
		startButtonPanel.add(menuButton);
		
		window.add(titleNamePanel);
		window.add(startButtonPanel);
		
		window.setVisible(true);
	}
	
	public void Level(choiceHandler cHandler) {
		
		window = new JFrame();
		window.setSize(800 , 600);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		LevelNamePanel = new JPanel();
		LevelNamePanel.setBounds(100,100,600,400);
		LevelNamePanel.setBackground(Color.black);
		LevelNamePanel.setLayout(new GridLayout(3,3));
		
		Level1 = new JButton("Level 1");
		Level1.setBackground(Color.black);
		Level1.setForeground(Color.white);
		Level1.setFont(normalFont);
		Level1.setFocusPainted(false);
		Level1.addActionListener(cHandler);
		Level1.setActionCommand("1");
		LevelNamePanel.add(Level1);
		
		Level2 = new JButton("Level 2");
		Level2.setBackground(Color.black);
		Level2.setForeground(Color.white);
		Level2.setFont(normalFont);
		Level2.setFocusPainted(false);
		Level2.addActionListener(cHandler);
		Level2.setActionCommand("2");
		LevelNamePanel.add(Level2);
		
		Level3 = new JButton("Level 3");
		Level3.setBackground(Color.black);
		Level3.setForeground(Color.white);
		Level3.setFont(normalFont);
		Level3.setFocusPainted(false);
		Level3.addActionListener(cHandler);
		Level3.setActionCommand("3");
		LevelNamePanel.add(Level3);
		
		Level4 = new JButton("Level 4");
		Level4.setBackground(Color.black);
		Level4.setForeground(Color.white);
		Level4.setFont(normalFont);
		Level4.setFocusPainted(false);
		Level4.addActionListener(cHandler);
		Level4.setActionCommand("4");
		LevelNamePanel.add(Level4);
		
		Level5 = new JButton("Level 5");
		Level5.setBackground(Color.black);
		Level5.setForeground(Color.white);
		Level5.setFont(normalFont);
		Level5.setFocusPainted(false);
		Level5.addActionListener(cHandler);
		Level5.setActionCommand("5");
		LevelNamePanel.add(Level5);
		
		Level6 = new JButton("Level 6");
		Level6.setBackground(Color.black);
		Level6.setForeground(Color.white);
		Level6.setFont(normalFont);
		Level6.setFocusPainted(false);
		Level6.addActionListener(cHandler);
		Level6.setActionCommand("6");
		LevelNamePanel.add(Level6);
		
		Level7 = new JButton("Level 7");
		Level7.setBackground(Color.black);
		Level7.setForeground(Color.white);
		Level7.setFont(normalFont);
		Level7.setFocusPainted(false);
		Level7.addActionListener(cHandler);
		Level7.setActionCommand("7");
		LevelNamePanel.add(Level7);
		
		Level8 = new JButton("Level 8");
		Level8.setBackground(Color.black);
		Level8.setForeground(Color.white);
		Level8.setFont(normalFont);
		Level8.setFocusPainted(false);
		Level8.addActionListener(cHandler);
		Level8.setActionCommand("8");
		LevelNamePanel.add(Level8);
		
		Level9 = new JButton("Level 9");
		Level9.setBackground(Color.black);
		Level9.setForeground(Color.white);
		Level9.setFont(normalFont);
		Level9.setFocusPainted(false);
		Level9.addActionListener(cHandler);
		Level9.setActionCommand("9");
		LevelNamePanel.add(Level9);
		
		
		LevelPanel = new JPanel();
		LevelPanel.setBounds(100,15,600,50);
		LevelPanel.setBackground(Color.black);
		LevelLabel = new JLabel("Levels");
		LevelLabel.setForeground(Color.white);
		LevelLabel.setFont(normalFont);
		LevelPanel.add(LevelLabel);
		
		
		window.add(LevelPanel);
		window.add(LevelNamePanel);
		
		window.setVisible(true);
	}
}
