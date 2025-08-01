package assignment5;

public class TicketBooking {
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Default constructor
    public TicketBooking() {}

    // Parameterized constructor
    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Overloaded method 1: Cash payment
    public void makePayment(double amount) {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.printf("Amount %.1f paid in cash\n", amount);
    }

    // Overloaded method 2: Wallet payment
    public void makePayment(double amount, String walletNumber) {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
    }

    // Overloaded method 3: Credit card payment
    public void makePayment(String holderName, double amount, String creditCardType, String ccv) {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.println("Holder name:" + holderName);
        System.out.printf("Amount %.1f paid using %s card\n", amount, creditCardType);
        System.out.println("CCV:" + ccv);
    }
}

