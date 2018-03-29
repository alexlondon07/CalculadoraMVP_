package io.github.alexlondon07.calculadoramvp.presenter;

import io.github.alexlondon07.calculadoramvp.R;
import io.github.alexlondon07.calculadoramvp.interactor.IMainActivityInteractor;
import io.github.alexlondon07.calculadoramvp.interactor.MainActivityInteractorImpl;
import io.github.alexlondon07.calculadoramvp.view.IMainActivityView;

/**
 * Created by alexlondon07 on 3/28/18.
 */

public class MainActivityPresenterImpl implements IMainActivityPresenter {

    private IMainActivityView iMainActivityView;
    private IMainActivityInteractor interactor;

    public MainActivityPresenterImpl(IMainActivityView iMainActivityView) {
        this.iMainActivityView = iMainActivityView;
        interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void sumar(String number1, String number2) {

        if( ("").equals(number1)  || ("").equals(number2)) {

            showError(R.string.fieldRequired);

        }else{
            interactor.sumar(number1, number2);
        }
    }

    @Override
    public void showError(int error) {
        iMainActivityView.showError(error);
    }


    @Override
    public void showResult(String result) {
        iMainActivityView.showResult(result);
    }
}
