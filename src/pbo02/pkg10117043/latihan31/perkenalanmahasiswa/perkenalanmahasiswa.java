/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan31.perkenalanmahasiswa;

/**
 * NAMA       : YUSRIZAL FALAHAN
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi perkenalan diri
 * @author Acer
 */
public class perkenalanmahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        mahasiswa mhs = new mahasiswa();
        mhs.nim = "10110269 \n";
        mhs.nama = "Rizki Adam Kurniawan \n";
        
        mahasiswa mhs2 = new mahasiswa();
        mhs2.nim = "10110270 \n";
        mhs2.nama = "Indra Tiola \n";
        
        mahasiswa mhs3 = new mahasiswa();
        mhs3.nim = "10110271 \n";
        mhs3.nama = "Robi Tanjil Genefi \n";
        
        mahasiswa mhs4 = new mahasiswa();
        mhs4.nim = "10110272 \n";
        mhs4.nama = "Muhammad Nur Awaludin \n";
       
        mhs.perkenalkandiri(mhs.nim, mhs.nama);
        mhs2.perkenalkandiri(mhs2.nim, mhs2.nama);
        mhs3.perkenalkandiri(mhs3.nim, mhs3.nama);
        mhs4.perkenalkandiri(mhs4.nim, mhs4.nama);
    }
    
}
