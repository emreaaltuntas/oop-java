package SPORT_TOURNAMENT_MANAGMENT_SYSTEM;

class volleyball extends APlayerData {

    private String name;
    private String gender;
    private double height;
    private double weight;
    private int age;
    private int jersey_number;

    public volleyball(String name, String gender, double height, double weight, int age, int jersey_number) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.jersey_number = jersey_number;
    }

    public volleyball(String name, String gender, double height, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public void setjersey(int jersey_number) {
        this.jersey_number = jersey_number;
    }

    public int getjersey() {
        return jersey_number;
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    void complete() {
        System.out.println("The player has been enrolled for volleyball.");
    }

    @Override
    void showNameInfo() {
        System.out.println("of volleyball player is " + this.name + ".");
    }

    @Override
    void showHeightInfo() {
        System.out.println(this.height + " cm");
    }

    @Override
    void showWeightInfo() {
        System.out.println(this.weight + " kg");

    }

    @Override
    void showGenderInfo() {
        System.out.println(this.gender);
    }

    @Override
    void showAgeInfo() {
        System.out.println(this.age + " years old");
    }

    @Override
    void showJerseyNumberInfo() {
        System.out.println(getjersey());
    }
}
