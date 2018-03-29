package io.github.alexlondon07.calculadoramvp.interactor;

import io.github.alexlondon07.calculadoramvp.presenter.IMainActivityPresenter;

/**
 * Created by alexlondon07 on 3/28/18.
 */

public class MainActivityInteractorImpl implements IMainActivityInteractor {

    private IMainActivityPresenter presenter;

    public MainActivityInteractorImpl(IMainActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void sumar(String number1, String number2) {

        Double result = Double.valueOf(number1) + Double.valueOf(number2);
        presenter.showResult(String.valueOf(result));
    }
}
