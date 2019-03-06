package unisoft.com.demoone.registrationPackage;

import android.content.Context;

/**
 * Created by user on 06-Mar-19.
 */

public class RegistrationPresenter implements RegistrationMvpPresenter{

    RegistrationView registrationView;
    Context context;

    public RegistrationPresenter(RegistrationView registrationView, Context context) {
        this.registrationView = registrationView;
        this.context = context;
    }

    @Override
    public void onRegistrationButtonclick(String name, String email, String pass, String confirmPass) {

        if (name.isEmpty() || name == null){
            registrationView.showNameError("Name cannot be empty");
        }else if (email.isEmpty()){
            registrationView.showEmailError("Email cannot be empty");
        }else if (pass.isEmpty()){
            registrationView.showEmailError("pass cannot be empty");
        }else if (confirmPass.isEmpty()){
            registrationView.showEmailError("confirm cannot be empty");
        }else {

        }


    }
}
