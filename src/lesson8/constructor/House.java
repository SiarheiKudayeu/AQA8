package lesson8.constructor;

public class House {
    public void getAllInfoAboutHouse() {
        System.out.println("Your address " + address);
        System.out.println("Your capacity " + capacity);
        System.out.println("Count of floors " + countOfFloors);
        if (isNew) {
            System.out.println("House is new!!!");
        } else {
            System.out.println("House is NOT new!!!");
        }
    }
    private String address;
    private int capacity;
    private int countOfFloors;

    public House(String address, int capacity, int countOfFloors, boolean isNew) {
        this.isNew = isNew;
        this.capacity = capacity;
        this.countOfFloors = countOfFloors;
        this.address = address;
    }

    public House(String address, int countOfFloors, boolean isNew, int capacity) {
        this(capacity, isNew);
        this.countOfFloors = countOfFloors;
        this.address = address;
    }

    public House() {
    }

    public House(int capacity, boolean isNew) {
        this.isNew = isNew;
        this.capacity = capacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCountOfFloors() {
        return countOfFloors;
    }

    public void setCountOfFloors(int countOfFloors) {
        this.countOfFloors = countOfFloors;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }



    private boolean isNew;
}
