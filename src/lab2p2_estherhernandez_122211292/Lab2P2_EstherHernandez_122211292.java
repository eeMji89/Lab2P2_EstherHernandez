
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
                    System.out.println("");
                System.out.println("1. Clientes");
                System.out.println("2. Empleados");
                System.out.println("3. Automoviles");
                System.out.println("4. Regresar a inicio de sesion");
                int op1 = lea.nextInt();
                 ArrayList listaC = new ArrayList();
                ArrayList<String> ClienteN = new ArrayList();
                ArrayList<Integer> ClienteE = new ArrayList();
                ArrayList<String> ClienteID = new ArrayList();
                ArrayList<Double> ClienteS = new ArrayList();
                ArrayList <Integer> dueño = new ArrayList();
                switch (op1){
                    case 1:
                        boolean flagC = true; 
                        Clientes c = new Clientes(); 
                        
                        while(flagC == true){
                            System.out.println("");
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
                                String nombre= lea.nextLine();
                                nombre = lea.next();
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
                                    String nn= lea.nextLine();
                                    nn = lea.next();
                                     ClienteN.remove(p);ClienteN.add(p, nn);
                                    System.out.println("EL NOMBRE HA SIDO MODIFICADO EXITOSAMENTE");
                                }
                                if (modC==2) {
                                    System.out.println("Ingrese la nueva edad");
                                    int ne= lea.nextInt();
                                        ClienteE.remove(p);ClienteE.add(p, ne);
                                        System.out.println("LA EDAD HA SIDO MODIFICADA EXITOSAMENTE");
                                }
                                if (modC==3) {
                                    System.out.println("Ingrese el nuevo ID");
                                    String nid= lea.nextLine();
                                    nid = lea.next();
                                    ClienteID.remove(p);ClienteID.add(p, nid);
                                    System.out.println("EL ID HA SIDO MODIFICADO EXITOSAMENTE");
                                }
                                if (modC==4) {
                                    System.out.println("Ingrese el nuevo sueldo a pagar");
                                    double ns= lea.nextInt();
                                        ClienteS.remove(p);ClienteS.add(p, ns);
                                        System.out.println("EL SUELDO HA SIDO MODIFICADO EXITOSAMENTE");
                                }
                                break;
                            case 3:
                                System.out.println("Escoga el cliente que desea eliminar: ");
                                for (int i = 0; i < ClienteN.size(); i++) {
                                    System.out.println(i +". "+ClienteN.get(i));
                                }
                                System.out.println("Ingrese el numero:");
                                int p1 = lea.nextInt();
                                ClienteN.remove(p1);
                                ClienteE.remove(p1);
                                ClienteID.remove(p1);
                                ClienteS.remove(p1);
                                System.out.println("EL CLIENTE SE HA ELIMINADO EXITOSAMENTE");
                                break;
                            case 4:
                                int cont2 = 0;
                                for (int i = 0; i <ClienteN.size(); i++) {
                                    System.out.println((cont2 +1)+"- " +ClienteN.get(i)+"- "+ ClienteE.get(i)+"- "+ ClienteID.get(i)
                                    +"- "+ ClienteS.get(i));
                                }
                                ;
                                break;
                            case 5:
                                System.out.println("Escoga el numero del cliente del que desea listar los autos: ");
                                for (int i = 0; i < ClienteN.size(); i++) {
                                    System.out.println(i +". "+ClienteN.get(i));
                                }
                                int p3 = lea.nextInt();
                                System.out.println("Los autos de este cliente son: ");
                                for (int m = 0; m < dueño.size(); m++) {
                                    if (p3==dueño.indexOf(m)) {
                                        System.out.println("1.-");
                                    }
                                }
                                break;
                            case 6:
                                flagC= false;
                             break;   
                                
                        }
                        }
                        break;
                    case 2:
                        ArrayList<Integer> EmpleadoE = new ArrayList();
                        ArrayList<String> EmpleadoN = new ArrayList();
                        ArrayList<String> ERRHH = new ArrayList();
                        ArrayList<Double> EMPS = new ArrayList();
                        ArrayList<String> estadoE= new ArrayList();
                        ArrayList<String> EE= new ArrayList();
                        
                        estadoE.add(0, "SE ENCUENTRA TRABAJANDO");
                        estadoE.add(1,"NO SE ENCUENTRA TRABAJANDO");
                        Empleados e = new Empleados();
                        boolean flag9 = true;
                        while(flag9 ==true){
                        System.out.println("");
                        System.out.println("1.Crear");
                        System.out.println("2.Modificar");
                        System.out.println("3.Eliminar");
                        System.out.println("4.Listar Empleados");
                        System.out.println("5.Estado de trabajo");
                        System.out.println("6.Regresar");
                        System.out.println("Ingrese la opcion:");
                        int ope = lea.nextInt();
                        if (ope == 1) {
                            System.out.println("Ingrese el nombre del empleado:");
                                String nombree= lea.nextLine();
                                nombree = lea.next();
                                e.setnombre(nombree);
                                EmpleadoN.add(nombree);
                                System.out.println("Ingrese la edad del empleado:");
                                int edade = lea.nextInt();
                                e.setedad(edade);
                                EmpleadoE.add(edade);
                                System.out.println("Ingrese el RRHH del empleado:");
                                String rrhh= lea.next();
                                e.setRRHH(rrhh);
                                ERRHH.add(rrhh);
                                System.out.println("Ingrese el sueldo del empleado:");
                                double sueldo = lea.nextDouble();
                                e.setsueldo(sueldo);
                                EMPS.add(sueldo);
                                System.out.println("Escoga el estado de trabajo del empleado:\n0.Se encuentra"
                                        + "trabajando\n1.no se encuentra trabajando");
                                int pes = lea.nextInt();
                                    if (pes ==0) { 
                                       EE.add(estadoE.get(pes));
                                        
                                    }
                                    else if (pes ==1) {  
                                        EE.add(estadoE.get(pes));
                                    }
         
                        }
                        if (ope == 2) {
                             System.out.println("Escoga el empleado que desea modificar: ");
                                for (int i = 0; i < EmpleadoN.size(); i++) {
                                    System.out.println(i +". "+EmpleadoN.get(i));
                                }
                                System.out.println("Ingrese el numero:");
                                int p4 = lea.nextInt();
                                System.out.println("Desea modificar :\n1.Nombre\n2.Edad\n3.RRHH\n4.Sueldo\n Ingrese el numero:");
                                int modC = lea.nextInt();
                                if (modC==1) {
                                    System.out.println("Ingrese el nuevo nombre");
                                    String nn= lea.nextLine();
                                    nn = lea.next();
                                    EmpleadoN.remove(p4);EmpleadoN.add(p4, nn);
                                    System.out.println("EL NOMBRE HA SIDO MODIFICADO EXITOSAMENTE");
                                }
                                if (modC==2) {
                                    System.out.println("Ingrese la nueva edad");
                                    int ne= lea.nextInt();
                                        ClienteE.remove(p4);ClienteE.add(p4, ne);
                                        System.out.println("LA EDAD HA SIDO MODIFICADA EXITOSAMENTE");
                                }
                                if (modC==3) {
                                    System.out.println("Ingrese el nuevo RRHH");
                                    String nrrhh= lea.nextLine();
                                    nrrhh = lea.next();
                                    ERRHH.remove(p4);ERRHH.add(p4, nrrhh);
                                    System.out.println("EL ID HA SIDO MODIFICADO EXITOSAMENTE");
                                }
                                if (modC==4) {
                                    System.out.println("Ingrese el nuevo sueldo del empleado");
                                    double ns= lea.nextInt();
                                        EMPS.remove(p4);EMPS.add(p4, ns);
                                        System.out.println("EL SUELDO HA SIDO MODIFICADO EXITOSAMENTE");
                                }
                                
                        }
                        if (ope == 3) {
                            System.out.println("Escoga el EMPLEADO que desea eliminar: ");
                                for (int i = 0; i < EmpleadoN.size(); i++) {
                                    System.out.println(i +". "+EmpleadoN.get(i));
                                }
                                System.out.println("Ingrese el numero:");
                                int p1 = lea.nextInt();
                                EmpleadoN.remove(p1);
                                EmpleadoE.remove(p1);
                                ERRHH.remove(p1);
                                EMPS.remove(p1);
                                System.out.println("EL EMPLEADO SE HA ELIMINADO EXITOSAMENTE");
                        }
                        if (ope == 4) {
                            int cont4 = 0;
                                for (int i = 0; i <EmpleadoN.size(); i++) {
                                    System.out.println((cont4 +1)+"-Nombre: " +EmpleadoN.get(i)+
                                    "-Edad: "+ EmpleadoE.get(i)+"-RRHH: "+ ERRHH.get(i)
                                    +"-Sueldo:  "+ EMPS.get(i)+"Estado: "+EE.get(i));
                                }
                        }
                        if (ope == 5) {
                            System.out.println("Escoga el EMPLEADO que desea cambiar de estado: ");
                                for (int i = 0; i < EmpleadoN.size(); i++) {
                                    System.out.println(i +". "+EmpleadoN.get(i));
                                }
                                System.out.println("Ingrese el numero:");
                                int p8 = lea.nextInt();
                                System.out.println("Estado actual de "+ERRHH.get(p8)+": "+EE.get(p8));
                                if (EE.get(p8).indexOf(p8)== 0) {
                                EE.remove(0);EE.add(estadoE.get(1));
                                }
                                 if (EE.get(p8).indexOf(p8)== 1) {
                                EE.remove(1);EE.add(estadoE.get(0));
                                }
                                 System.out.println("EL ESTADO DEL EMPLEADO HA SIDO CMABIADO EXISTOSAMENTE");
                        }
                        if(ope==6){
                            flag9 = false;
                        }}
                
                        break;
                    case 3:
                        Carros cr = new Carros(); 
                        ArrayList <String> carros = new ArrayList();
                        ArrayList <String> marca = new ArrayList();
                        ArrayList <String> modelo = new ArrayList();
                        ArrayList <Integer> año = new ArrayList();
                        ArrayList <String> fecha = new ArrayList();
                        ArrayList <Double> sueldo = new ArrayList();
                        ArrayList <String> estado = new ArrayList();
                        ArrayList <String> estadoa = new ArrayList();
                        
                        
                        estado.add(0, "En espera de entrar a reparacion");
                        estado.add(1, "En reparacion");
                        estado.add(2, "En espera de pago de reparacion");
                        estado.add(3, "Saldo Pagado");
                        estado.add(4, "En espera de ser entregado");
                        estado.add(5, "Entregado");
                        cr.setEstadoC(estado);
                        boolean flag0= true;
                        while(flag0== true){
                        System.out.println("1.Añadir carros al sistema");
                        System.out.println("2.Modificar su estado de reparacion");
                        System.out.println("3.Listar carro");
                        System.out.println("4.Regresar");
                        System.out.println("Ingrese la opcion:");
                        int opa = lea.nextInt();
                        if (opa == 1) {
                            System.out.println("Ingrese la marca del auto: ");
                            String marc = lea.nextLine(); marc = lea.next();
                            cr.setmarca(marc); 
                            marca.add(marc);
                            System.out.println("Ingrese el modelo de auto: ");
                            String modl = lea.nextLine(); modl = lea.next();
                            cr.setmodelo(modl); 
                            modelo.add(modl);
                            System.out.println("Ingrese el año de fabricacion del auto: ");
                            int year = lea.nextInt();
                            cr.setaño(year);
                            año.add(year);
                            System.out.println("Ingrese la fecha de ingreso al taller[ej. 12/04/2022]");
                            String ff = lea.nextLine(); ff = lea.next();
                            cr.setfecha(ff); 
                            fecha.add(ff);
                            System.out.println("Ingrese el estado de reparacion del auto:"
                                + "\n0.En espera de entrar a reparacion\n1.En reparacion\n2.En espera de pago de reparacion\n"
                                + "3.Saldo pagado\n4.En espera de ser entregado\n5.Entregado\nIngrese el numero;");
                            int pe= lea.nextInt();
                            estadoa.add(cr.getEstadoC().get(pe));
                            boolean flag4 = true;
                                while(flag4==true){
                                System.out.println("Ingrese el numero de ID del dueño: ");
                                int idd= lea.nextInt();
                                int cont5 = 0;
                                    for (int i = 0; i < ClienteID.size(); i++) {
                                       if (ClienteID.equals(idd)) { 
                                           int p5= ClienteID.indexOf(i);
                                           dueño.add(i);
                                           cont5=1;
                                       }
                                    }
                                if (cont5==0) {
                                    System.out.println("No se ha encontrado ningun cliente con el numero de ID ingresado,"
                                            + "ingrese de nuevo el ID");
                                    flag4= true;
                                }
                                else{
                                    flag4=false;
                                }
                            }
                                System.out.println("Se ha añadido el auto exitosamente");
                        }
                        if (opa==2) {
                            System.out.println("Escoga el auto al que quiere modificar su estado de reparacion");
                            for (int i = 0; i <marca.size(); i++) {
                                    System.out.println(i +"- Marca: " +marca.get(i)+"- Dueño: "+ dueño.get(i));
                                }
                            int p0= lea.nextInt();
                            estadoa.get(p0);estadoa.remove(p0);
                            System.out.println("Ingrese el estado de reparacion del auto:"
                                + "\n0.En espera de entrar a reparacion\n1.En reparacion\n2.En espera de pago de reparacion\n"
                                + "3.Saldo pagado\n4.En espera de ser entregado\n5.Entregado\nIngrese el numero;");
                            int pp= lea.nextInt();
                            if (pp==0) {
                                estadoa.add(p0,cr.getEstadoC().get(pp));
                            }
                            if (pp==1&&estadoa.equals(cr.getEstadoC().get(1))) {
                                estadoa.add(p0,cr.getEstadoC().get(pp));
                            }
                            else{
                                System.out.println("no puede cambiarlo a este estado");
                            }
                            if (pp==2) {
                                estadoa.add(p0,cr.getEstadoC().get(pp));
                            }
                            if (pp==3) {
                                System.out.println("Desea pagar en 1.taller o por 2.banco?");
                                int pago= lea.nextInt();
                                if (pago==1) {
                                    estadoa.add(p0,cr.getEstadoC().get(3));
                                    ClienteS.remove(p0);ClienteS.add(0.00);
                                }
                            }
                            if (pp>3) {
                                estadoa.add(p0,cr.getEstadoC().get(pp));
                            }
                            
                            
                        }
                        if(opa==3){
                            int cont9 = 0;
                                for (int i = 0; i <marca.size(); i++) {
                                    System.out.println((cont9 +1)+"- Marca: " +marca.get(i)+"- Dueño: "+ dueño.get(i));
                                }
                        }
                       
                            if (opa==4) {
                               flag0 =false; 
                            }
                        } 
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
