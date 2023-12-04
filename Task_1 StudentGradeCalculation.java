import java.util.Scanner;

  public class StudentGradeCalculation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of subjects:   ");
            int numSubjects = scanner.nextInt();

            int[] numsubjectMarks = new int[numSubjects];


            for (int j= 0; j < numSubjects; j++) {
                System.out.print("Enter the marks for Each Subject " + (j + 1) + ": ");
                numsubjectMarks[j] = scanner.nextInt();
            }

            int totalMarks = calculatedTotalMarks(numsubjectMarks);

            double averagePercentage = calculatedAveragePercentage( totalMarks,numSubjects);

            char grade = calculatedGrade(averagePercentage);

            System.out.println("\nResults:");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);

        }

        public static int calculatedTotalMarks(int[] subjectMarks) {
            int totalMarks =0;
            for (int marks : subjectMarks) {
                totalMarks += marks;
            }
            return totalMarks;
        }

        public static  double calculatedAveragePercentage(int totalMarks, int numSubjects) {
            return (double)
                    totalMarks / numSubjects;
        }

        public static char calculatedGrade(double averagePercentage) {
            if (averagePercentage >= 90) {
                return 'A';
            } else if (averagePercentage >= 80) {
                return 'B';
            } else if (averagePercentage >= 70) {
                return 'C';
            } else if (averagePercentage >= 60) {
                return 'D';
            } else if  (averagePercentage >= 50) {
                return 'G';
            }
            else {
                return 'F';
            }
        }
    }

