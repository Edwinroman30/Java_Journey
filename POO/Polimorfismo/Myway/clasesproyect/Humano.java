/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesproyect;

/**
 *
 * @author Edmain
 */
public class Humano {
    
    private String nombre;
    private char sexo;
    private int edad;
    
    public Humano(){}
    
    public Humano(String nombre,char sexo, int edad){
     this.setNombre(nombre);
     this.setEdad(edad);
     this.setSexo(sexo);
    } 
   
    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        if((nombre).length() < 2){
            nombre = "";
        }else{
            this.nombre = nombre;
        }
    }

    public void setSexo(char sexo) {
        if(sexo == 'm' || sexo == 'f')
        {
            this.sexo = sexo;
        }
    }
    public void setEdad(int edad) {
        if(edad < 0){
            
        }else{
            this.edad = edad;
        }
    }
    
    @Override
    public String toString(){
        return "Mi nombre es: " + this.nombre + ", tengo " + this.edad + " y pertenezco al genero "+this.sexo;
    }
     
}
