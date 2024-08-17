package poo_06;

public class Cadastro {
    private int numConta;
    private String titular;
    private double saldo;

    public Cadastro(){

    }

    public Cadastro(int numConta, String titular) {
        this.numConta = numConta;
        this.titular = titular;
    }

    public Cadastro(int numConta, String titular, double depInicial) {
        this.numConta = numConta;
        this.titular = titular;
        deposito(depInicial);
    }

    
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double quantia){
        saldo += quantia;
    }

    public void saque(double quantia){
        saldo -= quantia + 5.00;
    }

    public String toString() {
        return "Conta "
                + numConta 
                + "\nTitular: " 
                + titular + 
                "\nSaldo: $ "
                + String.format("%.2f",saldo);
    }
    
   

}