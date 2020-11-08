package com.kejiny.demo.service;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kejiny.demo.model.Topic;
@Service
public class TopicService {
    
   private static final Object topicId = null;


Topic[] topicArr = {
   		 new Topic("Spring", "Spring framework", "Spring Description"),
   		 new Topic("Java", "Core java", "Java Description"),
   		 new Topic("Javascript", "JavaScript", "JavaScript Description")
    };
   
  
   private List<Topic> topics=new ArrayList<>(Arrays.asList(topicArr));
   
   public List<Topic> getTopics(){
	   return topics;
   }
   public Topic getTopicbyId(String topicId) {
	   for (int i=0; i<topics.size(); i++) {
		   Topic topic=topics.get(i);
		   if (topic.getId().equals(topicId)) {
			   return topic;
		   }
	   }
	   
	   return null;
   }

	public void addNewTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void deleteTopic(String topicId) {
		 topics.removeIf(topic -> topic.getId().equals(topicId));
	}
	
	public void updateTopic(String topicId, Topic newTopic) {
		 for (int i=0; i<topics.size(); i++) {
			   Topic topic=topics.get(i);
			   if (topic.getId().equals(topicId )) {
				  newTopic.setId(topicId);
				   topics.set(i, newTopic);
			   }
	}
  }
}

