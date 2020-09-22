
package menu;


public class ClaseMenu {
    
    public ClaseMenu(){
        
        opciones();
    }
        Integer opcion=0;
        
        public void setMenu(int opc){
            
            opcion=opc;
        
            switch(opcion){
                case 1:
                    System.out.println("Caso 1:" +opcion);
                    break;
                case 2:
                    System.out.println("Caso 2:" +opcion);
                    break;
                default:
                    System.out.println("Caso no existe");;
        }
    }
    
        public void opciones(){
            System.out.println("opcion uno");
            System.out.println("opcion dos");
            System.out.println("opcion salir");
            
        }
        public void setAnidado(int opc){
            
            opcion=opc;
            
            if(opcion==1) {
                System.out.println("Caso 1");
            } else {
                if(opcion==2) {
                    System.out.println("Caso 2");
                }else {
                    if(opcion==3) {
                        System.out.println("El programa a Finalizado");
                    }else{
                        System.out.println("Dicha opcion no existe");
                    }
                }
            }
        }
}

