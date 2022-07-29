
package ADMIN;

import java.util.ArrayList;

/**
 * @author ELIZABETH HERNANDEZ
 */
public class Carros {
    private String marca;
    private String modelo;
    private int año;
    private String fecha;
    private ArrayList<String> estadoC = new ArrayList();
    private String dueño;
    private double costo;
    
    public void setmarca(String ma){
        this.marca=ma;
    }
    public String getmarca(){
        return marca;
    }
    public void setmodelo(String mo){
        this.modelo=mo;
    }
    public String getmodelo(){
        return modelo;
    }
    public void setfecha(String f){
        this.fecha=f;
    }
    public String getfecha(){
        return fecha;
    }
    public void setEstadoC(ArrayList<String> estc){
        this.estadoC = estc;
    }
    public ArrayList <String> getEstadoC(){
        return estadoC;
    }
    public void setdueño(String d){
        this.dueño=d;
    }
    public String getdueño(){
        return dueño;
    }
     public void setcosto(double cs){
        this.costo = cs;
    }
    public double getcosto(){
        return costo;
    }
}
