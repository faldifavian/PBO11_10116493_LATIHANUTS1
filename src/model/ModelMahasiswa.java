/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author faldi
 */
public class ModelMahasiswa {
    String nama;
    String nim;

    public ModelMahasiswa(String nim, String nama){
     this.nim = nim;
     this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
    
    

    
    
}
