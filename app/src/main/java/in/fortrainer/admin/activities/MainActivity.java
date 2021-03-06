package in.fortrainer.admin.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

import in.fortrainer.admin.R;
import in.fortrainer.admin.models.App;
import in.fortrainer.admin.models.Banner;
import in.fortrainer.admin.utilities.CommonRecyclerScreen;

import static in.fortrainer.admin.models.Admin.eraseCurrentUserData;
import static in.fortrainer.admin.utilities.EECMultiDexApplication.context;

public class MainActivity extends AppCompatActivity {

    CommonRecyclerScreen crs;
    Button button;
    LinearLayout linearLayout;
    int appId;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getIntent().getIntExtra("APP_ID",0)!= 0){
            appId = getIntent().getIntExtra("APP_ID",0);
            App.saveCurrentapp(this,appId);
        }
        else{
            Toast.makeText(MainActivity.this,"FAIL",Toast.LENGTH_SHORT).show();
        }
        appId = getIntent().getIntExtra("APP_ID",0);
        linearLayout = findViewById(R.id.ll_p1);
        linearLayout.setOnClickListener( view -> {
            Intent intent = new Intent(MainActivity.this,OrderActivity.class);
            intent.putExtra("APP_ID",appId);
            startActivity(intent);
        });
        linearLayout = findViewById(R.id.ll_p4);
        linearLayout.setOnClickListener( view -> {
            Intent intent = new Intent(MainActivity.this,BannerActivity.class);
            intent.putExtra("APP_ID",appId);
            startActivity(intent);
        });
        linearLayout = findViewById(R.id.ll_p5);
        linearLayout.setOnClickListener( view -> {
            Intent intent = new Intent(MainActivity.this,EventActivity.class);
            intent.putExtra("APP_ID",appId);
            startActivity(intent);
        });

        /*button = findViewById(R.id.bt_logout);
        button.setOnClickListener( view -> {
            eraseCurrentUserData(context);
            Intent intent = new Intent(MainActivity.this,LoginActivity.class);
            intent.putExtra("APP_ID",appId);
            startActivity(intent);
        });*/

        linearLayout = findViewById(R.id.ll_p6);
        linearLayout.setOnClickListener( view -> {
            Intent intent = new Intent(MainActivity.this,AppUsersListActivity.class);
            intent.putExtra("APP_ID",appId);
            startActivity(intent);
        });

        linearLayout = findViewById(R.id.ll_p3);
        linearLayout.setOnClickListener( view -> {
            Intent intent = new Intent(MainActivity.this,PostActivity.class);
            intent.putExtra("APP_ID",appId);
            startActivity(intent);
        });

        linearLayout = findViewById(R.id.ll_p2);
        linearLayout.setOnClickListener( view -> {
            Intent intent = new Intent(MainActivity.this,ProductActivity.class);
            intent.putExtra("APP_ID",appId);
            startActivity(intent);
        });




        /*setAdapter();
        setClickListener();
        loadBanners();*/
    }

    private void setAdapter() {

    }

    private void setClickListener() {

    }

    private void loadBanners() {

    }


}
