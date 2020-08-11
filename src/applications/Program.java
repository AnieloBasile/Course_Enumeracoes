package applications;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new object---------------------------------------------------------------------------
		//Order orderOE = new Order(id, moment, status) //creates a new variable of type ORDER
				//ctrl + space (of auto complete)
		Order orderOE = new Order(1008, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(orderOE);
		
		OrderStatus oS1 = OrderStatus.DELIVERED;
		
		OrderStatus oS2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(oS1);		
		System.out.println(oS2);

	}

}
