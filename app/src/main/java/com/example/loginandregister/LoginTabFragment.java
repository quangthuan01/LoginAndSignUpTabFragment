package com.example.loginandregister;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginTabFragment extends Fragment {
    TextInputEditText inputEditTextEmail,inputEditTextPass;
    TextInputLayout inputLayoutEmail, inputLayoutPass;
    Button login;
    float y = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup mroot = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container,false);
        inputEditTextEmail =mroot.findViewById(R.id.EditTextInputEmail);
        inputEditTextPass =mroot.findViewById(R.id.EditTextInputPass);
        inputLayoutEmail =mroot.findViewById(R.id.inputLayoutEmail);
        inputLayoutPass =mroot.findViewById(R.id.inputLayoutPass);
        login = mroot.findViewById(R.id.btn_login);

//        inputLayoutEmail.setTranslationX(900);
//        inputEditTextEmail.setTranslationX(900);
//        inputLayoutPass.setTranslationX(900);
//        inputEditTextPass.setTranslationX(900);
//        login.setTranslationX(900);
//
//        inputLayoutEmail.setAlpha(y);
//        inputEditTextEmail.setAlpha(y);
//        inputLayoutPass.setAlpha(y);
//        inputEditTextPass.setAlpha(y);
//        login.setAlpha(y);
//
//        inputLayoutEmail.animate().translationY(0).alpha(1).setDuration(1100).setStartDelay(300).start();
//        inputEditTextEmail.animate().translationY(0).alpha(1).setDuration(1100).setStartDelay(500).start();
//        inputLayoutPass.animate().translationY(0).alpha(1).setDuration(1100).setStartDelay(700).start();
//        inputEditTextPass.animate().translationY(0).alpha(1).setDuration(1100).setStartDelay(900).start();
//        login.animate().translationY(0).alpha(1).setDuration(1100).setStartDelay(1100).start();

        return mroot;
    }




}

