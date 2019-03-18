package com.design.pattern.observer.button;

public class Client implements OnClickListener {
    public static void main(String[] args) {
        Client client = new Client();
        client.test();
    }

    private void test(){
        RadioButton radioButton = new RadioButton("mybutton");
        radioButton.addOnClickListener(this);
        radioButton.addOnClickListener(new MyClickListener());

        radioButton.click();
    }

    @Override
    public void onclick(String name) {
        System.out.println("点击了按钮" + name);
    }
}
