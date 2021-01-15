package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private Penyihir penyihir = new Penyihir();

    // happy path
    @Test
    public void testSucces1() {
        double hasil = penyihir.rataRataKorbanTerbunuh(12, 10, 17, 13);
        assertEquals(4.5, hasil);
    }

    @Test
    public void testSucces2() {
        double hasil = penyihir.rataRataKorbanTerbunuh(1, 0, 6, 2);
        assertEquals(4, hasil);
    }

    // error path
    @Test
    public void testLahirSebelumDatangPenyihir() {
        double hasil = penyihir.rataRataKorbanTerbunuh(12, 14, 17, 13);
        assertEquals(-1, hasil);
    }

    @Test
    public void testUmurNegatif() {
        double hasil = penyihir.rataRataKorbanTerbunuh(12, -9, 16, 13);
        assertEquals(-1, hasil);
    }
}
