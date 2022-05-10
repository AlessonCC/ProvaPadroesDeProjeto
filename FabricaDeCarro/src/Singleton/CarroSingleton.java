package Singleton;

public class CarroSingleton {
    private int log;

    private static CarroSingleton instance;
    private CarroSingleton(){}

    public static CarroSingleton getInstance(){
        if(instance == null)
            instance = new CarroSingleton();
        return instance;
    }
    public String newLog(){
        ++log;
        return new String("LogRealizado: " +log);
    }
    public String report(){
        return new String("Total de logs no sistema : " + log);
    }


}
