
package Principal;

import ADT.ConjuntoADT;


public class Test {

public static void main(String[] args) {
        
 ConjuntoADT ConA = new ConjuntoADT();
     
 for(int i=1; i<=10; i++){
    ConA.Agregar((Integer)i);
    }
 
 
//Agregar y eliminar elementos
System.out.println("\nEl conjunto A es: "+ConA.getConjunto());
ConA.Agregar(6); //Inserta de nuevo el 6 e indica que está repetido \
ConA.eliminar(3); //Elimina el numero 3
System.out.println("\nEl conjunto A es: "+ConA.getConjunto());


//Subconjuntos
System.out.println("\nSubconjunto: "+ConA.subConjunto(2,9));
    
//Union
System.out.println("\n");
ConjuntoADT ConB = new ConjuntoADT(); //Nuevo conjunto
ConB.Agregar(6);
ConB.Agregar(11);
ConB.Agregar(12);
System.out.println("\nConjunto B: "+ConB.getConjunto());
System.out.println("\nUNION: B ∪ A: "+ConA.union(ConA.conjunto, ConB.conjunto));

//Interseccion
System.out.println("\n");
ConjuntoADT ConC = new ConjuntoADT(); 
ConC.Agregar(7);
ConC.Agregar(8);
ConC.Agregar(15);
System.out.println("\nConjunto C: " + ConC.getConjunto());
System.out.println("\nINTERSECCION: C ∩ A :"+ConA.interseccion(ConA.conjunto, ConC.conjunto));    

//Diferencia
System.out.println("\n");
ConjuntoADT ConD = new ConjuntoADT(); 
ConD.Agregar(5);
ConD.Agregar(3);
ConD.Agregar(12);
System.out.println("\nConjunto D: " + ConD.getConjunto());
System.out.println("\nDIFERENCIA: D \\ A: "+ConD.diferencia(ConD.conjunto, ConA.conjunto));    
    

}
    
}
