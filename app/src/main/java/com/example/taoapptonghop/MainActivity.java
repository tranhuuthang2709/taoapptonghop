    package com.example.taoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
    EditText edittextuser, edittextpassword;
    Button buttondangky, buttondangnhap,buttonthoat;
    String ten,mk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        controlButton();
        
    }

        private void controlButton() {
            buttonthoat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_DeviceDefault_Dialog_NoActionBar_MinWidth);
                    builder.setTitle("Bạn có muốn thoát không");
                    builder.setIcon(android.R.drawable.ic_dialog_alert);
                    builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            onBackPressed();

                        }
                    });
                    builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                   builder.show();
                }
            });
            buttondangky.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Dialog dialog = new Dialog(MainActivity.this);
                    dialog.setCancelable(false);
                    dialog.setContentView(R.layout.dangki);
                    EditText edittexttk =(EditText) dialog.findViewById(R.id.edittexttk);
                    EditText edittextmk =(EditText) dialog.findViewById(R.id.edittextmk);
                    Button buttonhuy =(Button) dialog.findViewById(R.id.buttonhuy);
                    Button buttondongy =(Button) dialog.findViewById(R.id.buttondongy);
                    buttondongy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            ten =edittexttk.getText().toString().trim();
                            mk =edittextmk.getText().toString().trim();

                            edittextuser.setText(ten);
                            edittextpassword.setText(mk);
                            dialog.cancel();
                        }
                    });
                    buttonhuy.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.cancel();
                        }
                    });
                    dialog.show();
                }
            });
            buttondangnhap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (edittextuser.getText().length() !=0 && edittextpassword.getText().length() !=0){
                        if (edittextuser.getText().toString().equals(ten) &&  edittextpassword.getText().toString().equals(mk)){
                            Toast.makeText(MainActivity.this,"Đăng nhập thành công",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                            startActivity(intent);
                        }
                        else if (edittextuser.getText().toString().equals("thang") && edittextpassword.getText().toString().equals("123")){
                            Toast.makeText(MainActivity.this,"Đăng nhập thành công",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(MainActivity.this,"Đăng nhập không thành công",Toast.LENGTH_SHORT).show();

                        }
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Mời bạn nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }

        private void Anhxa() {
            edittextuser =(EditText) findViewById(R.id.edittextuser);
            edittextpassword  =(EditText) findViewById(R.id.edittextpassword);
            buttondangky =(Button) findViewById(R.id.buttondangky);
            buttondangnhap =(Button) findViewById(R.id.buttondangnhap);
            buttonthoat =(Button) findViewById(R.id.buttonthoat);

        }
    }