/**
 * Created by sparr on 2017/3/21.
 */
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import spittr.Spittle;
import spittr.web.HomeController;

import java.util.List;

public class HomeControllerTest {

    @Test
    public void testHomeController() throws Exception{
        HomeController homeController =
                new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController)
                .build();
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.view().name("home"));
    }

}
