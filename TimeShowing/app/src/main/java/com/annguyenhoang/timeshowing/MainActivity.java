package com.annguyenhoang.timeshowing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.annguyenhoang.timeshowing.databinding.ActivityMainBinding;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private AlertDialog mAlertDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mAlertDialog = new AlertDialog.Builder(this).create();
        mBinding.btnShowTime.setOnClickListener(v -> {
            Date time = new Date();
            String message = "Thời gian hiện hành: " + time.toLocaleString();
            mAlertDialog.setMessage(message);
            mAlertDialog.show();
        });

    }
}