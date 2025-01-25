package dinamiccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class arbol {
    nodoE puntero;

    public arbol() {
        puntero = null;
    }

    public void agregar(nodoE aux, int valor) {
        if (puntero == null)
            puntero = new nodoE(valor);
        else if (valor > aux.caja)
            if (aux.Der == null) aux.Der = new nodoE(valor);
            else agregar(aux.Der, valor);
        else if (valor < aux.caja)
            if (aux.Izq == null) aux.Izq = new nodoE(valor);
            else agregar(aux.Izq, valor);
        else
            System.out.println("Dato repetido");
    }

    public void mostrar(nodoE aux) {
        if (aux != null) {
            mostrar(aux.Izq);
            System.out.print(aux.caja + " ");
            mostrar(aux.Der);
        }
    }


    public void encuno(nodoE papa, int dato) {
        if (papa == null) System.out.println("No hay elementos");
        else {
            if (dato == papa.caja) System.out.println("Encontrado");
            else if (dato > papa.caja) encuno(papa.Der, dato);
            else encuno(papa.Izq, dato);
        }
    }


    /* public void encuno(nodoE papa, int dato) {
        if (papa == null) System.out.println("No hay elementos");
        else{
          if (dato == papa.caja) System.out.println("Dato esta en la raíz");
          else{
             int ban = 0;
             if (dato == papa.Der.caja)ban  = 1;
             if (dato == papa.Izq.caja)ban  = 2;
             if (ban == 0)
               if (dato > papa.caja) encuno(papa.Der, dato);
               if (dato < papa.caja) encuno(papa.Izq, dato);
             else
               if (ban == 1) System.out.println("Encontrado a la derecha");
               if (ban == 2) System.out.println("Encontrado a la izquierda");
          }
        }
     }*/
    public void eliminar(int dato) {
        nodoE aux = puntero;
        nodoE ant = puntero;
        if (puntero == null) System.out.print("No hay elementos");
        else if (dato == puntero.caja) {
            if ((puntero.Der == null) && (puntero.Izq == null)) puntero = null;
            else if (puntero.Der == null) puntero = puntero.Izq;
            else if (puntero.Izq == null) puntero = puntero.Der;
            else {
                nodoE auxI = puntero.Izq;
                nodoE auxD = puntero.Der;
                puntero = auxD;
                while (auxD.Izq != null)
                    auxD = auxD.Izq;
                auxD.Izq = auxI;
            }
        } else {
            int ban = 0;
            while (ban == 0) {
                ant = aux;
                if (dato > aux.caja) {
                    if (aux.Der != null) {
                        aux = aux.Der;
                        if (dato == aux.caja) ban = 1;
                    } else ban = 3;
                }
                if (dato < aux.caja) {
                    if (aux.Izq != null) {
                        aux = aux.Izq;
                        if (dato == aux.caja) ban = 2;
                    } else ban = 3;
                }
            }
            if (ban == 3) System.out.print("no existe el dato");
            else if ((aux.Der == null) && (aux.Izq == null)) {
                if (ban == 1) ant.Der = null;
                else ant.Izq = null;
            } else {
                if (aux.Der == null) {
                    if (ban == 1) ant.Der = aux.Izq;
                    else ant.Izq = aux.Izq;
                } else {
                    if (aux.Izq == null) {
                        if (ban == 1) ant.Der = aux.Der;
                        else ant.Izq = aux.Der;
                    } else {
                        nodoE auxI = aux.Izq;
                        nodoE auxD = aux.Der;
                        if (ban == 1) ant.Der = auxD;
                        else ant.Izq = auxD;
                        while (auxD.Izq != null)
                            auxD = auxD.Izq;
                        auxD.Izq = auxI;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int dato = 0;
        arbol obj = new arbol();
        nodoE aux;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (dato != 5) {
            System.out.println("");
            System.out.println("1 Agregar, 2 Mostra, 3 Eliminar, 4 Encuentra y 5 Salir");
            dato = Integer.parseInt(entrada.readLine());
            switch (dato) {
                case 1: /*System.out.println("Dame valor para agregar");
		    	          obj.agregar(aux ,Integer.parseInt(entrada.readLine()));*/
                    obj.agregar(obj.puntero, 18);
                    obj.agregar(obj.puntero, 15);
                    obj.agregar(obj.puntero, 30);
                    obj.agregar(obj.puntero, 13);
                    obj.agregar(obj.puntero, 28);
                    obj.agregar(obj.puntero, 44);
                    obj.agregar(obj.puntero, 10);
                    obj.agregar(obj.puntero, 14);
                    obj.agregar(obj.puntero, 26);
                    obj.agregar(obj.puntero, 29);
                    obj.agregar(obj.puntero, 56);
                    break;
                case 2:
                    obj.mostrar(obj.puntero);
                    break;
                case 3:
                    System.out.println("Dame valor para buscar");
                    obj.eliminar(Integer.parseInt(entrada.readLine()));
                    break;
                case 4:
                    System.out.println("Dame valor para buscar");
                    obj.encuno(obj.puntero, Integer.parseInt(entrada.readLine()));
                    break;

            }
        }
    }
}