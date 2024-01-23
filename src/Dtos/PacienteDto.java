package Dtos;

public class PacienteDto {
	long idPaciente;
	String nombrePaciente = "aaaa";
	int edadPaciente = 11111;
	String fchNacimientoPaciente = "aaaaaaa";
	char sexoBiologicoPaciente = 'a';
	String especiePaciente = "aaaa";
	long idEsclavo;
	
	
	//contructor
	public PacienteDto(long idPaciente, String nombrePaciente, int edadPaciente, String fchNacimientoPaciente,
			char sexoBiologicoPaciente, String especiePaciente, long idEsclavo) {
		super();
		this.idPaciente = idPaciente;
		this.nombrePaciente = nombrePaciente;
		this.edadPaciente = edadPaciente;
		this.fchNacimientoPaciente = fchNacimientoPaciente;
		this.sexoBiologicoPaciente = sexoBiologicoPaciente;
		this.especiePaciente = especiePaciente;
		this.idEsclavo = idEsclavo;
	}
	
	
	public PacienteDto() {
		super();
	}






	//getter setter
	public long getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public int getEdadPaciente() {
		return edadPaciente;
	}
	public void setEdadPaciente(int edadPaciente) {
		this.edadPaciente = edadPaciente;
	}
	public String getFchNacimientoPaciente() {
		return fchNacimientoPaciente;
	}
	public void setFchNacimientoPaciente(String fchNacimientoPaciente) {
		this.fchNacimientoPaciente = fchNacimientoPaciente;
	}
	public char getSexoBiologicoPaciente() {
		return sexoBiologicoPaciente;
	}
	public void setSexoBiologicoPaciente(String string) {
		this.sexoBiologicoPaciente = string;
	}
	public String getEspeciePaciente() {
		return especiePaciente;
	}
	public void setEspeciePaciente(String especiePaciente) {
		this.especiePaciente = especiePaciente;
	}
	public long getIdEsclavo() {
		return idEsclavo;
	}
	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}
	
	
	//tostring
	@Override
	public String toString() {
		return "PacienteDto [idPaciente=" + idPaciente + ", nombrePaciente=" + nombrePaciente + ", edadPaciente="
				+ edadPaciente + ", fchNacimientoPaciente=" + fchNacimientoPaciente + ", sexoBiologicoPaciente="
				+ sexoBiologicoPaciente + ", especiePaciente=" + especiePaciente + ", idEsclavo=" + idEsclavo + "]";
	}
	
}
