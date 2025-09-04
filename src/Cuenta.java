public class Cuenta {
    private double saldo;

    public Cuenta() {
        this.saldo = 0.0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        } else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes. No se puede retirar más del saldo disponible.");
        } else {
            saldo -= cantidad;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
