package homeExSolutionOOP4;

public class BankMizrahi extends Bank {

    private String type;

    public BankMizrahi(int id, String name, int numOfEmployees, long amountOfRevenue, long amountOfExpenses, Customer[] customers) {
        super(id, name, numOfEmployees, amountOfRevenue, amountOfExpenses, customers);
        this.type = "Bank Mizrahi";
    }


    @Override
    public void calculateCustomerMoney() {

    }


}
