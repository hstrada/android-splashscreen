package br.com.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class FormularioActivity extends AppCompatActivity {

    private EditText etNome;
    private Spinner spCurso;
    private RadioGroup rgPeriodo;
    private Button btParticipar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        etNome = (EditText) findViewById(R.id.etNome);
        spCurso = (Spinner) findViewById(R.id.spCurso);
        rgPeriodo = (RadioGroup) findViewById(R.id.rgPeriodo);
        btParticipar = (Button) findViewById(R.id.btParticipar);

        btParticipar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent confirmarIntent = new Intent(FormularioActivity.this, ConfirmacaoActivity.class);

                confirmarIntent.putExtra(getString(R.string.label_nome), etNome.getText().toString());

                confirmarIntent.putExtra(getString(R.string.label_curso), spCurso.getSelectedItem().toString());

                confirmarIntent.putExtra(getString(R.string.label_periodo),
                        rgPeriodo.getCheckedRadioButtonId() == R.id.rbManha ?
                        getString(R.string.label_manha) : getString(R.string.label_noite));

                startActivity(confirmarIntent);

            }
        });

    }


}
