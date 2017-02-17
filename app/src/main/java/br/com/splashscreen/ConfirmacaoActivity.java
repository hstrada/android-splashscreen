package br.com.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ConfirmacaoActivity extends AppCompatActivity {

    private TextView tvConfirmacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);

        tvConfirmacao = (TextView) findViewById(R.id.tvConfirmacao);

        if(getIntent() != null) {
            tvConfirmacao.setText(Html.fromHtml(getString(R.string.confirmacao,
                    getIntent().getStringExtra(getString(R.string.label_nome)),
                    getIntent().getStringExtra(getString(R.string.label_curso)),
                    getIntent().getStringExtra(getString(R.string.label_periodo))
                    )));
        }

    }
}
