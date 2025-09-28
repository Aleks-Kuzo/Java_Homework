public enum Season{
    WINTER(-25),
    SPRING(15),
    SUMMER(30),
    AUTUMN(10);

    private final int temperature;

    Season(int temperature){
        this.temperature = temperature;
    }

    public String getDescription(){
        return "Холодное время года";
    }

    public String getDescriptionSummer(){
        if (this == SUMMER){
            return "Теплое время года";
        }
        else{
            return getDescription();
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public static void print (Season season) {
        switch (season){
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}
