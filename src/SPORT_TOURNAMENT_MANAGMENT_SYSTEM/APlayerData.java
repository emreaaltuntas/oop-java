package SPORT_TOURNAMENT_MANAGMENT_SYSTEM;

abstract class APlayerData implements IPlayerData {

    @Override
    public void enroll() {
        System.out.println("Information of the enrolled player:");
    }

    @Override
    public void name() {
        System.out.print("Name ");
    }

    @Override
    public void age() {
        System.out.print("Age: ");
    }

    @Override
    public void height() {
        System.out.print("Height: ");
    }

    @Override
    public void weight() {
        System.out.print("Weight: ");
    }

    @Override
    public void gender() {
        System.out.print("Gender: ");
    }

    abstract void complete();

    abstract void showNameInfo();

    abstract void showHeightInfo();

    abstract void showWeightInfo();

    abstract void showGenderInfo();

    abstract void showAgeInfo();

    abstract void showJerseyNumberInfo();

    abstract String getName();

}