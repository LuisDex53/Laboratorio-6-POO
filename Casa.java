/*Joseph Valenciano y Luis Diego Solorzano*/

import java.util.ArrayList;

public class Casa {
	public static void main(String[] args) {
		
		ArrayList<Object> Lista = new ArrayList<Object>();
		Lista.add( new Refrigeradora());
		Lista.add(new Cocina());
		Lista.add(new Microondas());
		Lista.add(new Lampara());
		
		ArrayList<Object> Cuarto = new ArrayList<Object>();
		Cuarto.add(new Computadora());
		Cuarto.add(new AireAcondicionado());
		Cuarto.add(new Lampara());
		
		ArrayList<Object> Sala = new ArrayList<Object>();
		Sala.add(new TV());
		Sala.add(new Estereo());
		Sala.add(new Lampara());
		
		ArrayList<Object> CuartoDePilas = new ArrayList<Object>();
		CuartoDePilas.add(new Lavadora());
		CuartoDePilas.add(new Secadora());
		CuartoDePilas.add(new Lampara());
		
		
		
	    Object[] objectsON = {
	      new TV(), new Secadora(), new Computadora(), new AireAcondicionado(), new Estereo()}; 
	      for (int i = 0; i < objectsON.length; i++) {
	        if (objectsON[i] instanceof Control) {
	        	System.out.println(((Control)objectsON[i]).encender());
	        }
	      }
	      
	      Object[] objectsOFF = {
	    	      new Lavadora(), new Lampara(), new Cocina(), new Microondas()}; 
	    	      for (int i = 0; i < objectsOFF.length; i++) {
	    	        if (objectsOFF[i] instanceof Control) {
	    	        	System.out.println(((Control)objectsOFF[i]).apagar());
	    	        }
	    	      }
	
	    	      System.out.println("Dispositivos de la Cocina: \n");
	    	 for (int i = 0; i < Lista.size(); i++) {
	    	   if (Lista.get(i) instanceof Control) {
	    	      System.out.println(((Control)Lista.get(i)).encender());
	    	      
	    	   }
	    	 }
	    	 
	    	 System.out.println("Dispositivos de la Sala: \n");
	    	 for (int i = 0; i < Sala.size(); i++) {
	    	   if (Sala.get(i) instanceof Control) {
	    	      System.out.println(((Control)Sala.get(i)).apagar());
	    	      
	    	   }
	    	 }
	    	 
	    	 System.out.println("Dispositivos del cuarto: \n");
	    	 for (int i = 0; i < Cuarto.size(); i++) {
	    	   if (Cuarto.get(i) instanceof Control) {
	    	      System.out.println(((Control)Cuarto.get(i)).encender());
	    	      
	    	   }
	    	 }
	    	 
	    	 System.out.println("Dispositivos del Cuarto de Pilas: \n");
	    	 for (int i = 0; i < CuartoDePilas.size(); i++) {
	    	   if (CuartoDePilas.get(i) instanceof Control) {
	    	      System.out.println(((Control)CuartoDePilas.get(i)).apagar());
	    	      
	    	      
	    	   }
	    	 }
	
	
		Dispositivo miEstereo = new Estereo();
		miEstereo.subirVolumen();
		Dispositivo miTV = new TV();
		miTV.bajarCanal();
		Secadora miSecadora = new Secadora();
		miSecadora.Secar();
		
		
		
		
	}
        

}

		