package exceptions;

public class Login {
    public static void main(String[] args) {
        log_in("te  1", "pa ss", "pass");
    }

    public static void log_in(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20 | login.contains(" ")) {
                throw new WrongLoginException("Login is more than 19 symbols or contains spaces");
            }

        }
        catch (WrongLoginException wrongLoginException) {
            wrongLoginException.printStackTrace();
        }

        try {
            if (password.length() >= 20 | password.contains(" ")) {
                throw new WrongPasswordException("Password is more than 19 symbols or contains spaces");
            }
        }
        catch (WrongPasswordException wrongPasswordException) {
            wrongPasswordException.printStackTrace();
        }

        try {
            if (password != confirmPassword) {
                throw new WrongPasswordException("Password does not match confirmPassword");
            }
        }
        catch (WrongPasswordException wrongPasswordException) {
            wrongPasswordException.printStackTrace();
        }
    }
}
