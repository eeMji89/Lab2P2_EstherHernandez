
package ADMIN;

import java.util.ArrayList;

public class Empleados {
    private String nombre;
    private int edad;
    private String horainicio;
    private String horasalida;
    private double sueldo;
    private String RRHH;
    private ArrayList <String> estado = new ArrayList();
    
    public Empleados(){
        
    }
     public void setnombre(String n){
        this.nombre= n;
    }
    public String getnombre(){
        return nombre;
    }
     public void edad(int ed){
        this.edad= ed;
    }
    public int getedad(){
        return edad;
    }
    public void sethi(String hi){
        this.horainicio=hi;
    }
    public String gethi(){
        return horainicio;
    }
    public void seths(String hs){
        this.horasalida=hs;
    }
    public String geths(){
        return horasalida;
    }
     public void setsueldo(double s){
        this.sueldo = s;
    }
    public double getsueldo(){
        return sueldo;
    }
    public void setRRHH(String rh){
        this.RRHH= rh;
    }
    public String getRRHH(){
        return RRHH;
    }
    public void setEstado(ArrayList<String> est){
        this.estado = est;
    }
    public ArrayList <String> getEstado (){
        return estado;
    }
}
