package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuctionController {

    private AuctionDao auctionDao;

    public AuctionController() {
        this.auctionDao = new MemoryAuctionDao();
    }

    @RequestMapping(path = "/auctions", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(required = false) String title_like, @RequestParam(required = false) Double currentBid_lte) {
        if (title_like != null && currentBid_lte == null) {
            return auctionDao.getAuctionsByTitle(title_like);
        } else if (currentBid_lte != null && title_like == null) {
            return auctionDao.getAuctionsByMaxBid(currentBid_lte);
        } else if (currentBid_lte != null && title_like != null) {
            return auctionDao.getAuctionsByTitleAndMaxBid(title_like, currentBid_lte);
        } else {
            return auctionDao.getAuctions();
        }
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

}