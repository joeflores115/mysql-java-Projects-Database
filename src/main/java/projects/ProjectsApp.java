package projects;

import projects.dao.DbConnection;
import projects.exception.DbException;

public class ProjectsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnection.getConnection();
		
	}

}
