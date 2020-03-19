module NewProject {
	exports com.traficaccidentsanalysis.backend.message.response;
	exports com.traficaccidentsanalysis.backend.service;
	exports com.traficaccidentsanalysis.backend.security.services;
	exports com.traficaccidentsanalysis.backend.service.serviceimpl;
	exports com.traficaccidentsanalysis.backend.repository;
	exports com.traficaccidentsanalysis.backend.security.jwt;
	exports com.example.demo;
	exports com.traficaccidentsanalysis.backend.message.request;
	exports com.traficaccidentsanalysis.backend;
	exports com.traficaccidentsanalysis.backend.controller;
	exports com.traficaccidentsanalysis.backend.model;
	requires spring.boot.autoconfigure;
}