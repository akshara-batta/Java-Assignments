class FoodItem{
    int itemId;
    String itemName;
    double price;
    static String cafeteriaName = "UCampus Cafeteria";
    static double serviceCharge = 10.0;
    static int totalFoodItems = 0;

    public void addFoodItem(int id, String name, double price){
        this.itemId = id;
        this.itemName = name;
        this.price = price;
        totalFoodItems++;
    }
    public double calculateFinalPrice(){
        return price+((price*serviceCharge)/100);
    }

    public void displayItemDetails(){
        System.out.println("Item id: " + this.itemId);
        System.out.println("Item Name: " + this.itemName);
        System.out.println("Original Price: " + this.price);
        System.out.println("Item Final Price: " + calculateFinalPrice());
    }

    public static void changeServiceCharge(double newCharge){
        serviceCharge = newCharge;
    }
    public static void displayCafetriaDetails(){
        System.out.println("Cafeteria Name: " + cafeteriaName);
        System.out.println("Service Charge: " + serviceCharge);
        System.out.println("Total Items: " + totalFoodItems);
    }

    public static void main(String[] args){
        FoodItem i1 = new FoodItem();
        FoodItem i2 = new FoodItem();
        FoodItem i3 = new FoodItem();

        i1.addFoodItem(101, "Veg Sandwich", 80);
        i2.addFoodItem(102, "Noodles", 120);
        i3.addFoodItem(103, "Cold Coffee", 150);

        FoodItem.displayCafetriaDetails();
        i1.displayItemDetails();
        i2.displayItemDetails();
        i3.displayItemDetails();

        FoodItem.changeServiceCharge(15);

        System.out.println("After Updating Services: ");

        i1.displayItemDetails();
        i2.displayItemDetails();
        i3.displayItemDetails();

    }
}