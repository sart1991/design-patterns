package com.designpatterns.learn.domains.prototype;

import com.designpatterns.learn.domains.DesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ProtoItem implements GenericCloneable<ProtoItem>, DesignPattern {

    private List<String> list = new ArrayList<>();

    private String text = "text";

    private ProtoItem() {}

    @Override
    public ProtoItem genericClone() {
        try {
            ProtoItem pi = (ProtoItem) super.clone();
            pi.list = new ArrayList<>(pi.list);
            return pi;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getListStorageId() {
        return ProtoItem.class.getSimpleName() + "@list@" + System.identityHashCode(list);
    }

    public String getTextStorageId() {
        return ProtoItem.class.getSimpleName() + "@text@" + System.identityHashCode(text);
    }

    @Override
    public String describe() {
        return "Creational -> Prototype";
    }

    public static class Factory {

        private static ProtoItem protoItem;

        private Factory() {}

        public static ProtoItem create() {
            ProtoItem newProto;
            if (protoItem == null) {
                protoItem = new ProtoItem();
                newProto = protoItem;
            } else {
                newProto = protoItem.genericClone();
            }
            return newProto;
        }

    }



}
