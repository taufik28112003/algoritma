
package com.mycompany.ipk;

public class Matakuliah {
    private String nama;
    private int sks;
    private float nilai;
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    void setSKS(int sks){
        this.sks = sks;
    }
    
    void setNilai(float nilai){
        this.nilai = nilai;
    }
    
    String getNama (){
        return this.nama;
    }
    int getSks(){
        return this.sks;
    }
    
    char getNilai(){
        if (this.nilai >= 80){
            return 'A';
        }else if (this.nilai < 80 && this.nilai >=70){
            return 'B';
        }else if (this.nilai < 70 && this.nilai >=50){
            return 'C';
        }else if (this.nilai < 50 && this.nilai >= 30){
            return 'D';
        }
        return 'E';
    }
    
}

    

