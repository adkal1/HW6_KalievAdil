package lesson_9;

class Dog extends Animal {
    private static int dogCount = 0;
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
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
        if (distance <= SWIM_LIMIT) {
            System.out.println(name + " swam " + distance + " meters.");
        } else {
            System.out.println(name + " can't swim that far!");
        }
    }
}
