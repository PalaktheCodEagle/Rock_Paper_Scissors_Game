import java.util.*;

    public class RockPaperScissor {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("WELCOME TO ROCK-PAPER-SCISSORS GAME!!!");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

            System.out.println("You know the rules......");
            System.out.println("Rock, Paper, Scissor");
            System.out.println("Let's Begin");
            System.out.println("------------------------------------------------");
            System.out.println("------------------------------------------------");

            String[] options = {"Rock", "Paper", "Scissor"};
            String userChoice, computerChoice;
            int valChoice;
            int totalPoints = 5;
            int userPoint = 0, computerPoint = 0;

            for (int i = 0; i < 5; i++) {

                System.out.print("Enter your choice user: ");
                userChoice = scanner.nextLine();

                Random random = new Random();
                valChoice = random.nextInt(options.length);
                computerChoice = options[valChoice];

//                int totalPoints = 5;
//                int userPoint = 0, computerPoint = 0;

                if (userChoice.equalsIgnoreCase(computerChoice)
                ) {
                    System.out.println("User: " + userChoice + " x Computer: " + computerChoice);
                    System.out.println("Its a DRAW!!!!!!!");
                    System.out.println();
                } else if (
                        userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissor") ||
                        userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock") ||
                        userChoice.equalsIgnoreCase("Scissor") && computerChoice.equalsIgnoreCase("Paper")
                ) {
                    System.out.println("User: " + userChoice + " x Computer: " + computerChoice);
                    System.out.println("User gets the point.......");
                    userPoint++;
                    System.out.println();
                } else if (
                        userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Paper") ||
                        userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Scissor") ||
                        userChoice.equalsIgnoreCase("Scissor") && computerChoice.equalsIgnoreCase("Rock")
                ) {
                    System.out.println("User: " + userChoice + " x Computer: " + computerChoice);
                    System.out.println("Computer gets the point");
                    computerPoint++;
                    System.out.println();
                } else if (
                        userChoice.isBlank()
                ) {
                    System.out.println("User didn't enter any choice!!!!!");
                    System.out.println();
                } else if (
                        !userChoice.startsWith("r") || !userChoice.startsWith("p") || !userChoice.startsWith("s")
                ) {
                    System.out.println("Wrong Input!!!!");
                    System.exit(0);
                }

            }
            System.out.println("---------------------------------------");
            System.out.println("SCORE!!!!!");
            System.out.println("---------------------------------------");
            System.out.println("User: " + userPoint);
            System.out.println("Computer: " + computerPoint);
            System.out.println();

            if (userPoint > computerPoint) {
                System.out.println("USER WINS!!!!!!!");
            } else if (userPoint == computerPoint) {
                System.out.println("ITS A DRAW!!!!!!");
            } else {
                System.out.println("COMPUTER WINS!!!!!!!");
            }

            scanner.close();
        }

    }