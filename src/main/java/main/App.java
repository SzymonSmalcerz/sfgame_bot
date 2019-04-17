package main;

import java.io.IOException;

import database.DAO;

public class App {

	public static void main(String[] args) {
		try {
			DAO dao = DAO.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
