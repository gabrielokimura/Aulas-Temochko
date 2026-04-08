public class MainImposto {

    public static void main(String[] args) {
        
        CalculadoraImposto calculadora = new CalculadoraImposto();
        double valor = 100;

        calculadora.setEstrategia(new Icms());
        System.out.println( calculadora.calcular(valor));

        calculadora.setEstrategia(new Iss());
        System.out.println( calculadora.calcular(valor));
    }
    
}
