package lessons10;

class Client implements Callback {
    // реализовать интерфейс Callback
    public void callback(int р) {
        System.out.println("Meтoд callback(), "
                + " вызываемый со значением " + р);
    }


    void nonifaceMeth() {
        System.out.println("B классах, реализующих интерфейсы,"
                + "могут определяться и другие члены.");
    }
}

