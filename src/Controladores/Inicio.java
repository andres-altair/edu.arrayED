package Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.EsclavoDto;
import Dtos.PacienteDto;

public class Inicio {

	public static void main(String[] args) {
		//diferentes formas
	    List<PacienteDto> listaPaciente = new ArrayList<PacienteDto>();
	    List<EsclavoDto> listaEsclavo = new ArrayList<EsclavoDto>();
	    //ArrayList<PacienteDto> arrayPaciente = new ArrayList<PacienteDto>();
	   // PacienteDto[] arrayPAciente = new PacienteDto[100];
		PacienteDto paciente1 = new PacienteDto();
		System.out.println(paciente1.toString());
		
		paciente1.setNombrePaciente("Andres");
	    System.out.println(paciente1.getNombrePaciente());
	    
	    
				
	}

}