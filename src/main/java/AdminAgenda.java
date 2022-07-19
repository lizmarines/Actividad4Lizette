
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;

public final class AdminAgenda {
    HashMap<String, String> mycontact = new HashMap<>();
    String[] arrayContacto;
    
    String inputfileName = "/Users/lizettemarines/NetBeansProjects/Actividad4Lizette/src/main/java/input.csv - Hoja 1.csv";
    String outputFileName = "/Users/lizettemarines/NetBeansProjects/Actividad4Lizette/src/main/java/output.csv - Hoja 1.csv";
    
        public AdminAgenda(){
            
            //Contactos en una ArrayList
        }
        
        public void cargarContactosFile(){
            BufferedReader bufferedReader = null;
            BufferedWriter bufferedWriter = null;
            
            try {
                bufferedReader = new BufferedReader(new FileReader(inputfileName));
                bufferedWriter = new BufferedWriter(new FileWriter(outputFileName));
                
                String line;
                while ((line = bufferedReader.readLine()) !=null) {
                    System.out.println(line);
                    arrayContacto = line.split(",");
                    mycontact.put(arrayContacto[0], arrayContacto[1]);
                    }  
                }
                
                catch(IOException e) {
                        System.out.println("IOException catched while reading: " + e.getMessage());
                        }
                finally{
                        try{
                            if (bufferedReader != null) {
                                bufferedReader.close();
                                }
                        }
                        catch(IOException e) {
                        System.out.println("IOException catched while closing: " + e.getMessage());
                        }
                        }
            }
        public void mostrar() {
            for (HashMap.Entry<String,String> entry : mycontact.entrySet()) {
                String key = entry.getKey();
                String value= entry.getValue();
                
                //System.out.println("Listado");
                System.out.println(key+" "+ value);
            }
        }
        public void addContacto(){
             mycontact.put("811555009","Laura Perez");
             System.out.println("Se agrego un contacto nuevo con función AddContacto ");
           
        }
        
        public void actualizarContactosFile(){
            BufferedWriter bufferedWriter = null;
            
            try {
                bufferedWriter = new BufferedWriter (new FileWriter (outputFileName));
                String line;
                for (HashMap.Entry<String,String> entry : mycontact.entrySet()){
                    String key = entry.getKey();
                    String value = entry.getValue();
                    
                    line = key + "," + value;
                    bufferedWriter.write(line + "\n");
                   
                }
            }
            catch(IOException e) {
                System.out.println("IoException catched while reading: " + e.getMessage());
                
            }
            finally {
                try {
                    if (bufferedWriter !=null){
                        bufferedWriter.close();
                        
                    }
                }
                
                catch (IOException e) {
                    System.out.println("IOException carched while closing: " + e.getMessage());
                }
            }
        }
        
        
}
