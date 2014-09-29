package client.view.infrastructure;

import javax.inject.Named;

/**
 * Created by Deniel on 24.09.2014.
 */
@Named
public class Sites {
    public static final String NEW_BOOK = "newBook.xhtml";

    public String getNewBook(){
        return NEW_BOOK;
    }
}
