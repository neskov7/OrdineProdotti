package com.poli.ordine1;

public class Prodotto{
    public String name;
    public int price;
    public Prodotto(String name, int price){
        this.name=name; this.price=price;
    }
    public String toString(){ return "\nnome: "+ name + "\nprezzo: " + price;}
    public String getName(){ return name; }
    public int getPrice(){ return price;}

        
}
