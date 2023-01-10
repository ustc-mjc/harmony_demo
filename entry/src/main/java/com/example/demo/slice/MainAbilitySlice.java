package com.example.demo.slice;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import com.example.demo.ResourceTable;
import com.example.mylibrary.JNITools;
import ohos.agp.components.Text;


public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        Text text = (Text) findComponentById(ResourceTable.Id_text_helloworld);
//         jni function
        String res = String.format("%d", JNITools.addNumber(1, 2));
        text.setText("Hello, world! JNITools: "+res);
        text.setTextSize(60);
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}