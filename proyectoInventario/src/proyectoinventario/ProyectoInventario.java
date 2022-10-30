package proyectoinventario;
import java.util.*;

public class ProyectoInventario {


  static int op, opu, opa;
  //static String productos[]=new String[3];
  public static String[] productos;
  //static List productos= new ArrayList();
  //static String producto;
  public static Scanner sc=new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("Bienvenido al programa:\n----------PROYECTO SALCHIPAPAxd----------");
    System.out.println("Creado por: \nAndrés Gerena\nFabián Suarez\nCamila Mosquera\nSantiago Carvajal\nValery Ospina");
    do{
      System.out.println("\n--------INDIQUE SU ROL--------");
      System.out.println("1- Usuario \n2- Admin \n3- Salir del programa");
      op=Integer.parseInt(sc.nextLine());
      switch(op){
        case 1:
          opu=0;
          do{
            System.out.println("\n------MENÚ DE USUARIO------");
            System.out.println("Qué desea hacer? \n1- Ver lista de productos \n2- Comprar productos \n3- Volver");
            opu=Integer.parseInt(sc.nextLine());
            switch(opu){
              case 1:
                System.out.println("\n----LISTA DE PRODUCTOS----");
                break;
                
              case 2:
                System.out.println("\n----COMPRAR PRODUCTOS----");
                break;
                
              case 3:
                break;
                
              default:
                System.out.println("\nOpción no valida!!!");
            }
          }while(opu!=3);
          break;
          
        case 2:
          opa=0;
          do{
            System.out.println("\n------MENÚ DE ADMIN------");
            System.out.println("Qué desea hacer? \n1- Ver lista de productos \n2- Agregar producto a la ''base de datos'' \n3- Entrada de inventario \n4- Salida de inventario \n5- Actualizar pruducto \n6- Borrar producto \n7- Volver");
            opa=Integer.parseInt(sc.nextLine());
            switch(opa){
              case 1:
                System.out.println("\n----LISTA DE PRODUCTOS----");
                for(int i=0; i<productos.length; i++){
                  System.out.println(productos[i]);
                }
                break;
                
              case 2:
                System.out.println("\n----AGREGAR PRODUCTO A LA BASE DE DATOS----");
                int n=0;
                System.out.println("Ingrese el nombre del producto: ");
                productos[n]=sc.nextLine();
                n++;
                break;
                
              case 3:
                System.out.println("\n----ENTRADA DE INVENTARIO----");
                break;
                
              case 4:
                System.out.println("\n----SALIDA DE INVENTARIO----");
                break;
                
              case 5:
                System.out.println("\n----ACTUALIZAR PRODUCTO----");
                break;
                
              case 6:
                System.out.println("\n----BORRAR PRODUCTO----");
                break;
                
              case 7:
                break;
                
              default:
                System.out.println("\nOpción no valida!!!");
            }
          }while(opa!=7);
          break;
          
        case 3:
          System.out.println("\nHasta luego");
          break;

        default:
          System.out.println("\nOpción no valida!!!");
      }
    }while(op!=3);
  }
}
