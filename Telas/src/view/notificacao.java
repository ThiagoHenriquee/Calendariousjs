/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.awt.AWTException;   
import java.awt.SystemTray;  
import java.awt.Toolkit;  
import java.awt.TrayIcon;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;


/**
 *
 * @author Thiago
 */
public class notificacao {
    
      

    public void initialize() throws IOException {
        //Image trayImage = ImageIO.read(new URL("https://www.freeiconspng.com/uploads/fire-icon-clip-art-photo-22.png"));
        Image trayImage = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/icons/google-plus-logo-1264.png"));
        TrayIcon tray = new TrayIcon(trayImage, "Tray Icon Example");
        SystemTray sysTray = SystemTray.getSystemTray();
        try {
            sysTray.add(tray);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        tray.displayMessage("Atenção!", "Clique aqui para abrir mais detalhes.", TrayIcon.MessageType.WARNING);
    }
  
}
