package com.example.myapplication.op_sumar.presenter;

public interface MainActivityPresenter {

    void sumar(String number1, String number2); //INTERACTOR
    void showResult(String result); //VIEW
    void showError(String error); //ERROR
}

