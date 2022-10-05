package src.practiceAdvance._14_Encapsulation.Q02;

public class User {

    /*id
    username
    pass
    boolean      constr
*/
    private String userName;
    private String passWord;
    private int id;
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String userName, int id) {
        this.userName = userName;
        this.id = id;
    }

    public User() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord.replaceAll("\\w","*") + '\'' +
                ", id=" + id +
                ", active=" +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public User(String userName, String passWord, int id, boolean active) {
        this.userName = userName;
        this.passWord = passWord;
        this.id = id;
        this.active = active;
    }
}
