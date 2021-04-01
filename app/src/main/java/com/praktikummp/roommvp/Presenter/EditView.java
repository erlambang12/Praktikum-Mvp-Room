package com.praktikummp.roommvp.Presenter;

import com.praktikummp.roommvp.Database.Entity.Person;

public interface EditView {

    void showErrorMessage(int id);

    void clearPreErrors();

    void populate(Person person);
}

