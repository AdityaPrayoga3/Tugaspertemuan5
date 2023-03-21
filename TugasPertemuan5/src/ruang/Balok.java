/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;
import bidang.Persegipanjang;
/**
 *
 * @author Lenovo
 */
public class Balok extends Persegipanjang implements Ruang {
    double tinggi;
    public Balok(double panjang, double lebar, double tinggi){
    super(panjang, lebar);
    this.tinggi = tinggi;}

    @Override
    public double menghitungluaspermukaan() {
    return 2*((lebar*tinggi)+(panjang*tinggi)+menghitungluas());
    }

    @Override
    public double menghitungvolume() {
    return menghitungluas()*tinggi;    
    }
    
}
