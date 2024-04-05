package enumerationdemo;

public enum Days {
    //we use enums for values that are fixed constants
    //THEY NEVER CHANGE
    //a constructor is not required

    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    //PROPERTIES IN ENUMS HAVE TO BE FINAL

    private final int numberOfDay;

    public int getNumberOfDay() {
        return numberOfDay;
    }
    //a setter is not needed in this case as the variable is final.

    Days(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }
}
