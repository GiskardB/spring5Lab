package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.GetterInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

	/*	System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

		System.out.println("Spring boot jokes");*/


		FakeDataSource bean = ctx.getBean(FakeDataSource.class);
		System.out.println(bean.getUser());

		FakeJmsSource beanJms = ctx.getBean(FakeJmsSource.class);
		System.out.println(beanJms.getUser());

	}
}
