import java.util.HashSet;
import java.util.Locale;

public class Persona {
    public String nombre;
    HashSet<String> hobbies;

    public Persona(String nombre) {
        this.nombre = nombre;
        hobbies = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addHobbie(String hobbie) {
        if (!hobbies.contains(hobbie)) {
            hobbies.add(hobbie.toLowerCase());
        } else {
            System.out.println("Error, el hobbie ya se encuentra en la colección!");
        }
    }

    public boolean tieneHobbie(String hobbie) {
        if(hobbies.contains(hobbie)){
            return true;
        }else {
            return false;
        }
    }

    public String hobbiesToString(){
        return String.valueOf(hobbies);
    }

    public String toString(){
        return "El nombre es: "+nombre+ " y sus hobbies son "+hobbies+".";
    }

}
