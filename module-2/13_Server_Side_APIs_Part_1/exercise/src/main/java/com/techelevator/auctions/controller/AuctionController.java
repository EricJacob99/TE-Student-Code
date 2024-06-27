package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class AuctionController {

    private AuctionDao auctionDao;

    public AuctionController() {
        this.auctionDao = new MemoryAuctionDao();
    }

    @RequestMapping(path = "/auctions", method = RequestMethod.GET)
    public List<Auction> list() {
        return auctionDao.getAuctions();
    }

    @RequestMapping(path = "/auctions/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        Auction auction = null;
        auction = auctionDao.getAuctionById(id);
        if (auction == null) {
            return auction;
        } else {
            return auction;
        }
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/auctions", method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction) {
        return auctionDao.createAuction(auction);
    }

    @RequestMapping(path = "/auctions?title_like={title}", method = RequestMethod.GET)
    public List<Auction> list(@PathVariable("title") String title) {
        List<Auction> auctions = auctionDao.getAuctionsByTitle(title);
        if (auctions == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Auction not found.");
        } else {
            return auctions;
        }
    }

}