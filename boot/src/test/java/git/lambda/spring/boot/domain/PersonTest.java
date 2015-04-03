package git.lambda.spring.boot.domain;


import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import git.lambda.spring.boot.App;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class PersonTest {

	@Test
	public void testPerson() {
		Person p = new Person();
		p.setAge(27);
		p.setName("1ambda");
		
		assertThat(p.getAge(), equalTo(27));
		assertThat(p.getName(), equalTo("1ambda"));
	}
}
