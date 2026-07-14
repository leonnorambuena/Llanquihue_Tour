package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {
    
    public void mostrarServicios(){
        
        
        System.out.println("--- Servicios Turisticos --- \n");

        RutaGastronomica ruta1 = new RutaGastronomica("Sabores de Llanquihue", 3.5, 4);
        RutaGastronomica ruta2 = new RutaGastronomica("Tour de los Kuchenes", 2.0, 3);

        PaseoLacustre paseo1 = new PaseoLacustre("Navegacion Lago Todos los Santos", "Catamaran", 4.0);
        PaseoLacustre paseo2 = new PaseoLacustre("Atardecer en Kayak", "Kayak", 1.5);

        ExcursionCultural excursion1 = new ExcursionCultural("Ruta de los Colonos Alemanes", "Museo Antonio Felmer", 5.0);
        ExcursionCultural excursion2 = new ExcursionCultural("Patrimonio de Puerto Varas", "Iglesia Sagrado Corazón", 2.5);

        System.out.println(ruta1);
        System.out.println(ruta2);
        System.out.println("-------------------------------------------------");
        System.out.println(paseo1);
        System.out.println(paseo2);
        System.out.println("-------------------------------------------------");
        System.out.println(excursion1);
        System.out.println(excursion2);
        
    }
    
}