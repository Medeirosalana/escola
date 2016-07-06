package controller;

import model.Turma;

public class TurmaController extends GenericoController<Turma>{

    @Override
    public Class<Turma> getClassType() {
        return Turma.class;
    }
    
}
