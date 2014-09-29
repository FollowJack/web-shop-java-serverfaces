package domain.services;

import domain.entities.Book;
import domain.repositories.BookRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Deniel on 24.09.2014.
 */
@Named
@Stateless
public class BookService {

    @Inject
    private BookRepository _repository;

    public List<Book> findAllBooks(){
        List<Book> result = _repository.findAllBooks();
        return result;
    }

    public Book findBookById(Long id){
        Book result = _repository.findBookById(id);
        return result;
    }

    public Book createBook(Book book){
        Book result = _repository.createBook(book);
        return result;
    }

}
