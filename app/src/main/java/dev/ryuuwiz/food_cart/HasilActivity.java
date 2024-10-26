package dev.ryuuwiz.food_cart;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HasilActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        TextView burgerText = findViewById(R.id.burgerText);
        TextView hasilBurgerCount = findViewById(R.id.hasilBurgerCount);
        TextView hasilBurgerPrice = findViewById(R.id.hasilBurgerPrice);
        TextView hasilTotalPrice = findViewById(R.id.hasilTotalPrice);

        // Retrieve data from Intent
        int burgerCount = getIntent().getIntExtra("burgerCount", 0);
        int totalPrice = getIntent().getIntExtra("burgerPrice", 0);

        burgerText.setText("Burger");
        hasilBurgerCount.setText(String.valueOf(burgerCount));
        hasilBurgerPrice.setText("Rp. " + (burgerCount * 10000)); // Example price
        hasilTotalPrice.setText("Rp. " + totalPrice);
    }
}