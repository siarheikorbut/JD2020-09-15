package by.it.siarheikorbut.jd_02_01;

public class Buyer extends Thread implements IBuyer {
    public Buyer(int number) {
        super("Buyer №" + number);
    }

    @Override
    public void run() {
        enterToMarket();
        chooseSomething();
        goOut();
        Dispatcher.BUYERS_IN_SHOP--;
    }

    @Override
    public void enterToMarket() {
        System.out.printf("%s Enter market\n", this);
    }

    @Override
    public void chooseSomething() {
        System.out.printf("%s Started to choose\n", this);
        int timeout = Helper.getRandom(500, 2000);
        Helper.mySleep(timeout);
        System.out.printf("%s finished to choose\n", this);
    }

    @Override
    public void goOut() {
        System.out.printf("%s Left market\n", this);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}