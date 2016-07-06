package controller;

import model.Aluno;



public class AlunoController extends GenericoController<Aluno>{

    @Override
    public Class<Aluno> getClassType() {
        return Aluno.class;    
    }
    
}
