public class Paciente{
	private String Nombre,Direccion,eMail;
	private int NumSeguro,Telefono,RecetaFolio;

	public Paciente (){}
	public Paciente(String Nombre,int NumSeguro,String Direccion,int Telefono,String eMail,int RecetaFolio){
		this.Nombre=Nombre;
		this.NumSeguro=NumSeguro;
		this.Direccion=Direccion;
		this.Telefono=Telefono;
		this.eMail=eMail;
		this.RecetaFolio=RecetaFolio;
	}
	public String getNombre(){
		return Nombre;
	}
	public void setNombre(String Nombre){
		this.Nombre=Nombre;
	}
	public int getNumSeguro(){
		return NumSeguro;
	}
	public void setNumSeguro(int NumSeguro){
		this.NumSeguro=NumSeguro;
	}
	public String getDireccion(){
		return Direccion;
	}
	public void setDireccion(String Direccion){
		this.Direccion=Direccion;
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
	public int getRecetaFolio(){
		return RecetaFolio;
	}
	public void setRecetaFolio(int RecetaFolio){
		this.RecetaFolio=RecetaFolio;
	}
}