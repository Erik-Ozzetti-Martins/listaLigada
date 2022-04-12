package com.company.linkedList;

public interface listaDao {
    public void listarLista();
    public void pushFrontNo(No n);
    public  No search (String n );
    public boolean popFrontNo();
    public void  updatedNO (String n, Integer id);
}
