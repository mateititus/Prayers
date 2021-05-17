package prayer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import prayer.helpers.DBHelper;
import prayer.pojo.Motive;

public class MotiveDAO {

	public static ArrayList<Motive> getMotive() throws SQLException {

		String select = "select * from motive";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(select);

		ArrayList<Motive> result = new ArrayList<Motive>();
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String motiv = rs.getString("motiv");
			String raspuns = rs.getString("raspuns");
			String categorie = rs.getString("categorie");
			Motive m = new Motive(id, motiv, raspuns, categorie);
			result.add(m);
		}
		DBHelper.closeConnection();
		return result;
	}

	public static void createMotive(Motive m) throws SQLException {
		MotiveDAO.createMotive(m.getMotiv(), m.getRaspuns(), m.getCategorie());
	}

	public static void createMotive(String motiv, String raspuns, String categorie) throws SQLException {
		String insert = "insert into motive (motiv, raspuns, categorie)" + "value(?,?,?)";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(insert);
		stmt.setString(1, motiv);
		stmt.setString(2, raspuns);
		stmt.setString(3, categorie);
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}

	public static void updateMotive(Motive m) throws SQLException {

		String update = "update motive set motiv = ?, raspuns=?, categorie=? where id = ?";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(update);
		stmt.setString(1, m.getMotiv());
		stmt.setString(2, m.getRaspuns());
		stmt.setString(3, m.getCategorie());
		stmt.setInt(4, m.getId());
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}

	public static void deleteMotive(Motive m) throws SQLException {

		String delete = "delete from motive where nume = ?";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setString(1, m.getMotiv());
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}

	public static void deleteMotive(int id) throws SQLException {

		String delete = "delete from motive where id = ?";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setInt(1, id);
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}

	public static Motive getMotiveByID(int id) throws SQLException {
		String select = "select * from motive where id =?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		Motive result = null;
		if (rs.next()) {
			String motiv = rs.getString("motiv");
			String raspuns = rs.getString("raspuns");
			String categorie = rs.getString("categorie");
			result = new Motive(id, motiv, raspuns, categorie);
		}
		DBHelper.closeConnection();
		return result;
	}
}