package com.example.testing;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Calculator calculator = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtA = findViewById(R.id.edt_a);
        EditText edtB = findViewById(R.id.edt_b);
        Button btnAdd = findViewById(R.id.btn_add);
        Button btnDivide = findViewById(R.id.btn_divide);
        TextView txtResult = findViewById(R.id.txt_result);

        btnAdd.setOnClickListener(v -> {
            int a = Integer.parseInt(edtA.getText().toString());
            int b = Integer.parseInt(edtB.getText().toString());
            txtResult.setText("Kết quả: " + calculator.add(a, b));
        });

        btnDivide.setOnClickListener(v -> {
            int a = Integer.parseInt(edtA.getText().toString());
            int b = Integer.parseInt(edtB.getText().toString());
            try {
                txtResult.setText("Kết quả: " + calculator.divide(a, b));
            } catch (ArithmeticException e) {
                txtResult.setText("Lỗi: chia cho 0");
            }
        });
    }
}
