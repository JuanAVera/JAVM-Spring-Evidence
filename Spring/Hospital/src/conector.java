/* Ejercicio. conector a base de datos*/
			        											//author: towa (JAV- Juan Angel Vera)
																//Co-author: towa ()
																//Date: 05-04-2017        												 
            													//alimentar una base de datos desde java
//===============================================================================================================
import java.sql.*;

public class conector{/*Declaracion de metodos para insertar en tablas*/
	private PreparedStatement InsertarPa;
	private PreparedStatement InsertarMe;
	private PreparedStatement InsertarMed;
	private PreparedStatement InsertarEsp;
	private Connection con;
/*	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	}
	catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
	}
*/	
//================================CLASE PARA INSERTAR PACIENTE NUEVO==	
	public void insertarPa(Paciente P)throws SQLException{//metele un try catch
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		
		InsertarPa = con.prepareStatement("INSERT INTO paciente (Nombre,NumSeguro,Direccion,Telefono,eMail,RecetaFolio)"+ "values(?,?,?,?,?,?)");
		
		InsertarPa.setString(1, P.getNombre());
		InsertarPa.setInt(2, P.getNumSeguro());
		InsertarPa.setString(3, P.getDireccion());
		InsertarPa.setInt(4, P.getTelefono());
		InsertarPa.setString(5, P.geteMail());
		InsertarPa.setInt(6, P.getRecetaFolio());
		
		InsertarPa.executeUpdate();
	}
//================================CLASE PARA INSERTAR MEDICO NUEVO==	
	public void insertarMe(medico m)throws SQLException{
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		
		InsertarMe = con.prepareStatement("INSERT INTO medico (Cedula,Nombre,Telefono,eMail,HorasConsulta,EspecialidadIdEspecialidad,EspecialidadNombreEspecialidad)"+ "values(?,?,?,?,?,?,?)");
		
		InsertarMe.setString(1, m.getCedula());
		InsertarMe.setString(2, m.getNombre());
		InsertarMe.setInt(3, m.getTelefono());
		InsertarMe.setString(4, m.geteMail());
		InsertarMe.setString(5, m.getHorasConsulta());
		InsertarMe.setString(6, m.getEspecialidadIdEspecialidad());
		InsertarMe.setString(7, m.getEspecialidadNombreEspecialidad());
		
		InsertarMe.executeUpdate();
	}
//================================CLASE PARA INSERTAR MEDICAMENTO NUEVO==
	public void insertarMed(Medicamento me)throws SQLException{
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		
		InsertarMed = con.prepareStatement("INSERT INTO medicamento (Nombre,TipoMedicamento,ViaDeAdministracion,CodigoMedicamento)"+ "values(?,?,?,?)");
		
		InsertarMed.setString(1, me.getNombre());
		InsertarMed.setString(2, me.getTipoMedicamento());
		InsertarMed.setString(3, me.getViaDeAdministracion());
		InsertarMed.setString(4, me.getCodigoMedicamento());

		
		InsertarMed.executeUpdate();
	}
//================================CLASE PARA INSERTAR ESPECIALIDAD NUEVA==
	public void insertarEsp(Especialidad esp)throws SQLException{
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		
		InsertarEsp = con.prepareStatement("INSERT INTO especialidad (IdEspecialidad,NombreEspecialidad,Descripcion)"+ "values(?,?,?)");
		
		InsertarEsp.setString(1, esp.getIdEspecialidad());
		InsertarEsp.setString(2, esp.getNombreEspecialidad());
		InsertarEsp.setString(3, esp.getDescripcion());
		
		InsertarEsp.executeUpdate();
	}	
}