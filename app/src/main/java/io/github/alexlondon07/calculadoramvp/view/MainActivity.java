package io.github.alexlondon07.calculadoramvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import io.github.alexlondon07.calculadoramvp.R;
import io.github.alexlondon07.calculadoramvp.presenter.IMainActivityPresenter;
import io.github.alexlondon07.calculadoramvp.presenter.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements IMainActivityView {

    private EditText editTextNumber1, editTextNumber2;
    private Button btnSumar;
    private TextView finalResult;

    private IMainActivityPresenter  presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadView();

        presenter = new MainActivityPresenterImpl(this);
    }

    private void loadView() {

        editTextNumber1 = findViewById(R.id.edit_text_Number1);
        editTextNumber2 = findViewById(R.id.edit_text_Number2);
        finalResult = findViewById(R.id.text_view_result);
        btnSumar = findViewById(R.id.btnSuma);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = editTextNumber1.getText().toString();
                String num2 = editTextNumber2.getText().toString();
                presenter.sumar(num1, num2);
            }
        });
    }

    @Override
    public void showResult(String result) {
        finalResult.setText(String.valueOf(result));
        emptyField();
    }

    private void emptyField() {
        editTextNumber1.setText("");
        editTextNumber2.setText("");
    }

    @Override
    public void showError(int error) {
        finalResult.setText(error);
    }
}
