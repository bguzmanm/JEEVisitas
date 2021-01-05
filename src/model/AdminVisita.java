package model;

import java.util.ArrayList;

import java.util.List;

public class AdminVisita {

	public List<Visita> getAllVisitas(){
		
		List<Visita> lista = new ArrayList<Visita>();
		
		lista.add(new Visita(1, "04 de Enero del 2020", "1-1", "Gustavo Lima", "lasdkljf", true));
		lista.add(new Visita(2, "02 de Enero del 2020", "2-2", "Manuel Alejandro", "134fdgas", false));
		lista.add(new Visita(3, "03 de Enero del 2020", "3-3", "Caro Silva", "gfasdf", true));
		
		return lista;
		
	}
	
}
