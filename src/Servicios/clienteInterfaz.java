package Servicios;

import java.util.List;

import Dtos.EsclavoDto;
import Dtos.PacienteDto;

public interface clienteInterfaz {
	
	public void darAltaCliente(List<EsclavoDto> antiguoEsclavo ,List<PacienteDto> antiguoPaciente );
	 public void darAltaEsclavo(List<EsclavoDto> antiguoEsclavo);
}
