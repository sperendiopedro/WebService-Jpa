package com.course.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.course.enums.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ORDER")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "clientID")
	private User client;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant moment;
	private Integer orderStat;

	public Order() {

	}

	public Order(Long id, Instant moment, OrderStatus orderStat, User client) {
		this.id = id;
		this.moment = moment;
		this.client = client;
		setOrderStat(orderStat);
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public User getUser() {
		return client;
	}

	public void setUser(User client) {
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public OrderStatus getOrderStatus() {
		return OrderStatus.valueOf(orderStat);
	}
	
	public void setOrderStat(OrderStatus orderStat) {
		if(orderStat != null) {
			this.orderStat = orderStat.getCode();
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}


}
