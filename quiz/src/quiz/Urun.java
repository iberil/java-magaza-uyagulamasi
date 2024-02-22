/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

/**
 *
 * @author irem beril
 */
public class Urun {
    public int urun_kodu;
    public String ad;
    private int fiyat;
    public int stok;

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
    
    static int toplamUrun=0;

    public Urun(int urun_kodu, String ad, int fiyat, int stok) {
        this.urun_kodu = urun_kodu;
        this.ad = ad;
        this.fiyat = fiyat;
        this.stok = stok;
        
        toplamUrun++;
    }
    
    public void urunBilgileriGetir(){
        System.out.println("\nÜrün Adı: "+ad+"\nFiyat: "+fiyat+"\nÜrün kodu: "+urun_kodu+"\nStok: "+stok);
    }
    public static void urunMiktariGetir()
    {
        System.out.println("Ürün miktari: "+toplamUrun);
    }
    
    
}
