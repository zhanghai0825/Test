package test;

import dao.Reading;
import dao.impl.Home;
import prox.ProxRead;

public class ReadingTest {


    public static void main(String[] args) {
        ProxRead proxRead = new ProxRead();
        Reading home = (Reading) proxRead.bind(new Home());
        home.read();
        home.eat();

    }
}
