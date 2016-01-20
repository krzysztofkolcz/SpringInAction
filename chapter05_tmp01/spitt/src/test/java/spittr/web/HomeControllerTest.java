package spittr.web;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.springframework.test.web.servlet.MockMvc;

import static org.junit.matchers.JUnitMatchers.*; // for hasItem()
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import spittr.web.HomeController;
import spittr.web.SpittleController;
import spittr.data.SpittleRepository;
import spittr.data.SpitterRepository;
import spittr.Spittle;
import spittr.Spitter;

import org.springframework.web.servlet.view.InternalResourceView;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.hamcrest.Matchers.*;
import org.hamcrest.Matcher.*;

public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}
