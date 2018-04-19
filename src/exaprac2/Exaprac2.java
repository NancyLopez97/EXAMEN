
package exaprac2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**Nombre de la clase:Exaprac2
 * Fecha:19/04/18
 * Copyrigth:Itca
 * Versin1.1
 * @author Nancy lOPEZ
 */
public class Exaprac2 {
    
    
    public static void main(String[] args) {
        
    
    String nombre[]=new String[999];
      
        double total[]=new double[999];
      int cantidad[]=new int[999];
        DecimalFormat df = new DecimalFormat("##.##");
        
        //declaracion de contadores y acumuladores
        int opcion=0;
        int numero=0;
        String datos="";
        
        
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("MENU\n[1]=Agregar\n[2]=calcular\n[3]=SALIR"));
            switch(opcion){
                case 1:
                       nombre[numero]=JOptionPane.showInputDialog("Ingrese datos\nnombre");
                       cantidad[numero]=Integer.parseInt(JOptionPane.showInputDialog("cantidad:"));
                       total[numero]=Double.parseDouble(JOptionPane.showInputDialog("total:"));
                     
                       //obteniendo edad
                   
                       datos=datos+"\ncompras #:"+(numero+1)+"\nNombre"+nombre[numero]+
                               "\ncantidad:"+cantidad[numero]+"\ntotal:"+total[numero];
                       numero++;              
               break;
                case 2:
                      JOptionPane.showMessageDialog(null," Mostrando todos los registros","REGISTROS",1);
                         for (int i = 0; i < numero; i++) {
                             double TOTAL=cantidad[i]+total[i];
                             double iva =(TOTAL*0.13)+TOTAL;
                             double descuento=0;
                             double descuento1=0;
                             if(iva>200){
                                 descuento=(iva*0.20)+iva;
                             
                             }else
                                 if(iva>500)
                                 {
                                 descuento=(iva*0.22)+iva;
                                 
                                 }
                                 else if(iva>800){
                                     
                                 descuento1=(iva*0.30)+iva;
                                
                                         }
                          
                             JOptionPane.showMessageDialog(null,"compras #:"+(i+1)+
                                     "\nnombre:"+nombre[i]+"\ncantidad"+cantidad[i]+"\nprecio:"+total[i]+"\ntotal"+iva+"\ndescuento"+descuento1,"DATOS",1);
                        
                    }
                    
                      break;
                               
            }
                 
        }while(opcion!=3);
        
    }
    
         
}
