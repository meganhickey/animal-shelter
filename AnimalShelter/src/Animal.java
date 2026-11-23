public class Animal {
    private String name;
    private String type;
    private long arrivalOrder;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        this.arrivalOrder = 0;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public long getArrivalOrder() {
        return arrivalOrder;
    }

    public void setArrivalOrder(long arrivalOrder) {
        this.arrivalOrder = arrivalOrder;
    }
}
