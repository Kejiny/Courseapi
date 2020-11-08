package com.kejiny.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kejiny.demo.model.Topic;
import com.kejiny.demo.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	TopicService topicService;
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getTopics();
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@GetMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id) {
		return topicService.getTopicbyId(id);
	}
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addNewTopic(topic); 
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopicById(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
	@PutMapping("topics/{id}")
	public void   updateTopic (@PathVariable String id,@RequestBody Topic topic) {
		topicService.updateTopic(id, topic);
	}
} 

