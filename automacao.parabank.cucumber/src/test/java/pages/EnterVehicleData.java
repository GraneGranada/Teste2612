package pages;

import elementos.Elementos;
import metodos.Metodos;

public class EnterVehicleData {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	public void enterVehicleData(String firstN, String lastN, String dateB, String street, String zip, String city, String website ) {
		 
		metodos.preencher(el.firstN, firstN, "Primeiro Nome");
		metodos.preencher(el.lastN, lastN, "Ultimo nome");
		metodos.preencher(el.dateB, dateB, "Data de nascimento");
		metodos.clicar(el.gender, "Genero");
		metodos.preencher(el.street, street, "Rua");
		metodos.clicar(el.country, "Pais");
		metodos.preencher(el.zip, zip, "Cep");
		metodos.preencher(el.city, city, "Cidade");
		metodos.clicar(el.occupation, "Ocupacao");
		metodos.clicar(el.hobbies, "hobbies");
		metodos.preencher(el.website, website, "Website");
		metodos.clicar(el.next2, "next");
		
	}

}
