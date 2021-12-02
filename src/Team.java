import java.sql.SQLOutput;

public class Team {
    String name;
    Member[] members = new Member[4];

    public Team(String name, Member man1, Member man2, Member man3, Member man4) {
        this.name = name;
        members[0] = man1;
        members[1] = man2;
        members[2] = man3;
        members[3] = man4;
    }
    public  void showAllmambers() {
        for (Member man: members) {
            System.out.println(man);

        }
    }
}
