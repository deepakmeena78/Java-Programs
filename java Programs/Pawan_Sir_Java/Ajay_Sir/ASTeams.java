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
        for (int i = 1; i <= planets; i++) {
            System.out.print(this.resource + " : ");
            this.resource = growth * resource;
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
