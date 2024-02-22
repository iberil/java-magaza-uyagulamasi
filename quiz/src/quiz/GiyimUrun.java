/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

/**
 *
 * @author irem beril
 */
public class GiyimUrun extends Urun{
    private String renk;
    private String beden;

    public GiyimUrun(int urun_kodu, String ad, int fiyat, int stok,String renk,String beden) {
        super(urun_kodu, ad, fiyat, stok);
        this.beden=beden;
        this.renk=renk;
    }

    @Override
    public void urunBilgileriGetir() {
        super.urunBilgileriGetir(); 
        System.out.println("Renk: "+renk+"\nbeden: "+beden);
    }
    
    
}
