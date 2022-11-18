package ders39_abstractClass;

public abstract class Araba {

    public abstract void motor();

    public abstract void marka();




    public abstract void kasa();




    public abstract void tekerlek();


    public void abs(){
        System.out.println("güvenlik artırmak isteyen arabalar abs kullanmalı");
    }
    public void klima(){
        System.out.println("konfor istiyen klima taksin ");
    }

}
