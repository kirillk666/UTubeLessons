/* https://javarush.com/groups/posts/2318-kompiljacija-v-java
1) Компилируем программу
javac src/main/java/BookHorstmann/ResourceTest/ResourceTest.java
Появляется файл ResourceTest.class
2)
jar -cvfe ResourceTest.jar ResourceTest *.class *.jpg *.txt

*/

package BookHorstmann.ResourceTest;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ResourceTest {
    public static void main(String[] args) throws IOException {
        Class<ResourceTest> cl = ResourceTest.class;

        // Load image resource
        URL imageUrl = cl.getResource("/ResourceTest/ozadachennyy-kot-sidit-za-stolom-6.jpg");
        assert imageUrl != null;
        ImageIcon icon = new ImageIcon(imageUrl);

        // Load text resources
        InputStream aboutStream = cl.getResourceAsStream("/ResourceTest/about.txt");
        assert aboutStream != null;
        String about = new String(aboutStream.readAllBytes(), StandardCharsets.UTF_8);

        InputStream titleStream = cl.getResourceAsStream("/ResourceTest/title.txt");
        assert titleStream != null;
        String title = new String(titleStream.readAllBytes(), StandardCharsets.UTF_8).trim();

        // Display message dialog
        JOptionPane.showMessageDialog(null, about, title, JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
