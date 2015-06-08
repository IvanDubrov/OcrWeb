import BD.MyBatisConnectionFactory;
import BD.User;
import BD.UserDAO;
import org.icefaces.ace.event.SelectEvent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
@ViewScoped
public class adminBean implements Serializable {

    int selectId;
    public void delete() {

        userDAO.delete(selectId);
    }
    public void selectListener(SelectEvent event) {
        User user = (User) event.getObject();
        selectId = (user.getId());
    }
    UserDAO userDAO = new UserDAO(MyBatisConnectionFactory.getSqlSessionFactory());

    public adminBean() {
    }

    private String name;
private  String year_of;

    public String getYear_of() {
        return year_of;
    }

    public void setYear_of(String year_of) {
        this.year_of = year_of;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    ArrayList<User> tableUserInBD;

    public ArrayList<User> getTableUserOfBD() {
        userDAO.selectAll();
        tableUserInBD = (ArrayList<User>) userDAO.selectAll();
        return tableUserInBD;
    }
    public void insert() {

            userDAO.insert(new User(name, year_of));

    }
}
