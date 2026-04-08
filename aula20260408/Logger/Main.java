package Logger;

public class Main{
    public static void main(String[] args) {
        Logger log1 = LogFactory.criarLog("console");
        Logger log2 = LogFactory.criarLog("file");

        log1.log("Olá");
        log2.log("OIIII");
}
}