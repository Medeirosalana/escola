package model;

import controller.Persiste;

public class Professor extends Pessoa  implements Persiste {
    private int matricula;   
    private String disciplina;
    

    @Override
    public int getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
   
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" + "matricula= " + matricula + 
                ", nome= " + super.getNome() 
                + ", disciplina= " + disciplina +
                ", idade= " + super.getIdade() + '}';
    }   

  
    
}
