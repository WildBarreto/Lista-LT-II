/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author analu
 */
public abstract class Usuario {
    public String nome;
    public String id;
    public List<Livro> Emprestados;
    
    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.Emprestados = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<Livro> getEmprestados() {
        return Emprestados;
    }

    public void devolver(Livro livro) {
        Emprestados.remove(livro);
        livro.devolver();
    }

    public abstract boolean permitir();
    
    public void emprestar(Livro livro) {
        Emprestados.add(livro);
        livro.emprestar();
    }
}
