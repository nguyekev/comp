public class O {
    int orderNumber;
    int arrivalTime;
    int serviceTime;

    String customerName;

    public O(int order, int arrival, int service, String name) {
        orderNumber = order;
        arrivalTime = arrival;
        serviceTime = service;
        customerName = name;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public String getCustomerName() {
        return customerName;
    }



}
