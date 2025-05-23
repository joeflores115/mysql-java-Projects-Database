package projects.service;

import java.util.List;

import java.util.NoSuchElementException;
import java.util.Optional;

import projects.dao.ProjectDao;
import projects.entity.Project;
import projects.exception.DbException;

//this file acts as a pass-through between the main application file
// that runs the menu (ProjectsApp.java) and the DAO file in the data layer
//(ProjectDao.java)
public class ProjectService {

	private ProjectDao projectDao= new ProjectDao();
	
	
	public Project addProject(Project project) {
		
		return projectDao.insertProject(project);
		
		
		
	}

	public void modifyProjectDetails(Project project) {
		if(!projectDao.modifyProjectDetails(project))
			{
				throw new DbException("Project with ID=" + project.getProjectId()
				+ " does not exist.");
			
			}
		
	}


	public void deleteProject(Integer projectId) {
		if(!projectDao.deleteProject(projectId))
		{
			throw new DbException("Project with ID="+projectId + " does not exist.");
		}
		
	}


	public List<Project> fetchAllProjects() {
		
		return projectDao.fetchAllProjects();
	}


	public Project fetchProjectById(Integer projectId) {
		
		return projectDao.fetchProjectById(projectId).orElseThrow(
				() -> new NoSuchElementException("Project with project ID="
						+ projectId + " does not exist."));
	}

}
