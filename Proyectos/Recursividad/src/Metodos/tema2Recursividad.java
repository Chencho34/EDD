package Metodos;

import javax.swing.JOptionPane;

public class tema2Recursividad {
	
	public static void main(String[] args) {
		
	}
	
	public static void leerMatriz(int array[][]) {
		int i, j;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[0].length; j++) {
				array[i][j] = Integer.parseInt(JOptionPane.showInputDialog("dato: "));
			}
		}
	}
	
	public static void verMatriz(int array[][]) {
		int i, j;
		String cad = "";
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[0].length; j++) {
				cad += array[i][j] + " "; 
			}
			cad += "\n";
		}
		JOptionPane.showMessageDialog(null, "Array bidimencional\n" + cad);
	}

}
