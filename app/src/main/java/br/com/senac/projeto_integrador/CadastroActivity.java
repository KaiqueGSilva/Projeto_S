package br.com.senac.projeto_integrador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {
    //Declarar as variáveis globais
    EditText edtCadNome, edtCadEmail, edtCadCPF, edtCadSenha;
    Button btnCadCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_layout);

        //Apresentando as variáveis xml no java
        edtCadNome = findViewById(R.id.edtCadNome);
        edtCadEmail = findViewById(R.id.edtCadEmail);
        edtCadCPF = findViewById(R.id.edtCadCPF);
        edtCadSenha = findViewById(R.id.edtCadSenha);

        btnCadCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}