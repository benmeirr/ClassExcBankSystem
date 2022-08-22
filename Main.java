package homeExSolutionOOP4;

public class Main {
    public static void main(String[] args) {
        Customer[] bankHapoalimCustomers = {
                new Customer(1, "Yossi", "abi", "Bank Hapoalim",  "1234-5678", 1343434),
                new Customer(2, "Haim", "abc", "Bank Hapoalim",  "1234-5678", 124334),
                new Customer(3, "Jeremy", "abd", "Bank Hapoalim",  "1234-5678", 5463536),
        };

        Customer[] bankDiscountCustomers = {
                new Customer(4, "Ben", "abi", "Bank Discount",  "1234-5678", 245632),
                new Customer(5, "Bar", "abc", "Bank Discount",  "1234-5678", 12422425),
                new Customer(6, "Rayan", "abd", "Bank Discount",  "1234-5678", 325634),
        };

        Customer[] bankLeomiCustomers = {
                new Customer(7, "Koral", "abi", "Bank Leomi",  "1234-5678", 134536),
                new Customer(8, "Avihi", "abc", "Bank Leomi",  "1234-5678", 3465543),
                new Customer(9, "Nidal", "abd", "Bank Leomi",  "1234-5678", 12325),
        };

        CompanyCustomer[] bankDiscountCompanyCustomers = {
                new CompanyCustomer(1, "Apple",   576134536),
                new CompanyCustomer(2, "Google",   238355335),
                new CompanyCustomer(3, "Facebook",   24649759345L)
        };

        BankDiscount bankDiscount = new BankDiscount(1, "Bank Discount", 1000, 5374564236L, 346465346345L, bankDiscountCustomers, bankDiscountCompanyCustomers);
        BankHapoalim bankHapoalim = new BankHapoalim(2, "Bank Hapoalim", 1000, 315234635L, 4364563426L, bankHapoalimCustomers);
        BankLeomi bankLeomi = new BankLeomi(3, "Bank Leomi", 1000, 3125357354L, 4637463463L, bankLeomiCustomers);

        System.out.println("Amount of money before change " + bankDiscount.getAmountOfRevenue());
        bankDiscount.calculateCustomerMoney();
        System.out.println("Amount of money after change " + bankDiscount.getAmountOfRevenue());


        System.out.println("Customer amount of money before change " + bankHapoalimCustomers[0].getAmountOfMoney());
        bankHapoalim.takePayment(bankHapoalim.getCustomers()[0], 156000);
        System.out.println("Customer of money after change " + bankHapoalimCustomers[0].getAmountOfMoney());

        System.out.println("Customer amount of money before change " + bankHapoalimCustomers[0].getAmountOfMoney());
        bankLeomi.takePayment(bankHapoalim.getCustomers()[0], 156000);
        System.out.println("Customer of money after change " + bankHapoalimCustomers[0].getAmountOfMoney());
    }
}
