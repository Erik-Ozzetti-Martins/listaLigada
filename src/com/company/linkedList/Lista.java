package com.company.linkedList;


public class Lista implements  listaDao {

    private long size = 5;
    private No noPrincipal;

    private int count = 0;

    public Lista(Long size) {
        this.size = size;
    }

    public void listarLista() {
        No noAux = noPrincipal;
        while (noAux != null) {
            System.out.println(noAux.getInfo());
            noAux = noAux.getNext();
        }
    }

    public No getNoPrincipal() {
        return noPrincipal;
    }

    public void pushFrontNo(No n) {
        if(count >= size ) return ;
        if (this.noPrincipal == null) {
            count ++;
            this.noPrincipal = n;
        } else {
            count++;
            n.setNext(this.noPrincipal);
            this.noPrincipal = n;
        }


    }

    public  No search (String n ){
        No noAux = noPrincipal;
        while (noAux != null) {
            if (noAux.getInfo().equals(n)) return noAux;

            noAux = noAux.getNext();
        }
        return null;
    }


    public boolean popFrontNo() {
        if (this.noPrincipal == null) return false;
        if (this.noPrincipal.getNext() != null) {
            this.noPrincipal = this.noPrincipal.getNext();
            count --;
            return true;
        } else {
            count = 0;
            this.noPrincipal = null;
            return true;
        }
    }


    private No findNO(Integer n) {
        No noAux = noPrincipal;
        while (noAux != null) {
            if (noAux.getId().equals(n)) return noAux;

            noAux = noAux.getNext();
        }
        return null;
    }

    public void  updatedNO (String n, Integer id) {
        No item  =  this.findNO(id);
        if(item != null){
            item.setInfo(n);
        }
    }


//    public void removeItemNo(Integer n) {
//        No noAux = noPrincipal;
//        while (noAux.getNext() != null) {
//            if (noAux.getInfo().equals(n)) {
//                noPrincipal.setNext(noAux.getNext());
//            }
//            noAux = noAux.getNext();
//        }
//
//
//    }

}
