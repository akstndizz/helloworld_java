package chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Greeter greeter=new Greeter();
		greeter.setFormat("%s,안녕하세요!");
		System.out.println(greeter.greet("자바"));
		/////////////////////////////////////데이터와 코드를 분리
		Greeter greeterBean=ctx.getBean("greeter",Greeter.class);
		System.out.println(greeterBean.greet("스프링"));
//		String msg=g.greet("스프링");
//		System.out.println(msg);
		ctx.close();
	}
}
