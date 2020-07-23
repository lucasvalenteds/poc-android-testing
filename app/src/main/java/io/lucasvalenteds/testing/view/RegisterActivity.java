package io.lucasvalenteds.testing.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.testing.R;
import io.lucasvalenteds.testing.model.person.Person;

public class RegisterActivity extends AppCompatActivity {

    public static final String phoneNumber = "(51) 98222-3333";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Person person = new Person();
        person.setPhoneNumber(phoneNumber);

        TextView tvPhoneNumber = findViewById(R.id.person_phone);
        Button btnShowMessage = findViewById(R.id.btn_show_message);

        btnShowMessage.setOnClickListener((v) -> tvPhoneNumber.setText(person.getPhoneNumber()));
    }
}
