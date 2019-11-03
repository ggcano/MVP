package com.example.mvp.iu.presenters;



import com.example.mvp.iu.Model.UserModel;
import com.example.mvp.iu.contracts.UserView;
import com.example.mvp.iu.iu.MainActivity;

public class MainActivityPresenter {

    private UserModel user;
    private UserView view;


    public MainActivityPresenter(UserView view) {
        this.user = new UserModel();
        this.view = view;
    }


    public void updateFullName(String fullName) {
        user.setFullName(fullName);
        view.updateUserInfoTextView(user.toString());

    }

    public void updateEmail(String email) {
        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());

    }

    public void updateUrl () {
        view.showImage(user.getLoquesea());
    }

}

