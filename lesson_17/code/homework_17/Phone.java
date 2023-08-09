package homework_17;

public class Phone {
    long number;
    String model;
    short weight;

    public Phone(long number, String model, short weight) {
//        this.number = number;
//        this.model = model;
//        this.weight = weight;
        this(number,model);
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(){

    }

    void phoneInfo() {
        System.out.println("\nPhone number: " + number);
        System.out.println("Phone model: " + model);
        System.out.println("Phone weight: " + weight);
    }

    void receiveCall(String callerName){
        System.out.println("Call from " + callerName);
    }

    long getNumber(){
        return number;
    }

    void receiveCall(String callerName, long callerNumber){
        System.out.println("\nCall from " + callerName);
        System.out.println("Number: " + callerNumber);
    }
}
