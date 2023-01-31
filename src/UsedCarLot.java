import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory = new ArrayList<>();

    public UsedCarLot() {
        ArrayList<Car> inventory = new ArrayList<>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(car);
    }

    public boolean swap(int i1, int i2) {
        if (i1<0 || i2<0 || i1 >= inventory.size() || i2>=inventory.size()) {
            return false;
        }
        Car temp = inventory.get(i1);

        inventory.set(i1,inventory.get(i2));
        inventory.set(i2,temp);
        return true;
    }
}
