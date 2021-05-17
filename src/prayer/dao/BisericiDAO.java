package prayer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import prayer.helpers.DBHelper;
import prayer.pojo.Biserici;

public class BisericiDAO {

	public static ArrayList<Biserici> getBiserici() throws SQLException {

		String select = "select * from biserici";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(select);

		ArrayList<Biserici> result = new ArrayList<Biserici>();
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			String adresa = rs.getString("adresa");
			String localitate = rs.getString("localitate");
			String telefon = rs.getString("telefon");
			Biserici b = new Biserici(id, nume, adresa, localitate, telefon);
			result.add(b);
		}
		DBHelper.closeConnection();
		return result;
	}

	public static void createBiserici(Biserici b) throws SQLException {
		BisericiDAO.createBiserici(b.getNume(), b.getAdresa(), b.getLocalitate(), b.getTelefon());
	}

	public static void createBiserici(String nume, String adresa, String localitate, String telefon)
			throws SQLException {
		String insert = "insert into biserici (nume, adresa, localitate, telefon)" + "value(?,?,?,?)";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(insert);
		stmt.setString(1, nume);
		stmt.setString(2, adresa);
		stmt.setString(3, localitate);
		stmt.setString(4, telefon);
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}

	public static void updateBiserici(Biserici b) throws SQLException {

		String update = "update biserici set nume = ?, adresa=?, localitate=?, telefon=? where id = ?";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(update);
		stmt.setString(1, b.getNume());
		stmt.setString(2, b.getAdresa());
		stmt.setString(3, b.getLocalitate());
		stmt.setString(4, b.getTelefon());
		stmt.setInt(5, b.getId());
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}

	public static void deleteBiserici(Biserici b) throws SQLException {

		String delete = "delete from biserici where nume = ?";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setString(1, b.getNume());
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}

	public static void deleteBiserici(int id) throws SQLException {

		String delete = "delete from biserici where id = ?";

		Connection con = DBHelper.getConnection();

		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setInt(1, id);
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}

	public static Biserici getBisericiByID(int id) throws SQLException {
		String select = "select * from biserici where id =?";
		Connection con = DBHelper.getConnection();
		PreparedStatement stmt = con.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		Biserici result = null;
		if (rs.next()) {
			String nume = rs.getString("nume");
			String adresa = rs.getString("adresa");
			String localitate = rs.getString("localitate");
			String telefon = rs.getString("telefon");
			result = new Biserici(id, nume, adresa, localitate, telefon);
		}
		DBHelper.closeConnection();
		return result;
	}
}