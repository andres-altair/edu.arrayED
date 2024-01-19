package Controladores;

import java.util.ArrayList;
import java.util.List;
import Dtos.PacienteDto;

public class Inicio {

	public static void main(String[] args) {
		
		PacienteDto paciente1 = new PacienteDto();
		System.out.println(paciente1.toString());
		
		paciente1.setNombrePaciente("Andres");
	    System.out.println(paciente1.getNombrePaciente());
	    
	    //diferentes formas
	    List<PacienteDto> listapaciente = new ArrayList<PacienteDto>();
	    ArrayList<PacienteDto> arrayPaciente = new ArrayList<PacienteDto>();
	    PacienteDto[] arrayPAciente = new PacienteDto[100];
				
	}

}