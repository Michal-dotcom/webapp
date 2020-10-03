package dao;

import model.AppUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AppUserDAO implements GenericDAO<AppUser> {

    List<AppUser> users = new ArrayList<>();


    @Override
    public Optional<AppUser> get(long id) {
        return Optional.of(users.get((int) id));
    }

    @Override
    public List<AppUser> getAll() {
        return users;
    }

    @Override
    public void save(AppUser appUser) {
        users.add(appUser);
    }

    @Override
    public void update(AppUser appUser, String[] params) {

    }

    @Override
    public void delete(AppUser appUser) {
        users.remove(appUser);
    }
}
