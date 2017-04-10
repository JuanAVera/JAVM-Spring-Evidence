public class Especialidad {
	private String IdEspecialidad,NombreEspecialidad,Descripcion;

	public Especialidad(String IdEspecialidad, String NombreEspecialidad,String Descripcion){
		this.IdEspecialidad=IdEspecialidad;
		this.NombreEspecialidad=NombreEspecialidad;
		this.Descripcion=Descripcion;
	}
	public String getIdEspecialidad(){
		return IdEspecialidad;
	}
	public void setIdEspecialidad(String IdEspecialidad){
		this.IdEspecialidad=IdEspecialidad;
	}
	public String getNombreEspecialidad(){
		return NombreEspecialidad;
	}
	public void setNombreEspecialidad(String NombreEspecialidad){
		this.NombreEspecialidad=NombreEspecialidad;
	}
	public String getDescripcion(){
		return Descripcion;
	}
	public void setDescripcion(String Descripcion){
		this.Descripcion=Descripcion;
	}
}
