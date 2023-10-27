import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PetDisplay extends JFrame implements ActionListener {
    private JLabel imageLabel;
    private JRadioButton dogButton, catButton, birdButton, fishButton, reptileButton;

    public PetDisplay() {
        super("Pet Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        // Create radio buttons
        dogButton = new JRadioButton("Dog");
        catButton = new JRadioButton("Cat");
        birdButton = new JRadioButton("Bird");
        fishButton = new JRadioButton("Fish");
        reptileButton = new JRadioButton("Reptile");

        // Add radio buttons to a group
        ButtonGroup group = new ButtonGroup();
        group.add(dogButton);
        group.add(catButton);
        group.add(birdButton);
        group.add(fishButton);
        group.add(reptileButton);

        // Add action listeners to radio buttons
        dogButton.addActionListener(this);
        catButton.addActionListener(this);
        birdButton.addActionListener(this);
        fishButton.addActionListener(this);
        reptileButton.addActionListener(this);

        // Create image label
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add components to content pane
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel radioPanel = new JPanel(new GridLayout(5, 1));
        radioPanel.add(dogButton);
        radioPanel.add(catButton);
        radioPanel.add(birdButton);
        radioPanel.add(fishButton);
        radioPanel.add(reptileButton);
        c.add(radioPanel, BorderLayout.WEST);
        c.add(imageLabel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        // Display image based on selected radio button
        if (e.getSource() == dogButton) {
            imageLabel.setIcon(new ImageIcon("dog.jpg"));
        } else if (e.getSource() == catButton) {
            imageLabel.setIcon(new ImageIcon("cat.jpg"));
        } else if (e.getSource() == birdButton) {
            imageLabel.setIcon(new ImageIcon("bird.jpg"));
        } else if (e.getSource() == fishButton) {
            imageLabel.setIcon(new ImageIcon("fish.jpg"));
        } else if (e.getSource() == reptileButton) {
            imageLabel.setIcon(new ImageIcon("reptile.jpg"));
        }
    }

    public static void main(String[] args) {
        PetDisplay pd = new PetDisplay();
        pd.setVisible(true);
    }
}
