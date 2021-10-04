//package br.com.mybank.cliente.cliente.config;
//
//import lombok.AllArgsConstructor;
//import org.springframework.amqp.core.AmqpAdmin;
//import org.springframework.amqp.core.Queue;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
//
//@Component
//@AllArgsConstructor
//public class RabbitMQConnection {
//
//    private final AmqpAdmin amqpAdmin;
//
//    private Queue fila(String nomeFila){
//        return new Queue(nomeFila, true, false, false);
//    }
//
//
//
//    @PostConstruct
//    private void adiciona(){
//        Queue filaEmail = this.fila("ms-mail");
//
//        this.amqpAdmin.declareQueue(filaEmail);
//
//    }
//
//
//
//}
