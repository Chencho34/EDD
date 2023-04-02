package UI;

import toolsList.toolsList;

public class Menu {	
	public static void menu() {
		
		String sel = "";
		
		do {
			sel = toolsList.menuDesplegable();
			switch (sel) {
			case "MenuIterativo":
				MenuIterativo.menu();
				break;
			case "MenuRecursivo":
				MenuRecursivo.menu();
				break;
			default:
				toolsList.imprimePantalla("Saliendo...");
			}
		} while (!sel.equalsIgnoreCase("Salir"));
	}
}
