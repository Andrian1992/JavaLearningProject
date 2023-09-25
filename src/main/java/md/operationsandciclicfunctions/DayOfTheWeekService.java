package md.operationsandciclicfunctions;

public class DayOfTheWeekService {

    public static void main(String[] args) {
        //Enter the day name and write in the console the day number


        String nameOfTheDay = "MonDay";
        int numberOfTheDay;

        System.out.println(nameOfTheDay.toUpperCase());

        switch (nameOfTheDay.toUpperCase()){
            case "MONDAY":
                numberOfTheDay = 1;
                System.out.println("A case has been found");
                break;

            case "TUESDAY":
                numberOfTheDay = 2;
                System.out.println("A case has been found");
                break;

            case "WEDNESDAY":
                numberOfTheDay = 3;
                System.out.println("A case has been found");
                break;

            case "THURSDAY":
                numberOfTheDay = 4;
                System.out.println("A case has been found");
                break;

            case "FRIDAY":
                numberOfTheDay = 5;
                System.out.println("A case has been found");
                break;

            case "SATURDAY":
                numberOfTheDay = 6;
                System.out.println("A case has been found");
                break;

            case "SUNDAY":
                numberOfTheDay = 7;
                System.out.println("A case has been found");
                break;

            default:
                numberOfTheDay = 0;
                System.out.println("There is not such a day defined in your programme");

        }

        System.out.println(numberOfTheDay);

    }
}
