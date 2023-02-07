/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package inclui.hola_mundo_modelo;

import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.configuraciones.iniciales;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import innui.modelos.modelos;
import static java.lang.System.exit;
import java.util.ResourceBundle;

/**
 * Aplicación básica en Java con Maven
 * @author emilio
 */
public class Hola_mundo_modelo extends iniciales {
    /** 
     * Ruta de los recursos de traducción para este paquete
     */
    public static String k_in_ruta = "in/inclui/hola_mundo_modelo/in";  //NOI18N
    public static String k_hola_mundo_modelos_contador="hola_mundo_modelos.contador";
    /**
     * Inicio de la aplicación
     * @param args 
     */
    public static void main(String[] args) {
        oks ok = new oks();
        Hola_mundo_modelo hola_mundo_modelo = null;
        try {
            hola_mundo_modelo = new Hola_mundo_modelo();
            hola_mundo_modelo.run(ok);
        } catch (Exception e) {
            ok.setTxt(e);
        }
        if (ok.es == false) {
            System.err.println(ok.txt);
            exit(1);
        } else {
            exit(0);
        }
    }    
    /**
     * Inicio de la aplicación desde un objeto instanciado
     * @param ok Comunicar resultados
     * @param extras_array Opción de añadir parámetros en el futuro.
     * @return true si todo va bien
     * @throws Exception Opción de notificar errores de excepción
     */
    public boolean run(oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return ok.es; }
            ResourceBundle in = null;
            iniciar(ok);
            if (ok.es) { 
                in = ResourceBundles.getBundle(k_in_ruta);
                // Inicio del código propio de la aplicación
                String contador = properties.getProperty(k_hola_mundo_modelos_contador);
                int contador_num = Integer.parseInt(contador);
                contador_num++;
                properties.setProperty(k_hola_mundo_modelos_contador, String.valueOf(contador_num));
                // Parámetro de java para cambiar el lenguaje de la JVM: -Duser.language=en
                System.out.println(tr.in(in, "¡Hola Mundo!"));
                // Fin del código propio de la aplicación
                oks ok_fin = new oks();
                terminar(ok_fin);
                ok.setTxt(ok.getTxt(), ok_fin.getTxt());
            }
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean iniciar(oks ok, Object... extra_array) throws Exception {
        // Iniciar clase principal de la librería
        if (ok.es == false) { return ok.es; }
        _iniciar_desde_clase(modelos.class, ok);
        if (ok.es == false) { return ok.es; }
        _iniciar_desde_clase(this.getClass(), ok);
        return ok.es;
    }
    
    @Override
    public boolean terminar(oks ok, Object... extra_array) throws Exception {
        // Iniciar clase principal de la librería
        if (ok.es == false) { return ok.es; }
        _terminar_desde_clase(modelos.class, ok);
        if (ok.es == false) { return ok.es; }
        _terminar_desde_clase(this.getClass(), ok);
        return ok.es;
    }
    
}
