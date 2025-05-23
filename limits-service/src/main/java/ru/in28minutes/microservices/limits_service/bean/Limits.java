package ru.in28minutes.microservices.limits_service.bean;

public class Limits {

    private int minimum;
    private int maximum;


    public Limits(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    @Override
    public String toString() {
        return "Limits{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                '}';
    }

    public Limits() {
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

}
