package andrei.dev;

import andrei.dev.config.AppConfig;
import andrei.dev.service.PlannerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PlannerService plannerService = context.getBean(PlannerService.class);
        plannerService.printConfig();

        context.close();
    }
}