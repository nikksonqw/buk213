package com.example.vkladki1.ui.osebe;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class osebeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public osebeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Дегтярев Коляяя");
    }

    public LiveData<String> getText() {
        return mText;
    }
}