package homeExSolutionOOP4;

public class BankHapoalim extends Bank {
    private String type;

    public BankHapoalim(int id, String name, int numOfEmployees, long amountOfRevenue, long amountOfExpenses, Customer[] customers) {
        super(id, name, numOfEmployees, amountOfRevenue, amountOfExpenses, customers);
        this.type = "Bank Hapoalim";
    }

    @Override
    public void calculateCustomerMoney(){
        long customerMoneyInBank = 0;
        for(int i=0; i<this.getCustomers().length; i++){
            customerMoneyInBank += this.getCustomers()[i].getAmountOfMoney();
        }
        this.setAmountOfRevenue(this.getAmountOfRevenue() + customerMoneyInBank);
    }
}
