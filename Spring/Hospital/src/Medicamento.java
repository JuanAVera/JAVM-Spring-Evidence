public class Medicamento {
	private String Nombre,TipoMedicamento,ViaDeAdministracion,CodigoMedicamento;

	public Medicamento(String Nombre, String TipoMedicamento,String ViaDeAdministracion,String CodigoMedicamento){
		this.Nombre=Nombre;
		this.TipoMedicamento=TipoMedicamento;
		this.ViaDeAdministracion=ViaDeAdministracion;
		this.CodigoMedicamento=CodigoMedicamento;
	}
	public String getNombre(){
		return Nombre;
	}
	public void setNombre(String Nombre){
		this.Nombre=Nombre;
	}
	public String getTipoMedicamento(){
		return TipoMedicamento;
	}
	public void setTipoMedicamento(String TipoMedicamento){
		this.TipoMedicamento=TipoMedicamento;
	}
	public String getViaDeAdministracion(){
		return TipoMedicamento;
	}
	public void setViaDeAdministracion(String ViaDeAdministracion){
		this.ViaDeAdministracion=ViaDeAdministracion;
	}
	public String getCodigoMedicamento(){
		return CodigoMedicamento;
	}
	public void setCodigoMedicamento(String CodigoMedicamento){
		this.CodigoMedicamento=CodigoMedicamento;
	}
}
