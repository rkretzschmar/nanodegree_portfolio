package nanodegree.appconditioner.com.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Toast currentToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // define one generic onclick listener for all buttons
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(currentToast != null) {
                    currentToast.cancel();
                }

                Button thisButton = (Button)view;

                currentToast = Toast.makeText(MainActivity.this,
                        getString(R.string.toast_launch_message) + " " + thisButton.getText() + "!",
                        Toast.LENGTH_SHORT);

                currentToast.show();
            }
        };

        // set the defined listener as onclick listener of all buttons
        findViewById(R.id.spotify_streamer_button).setOnClickListener(listener);
        findViewById(R.id.scores_app_button).setOnClickListener(listener);
        findViewById(R.id.library_app_button).setOnClickListener(listener);
        findViewById(R.id.build_it_bigger_button).setOnClickListener(listener);
        findViewById(R.id.xyz_reader_button).setOnClickListener(listener);
        findViewById(R.id.capstone_button).setOnClickListener(listener);
    }
}
