package dao;

import model.Tweet;

import java.util.List;
import java.util.Optional;

public class TweetDAO implements  GenericDAO<Tweet> {
    @Override
    public Optional<Tweet> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Tweet> getAll() {
        return null;
    }

    @Override
    public void save(Tweet tweet) {

    }

    @Override
    public void update(Tweet tweet, String[] params) {

    }

    @Override
    public void delete(Tweet tweet) {

    }
}
