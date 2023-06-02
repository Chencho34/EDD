# Metodos de ordenamiento

## Burbuja señal

```java

  public void burbujaSeñal() {
    boolean señal;
    int iteraciones = 0;

    for (int i = 0; i < datos.length - 1; i++) {  // Itera atravez de los elementos
      señal = false; // Establece señal como false
      for (int j = 0; j < datos.length - i - 1; j++) {
        if (datos[j] > datos[j + 1]) {  
          // Intercambiar elementos datos[j] y datos[j + 1]
          int temp = datos[j];
          datos[j] = datos[j + 1];
          datos[j + 1] = temp;
          señal = true;
          iteraciones++;
        }
      }
      if (!señal)
        break;
    }
    System.out.println("Cantidad de ciclos: + " + iteraciones);
  }

```

## sawp 
se implementa heapsort y heapify y inserDirecta.