package studio.twst.core.data;

public class PlayerData {

    private int level;
    private String skin;
    private int age;
    private String rank;
    private String profession;

    public PlayerData(int level, String skin, int age, String rank, String profession) {
        this.level = level;
        this.skin = skin;
        this.age = age;
        this.rank = rank;
        this.profession = profession;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
