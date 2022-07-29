
package ADMIN;

/**

 * @author ELIZABETH HERNANDEZ
 */
public class Clientes {
    private String nombre;
    private int edad;
    private String ID;
    private double saldo;
    
    public Clientes(){
    }
    public Clientes(String nombre, int edad, String ID, double saldo){
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
        this.saldo=saldo;
    }
    public void setnombre(String n){
        this.nombre= n;
    }
    public String getnombre(){
        return nombre;
    }
     public void setedad(int ed){
        this.edad= ed;
    }
    public int getedad(){
        return edad;
    }
     public void setID(String id){
        this.ID= id;
    }
    public String getID(){
        return ID;
    }
     public void setsaldo(double s){
        this.saldo = s;
    }
    public double getsaldo(){
        return saldo;
    }
}
