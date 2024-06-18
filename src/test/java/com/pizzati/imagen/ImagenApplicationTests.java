package com.pizzati.imagen;

import com.pizzati.imagen.entity.ClientesResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

@SpringBootTest
class ImagenApplicationTests {

	@Test
	void contextLoads() {
	}

//	public static Resource getTestFile() throws IOException {
////		String fileName = "C:\\patito\\imagen\\patito.png";
////		File file = new File(fileName);
//
//        Path testFile = Files.createTempFile("test-file", ".txt");
//        System.out.println("Creating and Uploading Test File: " + testFile);
//        Files.write(testFile, "Hello World !!, This is a test file.".getBytes());
//        return new FileSystemResource(testFile.toFile());
//		return new FileSystemResource(file);
//	}

	@Test
	void pruevaEnvio(){
		String fileName = "C:\\patito\\imagen\\patito.png";
		File file = new File(fileName);
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.MULTIPART_FORM_DATA);
			MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();

			body.add("file", new FileSystemResource(file));
			body.add("id", 999);

			HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);

			String serverUrl = "http://localhost:9090/";
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> response = restTemplate.postForEntity(serverUrl, requestEntity, String.class);
			System.out.println(response.getBody());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

	@Test
	void obtenerCliente(){
		try{
			String parametros = String.format("?id=%d",1L);
			String serverUrl = "http://localhost:9095/clientes/bcliente"+parametros;
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<ClientesResponse> response = restTemplate.getForEntity(serverUrl, ClientesResponse.class);
			System.out.println(response.getStatusCode());
			System.out.println(response.getBody());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}
