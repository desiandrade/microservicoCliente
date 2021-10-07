package br.com.mybank.cliente.cliente.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@AllArgsConstructor
@Slf4j
public class RabbitMQService {

    private static final String EMAIL_SERVICE = "emailService" ;
    private final RabbitTemplate rabbitTemplate;

        private final ObjectMapper objectMapper;

            @CircuitBreaker(name = "cliente")
            public void enviaMensagem(String nomeFila, Object mensagem){
            try {
                String mensagemJson = this.objectMapper.writeValueAsString(mensagem);
                System.out.println(mensagemJson);
                Message msgfinal = MessageBuilder.withBody(mensagemJson.getBytes()).setContentType("application/json").build();
                this.rabbitTemplate.convertAndSend(nomeFila, msgfinal);
                log.info("conexão com serviço de e-mails feita com sucesso");
            } catch (Exception e){
                e.printStackTrace();
                log.error("erro ao conectar com o serviço de e-mails");
            }
        }
}
