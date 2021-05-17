package prayer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import prayer.helpers.DBHelper;
import prayer.pojo.Participanti;

public class ParticipantiDAO {

	public static ArrayList<Participanti> getParticipanti() throws SQLException {

		String select = "select * from participanti";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(select);

		ArrayList<Participanti> result = new ArrayList<Participanti>();
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			String prenume = rs.getString("prenume");
			int varsta = rs.getInt("varsta");
			String telefon = rs.getString("telefon");
			Participanti p = new Participanti(id, nume, prenume, varsta, telefon);
			result.add(p);
		}
		DBHelper.closeConnection();
		return result;
	}

	public static void createParticipanti(Participanti p) throws SQLException {
		ParticipantiDAO.createParticipanti(p.getNume(), p.getPrenume(), p.getVarsta(), p.getTelefon());
	}

	public static void createParticipanti(String nume, String prenume, int varsta, String telefon) throws SQLException {
		String insert = "insert into participanti (nume, prenume, varsta, telefon)" + "value(?,?,?,?)";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(insert);
		stmt.setString(1, nume);
		stmt.setString(2, prenume);
		stmt.setInt(3, varsta);
		stmt.setString(4, telefon);
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}

	public static void updateParticipanti(Participanti p) throws SQLException {

		String update = "update participanti set nume = ?, prenume=?, varsta=?, telefon=? where id = ?";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(update);
		stmt.setString(1, p.getNume());
		stmt.setString(2, p.getPrenume());
		stmt.setInt(3, p.getVarsta());
		stmt.setString(4, p.getTelefon());
		stmt.setInt(5, p.getId());
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}

	public static void deleteParticipanti(Participanti p) throws SQLException {

		String delete = "delete from participanti where nume = ?";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setString(1, p.getNume());
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}

	public static void deleteParticipanti(int id) throws SQLException {

		String delete = "delete from participanti where id = ?";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setInt(1, id);
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}

	public static Participanti getParticipantiByID(int id) throws SQLException {
		String select = "select * from participanti where id =?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		Participanti result = null;
		if (rs.next()) {
			String nume = rs.getString("nume");
			String prenume = rs.getString("prenume");
			int varsta = rs.getInt("varsta");
			String telefon = rs.getString("telefon");
			result = new Participanti(id, nume, prenume, varsta, telefon);
		}
		DBHelper.closeConnection();
		return result;
	}
}