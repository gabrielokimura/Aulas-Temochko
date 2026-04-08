package Logger;

public class LogFactory {
    public static Logger criarLog(String tipo){
        if (tipo.equalsIgnoreCase("console")){
            return new ConsoleLogger();
        } else if (tipo.equalsIgnoreCase("file")){
            return new FileLogger();
        }
        throw new IllegalArgumentException("tipo de log não identificado");
    }
}
