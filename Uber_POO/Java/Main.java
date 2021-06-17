class Main{
    public static void main(String[] args) {
        System.out.println("Hello world");
        UberX uberX = new UberX("ASDF123", new Account("Albert Hack", "ALH0123"), "Mitsubichi", "lancer Evo");
        // car.license = "ASDF123";
        // car.driver = "Albert Hack";   when its empy i declared this 2 lines to add license and driver.
        uberX.setPassenger(4);
        uberX.printDatacar();

        UberVan uberVan = new UberVan("QWER12", new Account("Rosy", "ZXCV12"));
        uberVan.setPassenger(6);
        uberVan.printDatacar();
        // car2.license = "QWER123";
        // car2.driver = "Rosy";
        // car2.passenger = 2;
        // car2.printDatacar();
    }
}