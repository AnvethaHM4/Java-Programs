//5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
//display the capital of the countries on console whenever the countries are selected on the list.
//o/p
//Capital of USA is: Washington D.C.
//Capital of India is: New Delhi
//Capital of Vietnam is: Hanoi
//Capital of Denmark is: Copenhagen
//Capital of Africa is: Addis Ababa
//Capital of Japan is: Tokyo
//Capital of Greenland is: Nuuk
//Capital of Singapore is: Singapore
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.HashMap;
import java.util.Map;

public class CountryCapitalList extends JFrame {

    private JList<String> countryList;
    private Map<String, String> capitalMap;

    public CountryCapitalList() {
        // Initialize the capital map
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Addis Ababa");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Create the list model and add countries
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String country : capitalMap.keySet()) {
            listModel.addElement(country);
        }

        // Create the list
        countryList = new JList<>(listModel);

        // Add selection listener to the list
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = countryList.getSelectedValue();
                    if (selectedCountry != null) {
                        String capital = capitalMap.get(selectedCountry);
                        System.out.println("Capital of " + selectedCountry + " is: " + capital);
                    }
                }
            }
        });

        // Add the list to a scroll pane and the frame
        add(new JScrollPane(countryList));

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Country Capital List");
        setSize(200, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}
//5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and display the concerned color whenever the specific tab is selected in the Pan
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class TabbedColorPane extends JFrame {

    public TabbedColorPane() {
        setTitle("Tabbed Color Pane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels with background colors
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        tabbedPane.addTab("Cyan", cyanPanel);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        tabbedPane.addTab("Magenta", magentaPanel);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add a change listener to display the color
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                String colorName = tabbedPane.getTitleAt(selectedIndex);
                System.out.println("Selected color: " + colorName);
            }
        });

        add(tabbedPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedColorPane();
    }
}
