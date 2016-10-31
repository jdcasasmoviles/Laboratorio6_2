package com.jdcasas.lab_6_2act3;

/**
 * Created by Usuario on 30/10/2016.
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class login extends LinearLayout{

    private OnLoginListener listener;
    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btnLogin;
    private TextView lblMensaje; //el mensaje de CustomView

    public login(Context context) {
        super(context);
        inicializar();
    }

    public login(Context context, AttributeSet attrs) {
        super(context, attrs);
        inicializar();
        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.ControlLogin);
        String textoBoton = a.getString(R.styleable.ControlLogin_login_text);
        //btnLogin.setText(textoBoton);
        a.recycle();
    }

    private void inicializar()
    {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li =
                (LayoutInflater)getContext().getSystemService(infService);
        li.inflate(R.layout.login, this, true);
        txtUsuario = (EditText)findViewById(R.id.EditTextUsuario);
        txtPassword = (EditText)findViewById(R.id.EditTextContraseña);
        btnLogin = (Button)findViewById(R.id.btn_login);
        lblMensaje = (TextView)findViewById(R.id.mensaje);
        asignarEventos();
    }

    public void setOnLoginListener(OnLoginListener l) {
        listener = l;
    }

    private void asignarEventos() {
        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onLogin(txtUsuario.getText().toString(),
                        txtPassword.getText().toString());
            }
        });
    }

    public void setMensaje(String msg) {
        lblMensaje.setText(msg);
    }

}
