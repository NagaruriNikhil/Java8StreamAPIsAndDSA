package JavaStreamApis.models;

import java.util.Date;

public class Order {
    public int id;
    public String status;
    public Date orderDate;

    public Order(int id, String status, Date orderDate) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String toString() {
        return id + ":" + status;
    }
}
