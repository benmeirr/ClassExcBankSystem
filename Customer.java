package homeExSolutionOOP4;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String bankName;
    private String creditCardNumber;
    private long amountOfMoney;

    public Customer(int id, String firstName, String lastName, String bankName, String creditCardNumber, long amountOfMoney) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankName = bankName;
        this.creditCardNumber = creditCardNumber;
        this.amountOfMoney = amountOfMoney;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBankName() {
        return bankName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public long getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setAmountOfMoney(long amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void getPayment(int salary){
        this.amountOfMoney += salary;
    }
}
