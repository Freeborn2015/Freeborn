package mycodes;

import java.util.Scanner;

public class PollingMain {
    private static PollingExercise pollingExercise = new PollingExercise();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] topics = pollingExercise.getTopics();
        int numberOfTopics = topics.length;
        System.out.println("Welcome to unicorns");
        var response = "yes";
        while (response.equals("yes")){

        for(int index = 1; index < numberOfTopics; index++) {
            System.out.println("rate " + topics[index]);
            int userRatings = scanner.nextInt();
            if (userRatings < 1 || userRatings > 10) throw new UserNoGetSenseException("oga get sense ");
            saveRatings(index, userRatings);


        }
            System.out.println("continue");
        response = scanner.next();
        }
        pollingExercise.displayTabularReport();
        System.out.println();

    }

private static void saveRatings(int issueNumber, int userRating){
        int [][] responseDb = pollingExercise.getResponses();
        responseDb[issueNumber][userRating-1] = responseDb[issueNumber][userRating] + 1;

        }

    }



