package embedded.kookmin.ac.kr.lab02;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Test", "oncreate1");
        setContentView(R.layout.activity_main);

        Button bt = (Button)this.findViewById(R.id.btnLogin);
        bt.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View v) {
                                      Intent i = new Intent(MainActivity.this, LoginActivity.class);
                                      startActivity(i);
                                  }
                              }
        );
          //  ButtonClickListener btnlistener = new ButtonClickListener();
            //    bt.setOnClickListener(btnlistener);

    }
    /*
    //2 익명 클래스
    View.OnClickListener btnlistener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this.getApplicationContext(), "Click Button", Toast.LENGTH_LONG).show();
        }
    };
*/
    class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this.getApplicationContext(), "Click Button", Toast.LENGTH_LONG).show();
        }
    }
/*
    public void onNewBtnClicked(View v) {
        Toast.makeText(getApplicationContext(), "click button2.", Toast.LENGTH_LONG).show();
    }*/
}
