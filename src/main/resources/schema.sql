CREATE TABLE Users (
    ID INTEGER NOT NULL,
    Username VARCHAR(255) NOT NULL,
    Password VARCHAR(255) NOT NULL,
    PersonalName VARCHAR(255) NOT NULL,
    FamilyName VARCHAR(255) NOT NULL,
    RoleInTeam VARCHAR(255) NOT NULL,
    Team VARCHAR(255) NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE Teams(
    TeamName VARCHAR(255) NOT NULL,
    
);