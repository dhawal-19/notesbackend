package com.mindsparx.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mindsparx.springboot.entity.Note;
import com.mindsparx.springboot.repository.NotesRepository;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NotesController {
		@Autowired
		NotesRepository nRepo;
		
		@GetMapping("/notes")
		public ResponseEntity<List<Note>> readNotes(){
			
			return new ResponseEntity<List<Note>>(nRepo.findAll(),HttpStatus.OK);
			
		}
}
