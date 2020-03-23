import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

public class tableTest {

    JFrame f;

    JTable j;

    tableTest() {
        f = new JFrame();

        f.setTitle("Wave Calculations");

        String [][] data = {{"9.8", "5.13e-3", "43.71", "12.5", "3.497", "1"}, {"4.9", "5.13e-3", "30.91", "12.5", "2.472", ".5"}};

        String[] columnNames = {"force (N)", "mu", "velocity (m/s)", "frequency", "wavelength (m)", "mass (kg)" };

        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 5000, 7000);

        JScrollPane sp = new JScrollPane(j);
        f.add(sp);

        f.setSize(25, 25);

        f.setVisible(true);
    }




    public static void main(String[]args) {
        new tableTest();
    }


}