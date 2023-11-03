/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;


public final class Almarhum {
    private final String nik;
    private final String nama;
    private final String domisili;
    private final String tanggalLahir;
    private final String tanggalMeninggal;
    private final String tempatMeninggal;
    private final String penyebabMeninggal;
    private final String tempatPemakaman;
    private final String idStaff;
    private final String nikKeluarga;
    
    public Almarhum(String nik, String nama, String domisili, String tanggalLahir, String tanggalMeninggal, String tempatMeninggal, String penyebabMeninggal, String tempatPemakaman, String idStaff, String nikKeluarga){
        this.nik = nik;
        this.nama = nama;
        this.domisili = domisili;
        this.tanggalLahir = tanggalLahir;
        this.tanggalMeninggal = tanggalMeninggal;
        this.tempatMeninggal = tempatMeninggal;
        this.penyebabMeninggal = penyebabMeninggal;
        this.tempatPemakaman = tempatPemakaman;
        this.idStaff = idStaff;
        this.nikKeluarga = nikKeluarga;
    }

    public final String getNik(){
        return nik;
    }

    public final String getNama(){
        return nama;
    }

    public final String getDomisili(){
        return domisili;
    }

    public final String getTanggalLahir(){
        return tanggalLahir;
    }

    public final String getTanggalMeninggal(){
        return tanggalMeninggal;
    }

    public final String getTempatMeninggal(){
        return tempatMeninggal;
    }

    public final String getPenyebabMeninggal(){
        return penyebabMeninggal;
    }

    public final String getTempatPemakaman(){
        return tempatPemakaman;
    }

    public final String getIdStaff(){
        return idStaff;
    }

    public final String getNikKeluarga(){
        return nikKeluarga;
    }

    public final void createAlmarhum(){
        try {
            Database.connect();
            String query = "INSERT INTO almarhum VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, getNik());
            Database.preparedStatement.setString(2, getNama());
            Database.preparedStatement.setString(3, getDomisili());
            Database.preparedStatement.setString(4, getTanggalLahir());
            Database.preparedStatement.setString(5, getTanggalMeninggal());
            Database.preparedStatement.setString(6, getTempatMeninggal());
            Database.preparedStatement.setString(7, getPenyebabMeninggal());
            Database.preparedStatement.setString(8, getTempatMeninggal());
            Database.preparedStatement.setString(9, getIdStaff());
            Database.preparedStatement.setString(10, getNikKeluarga());
            Database.preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Berhasil menambahkan data almarhum!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menambahkan data almarhum!" + e);
        }
    }
     public final boolean updateAlmarhum(){
        try {
            Database.connect();
            String query = "UPDATE almarhum SET Nama = ?, Domisili = ?, Tanggal_lahir = ?, Tanggal_meninggal = ?, Tempat_meninggal = ?, Penyebab_meninggal = ?, Tempati_pemakaman = ?, Staff_ID_staff = ?, Keluarga_NIK_Keluarga = ? WHERE NIK = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, getNama());
            Database.preparedStatement.setString(2, getDomisili());
            Database.preparedStatement.setString(3, getTanggalLahir());
            Database.preparedStatement.setString(4, getTanggalMeninggal());
            Database.preparedStatement.setString(5, getTempatMeninggal());
            Database.preparedStatement.setString(6, getPenyebabMeninggal());
            Database.preparedStatement.setString(7, getTempatPemakaman());
            Database.preparedStatement.setString(8, getIdStaff());
            Database.preparedStatement.setString(9, getNikKeluarga());
            Database.preparedStatement.setString(10, getNik());
            Database.preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Berhasil mengubah data almarhum!");
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal mengubah data almarhum!");
        }
        return false;
     }

     public final void deleteAlmarhum(){
        try {
            Database.connect();
            String query = "DELETE FROM almarhum WHERE nik = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, getNik());
            Database.preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Berhasil menghapus data almarhum!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data almarhum!");
        }
     }

     public final void readAlmarhum(){
        try {
            Database.connect();
            String query = "SELECT * FROM almarhum";
            Database.statement = Database.connection.createStatement();
            Database.resultSet = Database.statement.executeQuery(query);
            while(Database.resultSet.next()){
                System.out.println(Database.resultSet.getString("nik"));
                System.out.println(Database.resultSet.getString("nama"));
                System.out.println(Database.resultSet.getString("domisili"));
                System.out.println(Database.resultSet.getString("tanggal_lahir"));
                System.out.println(Database.resultSet.getString("tanggal_meninggal"));
                System.out.println(Database.resultSet.getString("tempat_meninggal"));
                System.out.println(Database.resultSet.getString("penyebab_meninggal"));
                System.out.println(Database.resultSet.getString("tempat_pemakaman"));
                System.out.println(Database.resultSet.getString("id_staff"));
                System.out.println(Database.resultSet.getString("nik_keluarga"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }
}
