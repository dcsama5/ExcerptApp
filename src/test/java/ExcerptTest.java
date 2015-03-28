import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.excerpt.main.Excerpt;
import com.excerpt.main.ExcerptSpitterDAO;
import org.springframework.test.annotation.Rollback;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ameer
 */
public class ExcerptTest extends BaseTest{
	
	@Autowired
	private ExcerptSpitterDAO dao;
	
	@Test
	public void testRetrieveByDate() {
		List<Excerpt> list = dao.retrieveByDate("PUA");
		for(Excerpt e : list)
			System.out.println(e.getDate());
	}
        
        @Test
        public void testCreateExcerpt() {
            Excerpt e = new Excerpt();
            e.setAccount("AMEER");
            e.setDate();
            e.setExcerpt("Blah111");
            e.setLink("blah");
            e.setComments("blah");
            dao.addExcerpt(e);
        }
        
        @Test
        @Rollback(false)
        public void updateExcerpt() {
            Excerpt exc = dao.get("Blah111");
            callme(exc);
            //dao.updateExcerpt(exc);
        }
        
        @Test
        public void testLoad() {
            Excerpt excerpt = new Excerpt();
            dao.load("11", excerpt);
            excerpt.setDate();
            System.out.println(excerpt.getDate().toString()+"HIYA");
        }

    private void callme(Excerpt exc) {
        exc.setAccount("firas");    }
    
}
