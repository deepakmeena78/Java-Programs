import java.util.Scanner;

abstract class Series {
    abstract public void nextTerm();
}

class GeometricSeries extends Series {
    int resource;
    int growth;
    int planets;

    public GeometricSeries(int resource, int growth, int planets) {
        this.resource = resource;
        this.growth = growth;
        this.planets = planets;
    }

    public void nextTerm() {
        if (resource >= 1 || resource <= 10 && growth >= 1 || growth <= 10 && planets >= 1 || planets <= 10) {
            int temp = resource * growth;
            int temp2 = growth * temp;
            int temp3 = resource * temp2;

            System.out.println(resource + " : " + temp + " : " + temp2 + " : " + temp3);
        } else {
            System.out.println("Invalid number of planets! Please enter a value between 1 and 8.");
        }
    }
}

public class ASTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Under => 1 <= n , n <= 10");
        System.out.println("Enter Initial Resource Level : ");
        int resource = sc.nextInt();

        System.out.println("Enter Growth Ratio : ");
        int growth = sc.nextInt();

        System.out.println("Enter Number of Planets : ");
        int planets = sc.nextInt();

        GeometricSeries g = new GeometricSeries(resource, growth, planets);
        g.nextTerm();
    }
}
