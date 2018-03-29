package io.github.alexlondon07.calculadoramvp.presenter;

/**
 * Created by alexlondon07 on 3/28/18.
 */

public interface IMainActivityPresenter {

    void sumar(String number1, String number2); //Interactor
    void showError(int error);
    void showResult(String result);

}
