package unisoft.com.demoone.loginPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import unisoft.com.demoone.R;

public class MainActivity extends AppCompatActivity implements MainActivityView,View.OnClickListener {

    private EditText email;
    private EditText password;
    private Button login;
    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intView();
        login.setOnClickListener(this);

        presenter = new MainActivityPresenter(this,this);
    }

    private void intView() {

        email = (EditText)findViewById(R.id.etUserEmail);
        password = (EditText)findViewById(R.id.etpassword);
        login = (Button)findViewById(R.id.btnLogin);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:{

                presenter.onLoginButtonclicked(email.getText().toString(),password.getText().toString());
            }
        }

    }

    @Override
    public void showEmailError(String msg) {
        email.setError(msg);

    }

    @Override
    public void showPasswordError(String msg) {
        password.setError(msg);

    }
}
