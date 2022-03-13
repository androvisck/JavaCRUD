package br.com.agenda.aplicacao;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException {

        ContatoDAO contatoDAO = new ContatoDAO();

        /*
        // Adição de contato no BD
        Contato contato = new Contato();
        contato.setNome("Apolinário Pitomba");
        contato.setIdade(25);
        contato.setDataCadastro(new Date());

        contatoDAO.save(contato);
        */


        // Atualizar um registro no BD
        Contato c1 = new Contato();
        c1.setNome("Birimbolo de Souza");
        c1.setIdade(39);
        c1.setDataCadastro(new Date());
        c1.setId(5);

        contatoDAO.update(c1);


        // Apagar um registro no BD
        contatoDAO.deleteById(3);


        // Visualizar todos registros no BD
        for (Contato c : contatoDAO.getContatos()) {
            System.out.println(c.getId() + " - Contato no BD: " +c.getNome());
        }
    }
}
