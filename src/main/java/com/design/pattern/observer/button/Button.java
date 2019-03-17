package com.design.pattern.observer.button;

public interface Button {
    void addOnClickListener(OnClickListener observer);

    void removeOnClickListener(OnClickListener observer);

    void notifyObserver();
}
