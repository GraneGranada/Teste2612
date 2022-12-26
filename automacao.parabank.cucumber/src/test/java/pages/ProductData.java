package pages;

import elementos.Elementos;
import metodos.Metodos;

public class ProductData {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	public void productData(String startData) {
		
		metodos.preencher(el.startData, startData, "Data de inicio");
		metodos.clicar(el.insuranceSun, "insurance");
		metodos.clicar(el.meritR, "merit");
		metodos.clicar(el.damageI, "damage");
		metodos.clicar(el.optional, "opcionais");
		metodos.clicar(el.courtesy, "cortesia");
		metodos.clicar(el.next3, "next");
		
	}

}
