package model;

import controller.Persiste;
import java.util.List;

public class Turma implements Persiste {
    private int matricula;
    private int sala;
    private String turma;
    
    
   

    @Override
    public int getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(int codigo) {
        this.matricula = codigo;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Turma{" + "codigo=" + matricula + ", sala=" + sala + ", turma=" + turma + '}';
    }

    
    
}
