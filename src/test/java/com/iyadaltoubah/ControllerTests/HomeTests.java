package com.iyadaltoubah.ControllerTests;

import com.iyadaltoubah.Controllers.Home;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringJUnit4ClassRunner.class)
public class HomeTests {

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new Home())
                .setViewResolvers(new StandAloneMvcTestViewResolver())
                .build();
    }

    @Test
    public void testHomePageStatus() throws Exception {

        mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("index"));
    }
}
