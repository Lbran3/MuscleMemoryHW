package chapter6;
/*
phone bill should have an id, base cost, # of allotted minutes, # of minutes used
calculate overage, tax, total phone bill,
print itemized bill
include following constructors: default, id-only, all fields
create a class that instantiates a phone bill and prints the itemized bill
 */
public class PhoneBill {

    //initialize we know/need
    private int id;
    private double baseCost;
    private int numberOfMinutes;
    private int minutesUsed;


    public PhoneBill(){
        id = 1;
        baseCost = 55.99;
        numberOfMinutes = 600;
        minutesUsed = 450;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getNumberOfMinutes() {
        return numberOfMinutes;
    }

    public void setNumberOfMinutes(int numberOfMinutes) {
        this.numberOfMinutes = numberOfMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }
}
