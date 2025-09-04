public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        cuenta.depositar(500);
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        cuenta.retirar(200);
        System.out.println("Saldo después del retiro: " + cuenta.getSaldo());

        cuenta.retirar(400);  // Este intento fallará por saldo insuficiente
    }
}
