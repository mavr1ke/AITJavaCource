package homework_66.practice;

public class LazyInspiredClerk extends AbstractClerk {
    private static final int INSPIRATION_PROBABILITY = 20; //  вероятность вдохновения
    private static final int INSPIRATION_TIMES = 3; // сколько раз выдает кредиты быстрее

    private final double inspirationCoef;

    public LazyInspiredClerk(String name, int minTime, int maxTime, int creditsNum, double inspirationCoef) {
        super(name, minTime, maxTime, creditsNum);
        this.inspirationCoef = inspirationCoef;
    }

    public void run() {
        int creditsIssued = 0;

        while (creditsIssued < creditsNum) {
            if (random.nextInt(100) < INSPIRATION_PROBABILITY) {
                for (int i = 0; i < INSPIRATION_TIMES; i++) {
                    if (creditsIssued >= creditsNum) {
                        break;
                    }

                    int timeToIssueCredit = (int) (minTime * inspirationCoef) +
                            random.nextInt((int) (maxTime * inspirationCoef) -
                                    (int) (minTime * inspirationCoef) + 1);
                    finishTime += timeToIssueCredit;
                    creditsIssued++;

                    try {
                        Thread.sleep(timeToIssueCredit); // Замедление потока на время выдачи кредита
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }

            } else {
                int timeToIssueCredit = minTime + random.nextInt(maxTime - minTime + 1);
                finishTime += timeToIssueCredit;
                creditsIssued++;

                try {
                    Thread.sleep(timeToIssueCredit); // Замедление потока на время выдачи кредита
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}