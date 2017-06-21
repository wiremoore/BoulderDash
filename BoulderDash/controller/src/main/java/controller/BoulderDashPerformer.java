package controller;

import model.IBoulderDashModel;
import model.IElement;
import view.IView;

public class BoulderDashPerformer implements IOrderPerformer{

    public IBoulderDashModel ActualModel;
    public IView ActualView;
    
    private IElement hero;
    private IBoulderDashModel mine;
    
    private Order order;

    /**
     * Create constructor
      * @param BoulderDashModel
     * @param view
     */
	public BoulderDashPerformer(IBoulderDashModel BoulderDashModel, IView view) {

        ActualModel = BoulderDashModel;
        ActualView = view;
    }
	

	/**
	 * method in order to play
	 */
	public void play() throws Exception {
       ActualModel.buildMine();
       ActualView.start(this.ActualModel, this);
       this.hero = this.ActualModel.getElementByPosition(1, 1);

	}

	/**
	 * create a loop
	 */
	private void gameLoop() {}


	/**
	 * Sets the ViewSystem
	 * 
	 * @param viewSystem
	 */
	public void setViewSystem(IView viewSystem) {}
	
	/**
	 * @throws Exception 
	 * @see IOrderPerformer
	 */
	@Override
	public void OrderPerform(Order order) throws Exception {
		
		if ((order == Order.DOWN)){
			
			String next = Colision.getDownElement(ActualModel, hero);
			
			if(next == "stone"){}
			else if(next == "door"){
				
			}
			else if(next == "diamond"){
				this.ActualModel.getDiamond();
				this.hero.getBehaviour().moveDown();
			}
			else if(next == "wall"){}
			else {
				this.hero.getBehaviour().moveDown();
			}
        }


        if (order == Order.UP){
    		
        	String next = Colision.getUpElement(ActualModel, hero);
			
			if(next == "stone"){}
			else if(next == "door"){
				
			}
			else if(next == "diamond"){
				this.ActualModel.getDiamond();
				this.hero.getBehaviour().moveUp();
			}
			else if(next == "wall"){}
			else {
				this.hero.getBehaviour().moveUp();
			}
        }

        if (order == Order.RIGHT){
        	
        	String next = Colision.getRightElement(ActualModel, hero);
			
			if(next == "stone"){}
			else if(next == "door"){
				
			}
			else if(next == "diamond"){
				this.ActualModel.getDiamond();
				this.hero.getBehaviour().moveRight();
			}
			else if(next == "wall"){}
			else {
				this.hero.getBehaviour().moveRight();
			}
        }

        if (order == Order.LEFT){
        	
        	String next = Colision.getLeftElement(ActualModel, hero);
			
			if(next == "stone"){}
			else if(next == "door"){
				
			}
			else if(next == "diamond"){
				this.ActualModel.getDiamond();
				this.hero.getBehaviour().moveLeft();
			}
			else if(next == "wall"){}
			else {
				this.hero.getBehaviour().moveLeft();
			}
        }
    }


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}
}
