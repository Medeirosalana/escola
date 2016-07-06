package controller;

import model.Professor;

public class ProfessorController extends GenericoController<Professor> {

    @Override
    public Class<Professor> getClassType() {
        return Professor.class;
    }
       
}
