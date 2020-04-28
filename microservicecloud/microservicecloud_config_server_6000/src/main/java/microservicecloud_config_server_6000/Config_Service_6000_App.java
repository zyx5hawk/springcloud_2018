package microservicecloud_config_server_6000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Config_Service_6000_App {

	public static void main(String[] args) {
		SpringApplication.run(Config_Service_6000_App.class, args);
	}

}
