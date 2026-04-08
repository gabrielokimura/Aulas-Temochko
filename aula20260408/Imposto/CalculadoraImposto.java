public class CalculadoraImposto {
    private ImpostoStrategy estrategia;

    public void setEstrategia(ImpostoStrategy e){
        this.estrategia = e;
    }

    public double calcular(double valor){
        return estrategia.calcular(valor);
    }
}