/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perbankanextendmaven.View;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import com.mycompany.perbankanextendmaven.Entity.*;
import com.mycompany.perbankanextendmaven.View.*;

/**
 *
 * @author Dukhaan
 */


public class DatabaseService {
    private static Bank bank;

    public static Bank getBank() {
        if (bank == null) {
            bank = new Bank();
        }
        return bank;
    } 
}
