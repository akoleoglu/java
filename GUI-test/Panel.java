	//********************************************************************
	// Program Name:  GreetingPanel.java  - Starting Code 
	// Author : P Baker and ???
	// Date : 
	//
	// Brief Description:  User puts their name in the JTextField.  When the
    //                       button is clicked, the name is retrieved and 
    //                       a nice message is displayed by setting the
    //                       text of a JLabel.
	//********************************************************************
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	

	public class GreetingPanel extends JPanel
	{
	   
	   private JLabel questionLabel;  
	   private JTextField answerTextField;
	   private JButton button;
	   private JLabel niceMessageLabel;
	     

	 	//Constructor:  Sets up the Panel  
	   public GreetingPanel()
	   {
			

		  
		   questionLabel = new JLabel("What is your name? ");
		   
		   questionLabel.setFont(new Font("Serif",Font.BOLD,15));
		
		   answerTextField = new JTextField(7);
		   button = new JButton("Press Here!");
		   button.setForeground(Color.RED);
		   button.setFont(new Font("Calabri",Font.ITALIC,15));
		   niceMessageLabel = new JLabel("");
		   niceMessageLabel.setFont(new Font("Serif",Font.BOLD,25));
		   niceMessageLabel.setForeground(Color.BLUE);
			
			//add all the components to panel.  order is important
		   add(questionLabel);
		   
		   add(answerTextField);
		   add(button); 
		   add(niceMessageLabel);
		   
		   
		   
	        //connect event handler to event source
	       button.addActionListener(new ButtonListener());
					
			//configure panel.  
	       setBackground(Color.LIGHT_GRAY);
	       setPreferredSize(new Dimension(170, 200));
		  
	   }

	   //private internal class that is a listener for button push (action) events.
		//also called an event handler
		private class ButtonListener implements ActionListener
	   {
	      public void actionPerformed (ActionEvent event)
	      {
	    	   //get the name the user put in the answerTextField
	
	    	  String text = answerTextField.getText();
	    	  niceMessageLabel.setText("Hello, "+text);
	    	  
	    	   //now set the text of the niceMessageLabel 
	    	   //to a nice message that includes the name 
	    	   
	           
				  
				  
	      }//end of ActionPerformed method
			
	   }//end of ButtonListener
		
	}//end of GreetingPanel
