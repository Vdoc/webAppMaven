package NikoBolt;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
////        MessageProvider provider = new SimpleMessageProvider();
//        MessageProvider provider = new InternetMessageProvider();
//        MessageRenderer renderer = new SimpleMessageRenderer(provider);

        MessageProvider provider = MessageFactory.getProvider();
        MessageRenderer renderer = MessageFactory.getRenderer();
        renderer.render();

        /*ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.render();
        */

        // 8
        /*ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.render();*/

        // 9
        /*ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        MessageRenderer renderer = context.getBean("simpleMessageRenderer", MessageRenderer.class);
        renderer.render();*/
/*
        // 10
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        MessageRenderer renderer = context.getBean("simpleMessageRenderer", MessageRenderer.class);
        renderer.render();*/
    }
}
