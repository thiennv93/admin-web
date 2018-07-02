package com.vietfintex.marketplace.controller;

public interface IController {
    default void resetSearchForm(){};

    void validateAction(int actionMode);

    void prepareDisplayMode(int viewMode, Boolean changeModeOnly);

    void doActionListener(int actionMode);

    String getMessageConfirm(int actionMode);

    void doSearch();

    void doDelete();

    void doEdit();

    void doSave();
}
