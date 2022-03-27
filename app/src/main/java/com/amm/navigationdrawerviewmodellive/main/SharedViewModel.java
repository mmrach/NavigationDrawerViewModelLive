package com.amm.navigationdrawerviewmodellive.main;

import androidx.core.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    private MutableLiveData<Pair<String ,Integer>> selectedColor;

    //Constructor sin parametros para que podamos usar la default Application Factory.
    public SharedViewModel() {
    }

    public LiveData<Pair<String, Integer>> getSelectedColor() {
        if (selectedColor == null){
            selectedColor = new MutableLiveData<Pair<String,Integer>>();
        }
        return selectedColor;
    }

    public void setSelectedColor(Pair<String, Integer> selectedColor) {
        this.selectedColor.setValue(selectedColor);
    }
}
