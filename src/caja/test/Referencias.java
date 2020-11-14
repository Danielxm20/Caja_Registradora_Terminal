package caja.test;

public class Referencias {

    public static void main(String args[]) {
        Persona persona = new Persona();
        persona.nombre = "Ximena";
        persona.edad = 1;

        Persona segundaPersona = new Persona();
        try {
            segundaPersona = persona.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
       // segundaPersona.nombre = "Melissa";
        //segundaPersona.edad = 0;

        System.out.println(persona.nombre);
        System.out.println(persona.edad);
        System.out.println(segundaPersona.nombre);
        System.out.println(segundaPersona.edad);


    }
}
