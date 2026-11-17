public class ShoppingCalculator {

    public static void main(String[] args) {
        int itemPrice = 250;
        int quantity = 3;
        int discount = 100;
        int amountPaid = 1000;

        int totalCost = itemPrice * quantity;
        int finalPrice = totalCost - discount;
        int change = amountPaid - finalPrice;

        System.out.println("Item Price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Change: " + change);
    }
}