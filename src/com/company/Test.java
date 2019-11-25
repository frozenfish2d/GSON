package com.company;

interface AListener {
    public void doEvent();
}

class A {
    AListener listeners[];
    public void addListener(AListener listener) {
        //Запоминаем listener
    }

    public void doSomething(){
        //Делаем что-то о чем требуется оповестить всех слушателей
        for( int i = 0; i < listeners.length; i++ ) {
            listeners[i].doEvent(); //class A не знает кто его слушает
        }
    }
}

class B implements AListener {
    public void doEvent(){
        //Что-то случилось в классе A
    }
}