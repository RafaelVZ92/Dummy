package com.example.myapplication.op_sumar.presenter;

import com.example.myapplication.op_sumar.interactor.MainActivityInteractor;
import com.example.myapplication.op_sumar.interactor.MainActivityInteractorImpl;
import com.example.myapplication.op_sumar.view.MainActivityView;

public class MainActivityPresenterImp implements MainActivityPresenter {

    private MainActivityView activityView;
    //DECLARO EL INTERACTOR
    private MainActivityInteractor interactor;

    public MainActivityPresenterImp(MainActivityView activityView) {
        this.activityView = activityView;
        this.interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void sumar(String number1, String number2) {
        //COMUNICACION CON EL INTERACTOR
        interactor.sumar(number1, number2);
    }

    @Override
    public void showResult(String result) {
        activityView.showResult(result);
    }

    @Override
    public void showError(String error) {
        activityView.showError(error);
    }
}
