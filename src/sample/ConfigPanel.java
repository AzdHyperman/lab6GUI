package sample;

import javax.swing.*;

public class ConfigPanel extends JPanel {
    private final MainFrame frame;
    private JLabel label; // we’re drawing regular polygons
    private JLabel labelColor;
    private JSpinner sidesField; // number of sides
    private JComboBox colorCombo; // the color of the shape

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        //create the label and the spinner
        setLabel(new JLabel("Number of sides:"));
        setSidesField(new JSpinner(new SpinnerNumberModel(0, 0, 100, 1)));
        getSidesField().setValue(6); //default number of sides
        //create the colorCombo, containing the values: Random and Black

        //...TODO
         setLabelColor(new JLabel("Color: "));
setColorCombo(new JComboBox());
getColorCombo().setPrototypeDisplayValue("TEXT");
getColorCombo().setSize(400,400);
        add(getLabel()); //JPanel uses FlowLayout by default
        add(getLabelColor());
        add(getSidesField());
        add(getColorCombo());

    }

    public MainFrame getFrame() {
        return frame;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JLabel getLabelColor() {
        return labelColor;
    }

    public void setLabelColor(JLabel labelColor) {
        this.labelColor = labelColor;
    }

    public JSpinner getSidesField() {
        return sidesField;
    }

    public void setSidesField(JSpinner sidesField) {
        this.sidesField = sidesField;
    }

    public JComboBox getColorCombo() {
        return colorCombo;
    }

    public void setColorCombo(JComboBox colorCombo) {
        this.colorCombo = colorCombo;
    }
}
