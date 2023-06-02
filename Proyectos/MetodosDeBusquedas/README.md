# Algoritmos de Busqueda

---

## Busqueda Lineal:

Busqueda secuencial (Busqueda Secuencial Lineal) Recibe un arreglo de enteros y el valor a buscar. Luego, itera a través de cada elemento del arreglo y compara si el valor en esa posición coincide con el valor buscado.
* Si encuentra una coincidencia, devuelve la posición actual.
* Si no encuentra ninguna coincidencia, devuelve -1.

```java
public static int secuencialLineal (int array[], int valor) {
  for(int i = 0; i < array.length; i++){
    if(valor == array[i]) return i; // El valor buscado se encuentra en la posicion i
  }
  return -1; // El valor buscado no se encuentra en el arreglo
}
```

## Busqueda Binaria:

Busqueda SecuencialBinaria Recibe un arreglo de enteros y el valor a buscar, El algoritmo utiliza dos variables, inicio y fin, para rastrear el rango de búsqueda en el arreglo.
En cada iteración, se calcula el valor medio (medio) sumando inicio mas la diferencia entre fin e inicio, dividido entre 2.  
* Si el valor en la posición medio coincide con el valor buscado, se devuelve esa posición. 
* Si el valor en la posición medio es menor que el valor buscado, se actualiza el valor de inicio para que el nuevo rango de búsqueda esté a la derecha de la posición medio. 
* Si el valor en la posición medio es mayor que el valor buscado, se actualiza el valor de fin para que el nuevo rango de búsqueda esté a la izquierda de la posición medio

```java
public static int busquedaBinaria(int[] arreglo, int valorBuscado) {
  int inicio = 0;
  int fin = arreglo.length - 1;

  while (inicio <= fin) {
    int medio = inicio + (fin - inicio) / 2;
    
    if (arreglo[medio] == valorBuscado) return medio; // El valor buscado se encuentra en la posición medio  

    if (arreglo[medio] < valorBuscado) {
      inicio = medio + 1;
    } else {
      fin = medio - 1;
    }
  }
  return -1;  // El valor buscado no se encuentra en el arreglo
}
```

## Busqueda de patrones de Knuth Morris Pratt:

Bscar ocurrencias de un patrón en un texto. A diferencia de otros algoritmos de búsqueda de patrones el algoritmo KMP aprovecha información sobre ocurrencias previas del patrón para evitar comparaciones innecesarias.
KMP recibe el texto y el patron a buscar:

```java

```

## JumpSearch:

Utilizado para encontrar el índice de un elemento en un arreglo ordenado. Este algoritmo se basa en dividir el arreglo en bloques de tamaño óptimo y realizar saltos para buscar el bloque que podría contener el elemento buscado.

El bucle while realiza saltos en bloques hasta encontrar un bloque que podría contener el valor buscado. Si el último elemento del bloque actual es menor o igual al valor buscado, se actualizan los índices inicio y fin para pasar al siguiente bloque. Se asegura que el índice fin no exceda el tamaño del arreglo.

A continuación, se realiza una búsqueda lineal dentro del bloque actual utilizando un bucle for. Si se encuentra el valor buscado, se devuelve su posición. Si no se encuentra, se devuelve -1 para indicar que el valor no está presente en el arreglo.

```java
public static int jumpSearch(int array[], int valor) {
  int inicio = 0;
  int fin = array.length;
  int tbloque = (int) Math.sqrt(array.length);


  while (array[fin - 1] <= valor && fin < array.length) { // Realiza saltos hasta encontrar un bloque que podría contener el valor buscado
    inicio = fin;
    fin = fin + tbloque;
    
    if (fin > array.length - 1) fin = array.length;
  }

  for (int i = inicio; i < fin; i++) { // Busqueda lineal en el bloque actual
    if (array[i] == valor) return i; // El valor buscado se encuentra en la posicion i
  }
  return -1; // El valor buscado no se encuentra en el arreglo
}
```

## Interpolación:

La búsqueda se realiza en un arreglo ordenado. La funcion Interpolacion recibe dos parámetros: el arreglo y el valor que se desea encontrar:

En el bucle while, se comprueba: 
* si el valor buscado (valor) se encuentra dentro del rango del arreglo desde el índice inicio hasta el índice fin. 
* Si el valor se encuentra fuera de ese rango, o si inicio y fin son iguales, se verifica si el valor se encuentra en el índice inicio. 
* Si es así, se devuelve ese índice. De lo contrario, se devuelve -1 para indicar que el valor no se encontró.

Si el valor buscado se encuentra dentro del rango, se calcula la posición estimada utilizando la fórmula de interpolación:

```java
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
```

## Búsqueda exponencial:

La función busquedaExponencial recibe dos parámetros: el arreglo en el que se realizará la búsqueda (array) y el valor que se desea encontrar (valor). 

* Si el primer elemento del arreglo (array[0]) es igual al valor buscado. Si es así, se retorna 0, ya que se ha encontrado en la primera posición.

* Se establece una variable i con un valor inicial de 1. Esta variable se utilizará para realizar saltos exponenciales dentro del arreglo.

* Se inicia un bucle while que se ejecutará siempre que i sea menor que el tamaño del arreglo (tamaño) y el elemento en la posición i del arreglo (array[i]) sea menor o igual al valor buscado. Este bucle tiene como objetivo encontrar un rango en el que podría encontrarse el valor buscado.

En cada iteración del bucle while, i se multiplica por 2, lo que implica realizar saltos exponenciales en el arreglo.

Una vez que se ha encontrado un rango en el que podría encontrarse el valor buscado, se llama a la función busquedaBinaria para realizar una búsqueda binaria dentro de ese rango.

```java
public static int busquedaExponencial(int[] array, int valor) {
  int tamaño = a.length;
  if (array[0] == valor) {
    return 0; // El valor se encuentra en el arreglo
  }
  int i = 1;
  while (i < tamaño && array[i] <= valor) {
    // Se duplica el valor de i en cada iteración para realizar saltos exponenciales
    i *= 2; 
  }

  // Se llama a la función de búsqueda binaria para buscar el valor en el rango encontrado
  return busquedaBinaria(array, valor);
}
```

## Búsqueda Fibonacci:

 La búsqueda se realiza en un arreglo ordenado.

El algoritmo utiliza la secuencia de números de Fibonacci para determinar los índices a comparar en el arreglo de búsqueda. Comienza con los números de Fibonacci más grandes y se va reduciendo progresivamente hasta encontrar el valor deseado o llegar al final del arreglo.

* El bucle inicial se encarga de encontrar los números de Fibonacci más cercanos al tamaño del arreglo.

* El segundo bucle realiza la búsqueda comparando el valor deseado con los elementos del arreglo utilizando los índices determinados por la secuencia de Fibonacci. 

* Si el valor es mayor o menor que el elemento actual, se actualizan los valores de los números de Fibonacci y el offset.

* Si se encuentra el valor, se devuelve el índice correspondiente. 

* Si no se encuentra, se devuelve -1.

```java
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

  // Búsqueda utilizando los números de Fibonacci
  while (fib > 1) {
    int i = Math.min(dif + fib2, tamaño - 1);

    // Si el valor buscado es mayor, se actualizan los números de Fibonacci y el offset
    if (array[i] < valor) {
      fib = fib1;
      fib1 = fib2;
      fib2 = fib - fib1;
      dif = i;                  
      
      // Si el valor buscado es menor, se actualizan los números de Fibonacci
    } else if (array[i] > valor) {
      fib = fib2;
      fib1 = fib1 - fib2;
      fib2 = fib - fib1;
    } else {
      return i; // El valor se encuentra en la posicion i
    }
  }
  
  // Verificar el último elemento en caso de que fib1 sea 1
  if (fib1 == 1 && array[dif + 1] == valor) {
    return dif + 1; // El valor se encuentra en la posición (dif + 1)
  }
  return -1; // El valor no se encuentra en el arreglo
}
```

# EDD
## ARBOLES
* 4.1.2 OPERACIONES BASICAS SOBRE ARBOLES BINARIOS -->


# INTERFACES|
## AUDIO Y VIDEO
* Evolucion y aplicaciones actuales 
* Cuadro de comparacion, con los principales  equipos de diferente aplicación que tienen de los mejor en audio y viden, identifique el Hardware y software así como los principales detalles en el tema , para cada dispositivo u equipo que mencione en el cuadro, 

realice el documento bajo las normas APA. 
investigue  3  institutos importantes de investigación
analice 3 artículos ( los grandes descubrimientos en audio y video)
compárt alos y de sus conclusiones . 