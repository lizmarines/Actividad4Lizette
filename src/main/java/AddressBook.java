
public class AddressBook {

    static AdminAgenda contactos = new AdminAgenda();
    
    public static void main(String[] args) {
        contactos.cargarContactosFile();
        contactos.mostrar();
        contactos.addContacto();
        contactos.mostrar();
        contactos.actualizarContactosFile();
    }
    
}
