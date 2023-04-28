/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.consummigrest;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author ro
 */
@SpringBootApplication(scanBasePackages = "com.mycompany.inventory")
public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI().setVisible(true);
            }
        });

    }

}
