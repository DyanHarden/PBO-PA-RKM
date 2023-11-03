/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public final class Keluarga {
    private final String nik;
    private final String nama;
    private final String jenisKelamin;
    private final String hubungan;

    public Keluarga(String nik, String nama, String jenisKelamin, String hubungan){
        this.nik = nik;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.hubungan = hubungan;
    }

    public final String getNik(){
        return nik;
    }

    public final String getNama(){
        return nama;
    }

    public final String getJenisKelamin(){
        return jenisKelamin;
    }

    public final String getHubungan(){
        return hubungan;
    }

    public final void createKeluarga(){
        try {
            String query = "INSERT INTO keluarga (NIK_Keluarga, Nama, Jenis_Kelamin, Hubungan_dengan_Almarhum) VALUES (?, ?, ?, ?)";
            Database.connect();
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, getNik());
            Database.preparedStatement.setString(2, getNama());
            Database.preparedStatement.setString(3, getJenisKelamin());
            Database.preparedStatement.setString(4, getHubungan());
            Database.preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public final void updateKeluarga(){
        try {
            String query = "UPDATE keluarga SET Nama = ?, Jenis_Kelamin = ?, Hubungan_dengan_almarhum = ? WHERE NIK_Keluarga = ?";
            Database.connect();
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, getNama());
            Database.preparedStatement.setString(2, getJenisKelamin());
            Database.preparedStatement.setString(3, getHubungan());
            Database.preparedStatement.setString(4, getNik());
            Database.preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public final void deleteKeluarga(){
        try {
            String query = "DELETE FROM keluarga WHERE NIK_Keluarga = ?";
            Database.connect();
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, getNik());
            Database.preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public final void checkNikKeluarga(String nikKeluarga){
        try {
            String query = "SELECT * FROM keluarga WHERE NIK_Keluarga = ?";
            Database.connect();
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, nikKeluarga);
            Database.resultSet = Database.preparedStatement.executeQuery();
            if(Database.resultSet.next()){
                System.out.println("NIK Keluarga sudah terdaftar!");
            }
            Database.disconnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
