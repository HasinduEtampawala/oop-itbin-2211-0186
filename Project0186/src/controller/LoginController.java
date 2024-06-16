package Controller;

import Model.User;
import View.Login;
import javax.swing.JOptionPane;

public class LoginController {
    private Login loginView;

    public LoginController(Login view) {
        this.loginView = view;
        this.loginView.addLoginListener(e -> login());
    }

    public void login() {
        String username = loginView.getUsername();
        String password = loginView.getPassword();
        
        // Validate if both username and password are entered
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username and Password cannot be empty");
            return;
        }
        
        // Create a User object with username and password
        User user = new User(username, password);
        
        // Perform authentication logic here
        if (isValidUser(user)) {
            JOptionPane.showMessageDialog(null, "Login Successful");
            // Code to open the home window
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
        }
    }
    
    private boolean isValidUser(User user) {
        // Replace this with your actual authentication logic
        // For example, you might check against a database or a list of registered users
        return user.getUsername().equals("Hasindu") && user.getPassword().equals("123");
    }
}
