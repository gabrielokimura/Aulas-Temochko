package Logger;

public interface Logger {
   public void log(String msg);
}

class ConsoleLogger implements Logger{
    public void log(String msg){
        System.out.println(msg);
    }
}


class FileLogger implements Logger{
    public void log(String msg){
        System.out.println(msg+" File");
    }
}