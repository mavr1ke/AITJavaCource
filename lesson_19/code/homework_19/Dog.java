package homework_19;

public class Dog {
    private String name;
    private int jumpHeight;
    private final int maxJumpHeight;

    private final int increaseByTraining;

    {
        increaseByTraining = 10;
    }

    public Dog(String name, int jumpHeight) {
        setName(name);
        setJumpHeight(jumpHeight);
        this.maxJumpHeight = jumpHeight * 2;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    void whoAmI() {
        System.out.println("Я собака " + name + ", и я умею прыгать на " + jumpHeight + " см");
    }

    void jump() {
        System.out.println("Я прыгаю!");
    }

    void jump(int height) {
        System.out.println("Я перепрыгиваю барьер " + height + " см");
    }

    boolean getBarrier(int barrierHeight) {
        if (barrierHeight <= maxJumpHeight && jumpHeight < barrierHeight) {
            while (jumpHeight < barrierHeight) {
                training();
            }
        }

        if (jumpHeight >= barrierHeight) {
            jump(barrierHeight);
        } else {
            System.out.println("Я не могу перепрыгнуть барьер высотой: " + barrierHeight);
            return false;
        }

        System.out.println("End get barrier. Текущий прыжок " + jumpHeight);
        return true;
    }

    void training() {
        System.out.println("start training");
        if (jumpHeight + increaseByTraining <= maxJumpHeight) { // 50 -> 100 -> x <= 100 - 10 (90)
            jumpHeight += increaseByTraining;
            System.out.println("Я потренировался!");
            whoAmI();
        } else if (maxJumpHeight - jumpHeight < increaseByTraining) {
            System.out.println("Small training start");
            jumpHeight = maxJumpHeight;
        } else {
            System.out.println("Больше натренировать не могу, сорян!");
        }
    }
}
