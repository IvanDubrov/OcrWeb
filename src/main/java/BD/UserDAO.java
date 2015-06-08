package BD;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;


public class UserDAO {

    private SqlSessionFactory sqlSessionFactory = null;

    public UserDAO(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<User> selectAll() {
        List<User> list = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            list = session.selectList("OOO.selectAll");
        } finally {
            session.commit();
            session.close();
        }
        return list;
    }


    /**
     * Insert an instance of eee.Person into the database.
     *
     * @param user the instance to be persisted.
     */
    public int insert(User user) {
        int id = -1;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            id = session.insert("OOO.insert", user);
        } finally {
            session.commit();
            session.close();
        }
        return id;
    }


    /**
     * Delete an instance of eee.Person from the database.
     *
     * @param id value of the instance to be deleted.
     */
    public void delete(int id) {

        SqlSession session = sqlSessionFactory.openSession();

        try {
            session.delete("OOO.delete", id);
        } finally {
            session.commit();
            session.close();
        }
    }




}