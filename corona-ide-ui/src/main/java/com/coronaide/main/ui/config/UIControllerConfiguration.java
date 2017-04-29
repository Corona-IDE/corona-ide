package com.coronaide.main.ui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coronaide.core.service.IProjectService;
import com.coronaide.core.service.IWorkspaceService;
import com.coronaide.main.ui.controller.SimpleController;

/**
 * Since we replace the JavaFX FXMLLoader's dependency master with Spring, we need to manually configure our controller
 * classes
 * 
 * @author nickavv
 * @since 0.1
 */
@Configuration
public class UIControllerConfiguration {

    @Bean
    public SimpleController simpleController(IWorkspaceService workspaceService, IProjectService projectService) {
        return new SimpleController(workspaceService, projectService);
    }

}
