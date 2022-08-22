package homeExSolutionOOP4;

public class BankDiscount extends Bank {

    private String type;

    private CompanyCustomer[] companyCustomers;


    public BankDiscount(int id, String name, int numOfEmployees, long amountOfRevenue, long amountOfExpenses, Customer[] customers, CompanyCustomer[] companyCustomers) {
        super(id, name, numOfEmployees, amountOfRevenue, amountOfExpenses, customers);
        this.type = "Bank Discount";
        this.companyCustomers = companyCustomers;
    }

    @Override
    public void calculateCustomerMoney() {
        long customerMoneyInBank = 0;
        for (int i = 0; i < this.getCustomers().length; i++) {
            customerMoneyInBank += this.getCustomers()[i].getAmountOfMoney();
        }

        for (int i = 0; i < this.companyCustomers.length; i++) {
            customerMoneyInBank += this.companyCustomers[i].getAmountOfMoney();
        }
        this.setAmountOfRevenue(customerMoneyInBank);
    }

    public void takePayment(CompanyCustomer companyCustomer, int payment){
        this.setAmountOfRevenue(this.getAmountOfRevenue() + payment);
        companyCustomer.setAmountOfMoney(companyCustomer.getAmountOfMoney() - payment);
    }
}
