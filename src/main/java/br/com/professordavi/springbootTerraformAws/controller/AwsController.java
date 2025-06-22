package br.com.professordavi.springbootTerraformAws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.sqs.AmazonSQSAsync;

@RestController
@RequestMapping("/aws/s3")
public class AwsController {
	
	@Autowired
	private AmazonS3 amazonS3;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private AmazonSQSAsync sqs;
	
	@PostMapping("/note")
	public void note(@RequestParam String name, @RequestParam String content) {
		//Bucket bucket = amazonS3.createBucket("testecriarbucket999");
		//amazonS3.putObject(bucket.getName(), name + ".txt", content);
		//amazonS3.putObject("arquivoswalyson", name + ".txt", content);
		// vamos salvar no banco ao inves do S3
		
		new QueueMessagingTemplate(sqs).convertAndSend("nota_QUEUE", content);
		
		//jdbcTemplate.update("insert into nota (nome, conteudo) values (?,?)", name, content);
	}
	
	@SqsListener("nota_QUEUE")
	public void consumir(String message) {
		System.out.println("oi pessoal" + message);
	}

}
