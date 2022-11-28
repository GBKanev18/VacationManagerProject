package com.gbkanev18.vacationmanager.controllers;

import com.gbkanev18.vacationmanager.dao.UserTeamProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserTeamProjectController {

    @Autowired
    UserTeamProjectRepository userTeamProjectRepository;


}