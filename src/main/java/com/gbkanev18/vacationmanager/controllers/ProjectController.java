package com.gbkanev18.vacationmanager.controllers;

import com.gbkanev18.vacationmanager.dao.ProjectRepository;
import com.gbkanev18.vacationmanager.dao.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping("/goToProjectsInfoPage")
    public String projectsInfoPage() {
        return "projectsInfo";
    }

    @RequestMapping(value = "/projectsInfo")
    public String getAllProjects(Model model) {
        model.addAttribute("Projects", projectRepository.findAll());
        return "projectsInfo";
    }
}