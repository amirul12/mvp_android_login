package unisoft.com.demoone.registrationPackage;

/**
 * Created by user on 06-Mar-19.
 */

public interface RegistrationView {

    void showNameError(String msg);
    void showEmailError(String msg);
    void showpassword(String msg);
    void showConfirm(String msg);
    void succesfullyRegistration(String msg);
}
