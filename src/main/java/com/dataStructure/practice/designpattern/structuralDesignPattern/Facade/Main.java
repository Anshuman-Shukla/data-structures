package com.dataStructure.practice.designpattern.structuralDesignPattern.Facade;

public class Main {
    public static void main(String[] args) {
         Restaurant restaurant =new Restaurant();
         PrepareOrder prepareOrder=new PrepareOrder();
         DeliveryBoy deliveryBoy =new DeliveryBoy();
         OrderDelivered orderDelivered = new OrderDelivered();
        OrderFacade orderFacade= new OrderFacade(restaurant,prepareOrder,deliveryBoy,orderDelivered);
        orderFacade.placeOrder();
    }
}
