package pages;

import elementos.Elementos;
import metodos.Metodos;

public class DataVehiclePage {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	public void dataVehicle( String engineP, String cylinder, String dataM, String payload, String totalW, String listP, String licenseP, String annualM ) {
		
		metodos.clicar(el.make, "selecionar veiculo");
		metodos.clicar(el.model, "modelo");
		metodos.preencher(el.cylinder, cylinder, "cilindradas");
		metodos.preencher(el.engine, engineP, "engine");
		metodos.preencher(el.dateManufacture, dataM, "data");
		metodos.clicar(el.numberSeats, "numero de assentos");
		metodos.clicar(el.rightHandDrive, "right hand");
		metodos.clicar(el.numberSeats2, "assentos 2");
		metodos.clicar(el.fuelType, "tipo de combustivel");
		metodos.preencher(el.payLoad, payload, "payload");
		metodos.preencher(el.totalW, totalW, "total W");
		metodos.preencher(el.listP, listP, "lista");
		metodos.preencher(el.license, licenseP, "licenca");
		metodos.preencher(el.annual, annualM, "ano");
		metodos.clicar(el.next1, annualM);
		
		
		;
		
	}

}


