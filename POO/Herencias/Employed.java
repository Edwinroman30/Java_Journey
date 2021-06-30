package POO.Herencias;

public class Employed extends Person{
    
    private double salary;

    public Employed(int id, String nombre, int edad, char sexo,double salary)
    {
        super(id, nombre, edad, sexo);
        this.salary = salary;
    }

    public void working(){
        System.out.println("I'm working");
    }

    public String presentation(){
        return "Hi, my name is " + this.nombre + ", I'm " +this.edad + " and on this confuses world... my gender is "+ this.sexo + " and got an interesting job where I make " + this.salary;
    }


}
