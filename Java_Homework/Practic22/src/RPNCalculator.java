import java.util.*;

public class RPNCalculator {

    public static double evaluate(String expression) {
        String[] tokens = expression.trim().split("\\s+");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (token.isEmpty()) continue;

            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            }
            else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Ошибка: недостаточно операндов для операции '" + token + "'");
                }
                double b = stack.pop();
                double a = stack.pop();
                double result = applyOperation(a, b, token);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Неизвестный токен: '" + token + "'");
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Ошибка: выражение некорректно (осталось " + stack.size() + " элементов в стеке)");
        }

        return stack.pop();
    }

    private static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    private static double applyOperation(double a, double b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль!");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + op);
        }
    }

    public static void main(String[] args) {
        String[] tests = {
                "2 3 +",
                "2 3 * 4 5 * +",
                "2 3 4 5 6 * + - /",
                "10 2 /",
                "5 1 2 + 4 * + 3 -"
        };

        for (String expr : tests) {
            try {
                double result = evaluate(expr);
                System.out.println("Выражение: " + expr + " Результат: " + result);
            } catch (Exception e) {
                System.out.println("Ошибка в выражении '" + expr + "': " + e.getMessage());
            }
        }

        System.out.println("\nТесты на ошибки");
        String[] errorTests = {
                "1 2 + *",
                "5 +",
                "1 2 3",
                "1 0 /",
                "1 2 &"
        };

        for (String expr : errorTests) {
            try {
                evaluate(expr);
            } catch (Exception e) {
                System.out.println("Поймана ошибка: '" + expr + "' -> " + e.getMessage());
            }
        }
    }
}