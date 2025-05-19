//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Création des attributs
        CheckingAccount checkingaccount = new CheckingAccount();
        SavingsAccount savingsaccount = new SavingsAccount();
        COD CODaccount = new COD();

        //Attributs hérités
        checkingaccount.account = "CHK12345";
        checkingaccount.balance = 1500.0;
        checkingaccount.limit = 500.0;

        savingsaccount.account = "SAV67890";
        savingsaccount.balance = 5000.0;
        savingsaccount.limit = 130000;

        CODaccount.account = "COD13579";
        CODaccount.balance = 3000000;
        CODaccount.limit = 300000;

        //Lecture des attributs
        System.out.println("Compte courant - Numéro: " + checkingaccount.account +
                ", Solde: " + checkingaccount.balance +
                ", Limite: " + checkingaccount.limit);

        System.out.println("Compte épargne - Numéro: " + savingsaccount.account +
                ", Solde: " + savingsaccount.balance +
                ", Limite: " + savingsaccount.limit );

        System.out.println("COD - Numéro: " + CODaccount.account +
                ", Solde: " + CODaccount.balance +
                ", Limite: " + CODaccount.limit);
        }
    }
