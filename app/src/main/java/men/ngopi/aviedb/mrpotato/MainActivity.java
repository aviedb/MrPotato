package men.ngopi.aviedb.mrpotato;

import android.graphics.Typeface;
import android.support.design.chip.Chip;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
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

        // Toggle hat visibility
        Chip hat_chip = findViewById(R.id.hat_chip);
        hat_chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean isChecked) {
                ImageView hat = findViewById(R.id.hat);

                hat.setVisibility(isChecked? View.VISIBLE : View.INVISIBLE);
            }
        });

        // Toggle nose visibility
        Chip nose_chip = findViewById(R.id.nose_chip);
        nose_chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean isChecked) {
                ImageView nose = findViewById(R.id.nose);

                nose.setVisibility(isChecked? View.VISIBLE : View.INVISIBLE);
            }
        });

        // Toggle arms visibility
        Chip arms_chip = findViewById(R.id.arms_chip);
        arms_chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean isChecked) {
                ImageView arms = findViewById(R.id.arms);

                arms.setVisibility(isChecked? View.VISIBLE : View.INVISIBLE);
            }
        });

        // Toggle eyes visibility
        Chip eyes_chip = findViewById(R.id.eyes_chip);
        eyes_chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean isChecked) {
                ImageView eyes = findViewById(R.id.eyes);

                eyes.setVisibility(isChecked? View.VISIBLE : View.INVISIBLE);
            }
        });

        // Toggle glasses visibility
        Chip glasses_chip = findViewById(R.id.glasses_chip);
        glasses_chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean isChecked) {
                ImageView glasses = findViewById(R.id.glasses);

                glasses.setVisibility(isChecked? View.VISIBLE : View.INVISIBLE);
            }
        });

        // Toggle eyebrows visibility
        Chip eyebrows_chip = findViewById(R.id.eyebrows_chip);
        eyebrows_chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean isChecked) {
                ImageView eyebrows = findViewById(R.id.eyebrows);

                eyebrows.setVisibility(isChecked? View.VISIBLE : View.INVISIBLE);
            }
        });

        // Toggle ears visibility
        Chip ears_chip = findViewById(R.id.ears_chip);
        ears_chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean isChecked) {
                ImageView ears = findViewById(R.id.ears);

                ears.setVisibility(isChecked? View.VISIBLE : View.INVISIBLE);
            }
        });

        // Toggle mouth visibility
        Chip mouth_chip = findViewById(R.id.mouth_chip);
        mouth_chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean isChecked) {
                ImageView mouth = findViewById(R.id.mouth);

                mouth.setVisibility(isChecked? View.VISIBLE : View.INVISIBLE);
            }
        });

        // Toggle mustache visibility
        Chip mustache_chip = findViewById(R.id.mustache_chip);
        mustache_chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean isChecked) {
                ImageView mustache = findViewById(R.id.mustache);

                mustache.setVisibility(isChecked? View.VISIBLE : View.INVISIBLE);
            }
        });

        // Toggle shoes visibility
        Chip shoes = findViewById(R.id.shoes_chip);
        shoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean isChecked) {
                ImageView shoes = findViewById(R.id.shoes);

                shoes.setVisibility(isChecked? View.VISIBLE : View.INVISIBLE);
            }
        });

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
