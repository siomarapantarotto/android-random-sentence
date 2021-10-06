package br.com.siomara.android.randomsentence;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtRandomSentence;

    // Simple array of sentences.
    private final String[] arraySentences = {
            "Lorem ipsum was purposefully designed to have no meaning, but appear like real text, making it the perfect placeholder.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Duis nunc eros, mattis at dui ac, convallis semper risus. In adipiscing ultrices tellus, in suscipit massa vehicula eu.",
            "Ea omnis sint et reprehenderit omnis et adipisci atque qui dicta minima ex necessitatibus adipisci sit saepe neque et placeat tempora.",
            "Ab galisum doloribus non explicabo vitae qui saepe molestiae sed aspernatur molestias id laborum quia.",
            "Et neque obcaecati est corporis nihil a similique voluptas est exercitationem alias non corporis nemo.",
            "Sit consequatur doloremque hic mollitia vero cum voluptatem quia et beatae necessitatibus."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializes components.
        Button btnRandomSentence = findViewById(R.id.buttonRandomSentence);
        txtRandomSentence = findViewById(R.id.textViewRandomSentence);

        // Generates a random number and displays the stored sentence at the corresponding index.
        btnRandomSentence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int randomNumber = random.nextInt(arraySentences.length);
                txtRandomSentence.setText(arraySentences[randomNumber]);
                Toast.makeText(MainActivity.this, "Array Sentences - INDEX[" + randomNumber + "]", Toast.LENGTH_SHORT).show();
            }
        });

    }
}