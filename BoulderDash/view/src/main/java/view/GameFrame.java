package view;
import javax.swing.*;

import java.awt.event.*;

/**
 * <h1>The Class GameFrame provides the method to use the different keyboard interactions</h1>
 *
 * @author Jean-Francois LHOMME
 * @version 1.0
 */
public class GameFrame extends JFrame implements KeyListener {

	/**
	 * 	Generated Serialized ID
	 */
	private static final long serialVersionUID = 3792052992605473420L;
	private IEventPerformer eventPerformer;


	/**
	 * Create the constructor of GameFrame
	 * @param title
	 * @param performer
	 * @param observable
	 */
	public GameFrame(String title, IEventPerformer performer, IElementBuilder builder){

		this.setTitle(title);
		this.setLocationRelativeTo(null);
		this.setSize(1620, 1010);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GamePanel panel = new GamePanel(builder);

		addKeyListener(this);
		
		//builder.getModel().addObserver(panel);
		
		this.setContentPane(panel);

		this.eventPerformer = performer;

		this.setVisible(true);



		
	}

	/**
	 * Use for research the key who is typed
	 * @param e
	 */
	@Override
	public void keyTyped(KeyEvent e) {

		//this.eventPerformer.eventPerform(e);
	}

	/**
	 * Use for research the key who is pressed
	 * @param e
	 */
	@Override
	public void keyPressed(KeyEvent e) {

		eventPerformer.eventPerform(e);
	}

	/**
	 * Use for research the key who is released
	 * @param e
	 */
	@Override
	public void keyReleased(KeyEvent e) {

		//this.eventPerformer.eventPerform(e);

	}
	
	
}
