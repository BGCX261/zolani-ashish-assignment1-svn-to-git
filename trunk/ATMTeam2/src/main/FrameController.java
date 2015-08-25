package main;

public class FrameController extends javax.swing.JFrame implements ATMInterface {

    /**
     * framecount acts as a label for the next frames
     *
     * framecount = 0: TransactionFrame framecount = 1: SecQuestionFrame
     * framecount = 2: PasswordFrame
     */
    static int framecount = 0;
    /**
     * frameselect[] stores boolean values of check boxes in menu frame
     *
     * if(checkboxexample0.isSelected()), then frameselect[0] = true
     * if(checkboxexample1.isSelected() == false), then frameselect[1] = false
     *
     */
    static boolean[] frameselect = {false, false, false};
    // frames
    static login.LoginFrame loginFrame = new login.LoginFrame();
    static MenuFrame menuFrame = new MenuFrame();
    static bank.TransactionFrame transFrame = new bank.TransactionFrame();
    static SecQuestionFrame secFrame = new SecQuestionFrame();
    static login.PasswordFrame passFrame = new login.PasswordFrame();
    public static bank.TableFrame tableFrame = new bank.TableFrame();

    protected void resetFrameCount () {
        framecount = 0;

        frameselect[0] = false;
        frameselect[1] = false;
        frameselect[2] = false;
    }

    /**
     * confirmNextFrame moves from one frame to the next. It checks which frame
     * the user is currently in with framecount, looks into frameselect[] to see
     * which boxes were selected, and chooses what to dispose and set Visible.
     */
    protected void confirmNextFrame () {

        if (framecount == 0) {
            if (frameselect[1]) {
                transFrame.dispose();
                secFrame.setVisible(true);
                framecount++;
            } else if (frameselect[2]) {
                passFrame.setVisible(true);
                transFrame.dispose();
                framecount += 2;
            } else {
                System.exit(0);
            }
        } else if (framecount == 1) {
            if (frameselect[2]) {
                passFrame.setVisible(true);
                secFrame.dispose();
                framecount++;
            } else {
                loginFrame.setVisible(true);
                secFrame.dispose();
                resetFrameCount();
            }
        } else if (framecount == 2) {
            passFrame.dispose();
            resetFrameCount();
            loginFrame.setVisible(true);
        }


    }

    protected boolean checkEqual (String wordA, String wordB) {

        if (wordA.equals(wordB)) {
            return true;
        } else {
            return false;
        }
    }

    public void moveToMenu () {
        menuFrame.setVisible(true);

    }

}
