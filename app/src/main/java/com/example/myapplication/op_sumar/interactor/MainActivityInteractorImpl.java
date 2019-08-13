package com.example.myapplication.op_sumar.interactor;

import com.example.myapplication.op_sumar.presenter.MainActivityPresenter;

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivityPresenter activityPresenter;

    public MainActivityInteractorImpl(MainActivityPresenter activityPresenter) {
        this.activityPresenter = activityPresenter;
    }

    @Override
    public void sumar(String number1, String number2) {
        if (isNumeric(number1) && isNumeric(number2)) {
            Double resultado = Double.valueOf(number1) + Double.valueOf(number2);
            activityPresenter.showResult(String.valueOf(resultado));
        }else {
            activityPresenter.showError("Not is numeric!");
        }

    }

    @Override
    public boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
