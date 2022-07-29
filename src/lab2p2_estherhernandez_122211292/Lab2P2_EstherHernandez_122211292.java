
package lab2p2_estherhernandez_122211292;
/**
 * @author ELIZABETH HERNANDEZ
 */
import java.util.Scanner;
import ADMIN.Carros;
import ADMIN.Clientes;
import ADMIN.Empleados;
import java.util.ArrayList;
public class Lab2P2_EstherHernandez_122211292 {

    
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        Boolean flag = true;
        while(flag== true){
        System.out.println("INICIAR SESION");
        System.out.println("Usuario: ");
        String usuario = lea.next();
        System.out.println("Contraseña: ");
        String contraseña = lea.next();
            if (!usuario.equalsIgnoreCase("admin")) {
                flag = true;
                System.out.println("Usuario incorrecto");
            }
            if (!contraseña.equals("admin1234")) {
                flag = true;
                System.out.println("Contraseña incorrecta");
            }
            if (usuario.equalsIgnoreCase("admin")&&contraseña.equals("admin1234") ) {
                boolean flag1 = true;
                while (flag1== true){
                System.out.println("1. Clientes");
                System.out.println("2. Empleados");
                System.out.println("3. Automoviles");
                System.out.println("4. Regresar a inicio de sesion");
                int op1 = lea.nextInt();
                 ArrayList listaC = new ArrayList();
                
                switch (op1){
                    case 1:
                        boolean flagC = true; 
                        Clientes c = new Clientes(); 
                        ArrayList<String> ClienteN = new ArrayList();
                        ArrayList<Integer> ClienteE = new ArrayList();
                        ArrayList<String> ClienteID = new ArrayList();
                        ArrayList<Double> ClienteS = new ArrayList();
                        while(flagC == true){
                       
                        System.out.println("1.Crear");
                        System.out.println("2.Modificar");
                        System.out.println("3.Eliminar");
                        System.out.println("4.Listar Clientes");
                        System.out.println("5.Listar carros por cliente");
                        System.out.println("6.Regresar");
                        System.out.println("Ingrese la opcion:");
                        int opc = lea.nextInt();
                        switch(opc){
                            case 1:
                                
                                System.out.println("Ingrese el nombre del cliente:");
                                String nombre= lea.next();
                                nombre = lea.nextLine();
                                c.setnombre(nombre);
                                ClienteN.add(nombre);
                                System.out.println("Ingrese la edad del cliente:");
                                int edad = lea.nextInt();
                                c.setedad(edad);
                                ClienteE.add(edad);
                                System.out.println("Ingrese el numero de identidad del cliente:");
                                String id = lea.next();
                                c.setID(id);
                                ClienteID.add(id);
                                System.out.println("Ingrese el saldo a pagar por el cliente:");
                                double saldo = lea.nextDouble();
                                c.setsaldo(saldo);
                                ClienteS.add(saldo);
                                //listaC.add(new Clientes(c.getnombre(),c.getedad(),c.getID(),c.getsaldo()));
                                  
                            break;
                            case 2:
                                
                                System.out.println("Escoga el cliente que desea modificar: ");
                                for (int i = 0; i < ClienteN.size(); i++) {
                                    System.out.println(i +". "+ClienteN.get(i));
                                }
                                System.out.println("Ingrese el numero:");
                                int p = lea.nextInt();
                                System.out.println("Desea modificar :\n1.Nombre\n2.Edad\n3.ID\n4.Saldo\n Ingrese el numero:");
                                int modC = lea.nextInt();
                                if (modC==1) {
                                    System.out.println("Ingrese el nuevo nombre");
                                    String nn= lea.next();
                                    nn = lea.nextLine();
                                    ClienteN.get(p).replaceAll(ClienteN.get(p), nn);
                                }
                                if (modC==2) {
                                    System.out.println("Ingrese la nueva edad");
                                    int ne= lea.nextInt();
                                        ClienteE.remove(p);ClienteE.add(p, ne);
                                }
                                if (modC==3) {
                                    System.out.println("Ingrese el nuevo ID");
                                    String nid= lea.next();
                                    nid = lea.nextLine();
                                    ClienteID.get(p).replaceAll(ClienteID.get(p), nid);
                                }
                                if (modC==4) {
                                    System.out.println("Ingrese el nuevo sueldo a pagar");
                                    double ns= lea.nextInt();
                                        ClienteS.remove(p);ClienteS.add(p, ns);
                                }
                                break;
                            case 3:
                                break;
                            case 4:
                                int cont2 = 0;
                                for (int i = 0; i <ClienteN.size(); i++) {
                                    System.out.println((cont2 +1)+ClienteN.get(i));
                                }
                                ;
                                break;
                            case 5:
                                break;
                            case 6:
                                flagC= false;
                             break;   
                                
                        }
                        }
                        break;
                    case 2:
                        
                        
                        System.out.println("1.Crear");
                        System.out.println("2.Modificar");
                        System.out.println("3.Eliminar");
                        System.out.println("4.Listar Empleados");
                        System.out.println("5.Estado de trabajo");
                        System.out.println("6.Regresar");
                        System.out.println("Ingrese la opcion:");
                        int ope = lea.nextInt();
                        break;
                    case 3:
                        
                        System.out.println("1.Añadir carros al sistema");
                        System.out.println("2.Modificar su estado de reparacion");
                        System.out.println("3.Listar carro");
                        System.out.println("4.Regresar");
                        System.out.println("Ingrese la opcion:");
                        int opa = lea.nextInt();
                        break;
                    case 4:
                        flag1= false;

                        break;
                    default:
                        System.out.println("Opcion inexistente, ingrese de nuevo");
                        break;
                }
                }
            }
        
        }
        
        
    }
    
}
