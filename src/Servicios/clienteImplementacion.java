package Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.EsclavoDto;
import Dtos.PacienteDto;

public class clienteImplementacion implements clienteInterfaz {
	
	Scanner scan = new Scanner(System.in);
	private  PacienteDto crearPaciente() 
	{
		PacienteDto nuevoPaciente = new PacienteDto();
		System.out.println("escribe el nombre");
		String nombre = scan.next();
		nuevoPaciente.setNombrePaciente(nombre);
		System.out.println("escribe la edad");
		int edad = scan.nextInt();
		nuevoPaciente.setEdadPaciente(edad);
		System.out.println("escribe la especie");
		String especie = scan.next();
		nuevoPaciente.setEspeciePaciente(especie);
		System.out.println("escribe el sexo ('m' o 'f')");
		String sexo = scan.next();
		nuevoPaciente.setSexoBiologicoPaciente(sexo);
		System.out.println("escribe la fecha de nacimiento");
		String fecha = scan.next();
		nuevoPaciente.setFchNacimientoPaciente(fecha);
		return crearPaciente();
	}
	

	@Override
	public void darAltaCliente(List<EsclavoDto> antiguoEsclavo, List<PacienteDto> antiguoPaciente) {
		
		//System.out.println("eres un nuevo (si o no)");
				System.out.println("nombre del esclavo");
				String respueta = scan.next();
				EsclavoDto nuevoEsclavo = new EsclavoDto();
				nuevoEsclavo = antiguoEsclavo();
				if (respueta = nuevoEsclavo.getNombreEsclavo() )
				{ 
					
				
				
				}else 
				{
					darAltaEsclavo(List<EsclavoDto> antiguoEsclavo);
				}
	}


	@Override
	public void darAltaEsclavo(List<EsclavoDto> antiguoEsclavo) {
		
		EsclavoDto nuevoEsclavo = crearEsclavo();
		antiguoEsclavo.add(nuevoEsclavo);
		
	}
	
	private EsclavoDto crearEsclavo()
	{
		EsclavoDto nuevoEsclavo = new EsclavoDto();
		
		System.out.println("escribe el nombre");
		String nombre = scan.next();
		nuevoEsclavo.setNombreEsclavo(nombre);
		System.out.println("escribe el apellido");
		String apellido = scan.next();
		nuevoEsclavo.setApellidoEsclavo(apellido);
		System.out.println("escribe el dni");
		String dni = scan.next();
		nuevoEsclavo.setDniEsclavo(dni);
		System.out.println("escribe el nombre");
		int tel = scan.nextInt()
		nuevoEsclavo.setTlfEsclavo(dni);
		return nuevoEsclavo;
	}

}
