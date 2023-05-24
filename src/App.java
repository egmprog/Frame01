
//librerías
import javax.swing.*; //para los frames y layouts
import java.awt.*;
import java.awt.event.*; //para interactuar con los objetos incluidos en el layout

public class App extends JFrame {

    // definición de los objetos que se contendran en el layout
    private static JLabel directionsLabel = new JLabel("Ingrese su nombre");
    private static JLabel outputJLabel = new JLabel();
    private static JTextField nameBox = new JTextField(25);
    private static JButton nameButton = new JButton("Guardar");

    public static void main(String[] args) throws Exception {
        // construcción de la ventana emergente
        App window = new App();
        window.setSize(500, 500); // tamaño de la ventana
        window.setVisible(true); // hacer visible la ventana
        window.setTitle("Título de la ventana");
        window.setLayout(new FlowLayout()); // diseño de flujo para el layout (existen otros diseños posibles)

        // agregar contenido (Swing) a la ventana
        window.getContentPane().add(directionsLabel);
        window.getContentPane().add(nameBox);
        window.getContentPane().add(nameButton);
        window.getContentPane().add(outputJLabel);

        // controladores de acciones (listener)
        nameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClick(e); // función del evento
            }
        });

        // indicación que cuando se cierra la ventana emergente se detenga el programa
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // función para la acción del boton del layout (Fuera del Main)
    public static void buttonClick(ActionEvent e) {
        // acciones del boton

        // relacion entre lo ingresado en los controles de la ventana y unas variables
        // por definir
        String yourname = nameBox.getText();
        String outputMessage = "Hola " + yourname;
        // muestra una leyenda
        outputJLabel.setText(outputMessage);

        // muestra un cuadro de diálogo emergente (JOptionPane)
        JOptionPane.showMessageDialog(null, "Mensaje", "Hola", JOptionPane.INFORMATION_MESSAGE);
    }

}
