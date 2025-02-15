package MingguKelima;

import java.awt.*;
import java.applet.*;

public class WSIB_Week5_1_1 extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;

    public void init() {
        // The Font is Arial, size 18 and is Italicized
        font = new Font("Arial", Font.ITALIC, 18);

        // Some colors are predefined in the Color class
        redColor = Color.red;
        backgroundColor = Color.orange;

        // Colors can be created using Red, Green, Blue values
        blueColor = new Color(0, 0, 122);

        // Set the background color of the applet
        setBackground(backgroundColor);
    }

    public void stop() {
    }

    /**
     * This method paints the shapes to the screen
     */
    public void paint(Graphics graph) {
        // Set font
        graph.setFont(font);

        // Create a title
        graph.drawString("Draw Shapes", 50, 20);

        // Set the color for shapes
        graph.setColor(redColor);

        // Draw a rectangle
        graph.drawRect(110, 10, 50, 100);

        // Fill the rectangle
        graph.fillRect(110, 10, 50, 100);

        // Draw an arc
        graph.setColor(blueColor);
        graph.fillArc(110, 50, 50, 50, 0, 360);

        // Draw another rectangle
        graph.setColor(Color.CYAN);
        graph.drawRect(50, 50, 50, 50);

        // Fill the rectangle
        graph.fillRect(50, 50, 50, 50);
    }
}


// Penjelasan Output:
// Ketika kode ini dijalankan, outputnya akan berupa tampilan grafis yang digambar pada sebuah Applet dengan latar belakang berwarna oranye. Elemen yang muncul adalah:

// Tulisan "Draw Shapes" di posisi (50,20) dengan font Arial, ukuran 18, dan italic.
// Sebuah persegi panjang merah di posisi (110,10) dengan ukuran 50x100.
// Lingkaran biru (arc 360 derajat, jadi menjadi lingkaran penuh) di posisi (110,50) dengan ukuran 50x50.
// Persegi cyan (biru kehijauan) di posisi (50,50) dengan ukuran 50x50 yang diisi penuh.







