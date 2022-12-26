package pages;

import elementos.Elementos;
import metodos.Metodos;

public class SendQuote {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	public void sendQuote(String email, String phone, String username, String password, String confirmP, String comments) {
		
		metodos.preencher(el.email, email, "email");
		metodos.preencher(el.phone, phone, "phone");
		metodos.preencher(el.username, username,"usuario");
		metodos.preencher(el.passwoard, password, "password");
		metodos.preencher(el.confirmPasswoard, confirmP, "confirm password");
		metodos.preencher(el.coments, comments, "comentarios");
		metodos.clicar(el.btnSend, "Send");
		
		
	}
	

}
