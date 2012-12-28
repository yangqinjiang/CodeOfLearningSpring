package cn.yang.spring.junit.test1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.yang.spring.bean.ItcastClassPathXMLApplicationContext;
import cn.yang.spring.bean.PersonService;

public class SpringTest1 {

	@Test
	public void test() {
		/*fail("Not yet implemented");*/
		System.out.println("Hello,Junit!");
		//ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		ItcastClassPathXMLApplicationContext ac = new ItcastClassPathXMLApplicationContext("beans.xml");
		PersonService personService = (PersonService) ac.getBean("personBean");
		personService.save();
	}

}
