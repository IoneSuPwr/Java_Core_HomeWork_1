public class Member {
    String name;
    boolean isWinner;
    int maxRunDistance;

    public Member(String name, int maxRDist) {
        this.name = name;
        this.maxRunDistance = maxRDist;
        isWinner = false;
    }
    @Override
    public String toString() {
        return "[ Имя " + name + "/ Расстояние " + maxRunDistance +" / Результат = "+ isWinner +"]";
    }
}
