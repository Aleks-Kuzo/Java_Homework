public class Stringble implements Interfaceble {

    @Override
    public int count(String s) {
        return s.length();
    }

    @Override
    public String symbols(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String invert(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}