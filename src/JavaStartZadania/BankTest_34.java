package JavaStartZadania;

public class BankTest_34 {
        public static void main(String[] args) {
            BankAddress_34 address1 = new BankAddress_34("Wrocław", "Hubska", "50-123", "23A", "15");
            BankClient_34 client1 = new BankClient_34("Jan", "Kowalski", "88061056273", address1);
            BankAccount_34 account1 = new BankAccount_34("32 2222 5673 8901 3232 4786 0001", client1, 2019);

            BankAddress_34 address2 = new BankAddress_34("Wrocław", "Hubska", "50-123", "23A", "15");
            BankClient_34 client2 = new BankClient_34("Jan", "Kowalski", "88061056273", address2);
            BankAccount_34 account2 = new BankAccount_34("32 2222 5673 8901 3232 4786 0001", client2, 2019);

            if (account1.equals(account2)) {
                System.out.println("Konta bankowe są identyczne");
            } else {
                System.out.println("Konta bankowe są różne");
            }
        }
    }
