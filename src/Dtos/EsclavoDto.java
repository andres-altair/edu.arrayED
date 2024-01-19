package Dtos;

public class EsclavoDto {
	long idEsclaco;
	String nombreEsclavo;
	String apellidoEsclavo;
	String dniEsclavo;
	String tlfEsclavo;
	
	//contructor
	public EsclavoDto(long idEsclaco, String nombreEsclavo, String apellidoEsclavo, String dniEsclavo,
			String tlfEsclavo) {
		super();
		this.idEsclaco = idEsclaco;
		this.nombreEsclavo = nombreEsclavo;
		this.apellidoEsclavo = apellidoEsclavo;
		this.dniEsclavo = dniEsclavo;
		this.tlfEsclavo = tlfEsclavo;
	}
	
	public EsclavoDto() {
		super();
	}


	//getter setter
	public long getIdEsclaco() {
		return idEsclaco;
	}
	
	public void setIdEsclaco(long idEsclaco) {
		this.idEsclaco = idEsclaco;
	}
	public String getNombreEsclavo() {
		return nombreEsclavo;
	}
	public void setNombreEsclavo(String nombreEsclavo) {
		this.nombreEsclavo = nombreEsclavo;
	}
	public String getApellidoEsclavo() {
		return apellidoEsclavo;
	}
	public void setApellidoEsclavo(String apellidoEsclavo) {
		this.apellidoEsclavo = apellidoEsclavo;
	}
	public String getDniEsclavo() {
		return dniEsclavo;
	}
	public void setDniEsclavo(String dniEsclavo) {
		this.dniEsclavo = dniEsclavo;
	}
	public String getTlfEsclavo() {
		return tlfEsclavo;
	}
	public void setTlfEsclavo(String tlfEsclavo) {
		this.tlfEsclavo = tlfEsclavo;
	}

	
	//tostring
	@Override
	public String toString() {
		return "EsclavoDto [idEsclaco=" + idEsclaco + ", nombreEsclavo=" + nombreEsclavo + ", apellidoEsclavo="
				+ apellidoEsclavo + ", dniEsclavo=" + dniEsclavo + ", tlfEsclavo=" + tlfEsclavo + "]";
	}
	
}
