import java.util.Scanner;

class CinemaSeatingTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 5;
        int cols = 6;
        char[][] seats = new char[rows][cols];

    
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = 'O';
            }
        }

        while (true) {
            System.out.println("\n Cinema Seating Tracker");
            System.out.println("1. Display Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displaySeats(seats);
                    break;

                case 2:
                    System.out.print("Enter row (1-" + rows + "): ");
                    int row = scanner.nextInt() - 1;

                    System.out.print("Enter column (1-" + cols + "): ");
                    int col = scanner.nextInt() - 1;

                    if (isValidSeat(row, col, rows, cols)) {
                        if (seats[row][col] == 'O') {
                            seats[row][col] = 'X';
                            System.out.println("Seat booked successfully!");
                        } else {
                            System.out.println("Seat already booked.");
                        }
                    } else {
                        System.out.println("Invalid seat number.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the Cinema Seating Tracker!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void displaySeats(char[][] seats) {
        System.out.println("\n🎬 Cinema Seat Chart (O = Open, X = Booked)");
        System.out.print("    ");
        for (int j = 0; j < seats[0].length; j++) {
            System.out.print((j + 1) + " ");
        }
        System.out.println();

        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isValidSeat(int row, int col, int maxRows, int maxCols) {
        return row >= 0 && row < maxRows && col >= 0 && col < maxCols;
    }
}
