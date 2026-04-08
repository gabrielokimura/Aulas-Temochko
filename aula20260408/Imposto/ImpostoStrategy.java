public interface ImpostoStrategy {

    double calcular(double valor);
}

class Icms implements ImpostoStrategy{

    public double calcular(double valor) {
        return valor*0.18;
    }
}

class Iss implements ImpostoStrategy{
    public double calcular(double valor){
        return valor*0.05;
    }
}