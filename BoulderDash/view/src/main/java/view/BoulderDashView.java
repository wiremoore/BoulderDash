package view;

import controller.IOrderPerformer;
import model.IBoulderDashModel;

/**
 * <h1>The class BouilderDashView</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.2
 */

public class BoulderDashView implements Runnable, IView {
	
	private IEventPerformer eventPerformer;
	private IElementBuilder elementBuilder;
	private IOrderPerformer OrderPerformer;
	private IBoulderDashModel model;
	
	public BoulderDashView(){}

    /**
     * Set the current model and take the actual order
     * @param model
	 * 		Use for set the actual model
     * @param order
     *      Use for set the order perform
     */
	public void start(IBoulderDashModel model, IOrderPerformer order) {
        this.OrderPerformer = order;
		this.model = model;
		this.run();
	}


    /**
     * @see IView
     * @param message
     *      the meesage to display
     */
	@Override
	public void displayMessage(String message) {
	}


    /**
     * @see Runnable
     */
    @Override
	public void run() {
		this.eventPerformer = new EventPerformer(OrderPerformer);
    	this.elementBuilder = new ElementBuilder(this.model);
    	new GameFrame("BoulderDash", this.eventPerformer, elementBuilder, model);
	}

}