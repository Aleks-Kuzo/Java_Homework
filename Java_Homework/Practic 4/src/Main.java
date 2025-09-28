class Main {
    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Моё любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getTemperature() + "°C");
        System.out.println("Описание: " + favorite.getDescription());
        System.out.println();

        Season.print(favorite);
        System.out.println();

        System.out.println("Все времена года: ");
        for (Season season: Season.values()){
            System.out.println("Время года: " + season.name() + ", Средняя температура: " + season.getTemperature() + "°C, " + "Описание: " + season.getDescriptionSummer());
        }
    }

    public class TestShape {
        public static void main(String[] args) {
            // Создаём объекты разных фигур
            Shape circle = new Circle(5.5, "RED", false);
            Shape rectangle = new Rectangle(2.0, 3.0, "BLUE", true);
            Shape square = new Square(4.0, "GREEN", true);

            // Выводим информацию
            System.out.println(circle);
            System.out.println("Площадь: " + circle.getArea());
            System.out.println("Периметр: " + circle.getPerimeter());
            System.out.println();

            System.out.println(rectangle);
            System.out.println("Площадь: " + rectangle.getArea());
            System.out.println("Периметр: " + rectangle.getPerimeter());
            System.out.println();

            System.out.println(square);
            System.out.println("Площадь: " + square.getArea());
            System.out.println("Периметр: " + square.getPerimeter());
        }
    }
}