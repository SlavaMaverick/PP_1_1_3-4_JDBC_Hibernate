package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Имя-1", "Фамилия-1", (byte) 39);
        userService.saveUser("Имя-2", "Фамилия-2", (byte) 41);
        userService.saveUser("Имя-3", "Фамилия-3", (byte) 42);
        userService.saveUser("Имя-4", "Фамилия-4", (byte) 36);
        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }

}
