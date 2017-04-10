public class medico{
	private String Cedula,Nombre,eMail,HorasConsulta,EspecialidadIdEspecialidad,EspecialidadNombreEspecialidad;
	private int Telefono;

	public medico(String Cedula,String Nombre,int Telefono,String eMail,String HorasConsulta,String EspecialidadIdEspecialidad, String EspecialidadNombreEspecialidad){
		this.Cedula=Cedula;
		this.Nombre=Nombre;
		this.Telefono=Telefono;
		this.eMail=eMail;
		this.HorasConsulta=HorasConsulta;
		this.EspecialidadIdEspecialidad=EspecialidadIdEspecialidad;
		this.EspecialidadNombreEspecialidad=EspecialidadNombreEspecialidad;
	}
	public String getCedula(){
		return Cedula;
	}
	public void setCedula(String Cedula){
		this.Cedula=Cedula;
	}
	public String getNombre(){
		return Nombre;
	}
	public void setNombre(String Nombre){
		this.Nombre=Nombre;
	}
	public int getTelefono(){
		return Telefono;
	}
	public void setTelefono(int Telefono){
		this.Telefono=Telefono;
	}
	public String geteMail(){
		return eMail;
	}
	public void seteMail(String eMail){
		this.eMail=eMail;
	}
	public String getHorasConsulta(){
		return HorasConsulta;
	}
	public void setHorasConsulta(String HorasConsulta){
		this.HorasConsulta=HorasConsulta;
	}
	public String getEspecialidadIdEspecialidad(){
		return EspecialidadIdEspecialidad;
	}
	public void setEspecialidadIdEspecialidad(String EspecialidadIdEspecialidad){
		this.EspecialidadIdEspecialidad=EspecialidadIdEspecialidad;
	}
	public String getEspecialidadNombreEspecialidad(){
		return EspecialidadNombreEspecialidad;
	}
	public void setEspecialidadNombreEspecialidad(String EspecialidadNombreEspecialidad){
		this.EspecialidadNombreEspecialidad=EspecialidadNombreEspecialidad;
	}
}