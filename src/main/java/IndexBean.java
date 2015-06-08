import BD.MyBatisConnectionFactory;
import BD.User;
import BD.UserDAO;
import org.icefaces.ace.event.SelectEvent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
@SessionScoped

public class IndexBean implements Serializable {
    private String page = "template/welcomePage.xhtml";
    String nickname;
    String password;


    public void authorization() {

    }


    public void welcomePage() {
        page = "template/welcomePage.xhtml";
    }

    public void authorizationPage() {
        page = "authorizationPage.xhtml";
    }

    public void adminPage() {
        page = "adminPage.xhtml";
    }

    public void guestPage() {
        page = "guestPage.xhtml";

    }


    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
