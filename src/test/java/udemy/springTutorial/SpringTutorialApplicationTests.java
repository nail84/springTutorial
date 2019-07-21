package udemy.springTutorial;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import udemy.springTutorial.web.i18n.I18nService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTutorialApplicationTests {

	@Autowired
	I18nService i18nService;

	@Test
	public void testI18nService() {
		String result = i18nService.getMessage("index.main.header");
		Assert.assertEquals("i18n service fail", "Начальный шаблон бутстрапа", result);
	}

}
