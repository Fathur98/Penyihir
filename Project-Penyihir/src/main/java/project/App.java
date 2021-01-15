package project;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Penyihir penyihir = new Penyihir();
        System.out.println("==========================TEST==========================");
        System.out.println(penyihir.rataRataKorbanTerbunuh(12, 10, 17, 13));
        System.out.println(penyihir.rataRataKorbanTerbunuh(1, 0, 6, 2));
        System.out.println(penyihir.rataRataKorbanTerbunuh(12, 14, 17, 13));
        System.out.println(penyihir.rataRataKorbanTerbunuh(12, -9, 16, 13));
    }
}
