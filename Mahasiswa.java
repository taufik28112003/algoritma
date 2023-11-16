package com.mycompany.ipk;

import com.mycompany.ipk.Matakuliah;
import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private ArrayList<Matakuliah> matakuliah = new ArrayList<Matakuliah>();
    void setNama (String nama){
        this.nama = nama;
    }
    void setNim(String nim){
        this.nim = nim;
    }
    void addMatakuliah (Matakuliah matakuliah){
        this.matakuliah.add(matakuliah); 
    }
    void removeMatakuliah (Matakuliah matakuliah){
        this.matakuliah.remove(matakuliah);
    }
    String getNama(){  
        return this.nama;
    }
    String getNim(){
        return this.nim;
    }
    ArrayList<Matakuliah> getMatakuliah(){
        return this.matakuliah;
    }
}

