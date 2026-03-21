package com.construction.backend.service;

import com.construction.backend.model.Project;
import com.construction.backend.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectById(String id) {
        return projectRepository.findById(id);
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public void deleteProject(String id) {
        projectRepository.deleteById(id);
    }

    public Project updateProject(String id, Project project) {
        Project existingProject = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found with id: " + id));

        existingProject.setTitle(project.getTitle());
        existingProject.setDescription(project.getDescription());
        existingProject.setLongDescription(project.getLongDescription());
        existingProject.setLocation(project.getLocation());
        existingProject.setCategory(project.getCategory());
        existingProject.setServiceId(project.getServiceId());
        existingProject.setServiceTitle(project.getServiceTitle());
        existingProject.setImages(project.getImages());
        existingProject.setCompletedDate(project.getCompletedDate());

        return projectRepository.save(existingProject);
    }
}
