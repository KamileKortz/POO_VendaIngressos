public abstract class Ingresso {
    double valorBase;

    public Ingresso(double valorBase) {
        this.valorBase = valorBase;
    }

    public double consultarValor() {
        return this.valorBase;
    }
}
