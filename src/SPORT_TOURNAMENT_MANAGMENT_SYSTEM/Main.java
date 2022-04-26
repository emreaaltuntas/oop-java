package SPORT_TOURNAMENT_MANAGMENT_SYSTEM;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        APlayerData[] FootballArray = new football[88];
        APlayerData[] VolleyballArray = new volleyball[24];
        APlayerData[] BasketballArray = new basketball[40];
        APlayerData[] TennisArray = new tennis[8];
        APlayerData[] WrestleArray = new wrestling[8];

        int wCnt = 0, tCnt = 0, bCnt = 0, vCnt = 0, fCnt = 0;

        System.out.println("It is enrolled system for a sports tournament.");
        System.out.println("Use the command in parentheses:");
        System.out.println("1 - Add Player (AddPlayer)");
        System.out.println("2 - Display Player Information (PlayerInfo)");
        System.out.println("3 - Display Sport Information (SportInfo)");
        System.out.println("4 - Help (Help)");
        System.out.println("5 - Exit (Exit)");
        System.out.println("** Enter your command! **");

        Scanner scan = new Scanner(System.in);

        String name = new String();
        String surname = new String();
        String gender = new String();
        int age;
        double height;
        double weight;
        int jersey_number;

        String userInput = new String();
        userInput = scan.next();

        boolean cond = false;
        String branch = new String();
        String branch_info = new String();


        while (!(userInput.equalsIgnoreCase("exit"))) {

            if (userInput.equalsIgnoreCase("help")) {
                System.out.println("It is enrolled system for a sports tournament.");
                System.out.println("Use the command in parentheses:");
                System.out.println("1 - Add Player (AddPlayer)");
                System.out.println("2 - Display Player Information (PlayerInfo)");
                System.out.println("3 - Display Sport Information (SportInfo)");
                System.out.println("4 - Help (Help)");
                System.out.println("5 - Exit (Exit)");
            } else if (userInput.equalsIgnoreCase("addplayer")) {
                System.out.println("Branches are: ");
                System.out.println("1 - Football");
                System.out.println("2 - Basketball");
                System.out.println("3 - Volleyball");
                System.out.println("4 - Tennis");
                System.out.println("5 - Wrestling");
                System.out.println("Enter the sport's name you want to be register: ");

                while (true) {
                    branch = scan.next();

                    if (branch.equalsIgnoreCase("football")) {
                        if (fCnt >= 40) {
                            System.out.println("Football registrations are full.");
                            break;
                        }
                        System.out.print("Enter gender: ");
                        gender = scan.next();
                        System.out.print("Enter name and surname: ");
                        name = scan.next();
                        surname = scan.next();
                        name = name + " " + surname;
                        System.out.print("Enter age: ");
                        age = scan.nextInt();
                        System.out.print("Enter height (cm): ");
                        height = scan.nextDouble();
                        System.out.print("Enter weight (kg): ");
                        weight = scan.nextDouble();
                        System.out.print("Enter jersey number: ");
                        jersey_number = scan.nextInt();

                        FootballArray[fCnt] = new football(name, gender, height, weight, age, jersey_number);
                        FootballArray[fCnt].complete();
                        System.out.println("");
                        fCnt++;
                        break;
                    } else if (branch.equalsIgnoreCase("basketball")) {
                        if (bCnt >= 40) {
                            System.out.println("Basketball registrations are full.");
                            break;
                        }
                        System.out.print("Enter gender: ");
                        gender = scan.next();
                        System.out.print("Enter name and surname: ");
                        name = scan.next();
                        surname = scan.next();
                        name = name + " " + surname;
                        System.out.print("Enter age: ");
                        age = scan.nextInt();
                        System.out.print("Enter height (cm): ");
                        height = scan.nextDouble();
                        System.out.print("Enter weight (kg): ");
                        weight = scan.nextDouble();
                        System.out.print("Enter jersey number: ");
                        jersey_number = scan.nextInt();

                        BasketballArray[bCnt] = new basketball(name, gender, height, weight, age, jersey_number);
                        BasketballArray[bCnt].complete();
                        System.out.println("");
                        bCnt++;
                        break;
                    } else if (branch.equalsIgnoreCase("volleyball")) {
                        if (vCnt >= 24) {
                            System.out.println("Volleyball registrations are full.");
                            break;
                        }
                        System.out.print("Enter gender: ");
                        gender = scan.next();
                        System.out.print("Enter name and surname: ");
                        name = scan.next();
                        surname = scan.next();
                        name = name + " " + surname;
                        System.out.print("Enter age: ");
                        age = scan.nextInt();
                        System.out.print("Enter height (cm): ");
                        height = scan.nextDouble();
                        System.out.print("Enter weight (kg): ");
                        weight = scan.nextDouble();
                        System.out.print("Enter jersey number: ");
                        jersey_number = scan.nextInt();

                        VolleyballArray[vCnt] = new volleyball(name, gender, height, weight, age, jersey_number);
                        VolleyballArray[vCnt].complete();
                        System.out.println("");
                        vCnt++;
                        break;

                    } else if (branch.equalsIgnoreCase("tennis")) {
                        if (tCnt >= 8) {
                            System.out.println("Tennis registrations are full.");
                            break;
                        }
                        System.out.print("Enter gender: ");
                        gender = scan.next();
                        System.out.print("Enter name and surname: ");
                        name = scan.next();
                        surname = scan.next();
                        name = name + " " + surname;
                        System.out.print("Enter age: ");
                        age = scan.nextInt();
                        System.out.print("Enter height (cm): ");
                        height = scan.nextDouble();
                        System.out.print("Enter weight (kg): ");
                        weight = scan.nextDouble();

                        TennisArray[tCnt] = new tennis(name, gender, height, weight, age);
                        TennisArray[tCnt].complete();
                        System.out.println("");
                        tCnt++;
                        break;

                    } else if (branch.equalsIgnoreCase("wrestling")) {
                        if (wCnt >= 8) {
                            System.out.println("Wrestling registrations are full.");
                            break;
                        }
                        System.out.print("Enter gender: ");
                        gender = scan.next();
                        System.out.print("Enter name and surname: ");
                        name = scan.next();
                        surname = scan.next();
                        name = name + " " + surname;
                        System.out.print("Enter age: ");
                        age = scan.nextInt();
                        System.out.print("Enter height (cm): ");
                        height = scan.nextDouble();
                        System.out.print("Enter weight (kg): ");
                        weight = scan.nextDouble();

                        WrestleArray[wCnt] = new wrestling(name, gender, height, weight, age);
                        WrestleArray[wCnt].complete();
                        System.out.println("");
                        System.out.println("** Enter new command! **");
                        wCnt++;
                        break;

                    } else {
                        System.out.print("Unvalid branch name!" + "Enter branch's name again: ");
                    }
                }
            } else if (userInput.equalsIgnoreCase("playerinfo")) {
                System.out.println("Enter the name & surname of the player: ");
                name = scan.next();
                surname = scan.next();
                name = name + " " + surname;

                for (int i = 0; i <= 40; i++) {
                    if (fCnt > i && name.equalsIgnoreCase(FootballArray[i].getName())) {
                        System.out.println("Branch: Football");
                        FootballArray[i].name();
                        FootballArray[i].showNameInfo();
                        FootballArray[i].gender();
                        FootballArray[i].showGenderInfo();
                        FootballArray[i].age();
                        FootballArray[i].showAgeInfo();
                        FootballArray[i].height();
                        FootballArray[i].showHeightInfo();
                        FootballArray[i].weight();
                        FootballArray[i].showWeightInfo();
                        System.out.print("Jersey number of football player is: ");
                        FootballArray[i].showJerseyNumberInfo();
                        cond = true;
                        System.out.println("");
                        break;
                    } else if (bCnt > i && name.equalsIgnoreCase(BasketballArray[i].getName())) {
                        System.out.println("Branch: Basketball");
                        BasketballArray[i].name();
                        BasketballArray[i].showNameInfo();
                        BasketballArray[i].gender();
                        BasketballArray[i].showGenderInfo();
                        BasketballArray[i].age();
                        BasketballArray[i].showAgeInfo();
                        BasketballArray[i].height();
                        BasketballArray[i].showHeightInfo();
                        BasketballArray[i].weight();
                        BasketballArray[i].showWeightInfo();
                        System.out.print("Jersey number of basketball player is ");
                        BasketballArray[i].showJerseyNumberInfo();
                        cond = true;
                        System.out.println("");
                        break;
                    } else if (vCnt > i && name.equalsIgnoreCase(VolleyballArray[i].getName())) {
                        System.out.println("Branch: Volleyball");
                        VolleyballArray[i].name();
                        VolleyballArray[i].showNameInfo();
                        VolleyballArray[i].gender();
                        VolleyballArray[i].showGenderInfo();
                        VolleyballArray[i].age();
                        VolleyballArray[i].showAgeInfo();
                        VolleyballArray[i].height();
                        VolleyballArray[i].showHeightInfo();
                        VolleyballArray[i].weight();
                        VolleyballArray[i].showWeightInfo();
                        System.out.print("Jersey number of volleyball player is ");
                        VolleyballArray[i].showJerseyNumberInfo();
                        cond = true;
                        System.out.println("");
                        break;
                    } else if (tCnt > i && name.equalsIgnoreCase(TennisArray[i].getName())) {
                        System.out.println("Branch: Tennis");
                        TennisArray[i].name();
                        TennisArray[i].showNameInfo();
                        TennisArray[i].gender();
                        TennisArray[i].showGenderInfo();
                        TennisArray[i].age();
                        TennisArray[i].showAgeInfo();
                        TennisArray[i].height();
                        TennisArray[i].showHeightInfo();
                        TennisArray[i].weight();
                        TennisArray[i].showWeightInfo();
                        cond = true;
                        System.out.println("");
                        break;
                    } else if (wCnt > i && name.equalsIgnoreCase(WrestleArray[i].getName())) {
                        System.out.println("Branch: Wrestling");
                        WrestleArray[i].name();
                        WrestleArray[i].showNameInfo();
                        WrestleArray[i].gender();
                        WrestleArray[i].showGenderInfo();
                        WrestleArray[i].age();
                        WrestleArray[i].showAgeInfo();
                        WrestleArray[i].height();
                        WrestleArray[i].showHeightInfo();
                        WrestleArray[i].weight();
                        WrestleArray[i].showWeightInfo();
                        cond = true;
                        System.out.println("");
                        break;
                    }
                }

                if (!cond) {
                    System.out.println("There is no player referred to this name!");
                }

            } else if (userInput.equalsIgnoreCase("sportinfo")) {
                System.out.println("Which branch do you want to information about?:");
                System.out.println("1 - Football");
                System.out.println("2 - Basketball");
                System.out.println("3 - Volleyball");
                System.out.println("4 - Tennis");
                System.out.println("5 - Wrestling");
                System.out.println("Enter the name of the sport: ");
                branch_info = scan.next();
                while (true) {
                    if (branch_info.equalsIgnoreCase("football")) {
                        System.out.println("In football, maximum number of players are 40.");
                        System.out.println("Total number of registered players are: " + fCnt + ".");
                        System.out.println("");
                        break;
                    } else if (branch_info.equalsIgnoreCase("basketball")) {
                        System.out.println("In basketball, maximum number of players are 40.");
                        System.out.println("Total number of registered players are: " + bCnt + ".");
                        System.out.println("");
                        break;
                    } else if (branch_info.equalsIgnoreCase("volleyball")) {
                        System.out.println("In voleyball, maximum number of player is 24.");
                        System.out.println("Total number of registered players are: " + vCnt + ".");
                        System.out.println("");
                        break;
                    } else if (branch_info.equalsIgnoreCase("tennis")) {
                        System.out.println("In tennis, maximum number of player is 8.");
                        System.out.println("Total number of registered players are: " + tCnt + ".");
                        System.out.println("");
                        break;
                    } else if (branch_info.equalsIgnoreCase("wrestling")) {
                        System.out.println("In wrestling, maximum number of player is 8.");
                        System.out.println("Total number of registered players are: " + wCnt + ".");
                        System.out.println("");
                        break;
                    } else {
                        System.out.println("Unrecognized command!");
                        System.out.println("** Enter new command! **");
                    }
                }

            } else {
                System.out.println("Unrecognized command!");

            }
            System.out.println("** Enter new command! **");
            userInput = scan.next();
        }
        System.out.println("Exiting...");


        scan.close();
    }
}
