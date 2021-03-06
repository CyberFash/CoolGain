package nigeriandailies.com.ng.coolgain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        getSupportActionBar ().hide ();
    }

    public void logout (View view){
        FirebaseAuth.getInstance ().signOut (); //logging user out
        startActivity (new Intent (getApplicationContext (), Login.class));
        finish ();
    }
}