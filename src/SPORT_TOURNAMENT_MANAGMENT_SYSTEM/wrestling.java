package SPORT_TOURNAMENT_MANAGMENT_SYSTEM;

class wrestling extends APlayerData {
    private String name;
    private String gender;
    private double height;
    private double weight;
    private int age;

    public wrestling(String name, String gender, double height, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    void complete() {
        System.out.println("The player has been enrolled for wrestling.");
    }

    @Override
    void showNameInfo() {
        System.out.println("of tennis player is " + this.name + ".");
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
        System.out.println(this.age + " years old.");
    }

    void showJerseyNumberInfo() {
        System.out.println("THERE IS NO JERSEY NUMBER FOR THIS SPORT.");
    }
}