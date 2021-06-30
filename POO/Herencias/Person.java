package POO.Herencias;

public class Person {
    public int id;
    public String nombre;
    public int edad;
    public char sexo;

    public Person(int id, String nombre,int edad, char sexo){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

        System.out.println("I'm a human.");
    }

    public void speak(){
        System.out.println("I'm talking");
    }
}
