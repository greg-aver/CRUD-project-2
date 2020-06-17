package service;

import model.User;
import util.DBConfig;

import java.sql.Connection;
import java.util.List;

import DAO.UserJdbcDAO;

public class UserService {
    private static UserService service;
    private UserJdbcDAO userJdbcDAO = UserJdbcDAO.getUserJdbcDAO(DBConfig.getMysqlConnection());

    public List<User> getAllUsers() {
        return userJdbcDAO.getAllUsers();
    }

    private UserService() {
    }

    public static UserService getService() {
        if (service == null) {
            service = new UserService();
        }
        return service;
    }

    public void addUser(User user) {
        userJdbcDAO.addUser(user);
    }

    public void updateUser(User user) {
        userJdbcDAO.updateUser(user);
    }

    public void deleteUserById(int id) {
        userJdbcDAO.deleteUserById(id);
    }

    public User getUserById(int id) {
        return userJdbcDAO.getUserById(id);
    }
}
