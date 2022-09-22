
package ADT;

import java.util.*;

public class ConjuntoADT {
    
public SortedSet conjunto;

public ConjuntoADT() {
  conjunto = new TreeSet();  
}    
    
public void setConjunto(SortedSet conjunto){    
    this.conjunto = conjunto;    
}    
  
public SortedSet getConjunto(){
    return conjunto;
}


public void Agregar(Object elemento){
    if(conjunto.add(elemento) == true) {
        System.out.println("Elemento " + elemento + " agregado");
  } else {
        System.out.println("Elemento " + elemento + " repetido" + "  ...No se pudo agregar");
  }
    
  }


 public void eliminar(Object elemento){
    if(conjunto.remove(elemento)){
    System.out.println("El elemento " + elemento + " ha sido eliminado");
    }else{
    System.out.println("No existe el elemento");
        }
    }

public SortedSet subConjunto(Object x, Object y){
    SortedSet otroConjunto=new TreeSet();
    otroConjunto=conjunto.subSet(x, y);
    return otroConjunto;
    }
 
public SortedSet union(SortedSet conjunto, SortedSet otroConjunto){
    conjunto.addAll(otroConjunto);
    return conjunto;
    } 
 

public SortedSet interseccion(SortedSet conjunto, SortedSet otroConjunto){
    conjunto.retainAll(otroConjunto);
    return conjunto;
    }


public SortedSet diferencia(SortedSet conjunto, SortedSet otroConjunto){
    conjunto.removeAll(otroConjunto);
    return conjunto;
    }


}
