package dev.ryuuwiz.food_cart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int burgerCount = 0;
    private TextView countBurger;
    private static final int BURGER_PRICE = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countBurger = findViewById(R.id.countBurger);
        TextView burgerName = findViewById(R.id.burgerName);
        Button minusBurger = findViewById(R.id.minusBurger);
        Button plusBurger = findViewById(R.id.plusBurger);
        Button submitButton = findViewById(R.id.submit);

        // Set up button click listeners
        plusBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                burgerCount++;
                updateBurgerCount();
            }
        });

        minusBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (burgerCount > 0) {
                    burgerCount--;
                    updateBurgerCount();
                }
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHasilActivity();
            }
        });
    }

    private void updateBurgerCount() {
        countBurger.setText(String.valueOf(burgerCount));
    }

    private void goToHasilActivity() {
        Intent intent = new Intent(this, HasilActivity.class);
        intent.putExtra("burgerCount", burgerCount);
        intent.putExtra("burgerPrice", BURGER_PRICE * burgerCount);
        startActivity(intent);
    }
}