
public class Main {
    public static void main(String[] args) {
        Member man1 = new Member("Ivan", 500);
        Member man2 = new Member("Egor", 350);
        Member man3 = new Member("Ilya", 300);
        Member man4 = new Member("Aleksander", 299);
        Team team = new Team("Ну чё, пацаны, Аниме?!", man1, man2, man3, man4);


        Course course = new Course(310, 100, 299);
        team.showAllmambers();
        System.out.println();
        course.doIt(team);
        team.showAllmambers();
    }
}


