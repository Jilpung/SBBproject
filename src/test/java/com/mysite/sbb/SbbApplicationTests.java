package com.mysite.sbb;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.mysite.sbb.question.QuestionRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {

//    @Autowired
//    private QuestionRepository questionRepository;
//    @Autowired
//    private AnswerRepository answerRepository;
    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for(int i=1; i<=300; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = "내용무";
            this.questionService.create(subject, content, null);
        }
    }

//    @Test
//    void testJpa() {
//        Optional<Answer> oa = this.answerRepository.findById(1);
//        assertTrue(oa.isPresent());
//        Answer a = oa.get();
//        assertEquals(2, a.getQuestion().getId());
//    }

//    @Test
//    void testJpa() {
//        Optional<Question> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//
//        Answer a = new Answer();
//        a.setContent("네 자동으로 생성됩니다.");
//        a.setQuestion(q);
//        a.setCreateDate(LocalDateTime.now());
//        this.answerRepository.save(a);
//    }

//    @Test
//    void testJpa() {
//        assertEquals(2, this.questionRepository.count());
//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        this.questionRepository.delete(q);
//        assertEquals(1, this.questionRepository.count());
//    }

//    @Test
//    void testJpa() {
//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        q.setSubject("수정된 제목");
//        this.questionRepository.save(q);
//    }

//    @Test
//    void testJpa() {
//        List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//        Question q = qList.get(0);
//        assertEquals("sbb가 무엇?", q.getSubject());
//    }

//    @Test
//    void testJpa() {
//        Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇?", "sbb에 대해 알고 싶습니다.");
//        assertEquals(1, q.getId());
//    }

//    @Test
//    void testJpa() {
//        Question q = this.questionRepository.findBySubject("sbb가 무엇?");
//        assertEquals(1, q.getId());
//    }

//	@Test
//	void testJpas(){
//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2, all.size());
//
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇?", q.getSubject());
//	}

//	@Test
//	void testJpa() {
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇?");
//		q1.setContent("sbb에 대해 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//
//		Question q2 = new Question();
//		q2.setSubject("스프링부트 모델 질문");
//		q2.setContent("id는 자동으로 생성?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
//	}

}
