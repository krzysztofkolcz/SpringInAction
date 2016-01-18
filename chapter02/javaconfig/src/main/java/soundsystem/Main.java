package soundsystem;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) throws Exception {
    ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
    CDPlayer player = context.getBean(CDPlayer.class);
    context.close();
  }
}
