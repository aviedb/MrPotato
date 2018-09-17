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

        // Declaring Google Sans font
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/google_sans.ttf");

        // Change mr_potato font
        TextView mr_potato = findViewById(R.id.mr_potato);
        mr_potato.setTypeface(typeface);

        // Changing placeholder font
        TextView placeholder = findViewById(R.id.placeholder);
        placeholder.setTypeface(typeface);

        // Declaring each chips' Id
        android.support.design.chip.Chip hat_chip = findViewById(R.id.hat_chip);
        android.support.design.chip.Chip nose_chip = findViewById(R.id.nose_chip);
        android.support.design.chip.Chip arms_chip = findViewById(R.id.arms_chip);
        android.support.design.chip.Chip eyes_chip = findViewById(R.id.eyes_chip);
        android.support.design.chip.Chip glasses_chip = findViewById(R.id.glasses_chip);
        android.support.design.chip.Chip eyebrows_chip = findViewById(R.id.eyebrows_chip);
        android.support.design.chip.Chip ears_chip = findViewById(R.id.ears_chip);
        android.support.design.chip.Chip mouth_chip = findViewById(R.id.mouth_chip);
        android.support.design.chip.Chip mustache_chip = findViewById(R.id.mustache_chip);
        android.support.design.chip.Chip shoes = findViewById(R.id.shoes_chip);

        // Changing each chips' font
        hat_chip.setTypeface(typeface);
        nose_chip.setTypeface(typeface);
        arms_chip.setTypeface(typeface);
        eyes_chip.setTypeface(typeface);
        glasses_chip.setTypeface(typeface);
        eyebrows_chip.setTypeface(typeface);
        ears_chip.setTypeface(typeface);
        mouth_chip.setTypeface(typeface);
        mustache_chip.setTypeface(typeface);
        shoes.setTypeface(typeface);
    }
}
