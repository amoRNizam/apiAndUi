package alfresco.s.api.login.user;

import com.google.gson.annotations.Expose;

public class User {

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public User() {}

    private String username;
    private String password;

    public String ticket;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}
