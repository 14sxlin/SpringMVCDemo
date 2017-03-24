package spittr.data;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sparr on 2017/3/21.
 */
@Component
public class MockSpittleRepository implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> list = new ArrayList<>();
        for(int i=0; i<count; i++)
            list.add(new Spittle("spittle_"+i,new Date()));
        return list;
    }
}
