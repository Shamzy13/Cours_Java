import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class App extends JFrame {

   
    /**
     * 
     */
    public App(){
        super("Ma Première application");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Changer la taille de la fenetre
        this.setSize(600, 400);

        //this.setLocation(100, 100); // localisation de la fentre
        //Je centre ma fenetre toujours changer la taille de la fenetre avant
        this.setLocationRelativeTo(null); 

        //JFrame frameUser = 

        JPanel contentPane = (JPanel) this.getContentPane();

        // pour éviter que les boutons se chevauchent
        contentPane.setLayout((new FlowLayout()));

        // bouton 1
        JButton btnclick = new JButton("Click");
        contentPane.add(btnclick);

        // bouton 2
        JButton btnclickme = new JButton("Click me");
        contentPane.add(btnclickme);



        // ajout Zone de texte
        // columns = x (changer la longueur du JTextField)
        JTextField username = new JTextField();

        username.setForeground(Color.GRAY);
        username.setText("Username");

          
        
        // définir la taille préférée du JTexteField
        Dimension size = username.getPreferredSize();
        size.width = 150;
        size.height = 25;
        username.setPreferredSize(size);

        contentPane.add(username);

        
        // ajout Zone de texte
        JLabel texte = new JLabel("coucou le texte");
        contentPane.add(texte);

        // ajout d'un bouton quitter
        // création du bouton
        JButton exit = new JButton("Exit");
        //affichage du bouton
        contentPane.add(exit);
        // appel de la méthode pour quitter
        exit.addActionListener(new ActionListener() {

            // Méthode pour quitter 
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(DISPOSE_ON_CLOSE);;
            }
        
            
        });

        


    }

        

    public static void main(String[] args) throws Exception
    {
        // ajouter un look (une apparence)
        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        // start App
        App application = new App();
        application.setVisible(true);
        
    }
    
}
