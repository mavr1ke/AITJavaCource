package homework_20;

public class DogV3 {
    private String name;
    private int jumpHeight;
    private final int maxJumpHeight;
    public static final int INCREASE = 10;

    public static final int MULTIPLIER = 2;

    private static int totalBarrierCount;

    public DogV3(String name, int jumpHeight) {
        setName(name);
        setJumpHeight(jumpHeight);
        this.maxJumpHeight = coefficientMaxJumpHeight(jumpHeight);
    }

    private int coefficientMaxJumpHeight(int jumpHeight) {
        return jumpHeight * MULTIPLIER;
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

    public void whoAmI() {
        System.out.println("i am a dog " + name + ", i can jump on " + jumpHeight + " сm");
    }

    private void jump() {
        System.out.println("Im jumping");
    }

    private void jump(int height) {
        System.out.println("Im done with barrier " + height + " cm");
    }

    public boolean getBarrier(int barrierHeight) {
        if (barrierHeight <= maxJumpHeight && jumpHeight < barrierHeight) {
            while (jumpHeight < barrierHeight) {
                training();
            }
        }

        if (jumpHeight >= barrierHeight) {
            jump(barrierHeight);
            totalBarrierCount++;
        } else {
            System.out.println("I cant get barrier with height: " + barrierHeight);
            return false;
        }

        System.out.println("End get barrier. Current jump " + jumpHeight);
        return true;
    }

    public void training() {
        System.out.println("start training");
        if (jumpHeight + INCREASE <= maxJumpHeight) { // 50 -> 100 -> x <= 100 - 10 (90)
            jumpHeight += INCREASE;
            System.out.println("Im done with training!");
            whoAmI();
        } else if (maxJumpHeight - jumpHeight < INCREASE) {
            System.out.println("Small training start");
            jumpHeight = maxJumpHeight;
        } else {
            System.out.println("I cant train no more :(");
        }

    }

    public static void ShowBarrierCount() {
        System.out.println("\nAll dogs jumped: " + totalBarrierCount + " times");
    }
}
