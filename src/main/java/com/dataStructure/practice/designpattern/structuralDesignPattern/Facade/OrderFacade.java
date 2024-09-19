package com.dataStructure.practice.designpattern.structuralDesignPattern.Facade;

public class OrderFacade {

    private Restaurant restaurant;
    private PrepareOrder prepareOrder;
    private  DeliveryBoy deliveryBoy;
    private  OrderDelivered orderDelivered;

    public OrderFacade(Restaurant restaurant, PrepareOrder prepareOrder, DeliveryBoy deliveryBoy, OrderDelivered orderDelivered) {
        this.restaurant = restaurant;
        this.prepareOrder = prepareOrder;
        this.deliveryBoy = deliveryBoy;
        this.orderDelivered = orderDelivered;
    }

    public void placeOrder(){
        restaurant.placeOrder();
        prepareOrder.prepareOrder();
        deliveryBoy.deliveredToBoy();
        orderDelivered.orderDelivered();
    }
}
