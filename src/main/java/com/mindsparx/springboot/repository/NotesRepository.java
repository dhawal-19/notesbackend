package com.mindsparx.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mindsparx.springboot.entity.Note;
@Repository
public interface NotesRepository extends JpaRepository<Note,Long>{

}
