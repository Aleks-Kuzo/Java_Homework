import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPNCalculatorGUI extends JFrame {
    private JTextField inputField;
    private JTextArea outputArea;

    public RPNCalculatorGUI() {
        setTitle("RPN Калькулятор");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        inputField = new JTextField();
        add(new JLabel("Введите выражение в ОПН (через пробелы):"), BorderLayout.NORTH);
        add(inputField, BorderLayout.CENTER);

        JButton calcButton = new JButton("Вычислить");
        add(calcButton, BorderLayout.SOUTH);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.EAST);

        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expr = inputField.getText();
                try {
                    double result = RPNCalculator.evaluate(expr);
                    outputArea.setText("Результат: " + result);
                } catch (Exception ex) {
                    outputArea.setText("Ошибка: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RPNCalculatorGUI().setVisible(true);
        });
    }
}