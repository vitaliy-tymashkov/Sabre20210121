package org.home.sab;

public class App {
    public static void main(String[] args) {
        Service.method();

        Service service = new Service();
        System.out.println(service.add(1_000_000, 3_000_000));
    }
}
