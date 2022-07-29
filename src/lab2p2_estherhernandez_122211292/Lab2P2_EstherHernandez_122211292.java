
package lab2p2_estherhernandez_122211292;
/**
 * @author ELIZABETH HERNANDEZ
 */
import java.util.Scanner;

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
                
                switch (op1){
                    case 1:
                        
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
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
