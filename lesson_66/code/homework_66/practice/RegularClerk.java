package homework_66.practice;

public class RegularClerk extends AbstractClerk{
    public RegularClerk( String name, int minTime, int maxTime, int creditsNum){
        super(name,minTime,maxTime,creditsNum);
    }

    @Override
    public void run() {
        for (int i = 0; i < creditsNum; i++) {

            int timeToIssueCredit = minTime + random.nextInt(maxTime - minTime + 1);

            finishTime += timeToIssueCredit;

            try {
                Thread.sleep(timeToIssueCredit); // Замедление потока на время выдачи кредита
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
