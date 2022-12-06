package com.example.vendorapp.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vendorapp.databinding.ActivityEnterOtpBinding;


public class EnterOtpActivity extends AppCompatActivity {

    private ActivityEnterOtpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnterOtpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnEnterOtp.setOnClickListener(view -> openMainActivity());
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}