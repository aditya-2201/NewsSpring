package org.tejas.NewsAggregator.controller;

import com.stackroute.NewsAggregator.*;
import com.stackroute.NewsAggregator.domain.NewsModel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NewsControllerTest {

    String user1;

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    NewsModel newsModel;
    

    @Before
    public void setUp() throws Exception {
        
    }
    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }

    @After
    public void tearDown() throws Exception {
    }

    /*@Test
    public void testSaveUser() throws Exception {

        HttpEntity<NewsModel> entity = new HttpEntity<NewsModel>(newsModel, headers);
        ResponseEntity<NewsModel> response = restTemplate.exchange(
                createURLWithPort(""),
                HttpMethod.POST, entity, NewsModel.class);
        assertNotNull(response);
        NewsModel actual = response.getBody();
        System.out.println(actual);
        assertEquals("User saved successfully",actual);
    }

    @Test
    public void testList() throws Exception {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<NewsModel> response = restTemplate.exchange(
                createURLWithPort(""),
                HttpMethod.GET, entity, NewsModel.class);
        assertNotNull(response);

    }*/
    @Test
    public void testGetUser() throws Exception {

    }
    @Test
    public void testUpdateUser() throws Exception {

    }

    @Test
    public void testDeleteUser() throws Exception {

    }

}