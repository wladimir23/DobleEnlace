package com.epn;

public class Nodo {
	//Componentes del nodo
    Object info;   //Variables de tipo enlace que dirigen al anterior y al siguiente nodo
    Nodo Izq;
    Nodo Der;

    public Nodo(Object Dato){ //Constructor que inicializa un Nodo con una información enviada como parámetro
        this.info = Dato;
        this.Izq = null;
        this.Der = null;
    }
    public Nodo(Nodo Izq, Object Dato){
        this.Izq = Izq;
        this.info = Dato;
        this.Der = null;
    }
    public Nodo(Object Dato, Nodo Der){
        this.Izq = null;
        this.info = Dato;
        this.Der = Der;
    }
    public  Nodo(Nodo Izq, Object Dato, Nodo Der){
        this.Izq = Izq;
        this.info = Dato;
        this.Der = Der;
    }
}