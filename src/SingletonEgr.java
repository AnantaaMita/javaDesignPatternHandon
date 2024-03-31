public class SingletonEgr {
    private static final SingletonEgr singletonEgr=new SingletonEgr();
    private SingletonEgr(){

    }
    public static SingletonEgr getSingletonEgr(){
        return singletonEgr;
    }
}
