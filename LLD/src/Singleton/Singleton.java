package Singleton;

class Singleton {
    private static Singleton  singleton;
    private Singleton(){

    };
    public static synchronized Singleton getInstance(){
        System.out.println("Out of the creation");
        if(singleton==null){
            System.out.println("In of the creation");
            singleton = new Singleton();
        }
        return singleton;
    }
}
