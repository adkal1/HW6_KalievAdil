package lesson_9;

public class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        this.foodAmount = initialFood;
    }

    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("Added " + amount + " units of food to the bowl.");
    }

    public void decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
