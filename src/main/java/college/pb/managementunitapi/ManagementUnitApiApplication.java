package college.pb.managementunitapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ManagementUnitApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementUnitApiApplication.class, args);
    }

}
