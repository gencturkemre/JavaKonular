package ders39_abstractClass;

public abstract class BHonda extends Araba{

    public void marka(){

        System.out.println("marka: Honda");

    }



    public abstract void yakit();


    public abstract void guvenlik();

    public void ozelTeknoloji(){
        System.out.println("tüm ondalar vitek kullanir");
    }
}
