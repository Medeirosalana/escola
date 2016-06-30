package controller;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;

public class AlunoController {
     private List<Aluno> alunos;

    public AlunoController() {
        this.alunos = new ArrayList<>(0);
    }
    public void create (Aluno aluno){
        alunos.add(aluno);
    }
    public List<Aluno> findALL(){
        return alunos;
    } 
    public Aluno findById(int matricula){
        Aluno aluno = new Aluno();
        aluno = null;
        for (Aluno a : alunos){
            if (a.getMatricula() == matricula){
            aluno = a;
            break;
            }
        }
        return aluno;
    } 
    
    public void update(Aluno aluno){
        for (Aluno a : alunos){
            if(a.getMatricula() == aluno.getMatricula()){
                a.setNome(aluno.getNome());
                a.setIdade(aluno.getIdade());
                break;
            }
        }
    }
  
    public void delete(Aluno aluno){
        alunos.remove(aluno);
    }
}
