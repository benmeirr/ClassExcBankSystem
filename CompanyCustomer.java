package homeExSolutionOOP4;

public class CompanyCustomer {
    private int id;
    private String name;
    private String bankName;
    private long amountOfMoney;

    public CompanyCustomer(int id, String name, long amountOfMoney) {
        this.id = id;
        this.name = name;
        this.amountOfMoney = amountOfMoney;
        this.bankName = "Bank Discount";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmountOfMoney(long amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
