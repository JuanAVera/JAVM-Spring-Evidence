import java.sql.SQLException;

public class Menu {
	public static void main(String[] args)throws SQLException{
//======INSERTS========
//======PACIENTE===OK==		
//		Paciente p = new Paciente("Gilberto santarosa",518356,"barranca 24 col. doctores",551878963,"Gilberto25@net.com",25);
//		conector cn = new conector();
//		cn.insertarPa(p);
//=======MEDICO========	
//		medico m = new medico("123ABC","Aquiles Valaver",557777,"Gilberto25@net.com","10","Ur1","Urologia");
//		conector cn = new conector();
//		cn.insertarMe(m);
//=======MEDICAMENTO========
//		Medicamento me = new Medicamento("Viagra","Tableta","Oral","7702004003508");
//		conector cn = new conector();
//		cn.insertarMed(me);
//=======ESPECIALIDAD========
		Especialidad esp = new Especialidad("Al3","Alergología","Oral");
		conector cn = new conector();
		cn.insertarEsp(esp);		
		
	}
}
