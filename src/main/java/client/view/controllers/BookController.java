package client.view.controllers;

import client.view.infrastructure.Sites;
import domain.entities.Book;
import domain.services.BookService;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Deniel on 24.09.2014.
 */
@Named
@RequestScoped
public class BookController {

    @Inject
    private BookService _bookService;
    private Book book = new Book();

    public String doCreateBook(){
        _bookService.createBook(book);

        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                FacesMessage.SEVERITY_INFO,
                "Book created",
                "The book "+book.getTitle() + " has been created with id="+book.getId()));

        return Sites.NEW_BOOK;
    }

    public void doFindBookById(){
        book = _bookService.findBookById(book.getId());
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
