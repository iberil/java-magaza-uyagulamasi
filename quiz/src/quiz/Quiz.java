/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;

/**
 *
 * @author irem beril
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Urun[] urunList=new Urun[3];
        
        urunList[0]=new GiyimUrun(123,"Gömlek",250,50,"Mavi","M");
        urunList[1]=new ElektronikUrun(147,"Laptop",25000,100,"Monster","Abra");
        urunList[2]=new Urun(569,"Defter",25,120);
        
        for(Urun urun: urunList)
        {
            urun.urunBilgileriGetir();
            System.out.println("************************************************");
        }
        Urun.urunMiktariGetir();
    }
    
}
