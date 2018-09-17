package men.ngopi.aviedb.mrpotato;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mr_potato = findViewById(R.id.mr_potato);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/google_sans.ttf");
        mr_potato.setTypeface(typeface);
    }
}
