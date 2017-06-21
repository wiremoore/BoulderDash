package view;

import java.awt.event.KeyEvent;
import controller.IOrderPerformer;
import controller.Order;

public class EventPerformer implements IEventPerformer {
	
	IOrderPerformer orderPerformer;
	
	public EventPerformer(IOrderPerformer orderPerformer){
		this.orderPerformer = orderPerformer;
	}
	
	public void keyCodeToUserOrder(int keycode) throws Exception{
		switch(keycode){
			case KeyEvent.VK_DOWN :
				this.orderPerformer.OrderPerform(Order.DOWN);
				System.out.println("DOWN");
				break;
			case KeyEvent.VK_UP :
				this.orderPerformer.OrderPerform(Order.UP);
				System.out.println("UP");
				break;
			case KeyEvent.VK_RIGHT :
				this.orderPerformer.OrderPerform(Order.RIGHT);
				System.out.println("RIGHT");
				break;
			case KeyEvent.VK_LEFT :
				this.orderPerformer.OrderPerform(Order.LEFT);
				System.out.println("LEFT");
				break;
		}
	}


	@Override
	public void eventPerform(KeyEvent keyCode) throws Exception {
		
		this.keyCodeToUserOrder(keyCode.getKeyCode());
	}

}
