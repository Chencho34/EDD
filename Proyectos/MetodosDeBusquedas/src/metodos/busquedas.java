package metodos;

public class busquedas {

  public static int secuencialLineal (int array[], int valor) {
    for(int i = 0; i < array.length; i++){
      if(valor == array[i]) return i;
    }
    return -1;
  }

  public static int busquedaBinaria(int[] arreglo, int valor) {
    int inicio = 0;
    int fin = arreglo.length - 1;
  
    while (inicio <= fin) {
      int medio = inicio + (fin - inicio) / 2;
      
      if (arreglo[medio] == valor) return medio; // El valor buscado se encuentra en la posición medio  

      if (arreglo[medio] < valor) {
        inicio = medio + 1;
      } else {
        fin = medio - 1;
      }
    }
    return -1;  // El valor buscado no se encuentra en el arreglo
  }


  // public static int KMPV2 (char[] texto, char[] patron) {
  //   int k=0;
  //   int j=0;
  //   while (k<texto && j<patron){
  //     while (j>0 && texto[k+1]!=patron[j+1]){
  //       j=f[j];
  //     }
  //     if (texto[k+1])==patron[j+1])){
  //       j++;
  //     }
  //     k++;
  //   }
  // }


  public static int KMP(char[] texto, char[] pat) {
    int n = texto.length;
    int m = pat.length;
    int[] lps = new int[m];
    int tam = 0;
    int i = 1;
    lps[0] = 0;
    while (i < m) {
      if (pat[i] == pat[tam]) {
        tam++;
        lps[i] = tam;
        i++;
      } else {
        if (tam != 0) {
          tam = lps[tam - 1];
        } else {
          lps[i] = 0;
          i++;
        }
      }
    }
    int j = 0;
    for (i = 0; i < n;) {
      if (pat[j] == texto[i]) {
        j++;
        i++;
      }
      if (j == m) {
        return i - j;
      } else if (i < n && pat[j] != texto[i]) {
        if (j != 0) {
          j = lps[j - 1];
        } else {
          i++;
        }
      }
    }
    return -1;
  }

  public static int jumpSearch(int array[], int valor) {
    int inicio = 0;
    int fin = array.length;
    int tbloque = (int) Math.sqrt(array.length);

    while (array[fin - 1] <= valor && fin < array.length) {
      inicio = fin;
      fin = fin + tbloque;

      if (fin > array.length - 1) fin = array.length;
    }

    for (int i = inicio; i < fin; i++) {
      if (array[i] == valor) return i;
    }
    return -1;
  }

  public static int interpolacion(int[] array, int valor) {
    int inicio = 0;
    int fin = array.length - 1;

    while (inicio <= fin && valor >= array[inicio] && valor <= array[fin]) {
      // Verificar si inicio y fin son iguales, lo que indica que solo queda un elemento por verificar
      if (inicio == fin) {
        if (array[inicio] == valor) {
          return inicio; // El valor se encuentra en la posicion inicio
        }
        return -1; // El valor no se encuentra en el arreglo
      }

      // Calcular la posición estimada utilizando la fórmula de interpolación
      int position = inicio + ((valor - array[inicio]) * (fin - inicio)) / (array[fin] - array[inicio]);

      if (array[position] == valor) return position;

      // Si el valor en la posición calculada es menor que el valor buscado, actualizar el rango a la derecha
      if (array[position] < valor) {
        inicio = position + 1;
      } else {
        // Si el valor en la posición calculada es mayor que el valor buscado, actualizar el rango a la izquierda
        fin = position - 1;
      }
    }
    return -1; // El valor no se encuentre en el arreglo
  }

  public static int busquedaExponencial(int[] array, int valor) {
    int tamaño = array.length;
    if (array[0] == valor) {
      return 0;
    }
    int i = 1;
    while (i < tamaño && array[i] <= valor) {
      i *= 2;
    }
    // return busquedaBinaria(a, valor, i / 2, Math.min(i, tamaño - 1));
    return busquedaBinaria(array, valor);
  }

  public static int busquedaBinaria(int[] a, int clave, int inicio, int fin) {
    if (fin >= inicio) {
      int medio = inicio + (fin - inicio) / 2;
      if (a[medio] == clave) {
        return medio;
      }
      if (a[medio] > clave) {
        return busquedaBinaria(a, clave, inicio, medio - 1);
      }
      return busquedaBinaria(a, clave, medio + 1, fin);
    }
    return -1;
  }

  public static int fibonacciSearch(int[] array, int valor) {
    int tamaño = array.length;
    int fib2 = 0;
    int fib1 = 1;
    int fib = fib2 + fib1;
    // calcular fibonacci
    while (fib < tamaño) {
      fib2 = fib1;
      fib1 = fib;
      fib = fib2 + fib1;
    }

    int dif = -1;

    while (fib > 1) {
      int i = Math.min(dif + fib2, tamaño - 1);
      if (array[i] < valor) {
        fib = fib1;
        fib1 = fib2;
        fib2 = fib - fib1;
        dif = i;
      } else if (array[i] > valor) {
        fib = fib2;
        fib1 = fib1 - fib2;
        fib2 = fib - fib1;
      } else {
        return i;
      }
    }
    if (fib1 == 1 && array[dif + 1] == valor) {
      return dif + 1;
    }
    return -1;
  }

  public static String imprimeOrdenados(int a[]) {
    String cad = "";
    for (int i = 0; i < a.length; i++) {
      cad += i + "[" + a[i] + "]" + "\n";
    }
    return "\n" + cad;
  }

  public static String imprimeOrdenados(char a[]) {
    String cad = "";
    for (int i = 0; i < a.length; i++) {
      cad += "[" + a[i] + "]";
    }
    return "\n" + cad;
  }
}
