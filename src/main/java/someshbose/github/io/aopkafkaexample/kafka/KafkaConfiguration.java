package someshbose.github.io.aopkafkaexample.kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@Configuration
public class KafkaConfiguration {

  @Bean
  public ConcurrentKafkaListenerContainerFactory<String,String> kafkaListenerContainerFactory(
      ConsumerFactory<String,String> consumerFactory){

    ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
    factory.setConsumerFactory(consumerFactory);
    factory.setMessageConverter(new StringJsonMessageConverter());
    return factory;
  }
}
