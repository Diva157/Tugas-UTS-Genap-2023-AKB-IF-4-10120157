package com.example.utsakb_10120157.main.base;

//10120157, Diva Alvita Donny Syahputri, IF4

public interface IPresenter<T extends IView, IView> {
    void onAttach(T view);
    void onDetach();
}
