package Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.EsclavoDto;
import Dtos.PacienteDto;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.clienteImplementacion;
import Servicios.clienteInterfaz;

public class Inicio 
{

	public static void main(String[] args) 
	{
		//diferentes formas
	    List<PacienteDto> listaPaciente = new ArrayList<PacienteDto>();
	    List<EsclavoDto> listaEsclavo = new ArrayList<EsclavoDto>();
	    //ArrayList<PacienteDto> arrayPaciente = new ArrayList<PacienteDto>();
	   // PacienteDto[] arrayPAciente = new PacienteDto[100];
		PacienteDto paciente1 = new PacienteDto();
		System.out.println(paciente1.toString());
		
		paciente1.setNombrePaciente("Andres");
	    System.out.println(paciente1.getNombrePaciente());
	    MenuInterfaz mi = new MenuImplementacion();
	    clienteInterfaz ci = new clienteImplementacion();
	    for(PacienteDto paciente: listaPaciente) {
	    	System.out.println(paciente.toString());
	    }
	    for(EsclavoDto esclavo: listaEsclavo) {
	    	System.out.println(esclavo.toString());
	    }
	    boolean abrir = false;
	    
	    while (!abrir) 
	    {
	    	int opcion = mi.menu();
	    	switch(opcion) 
	    	{
	    	case 0 : abrir=true;
	    	break;
	    	case 1: ci.darAltaCliente(listaEsclavo, listaPaciente);
	    	default: System.out.println("no se reconoce la opcion");
	    	break;
	    	}
	    }				
	}
}