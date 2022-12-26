package pages;

import elementos.Elementos;
import metodos.Metodos;

public class SelectPrice {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	public void selectPrice() {
		
		
		metodos.pausa(2000);;
		metodos.clicar(el.selectP, "select price");
		metodos.pausa(2000);
		metodos.clicar(el.next4, "next 4");
		
	}

}
