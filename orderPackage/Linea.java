package com.poli.ordine1;
public class Linea{
    private int n;
    private Linea next;
    private Prodotto prod;
    public Linea(int n, Prodotto prod){
        this.prod=prod;
        this.n=n;
    }
    public Linea getRef(){return this;}
    public Linea newLine(int id, Prodotto prod){
        this.next=new Linea(id,prod);
        return this.next;
    } 
    public int sum(){
        if(next==null){
            return prod.getPrice();
        }
        else{
            return prod.getPrice() + next.sum();
        }
    }
    public String getString()
    {
        if(next==null){
            return prod.toString();
        }
       else{
           return prod.toString() + next.getString();
       } 
    }
}
