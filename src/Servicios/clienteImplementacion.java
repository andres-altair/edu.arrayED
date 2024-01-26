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
		char sexo = scan.next().charAt(0);
		nuevoPaciente.setSexoBiologicoPaciente(sexo);
		System.out.println("escribe la fecha de nacimiento");
		String fecha = scan.next();
		nuevoPaciente.setFchNacimientoPaciente(fecha);
		return crearPaciente();
	}
	

	@Override
	public void darAltaCliente(List<EsclavoDto> antiguoEsclavo, List<PacienteDto> antiguoPaciente) {
		
		PacienteDto paciente = new PacienteDto();
		System.out.println("escribr el id");
		paciente.setIdPaciente(scan.nextLong());
		System.out.println("escribr el nombre");
		paciente.setNombrePaciente(scan.next());
		System.out.println("escribr el edad");
		paciente.setEdadPaciente(scan.nextInt());
		System.out.println("escribr el fecha de nacimiento");
		paciente.setFchNacimientoPaciente(scan.next());
		System.out.println("escribr el sexo");
		paciente.setSexoBiologicoPaciente(scan.next().charAt(0));
		System.out.println("escribr el especie");
		paciente.setEspeciePaciente(scan.next());
		System.out.println("existe el esclavo (s/n)");
		if(scan.next().charAt(0) == 'n'){
			paciente.setIdEsclavo( crearEclavo( antiguoEsclavo,scan));
			
		}else {
			int contador= 0;
			do {contador=0;
			System.out.println("escribe el id del esclavo");
			long idEsclavo = scan.nextLong();
		
			for(EsclavoDto esclavo : antiguoEsclavo) {
				if(idEsclavo == esclavo.getIdEsclaco()) {
					contador++;
					paciente.setIdPaciente(idEsclavo);}
				}
			}while(contador==0);
		}
	}

	
	private long crearEclavo(List<EsclavoDto> antiguoEsclavo, Scanner scan) {
		
		System.out.println("escribe el id");
		long id = scan.nextLong();
		
		System.out.println("escribe el nombre");
		String nombre = scan.next();
		
		System.out.println("escribe el apellido");
		String apellido = scan.next();
		
		System.out.println("escribe el dni");
		String dni = scan.next();
		
		System.out.println("escribe el nombre");
		String tel = scan.next();
		
		EsclavoDto nuevoEsclavo = new EsclavoDto(id,nombre,apellido,dni,tel);
		return id;
	}

}
