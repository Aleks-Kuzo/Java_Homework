import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static int milanScore = 0;
    private static int madridScore = 0;

    private static JLabel resultLabel;
    private static JLabel lastScorerLabel;
    private static JLabel winnerLabel;

    public static void main(String[] args) {
        // Создаём окно
        JFrame frame = new JFrame("Матч: AC Milan vs Real Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 1, 10, 10));

        resultLabel = new JLabel("Result: 0 X 0", JLabel.CENTER);
        lastScorerLabel = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        winnerLabel = new JLabel("Winner: DRAW", JLabel.CENTER);

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorerLabel.setText("Last Scorer: AC Milan");
                updateResultAndWinner();
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                lastScorerLabel.setText("Last Scorer: Real Madrid");
                updateResultAndWinner();
            }
        });

        frame.add(resultLabel);
        frame.add(lastScorerLabel);
        frame.add(winnerLabel);
        frame.add(milanButton);
        frame.add(madridButton);

        frame.setVisible(true);
    }

    private static void updateResultAndWinner() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
}
