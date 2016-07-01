package controller;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import model.Professor;

public class ProfessorController {
    private List<Professor> professores;
    private final ArrayList<Object> professor;
     public ProfessorController() {
        this.professor = new ArrayList<>(0);
    }
    public void create (Professor professor){
        professores.add(professor);
    }
    public List<Professor> findALL(){
        return professores;
    } 
    public Professor findById(int matricula){
        Professor professor = new Professor();
        professor = null;
        for (Professor a : professores){
            if (a.getMatricula() == matricula){
            professor = a;
            break;
            }
        }
        return professor;
    } 
    
    public void update(Professor professor){
        for (Professor a : professores){
            if(a.getMatricula() == professor.getMatricula()){
                a.setNome(professor.getNome());
                a.setDisciplina(professor.getDisciplina());
                break;
            }
        }
    }
  
    public void delete(Professor professor){
        professores.remove(professor);
    }
}
