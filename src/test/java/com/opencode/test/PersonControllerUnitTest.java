package com.opencode.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;



import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.TestExecutionListeners;



@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:beans.xml"})
public class PersonControllerUnitTest {
	    @Autowired
	    private volatile WebApplicationContext webApplicationContext;

	    private volatile MockMvc mockMvc;

	    @Before
	    public void before() {
	        this.mockMvc = webAppContextSetup(this.webApplicationContext).build();
	    }
	    
	    @Test
	    public void createPersonTest() throws Exception{
	    	this.mockMvc.perform(post("/person"))
	        .andExpect(status().isCreated());
	    }
	    
	    @Test
		public void getPerson() throws Exception{
			this.mockMvc.perform(get("/person/{id}", 1))
			.andExpect(status().isOk())
			.andExpect(content().contentType("application/json;charset=UTF-8"))
			.andExpect(jsonPath("$.firstname").value("John"));
		}
		
		@Test
		public void getProfile() throws  Exception{
			this.mockMvc.perform(get("/person/{id}/profile", 1))
			.andExpect(status().isOk())
			.andExpect(content().contentType("application/json;charset=UTF-8"))
			.andExpect(jsonPath("$.description").value("Profile description"));
		}
		
		@Test
		public void getAccount() throws Exception{
			this.mockMvc.perform(get("/person/{id}/account", 1))
			.andExpect(status().isOk())
			.andExpect(content().contentType("application/json;charset=UTF-8"))
			.andExpect(jsonPath("$.username").value("johnk"));
		}

}
