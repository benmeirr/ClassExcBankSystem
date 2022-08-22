package homeExSolutionOOP4;

public abstract class Bank implements MoneyCalculation{
    private int id;
    private String name;
    private int numOfEmployees;
    private long amountOfRevenue;
    private long amountOfExpenses;
    private Customer[] customers;

    public Bank(int id, String name, int numOfEmployees, long amountOfRevenue, long amountOfExpenses, Customer[] customers) {
        this.id = id;
        this.name = name;
        this.numOfEmployees = numOfEmployees;
        this.amountOfRevenue = amountOfRevenue;
        this.amountOfExpenses = amountOfExpenses;
        this.customers = customers;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public long getAmountOfRevenue() {
        return amountOfRevenue;
    }

    public long getAmountOfExpenses() {
        return amountOfExpenses;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public void setAmountOfRevenue(long amountOfRevenue) {
        this.amountOfRevenue = amountOfRevenue;
    }

    public void setAmountOfExpenses(long amountOfExpenses) {
        this.amountOfExpenses = amountOfExpenses;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public void takePayment(Customer customer, int payment){
        boolean flag = false;
        for(int i=0; i<this.customers.length; i++){
            if(this.customers[i].getId() == customer.getId()){
                flag = true;
                break;
            }
        }

        if(flag){
            this.amountOfRevenue += payment;
            customer.setAmountOfMoney(customer.getAmountOfMoney() - payment);
        } else{
            System.out.println("The customer with ID " + customer.getId() + " is not the bank customer");
        }
    }
}
