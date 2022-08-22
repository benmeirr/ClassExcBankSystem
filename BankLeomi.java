package homeExSolutionOOP4;

public class BankLeomi extends Bank{

    private String type;

    public BankLeomi(int id, String name, int numOfEmployees, long amountOfRevenue, long amountOfExpenses, Customer[] customers) {
        super(id, name, numOfEmployees, amountOfRevenue, amountOfExpenses, customers);
        this.type = "Bank Leomi";
    }


    @Override
    public void calculateCustomerMoney(){
        long customerMoneyInBank = 0;
        for(int i=0; i<this.getCustomers().length; i++){
            customerMoneyInBank += this.getCustomers()[i].getAmountOfMoney();
        }
        this.setAmountOfRevenue(this.getAmountOfRevenue() - customerMoneyInBank);
    }
}
