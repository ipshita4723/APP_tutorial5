import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Candidate {
    int candidate_Id;
    String name;
    int aptitude;
    int technical;
    int communication;

    public Candidate(int candidate_Id, String name, int aptitude, int technical, int communication) {
        this.candidate_Id = candidate_Id;
        this.name = name;
        this.aptitude = aptitude;
        this.technical = technical;
        this.communication = communication;
    }

    public int getTotalScore() {
        return aptitude + technical + communication;
    }
}

public class CampusPlacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Candidate[] candidates = new Candidate[n];

        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            int apt = scanner.nextInt();
            int tech = scanner.nextInt();
            int comm = scanner.nextInt();
            candidates[i] = new Candidate(id, name, apt, tech, comm);
        }

        Arrays.sort(candidates, new Comparator<Candidate>() {
           
            public int compare(Candidate c1, Candidate c2) {
                int score1 = c1.getTotalScore();
                int score2 = c2.getTotalScore();
                if (score1 != score2) {
                    return Integer.compare(score2, score1);
                }
                return Integer.compare(c1.candidate_Id, c2.candidate_Id);
            }
        });

        for (int i = 0; i < k; i++) {
            System.out.println(candidates[i].candidate_Id + " " + candidates[i].name + " " + candidates[i].getTotalScore());
        }

        scanner.close();
    }
}