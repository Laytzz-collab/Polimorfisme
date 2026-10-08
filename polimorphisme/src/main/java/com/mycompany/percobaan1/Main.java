/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.percobaan1;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] argv){
        Pegawai p = new Pegawai();
        p = new Programmer ();
        p = new Manajer ();
        
        Manajer m = new Manajer();
        m.gajiPokok = 10000;
        m.nama = "Sai";
        m.tunjangan = 5000;
        p =m;
        p.tampilData();
        
        m.tampilData();
        
        Pegawai[] arrPeg = new Pegawai [3];
        Programmer pr = new Programmer ();
        pr.nama = "uciha"; pr.gajiPokok = 100000; pr.bonus = 120000;
        arrPeg[0] = p;
        arrPeg[1] = m;
        arrPeg[2] = new Programmer();
        arrPeg[0].tampilData();
        arrPeg[1].tampilData();
    
    
    }
    
}
