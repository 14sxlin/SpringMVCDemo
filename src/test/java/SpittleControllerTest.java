import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import spittr.Spittle;
import spittr.data.SpittleRepository;
import spittr.web.SpittleController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sparr on 2017/3/21.
 */
public class SpittleControllerTest {

    private List<Spittle> createSpittleList(int count){
        List<Spittle> list = new ArrayList<>();
        for(int i=0; i<count; i++)
            list.add(new Spittle("spittle_"+i,new Date()));
        return list;
    }
    @Test
    public void showShowRecentSpittles() throws Exception{
        List<Spittle> expectedSpittles = createSpittleList(20);
        SpittleRepository spittleRepository = mock(SpittleRepository.class);
        when(spittleRepository.findSpittles(Long.MAX_VALUE,20))
                .thenReturn(expectedSpittles);
        SpittleController spittleController =
                new SpittleController(spittleRepository);
        MockMvc mockMvc = standaloneSetup(spittleController)
                .setSingleView(new InternalResourceView(("/WEB-INF/views/spittles.jsp")))
                .build();
        mockMvc.perform(get("/spittles"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"));
    }
}
