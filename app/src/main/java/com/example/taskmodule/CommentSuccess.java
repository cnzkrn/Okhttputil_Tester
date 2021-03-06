package com.example.taskmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CommentSuccess extends AppCompatActivity {
    private Button btn_comment_success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_success);

        btn_comment_success = findViewById(R.id.btn_comment_success);
        btn_comment_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommentSuccess.this, TaskCenter.class);
                startActivity(intent);
            }
        });
    }
}
