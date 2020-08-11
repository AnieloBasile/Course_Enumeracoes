//Order Class -----------------------------------------------------------------------------------------------------

package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	//não foi criado como public void
	private Integer      id ;    //order ID
	private Date         moment; //moment the creation of order
	private OrderStatus  status; //order status, type OrderStatus was created in "entity.enums"
	
	public Order() {
		//empty builder 
	}

	public Order(Integer id, Date moment, OrderStatus status) {
		//super(); this line is not necessary
		this.id     = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
	
	
	

}
