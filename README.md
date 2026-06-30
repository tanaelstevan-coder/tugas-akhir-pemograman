# package Ternak;
public class DataTernak{
 private String kode,jenis,kondisi;
 private int jumlah;
 public DataTernak(String kode,String jenis,int jumlah,String kondisi){
 this.kode=kode;this.jenis=jenis;this.jumlah=jumlah;this.kondisi=kondisi;}
 public String getKode(){return kode;}
 public String getJenis(){return jenis;}
 public int getJumlah(){return jumlah;}
 public String getKondisi(){return kondisi;}
 public void setJenis(String v){jenis=v;}
 public void setJumlah(int v){jumlah=v;}
 public void setKondisi(String v){kondisi=v;}
 public String toString(){return kode+" | "+jenis+" | "+jumlah+" | "+kondisi;}
}

package Ternak;

import java.util.*;import java.io.*;
public class Main{
 static ArrayList<DataTernak> data=new ArrayList<>();
 static Scanner in=new Scanner(System.in);
 static final String FILE="data_peternakan_241011401252.txt";
 public static void main(String[]a){muat();int p;
 do{
 System.out.println("\n1.Tambah\n2.Tampil\n3.Ubah\n4.Hapus\n5.Cari\n6.Simpan\n7.Muat\n0.Keluar");
 try{p=Integer.parseInt(in.nextLine());}catch(Exception e){p=-1;}
 switch(p){
 case 1:tambah();break;case 2:tampil();break;case 3:ubah();break;
 case 4:hapus();break;case 5:cari();break;case 6:simpan();break;case 7:muat();break;
 }}while(p!=0);}
 static void tambah(){System.out.print("Kode:");String k=in.nextLine();System.out.print("Jenis:");String j=in.nextLine();System.out.print("Jumlah:");int jm=Integer.parseInt(in.nextLine());System.out.print("Kondisi:");String ko=in.nextLine();data.add(new DataTernak(k,j,jm,ko));}
 static void tampil(){for(DataTernak d:data)System.out.println(d);}
 static DataTernak f(String k){for(DataTernak d:data)if(d.getKode().equalsIgnoreCase(k))return d;return null;}
 static void ubah(){System.out.print("Kode:");DataTernak d=f(in.nextLine());if(d!=null){System.out.print("Jenis:");d.setJenis(in.nextLine());System.out.print("Jumlah:");d.setJumlah(Integer.parseInt(in.nextLine()));System.out.print("Kondisi:");d.setKondisi(in.nextLine());}}
 static void hapus(){System.out.print("Kode:");DataTernak d=f(in.nextLine());if(d!=null)data.remove(d);}
 static void cari(){System.out.print("Kode:");DataTernak d=f(in.nextLine());System.out.println(d==null?"Tidak ada":d);}
 static void simpan(){try(PrintWriter pw=new PrintWriter(new FileWriter(FILE))){for(DataTernak d:data)pw.println(d.getKode()+";"+d.getJenis()+";"+d.getJumlah()+";"+d.getKondisi());System.out.println("Tersimpan");}catch(Exception e){System.out.println(e);}}
 static void muat(){data.clear();try(BufferedReader br=new BufferedReader(new FileReader(FILE))){String l;while((l=br.readLine())!=null){String[] s=l.split(";");if(s.length==4)data.add(new DataTernak(s[0],s[1],Integer.parseInt(s[2]),s[3]));}}catch(Exception e){}}
}
package Ternak;

import java.util.*;import java.io.*;
public class Main{
 static ArrayList<DataTernak> data=new ArrayList<>();
 static Scanner in=new Scanner(System.in);
 static final String FILE="data_peternakan_241011401252.txt";
 public static void main(String[]a){muat();int p;
 do{
 System.out.println("\n1.Tambah\n2.Tampil\n3.Ubah\n4.Hapus\n5.Cari\n6.Simpan\n7.Muat\n0.Keluar");
 try{p=Integer.parseInt(in.nextLine());}catch(Exception e){p=-1;}
 switch(p){
 case 1:tambah();break;case 2:tampil();break;case 3:ubah();break;
 case 4:hapus();break;case 5:cari();break;case 6:simpan();break;case 7:muat();break;
 }}while(p!=0);}
 static void tambah(){System.out.print("Kode:");String k=in.nextLine();System.out.print("Jenis:");String j=in.nextLine();System.out.print("Jumlah:");int jm=Integer.parseInt(in.nextLine());System.out.print("Kondisi:");String ko=in.nextLine();data.add(new DataTernak(k,j,jm,ko));}
 static void tampil(){for(DataTernak d:data)System.out.println(d);}
 static DataTernak f(String k){for(DataTernak d:data)if(d.getKode().equalsIgnoreCase(k))return d;return null;}
 static void ubah(){System.out.print("Kode:");DataTernak d=f(in.nextLine());if(d!=null){System.out.print("Jenis:");d.setJenis(in.nextLine());System.out.print("Jumlah:");d.setJumlah(Integer.parseInt(in.nextLine()));System.out.print("Kondisi:");d.setKondisi(in.nextLine());}}
 static void hapus(){System.out.print("Kode:");DataTernak d=f(in.nextLine());if(d!=null)data.remove(d);}
 static void cari(){System.out.print("Kode:");DataTernak d=f(in.nextLine());System.out.println(d==null?"Tidak ada":d);}
 static void simpan(){try(PrintWriter pw=new PrintWriter(new FileWriter(FILE))){for(DataTernak d:data)pw.println(d.getKode()+";"+d.getJenis()+";"+d.getJumlah()+";"+d.getKondisi());System.out.println("Tersimpan");}catch(Exception e){System.out.println(e);}}
 static void muat(){data.clear();try(BufferedReader br=new BufferedReader(new FileReader(FILE))){String l;while((l=br.readLine())!=null){String[] s=l.split(";");if(s.length==4)data.add(new DataTernak(s[0],s[1],Integer.parseInt(s[2]),s[3]));}}catch(Exception e){}}
}
