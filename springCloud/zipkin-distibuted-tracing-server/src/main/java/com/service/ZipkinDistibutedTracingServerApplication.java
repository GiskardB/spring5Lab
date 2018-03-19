package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;


@EnableZipkinServer
@SpringBootApplication
public class ZipkinDistibutedTracingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinDistibutedTracingServerApplication.class, args);
	}
}
