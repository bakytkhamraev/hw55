package com.company;

public class Boss {
    private int helth;
    private int Attak;
    private int Protectiontype;

    public int  getHelth() {
        return helth;
    }
    public  void  sethealth(int health){
        this.helth=health;

    }public int getAttak(){
        return Attak;

    }public void setAttak(int Attak ){
        this.Attak=Attak;

    }public int getProtectiontype(){
        return Protectiontype;

    }public void setProtectiontype(int Protectiontype){
        this.Protectiontype=Protectiontype;
    }
}