package life.majiang.community.community.dto;

public class GithubUser {
    private String name;
    private String login;

    @Override
    public String toString() {
        return "GithubUser{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", id=" + id +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
