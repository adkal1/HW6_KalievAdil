package lesson_9;

class Cat extends Animal {
    private static int catCount = 0;
    private static final int RUN_LIMIT = 200;
    private boolean fullness = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(name + " ran " + distance + " meters.");
        } else {
            System.out.println(name + " can't run that far!");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " can't swim!");
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.getFoodAmount() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            fullness = true;
            System.out.println(name + " ate " + foodAmount + " units of food and is now full.");
        } else {
            System.out.println(name + " couldn't eat, not enough food.");
        }
    }

    public boolean isFull() {
        return fullness;
    }
}
