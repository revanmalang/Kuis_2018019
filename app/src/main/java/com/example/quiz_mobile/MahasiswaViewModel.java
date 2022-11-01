package com.example.quiz_mobile;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MahasiswaViewModel extends ViewModel {
    private MutableLiveData<String> name;
    private MutableLiveData<String> nim;
    private MutableLiveData<String> jurusan;

    public MutableLiveData<String> getName() {
        if(name == null){
            name = new MutableLiveData<>();
        }
        return name;
    }
    public MutableLiveData<String> getNim() {
        if(nim == null){
            nim = new MutableLiveData<>();
        }
        return nim;
    }
    public MutableLiveData<String> getjurusan() {
        if(jurusan == null){
            jurusan = new MutableLiveData<>();
        }
        return jurusan;
    }
    public void setName(String name) {
        this.name.postValue(name);
    }
    public void setJurusan(String jurusan) {
        this.jurusan.postValue(jurusan);
    }
    public void setNim(String nim) {
        this.nim.postValue(nim);
    }
}
