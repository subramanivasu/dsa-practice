package greedy;

public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five += 1;
            } else if (bills[i] == 10) {
                if (five > 0) {
                    five -= 1;
                    ten += 1;
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (five > 0 && ten > 0) {
                    five -= 1;
                    ten -= 1;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LemonadeChange lemonadeChange = new LemonadeChange();

        // Test case 1: Exact change for all customers
        int[] bills1 = {5, 5, 5, 10, 20};
        System.out.println("Test case 1: " + lemonadeChange.lemonadeChange(bills1)); // Expected: true

        // Test case 2: Not enough change for a $10 bill
        int[] bills2 = {5, 5, 10, 10, 20};
        System.out.println("Test case 2: " + lemonadeChange.lemonadeChange(bills2)); // Expected: false

        // Test case 3: Not enough change for a $20 bill
        int[] bills3 = {5, 5, 5, 10, 5, 20, 20};
        System.out.println("Test case 3: " + lemonadeChange.lemonadeChange(bills3)); // Expected: false

        // Test case 4: All $5 bills
        int[] bills4 = {5, 5, 5, 5, 5};
        System.out.println("Test case 4: " + lemonadeChange.lemonadeChange(bills4)); // Expected: true

        // Test case 5: Mixed bills with sufficient change
        int[] bills5 = {5, 10, 5, 10, 20};
        System.out.println("Test case 5: " + lemonadeChange.lemonadeChange(bills5)); // Expected: true
    }
}
