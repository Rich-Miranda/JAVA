/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojainformatica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author R I C H
 */
public class ComputadorDAO {

    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "Rich";
    static String senha = "Rdzin.s7";

    public static boolean salvar(Computador novoCompu) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            comandoSQL = conexao.prepareStatement("INSERT INTO Computador (");
        } catch (ClassNotFoundException ex) {
            retorno = false;

        } catch (SQLException ex) {
        retorno = false;
        }
        return retorno;
    }
}
