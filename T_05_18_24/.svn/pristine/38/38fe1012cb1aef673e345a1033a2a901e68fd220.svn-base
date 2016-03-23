package pt.ist.rest.presentationserver; 

import java.util.HashSet;
import java.util.Set;

import pt.ist.fenixframework.Config;
import pt.ist.fenixframework.FenixFramework; 
import pt.ist.fenixframework.pstm.Transaction; 
import pt.ist.rest.domain.*;
	  
	  
public class PresentationServer { 
    public static void main(String[] args) {
    	FenixFramework.initialize(new Config() {{
                dbAlias = "//localhost:3306/restdb"; 
                dbUsername = "rest";
                dbPassword = "r3st";
    		domainModelPath="src/main/dml/domain.dml";
    		rootClass=PortalRestaurante.class;
    	}});

    	System.out.println("Welcome to the PresentationServer application!");

    	boolean committed = false;
 //1  	
    	try {
    		Transaction.begin();
    		PortalRestaurante rest = FenixFramework.getRoot();

        	Restaurante r1 = new Restaurante("Barriga Cheia", "Porto, Portugal");
        	Gestor g1 = (Gestor) rest.getUtilizadorEspecifico("pp");
        	r1.addGestor(g1);
        	
        	rest.adicionaRestaurante(r1);	
    		
    	Transaction.commit();
    	committed = true;
    	}	catch(Exception e){
    			System.out.println("Erro: " + e.getMessage());
    		}	finally {
    				if (!committed)
    					Transaction.abort();
    			}
 //2   	
    	try {
    		Transaction.begin();
    		PortalRestaurante rest = FenixFramework.getRoot();
		
    		for (Utilizador u : rest.getUtilizadorSet()) {
    			if(u instanceof Gestor)
    				System.out.println("Gestor: " + u.getNome());
    			else
    				System.out.println("Cliente: " + u.getNome());
    		}
    		
    	Transaction.commit();
    	committed = true;
    	}	catch(Exception e){
    			System.out.println("Erro: " + e.getMessage());
    		}	finally {
    				if (!committed)
    					Transaction.abort();
    			}
 //3   	
    	try {
    		Transaction.begin();
    		PortalRestaurante rest = FenixFramework.getRoot();
	
    		for (Restaurante r : rest.getRestaurante()){
				System.out.print("Restaurante: " + r.getNome() + ". Morada: " + r.getMorada() + ". Pratos: ");
    			for (Prato p : r.getPrato())
    				System.out.print(p.getNome() + "; ");
    			System.out.println();
    		}
    		
    		
    	Transaction.commit();
    	committed = true;
    	}	catch(Exception e){
    			System.out.println("Erro: " + e.getMessage());
    		}	finally {
    				if (!committed)
    					Transaction.abort();
    			}
    	
 //4
    	try {
    		Transaction.begin();
    		PortalRestaurante rest = FenixFramework.getRoot();
    		
        	Vegetariano v1 = new Vegetariano("batatas");
        	Carne c1 = new Carne("Bife");

    		
        	Set<Alimento> alimentosPrato = new HashSet<Alimento>();
        	alimentosPrato.add(c1);
        	alimentosPrato.add(v1);
    		
    		Gestor g1 = (Gestor) rest.getUtilizadorEspecifico("pp");
        	Restaurante r1 = rest.getRestauranteEspecifico("Barriga Cheia");
        	Prato p1 = new Prato("Bitoque", alimentosPrato);
        	
        	r1.adicionaPrato(p1, g1);
        	
    		
        	Transaction.commit();
        	committed = true;
    	}	catch(Exception e){
    			System.out.println("Erro: " + e.getMessage());
    		}	finally {
    				if (!committed)
    					Transaction.abort();
    			}
//5
    	try {
    		PortalRestaurante rest = FenixFramework.getRoot();

        	Restaurante r1 = rest.getRestauranteEspecifico("Barriga Cheia");
        	Restaurante r2 = rest.getRestauranteEspecifico("Barriga Feliz");

        	System.out.println("Classificaçao Barriga Cheia: " + r1.getClassificacao());
        	System.out.println("Classificaçao Barriga Feliz: " + r2.getClassificacao());
   		
    	}	catch(Exception e){
    			System.out.println("Erro: " + e.getMessage());
    		}  	
 //6	
    	try {
    		PortalRestaurante rest = FenixFramework.getRoot();
    		
        	Restaurante r1 = rest.getRestauranteEspecifico("Barriga Feliz");

        	Prato p1 = r1.getPratoEspecifico("Bitoque");
        	Prato p2 = r1.getPratoEspecifico("Canja de galinha");
        	Prato p3 = r1.getPratoEspecifico("Bacalhau com batatas");
    		
    		Cliente c1 = (Cliente) rest.getUtilizadorEspecifico("zeze");
    		
    		c1.likePrato(p1);
    		c1.likePrato(p2);
    		c1.likePrato(p3);

    	}	catch(Exception e){
    			System.out.println("Erro: " + e.getMessage());
    		}
//7
    	try {
    		PortalRestaurante rest = FenixFramework.getRoot();

        	Restaurante r1 = rest.getRestauranteEspecifico("Barriga Feliz");

        	Prato p1 = r1.getPratoEspecifico("Canja de galinha");
    		
    		Cliente c1 = (Cliente) rest.getUtilizadorEspecifico("mariazinha");
    		
    		c1.likePrato(p1);
    		
    	committed = true;
    	}	catch(Exception e){
    			System.out.println("Erro: " + e.getMessage());
    		}
    	
//8
    	try {
    		PortalRestaurante rest = FenixFramework.getRoot();

        	Restaurante r1 = rest.getRestauranteEspecifico("Barriga Cheia");
        	Restaurante r2 = rest.getRestauranteEspecifico("Barriga Feliz");

        	System.out.println("Classificaçao Barriga Cheia: " + r1.getClassificacao());
        	System.out.println("Classificaçao Barriga Feliz: " + r2.getClassificacao());
        	
    		
    	}	catch(Exception e){
    			System.out.println("Erro: " + e.getMessage());
    		}
    	
    }
}
