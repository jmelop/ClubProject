import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Club {
    ArrayList<Persona> personas = new ArrayList<>();

    public Club(){ }

    public void addPersona(String nombre, HashSet<String> hob){
        Persona persona = new Persona(nombre);
        Iterator<String> iter = hob.iterator();

        while (iter.hasNext()){
            persona.addHobbie(iter.next());
        }
        personas.add(persona);
        System.out.println(personas.get(0).getNombre());
    }

    public int personasConHobbies(String cual){
        Iterator<Persona> it = personas.iterator();
        int i = 0;

        while (it.hasNext()){
            Persona persona = it.next();
            if(persona.hobbies.contains(cual)){
                i += 1;
            }
        }
        return i;
    }

    public HashSet<String> borrarPersonasConHobbies(String hobbie){
        Iterator<Persona> iterator = personas.iterator();
        HashSet<String> personasBorradas = new HashSet<>();

        while (iterator.hasNext()){
            Persona pt = iterator.next();
            if (pt.tieneHobbie(hobbie)){
                personasBorradas.add(pt.toString());
                personas.remove(pt);
            }
        }
        return personasBorradas;
    }

    public void printClub(){
        for (Persona pesona: personas){
            System.out.println(pesona);
        }
    }
}
