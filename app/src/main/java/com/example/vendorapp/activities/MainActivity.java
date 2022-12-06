package com.example.vendorapp.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vendorapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.fabAdd.setOnClickListener(view -> {
            Intent intent = new Intent(this, AddCustomerActivity.class);
            startActivity(intent);
        });

        binding.btnLogin.setOnClickListener(view -> {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        });

        binding.btnLogin.setOnClickListener(view -> {
            Intent intent = new Intent(this, CustomersPaymentActivity.class);
            startActivity(intent);
        });
    }
}