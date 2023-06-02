package main;

import tools.*;
import metodos.*;
import javax.swing.*;
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    String menu = "Secuencial Lineal,Secuencial Binaria,Knuth Morris Pratt,Busqueda Salto,Interpolacion,Exponencial,Busqueda Fibonacci,Salir";
    menu3(menu);
  }

  public static String boton(String menu) {
    String valores[] = menu.split(",");
    int n;
    n = JOptionPane.showOptionDialog(null, " SELECCIONA DANDO CLICK ", " M E N U",JOptionPane.NO_OPTION,JOptionPane.QUESTION_MESSAGE, null,valores, valores[0]);
    return (valores[n]);
  }

  public static void menu3(String menu) {
    String sel = "";
    do {
      sel = boton(menu);
      switch (sel) {
        case "Secuencial Lineal":
          int SL[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
          int valorSL = toolsList.leerInt("Ingresa dato a buscar en un rango del 1 al 10");
          int indexSL = busquedas.secuencialLineal(SL, valorSL);
          if(indexSL != -1){
            toolsList.imprimePantalla("existe en la posicion: " + indexSL);
          } else {
            toolsList.imprimePantalla("No existe");
          }
          break;

        case "Secuencial Binaria":
          int SB[] = { 10, 20, 1, 430, 30 };
          Arrays.sort(SB);

          int valorSB = toolsList.leerInt("Ingresa dato a bucar" + busquedas.imprimeOrdenados(SB));
          int indexSB = busquedas.busquedaBinaria(SB, valorSB);
          if(indexSB != -1) {
            toolsList.imprimePantalla("existe en la posicion: " + indexSB);
          } else {
            toolsList.imprimePantalla("No existe");
          }
          break;

        case "Knuth Morris Pratt":
          char[] texto = { 'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B', 'D' };
          char[] patron = { 'D', 'L', 'D' };
          toolsList.imprimePantalla(busquedas.imprimeOrdenados(texto));
          toolsList.imprimePantalla("Patron a buscar:" + busquedas.imprimeOrdenados(patron));
          if (busquedas.KMP(texto, patron) >= 0)
            toolsList.imprimePantalla("El patron existe");
          else
            toolsList.imprimePantalla("El patron no existe.");
          break;

        case "Busqueda Salto":
          int JS[] = { 10, 13, 15, 26, 28, 50, 56, 88, 94, 127, 159, 356, 480, 567, 689, 699, 780, 850, 956,
              995 };
          toolsList.imprimePantalla(busquedas.imprimeOrdenados(JS));
          if (busquedas.jumpSearch(JS, toolsList.leerInt("Numero a buscar:")) >= 0)
            toolsList.imprimePantalla("El dato existe");
          else
            toolsList.imprimePantalla("El dato no existe.");
          break;

        case "Interpolacion":
          int[] ITP = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
          int valorITP = toolsList.leerInt("Numero a buscar: \n" + busquedas.imprimeOrdenados(ITP));
          int indexITP = busquedas.interpolacion(ITP, valorITP);
          
          if (indexITP != -1)
            toolsList.imprimePantalla("El dato existe en la posicion: " + indexITP );
          else
            toolsList.imprimePantalla("El dato no existe.");
          break;

        case "Exponencial":
          int[] EXP = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26 };
          int valorEXP = toolsList.leerInt("Ingresa dato a buscar: " + busquedas.imprimeOrdenados(EXP));
          int indexEXP = busquedas.interpolacion(EXP, valorEXP);

          if(indexEXP != -1) {
            toolsList.imprimePantalla("existe en la posicion: " + indexEXP);
          } else {
            toolsList.imprimePantalla("No existe");
          }
          // toolsList.imprimePantalla(busquedas.imprimeOrdenados(EXP));
          // if (busquedas.interpolacion(EXP, toolsList.leerInt("Numero a buscar:")) >= 0)
          //   toolsList.imprimePantalla("El dato existe");
          // else
          //   toolsList.imprimePantalla("El dato no existe.");
          break;
        case "Busqueda Fibonacci":
          int BF[] = { 10, 13, 15, 26, 28, 50, 56, 88, 94, 127, 159, 356, 480, 567, 689, 699, 780 };
          toolsList.imprimePantalla(busquedas.imprimeOrdenados(BF));
          if (busquedas.fibonacciSearch(BF, toolsList.leerInt("Numero a buscar:")) >= 0)
            toolsList.imprimePantalla("El dato existe");
          else
            toolsList.imprimePantalla("El dato no existe.");
          break;

        case "Salir":
    
          break;
      }
    } while (!sel.equalsIgnoreCase("Salir"));
  }
}
