
package main;


public class Errores {
    private float valorreal,valoraprox;

    public Errores(float valorreal, float valoraprox) {
        this.valorreal = valorreal;
        this.valoraprox = valoraprox;
    }

    Errores(Double valorreal, Double valoraprox) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double ErrorAbsoluto() {
        double absoluto = Math.abs(valorreal - valoraprox);

        return absoluto;
    }

    public double ErrorRelativo() {
        double relativo = ErrorAbsoluto()/ valorreal;

        return relativo;
    }

    public double ErrorRelativoPorcentual() {
        double porcentual = ErrorRelativo()* 100;

        return porcentual;
    }
}
