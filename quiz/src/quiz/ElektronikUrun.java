/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

/**
 *
 * @author irem beril
 */
public class ElektronikUrun extends Urun {
    
    private String marka;
    private String model;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
    public ElektronikUrun(int urun_kodu, String ad, int fiyat, int stok,String marka,String model) {
        super(urun_kodu, ad, fiyat, stok);
        this.marka=marka;
        this.model=model;
    }

    @Override
    public void urunBilgileriGetir() {
        super.urunBilgileriGetir();
        System.out.println("Marka: "+marka+"\nModel: "+model);
    }
    
    
}
