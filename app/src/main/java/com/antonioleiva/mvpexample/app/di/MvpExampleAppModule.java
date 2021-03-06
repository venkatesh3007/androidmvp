package com.antonioleiva.mvpexample.app.di;

import com.antonioleiva.mvpexample.app.Login.LoginInteractor;
import com.antonioleiva.mvpexample.app.Login.LoginInteractorImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by venkatesh on 11/9/15.
 */

@Module
public class MvpExampleAppModule {

    @Provides
    LoginInteractor provideLoginInteractor() {
        return new LoginInteractorImpl();
    }
}
