package frank.project01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Links the textview to the variable
        TextView videos = (TextView) findViewById(R.id.videos_text_view);

        videos.setOnClickListener(new View.OnClickListener() {
            // This will be executed when the videos category is clicked on.
            @Override
            public void onClick(View view) {
                // Create new intent to open the {@link activity_videos}
                Intent videosIntent = new Intent(MainActivity.this, videos.class);

                // Start the new activity
                startActivity(videosIntent);
            }
        });
    }
}