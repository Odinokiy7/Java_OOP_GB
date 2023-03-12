import Units.*;

public class Main {
    public static void main(String[] args) {

        Arbaletchik_1 arbaletchik = new Arbaletchik_1(100, 10, 5, 20);
        Sniper_1 sniper = new Sniper_1(100, 5, 10, 10);
        Koldun_2 koldun = new Koldun_2(100, 8, 7, 12);
        Monah_2 monah = new Monah_2(100, 8, 7, 12);
        Kopeyshik_3 kopeyshik = new Kopeyshik_3(100, 5, 10, 20);
        Razboynik_3 razboynik = new Razboynik_3(100, 10, 5, 40);
        Krestianin_4 krestianin = new Krestianin_4();

        System.out.println(arbaletchik.getInfo());
        System.out.println(sniper.getInfo());
        System.out.println(koldun.getInfo());
        System.out.println(monah.getInfo());
        System.out.println(kopeyshik.getInfo());
        System.out.println(razboynik.getInfo());
        System.out.println(krestianin.getInfo());

    }
}
