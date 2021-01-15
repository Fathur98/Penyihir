package project;

public class Penyihir {

    public double rataRataKorbanTerbunuh(int kematianA, int umurA, int kematianB, int umurB) {
        double rataRata = -1;
        if (kematianA > 0 && umurA >= 0 && kematianB > 0 && umurB >= 0) {
            if (kematianA >= umurA && kematianB >= umurB) {
                rataRata = (tahunKorbanTerbunuh(kematianA, umurA) + tahunKorbanTerbunuh(kematianB, umurB)) / 2.0;
            }
        }
        return rataRata;
    }

    private int tahunKorbanTerbunuh(int kematian, int umur) {
        return jumlahKorbanTerbunuh(kematian - umur);
    }

    private int jumlahKorbanTerbunuh(int inputTahun) {
        int jumlahKorbanTerbunuh = 0;
        int a = 1;
        int b = 1;
        int temp;

        for (int i = 0; i < inputTahun; i++) {
            jumlahKorbanTerbunuh += a;
            temp = a + b;
            a = b;
            b = temp;
        }
        return jumlahKorbanTerbunuh;
    }
}
