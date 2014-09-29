package domain.repositories;

import domain.entities.Book;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Deniel on 24.09.2014.
 */
@Named
@Stateless
public class BookRepository {

    @Inject
    private EntityManager entityManager;

    public Book createBook(Book book){
        entityManager.persist(book);
        return book;
    }

    public List<Book> findAllBooks(){
        List<Book> result = entityManager.createNamedQuery("findAllBooks",Book.class).getResultList();
        return result;
    }

    public Book findBookById(Long id){
        Book result = entityManager.find(Book.class,id);
        return result;
    }
}
