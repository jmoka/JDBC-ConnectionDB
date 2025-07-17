package apication;

import java.sql.Connection;

import db.DB;
import db.closes.CloseConection;


public class app {

	public static void main(String[] args) {
		System.out.println("====================");	
		System.out.println("Banco Conectado");	
		System.out.println("====================");	
			Connection conn = DB.getConectComProperties();
		// Connection conn = LerVariaveisAmbiente.getConectVariaveisAmbiente(DB.conn);
			
			
			CloseConection.closeConection(conn);
			System.out.println("====================");	
			System.out.println("Banco Desconectado");	
			System.out.println("====================");	
	}

}
