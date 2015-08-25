package login;

abstract class LoginClass extends main.FrameController {

    protected static String password = "passWordAs1";

    protected abstract void reset ();

    protected abstract void secExit ();

    protected void setPassword (String word) {
        password = word;
    }

    // Validates uername + password w/ boolean
    protected boolean checkValid (String user, String pass) {

        if (user.equals(userName) && pass.equals(password)) {
            return true;
        } else {
            return false;
        }

    }

}
