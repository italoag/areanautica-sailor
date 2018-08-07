package br.com.areanautica.sailor.cucumber.stepdefs;

import br.com.areanautica.sailor.SailorApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SailorApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
