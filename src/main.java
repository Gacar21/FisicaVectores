import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Scanner;

public class main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("ingrese el componente X: ");
            double x = scanner.nextDouble();

            System.out.print("ingrese el componente Y: ");
            double y = scanner.nextDouble();


            double magnitude = Math.sqrt(x * x + y * y);
            double angle = Math.atan2(y, x);

            System.out.println("Resultante : " + magnitude);
            System.out.println("Angulo: " + Math.toDegrees(angle) + " Grados");


            createVectorVisualization(x, y);
        }

        private static void createVectorVisualization(double x, double y) {

            javax.swing.JFrame frame = new javax.swing.JFrame("Grafica del Vector");
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);


            javax.swing.JPanel panel = new javax.swing.JPanel() {
                protected void paintComponent(java.awt.Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;


                    g2d.setBackground(Color.WHITE);
                    g2d.clearRect(0, 0, getWidth(), getHeight());


                    g2d.setStroke(new BasicStroke(3));


                    g2d.setColor(Color.BLUE);
                    g2d.draw(new Line2D.Double(200, 200, 200 + x * 50, 200 - y * 50));
                }
            };

            frame.add(panel);
            frame.setVisible(true);
        }

}
