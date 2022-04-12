package com.company.linkedList;

public class No {


    private No next;
    private String info;
    private Integer id;

    public No(String info, Integer id) {
        this.info = info;
        this.id = id;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    public String getInfo() {
        return this.info;
    }

    public void deleteNo() {
        this.next = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

