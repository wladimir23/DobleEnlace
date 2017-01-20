package com.epn;


public class Lista {
		
    public Nodo Primero,Ultimo,Nuevo,Aux,Pos,Ant;//crear variables de enlace
    
    //constructor
    public Lista(){
        Primero = Ultimo = Nuevo = Aux = Pos = Ant = null;
    }
    //insertar al frente
    public void insertarAlFrente(Object dato){
        if(Primero==null){   //Si la lista está vacía, el nuevo nodo, será el primer nodo
            Primero = new Nodo(dato); //La cabeza y el fin coincidirán
            Ultimo = Primero;
        }
        else {  //Si no está vacía
            Nuevo = new Nodo(dato,Primero); //Se crea los enlaces necesarios
            Primero.Izq=Nuevo;
            Primero = Nuevo;  //Y el nuevo nodo ahora será la cabeza
        }
        despliegaLista();
        despliegaListaIzq();
    }
    
    //insertar al final
    public void insertarAtras(int dato){
		    	
    		if(Primero==null){  //Si la lista está vacía, el nuevo nodo, será el primer nodo
    	        Primero = new Nodo(dato);
    	        Ultimo = Primero;  //La cabeza y el fin coincidirán
    	        }
    	        else{    //Si no está vacía
    	            Nuevo = new Nodo(Ultimo, dato);  //Se crea los enlaces necesarios
    	            Ultimo.Der = Nuevo;
    	            Ultimo = Nuevo;  //Y el nodo ingresado será el ultimo
    	        }
          despliegaLista();
          despliegaListaIzq();
    } 
    //elimianar nodo
    public void eliminarNodo(Object DatoB){
        if(Primero==null){
            System.out.println ("lista vacia");  //Comprueba si está vacía
        }
        else{
            if(buscar(DatoB)==true){	///busca el dato a eliminar
                if(Primero==Ultimo){	
                    Primero=Ultimo=null;  // se elimina
                }
                else if(Aux==Primero){	//si el auxiliar es igual al primero
                    Primero=Aux.Der;   //la cabeza seria el siguiente
                    Primero.Izq=Aux=null;  // el lado izquierdo se queda con null
                }
                else if(Aux==Ultimo){	//si el auxiliar es igual al ultimo
                    Ultimo=Aux.Izq; 	//el final sera a la izquierda	
                    Ultimo.Der=Aux=null;   // la derecha quedaria null
                }
                else{	 //cuando se elimina un numero que no este ni al inicio, ni al inicio
                    Ant.Der=Pos;    //el nodo que estaba a la izquierda se apunta ala derecha
                    Pos.Izq=Ant;	//el nodo que esta a la derecha apunta a la izquierda
                    Aux=null;		//el auxiliar no existe
                }
            }
        }
        despliegaLista();
        despliegaListaIzq();
    }
        
    //buscar datos 
    public boolean  buscar(Object DatoB){
        Aux = Primero;  //se pone en la primera posicion
        boolean bandera = false;  //va comprobando con una bandera
        while (Aux != null && bandera != true) {  //mientras que el auxiliar y la bandera  
            if(DatoB.equals(Aux.info)){  //se comprueba si el dato ingresado es igual al valor del nodo
                bandera = true;		// si lo encuentra pone un true
            }
            else{//apunta al siguiente nodo
                Ant = Aux;	//toma el valor 
                Aux = Aux.Der; 	//recorre al siguiente nodo
                //Pos = Aux.Der;
            }
        }
        if(bandera == true){   // encontro el dato
        	System.out.println ("el numero " + DatoB+" existe \n");
            return true;
        }
        else {				//no encontro el dato
            System.out.println ("el numero "+ DatoB +" no existe \n");
            return false;
        }
    }
  //desplegar en pantalla
    public  void despliegaLista(){
        Aux = Primero;
        System.out.println ("Lista de inicio a fin \n-------------------");
        while (Aux != null) {
        	System.out.println (Aux.info);
            Aux = Aux.Der;
        }
        System.out.println ("-------------------\n\n");
    }	
    public  void despliegaListaIzq(){
        Aux = Ultimo;
        System.out.println ("Lista de fin a inicio \n-------------------");
        while (Aux != null) {
        	System.out.println (Aux.info);
            Aux = Aux.Izq;
        }
        System.out.println ("-------------------");
    }	
}