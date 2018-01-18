package realmproject.realm.app.myapplication;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import realmproject.realm.app.myapplication.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //tanaji commit from github account
        //tanaji commit from github account

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User();
        user.setName("Android");

        binding.setUser(user);
        binding.setActivity(this);
    }

    public void onButtonClick(String email) {

        Log.d("", "Email :" + binding.getUser().getEmail());
        Log.d("", "Email : " + email);
        Toast.makeText(this, email, Toast.LENGTH_SHORT).show();
    }
}
