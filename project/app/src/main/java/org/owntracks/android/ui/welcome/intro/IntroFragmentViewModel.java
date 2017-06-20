package org.owntracks.android.ui.welcome.intro;

import android.databinding.Bindable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.owntracks.android.App;
import org.owntracks.android.BR;
import org.owntracks.android.R;
import org.owntracks.android.injection.scopes.PerFragment;
import org.owntracks.android.support.Preferences;
import org.owntracks.android.ui.base.viewmodel.BaseViewModel;
import org.owntracks.android.ui.welcome.WelcomeFragmentMvvm;
import org.owntracks.android.ui.welcome.mode.ModeFragmentMvvm;

import javax.inject.Inject;


@PerFragment
public class IntroFragmentViewModel extends BaseViewModel<IntroFragmentMvvm.View> implements IntroFragmentMvvm.ViewModel<IntroFragmentMvvm.View> {


    @Inject
    public IntroFragmentViewModel() {

    }

    public void attachView(@NonNull IntroFragmentMvvm.View view, @Nullable Bundle savedInstanceState) {
        super.attachView(view, savedInstanceState);
        getView().setActivityViewModel();
    }

    @Override
    public void onNextClicked() {

    }

    @Override
    @Bindable
    public boolean isNextEnabled() {
        return true;
    }

    @Override
    public void setNextEnabled(boolean enabled) {

    }
}
