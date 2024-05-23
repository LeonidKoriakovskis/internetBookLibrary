package com.spring.internetBookLibrary.controller;

import com.spring.internetBookLibrary.model.Book;
import com.spring.internetBookLibrary.service.BookService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/book")
@EnableAutoConfiguration
public class BookController {
    final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/list")
    public String listBooks(Model theModel) {
        // get employees from db
        List<Book> theBooks = bookService.findAll();
        // add to the spring model
        theModel.addAttribute("books", theBooks);
        return "list-book";
    }
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        // create model attribute to bind form data
        Book theBook = new Book();
        theModel.addAttribute("books", theBook);
        return "book-form";
    }


    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("bookId") int theID, Model theModel) {
        //get the book from the service
        Book theBook = bookService.findById(theID);
        //set book as a model attribute to pre-populate the form
        theModel.addAttribute("books", theBook);
        return "book-form";
    }
    @PostMapping("/save")
    public String saveBook(@ModelAttribute("books") Book theBook) {
        // save the book
        bookService.save(theBook);
        // use a redirect to prevent duplicate submissions
        return "redirect:/book/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("bookId") int theId) {
        // delete the book
        bookService.deleteById(theId);
        return "redirect:/book/list";
    }

    @GetMapping("/search")
    public String findBookByName(Model model, @Param("keyword") String keyword){
        model.addAttribute("books", bookService.findBookByName(keyword));
        return "list-book";
    }
}

