package unisoft.com.demoone;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by user on 05-Mar-19.
 */

public class MainActivityPresenter implements MainActivityMvpPresenter {

    private Context context;
    private MainActivityView activityView;


    public MainActivityPresenter(Context context, MainActivityView activityView) {
        this.context = context;
        this.activityView = activityView;
    }

    @Override
    public void onLoginButtonclicked(String userEmail, String userPass) {

        if (userEmail.isEmpty() || userEmail == null){
            activityView.showEmailError("Email can't be Empty");
        }else if (userPass.isEmpty() || userPass == null){
            activityView.showPasswordError("Password can't be Empty");
        }else {
            Toast.makeText(context, "Email "+userEmail+"Password "+userPass, Toast.LENGTH_SHORT).show();
        }



    }
}
