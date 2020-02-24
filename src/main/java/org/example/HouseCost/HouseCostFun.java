package org.example.HouseCost;

public class HouseCostFun {
    private int type;
    private double area;

    public HouseCostFun(int type, double area) {
        this.type = type;
        this.area = area;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    static int costPerSqFeet(int type)
    {
        int cost=0;
        switch(type)
        {
            case 1:cost=1200;
                break;
            case 2:cost=1500;
                break;
            case 3:cost=1800;
                break;
            case 4:cost=2500;
                break;
            default:cost=0;
                break;
        }
        return cost;
    }
    public double calculateTotalCost() {
        int costPerFeet = HouseCostFun.costPerSqFeet(this.type);
        return costPerFeet*this.area;
    }
}
