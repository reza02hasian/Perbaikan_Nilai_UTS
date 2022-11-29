package lingkaran;

import lingkaran.Lingkaran;
import lingkaran.LuasSetengah;
import lingkaran.SetengahLingkaran;

public class Main {
    public static void main(String[] args) {
        Lingkaran circle_satu = new SetengahLingkaran();
        LuasSetengah L = new LuasSetengah(circle_satu);
        
        L.hitung();
        L.tampilkan();
    } 
}
