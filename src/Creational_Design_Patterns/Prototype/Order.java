package Creational_Design_Patterns.Prototype;

import java.util.ArrayList;
import java.util.List;

class Order implements Cloneable {
    private List<String> orderList;

    public Order() {
        this.orderList = new ArrayList<String>();
    }

    public Order(List<String> list) {
        this.orderList = list;
    }

    public void insertData() {
        orderList.add("Pasta");
        orderList.add("Noodles");
        orderList.add("Roti");
        orderList.add("Ice Cream");
        orderList.add("Soup");
    }

    public List<String> getOrderList() {
        return this.orderList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<String>();

        for(String s : this.getOrderList()) {
            tempList.add(s);
        }

        return new Order(tempList);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Order a = new Order();
        a.insertData();

        Order b = (Order) a.clone();
        List<String> list = b.getOrderList();
        list.add("Dosa");

        System.out.println(a.getOrderList());
        System.out.println(list);

        b.getOrderList().remove("Soup");
        System.out.println(list);
        System.out.println(a.getOrderList());
    }
}
