package at.tuwien.domain.services;

import at.tuwien.domain.Joke;

import java.util.Collection;
import java.util.List;

/**
 * Created by geoHeil on 07.03.16.
 */
public interface JokeService {

    public Collection<Joke> getAllJokes();

    public Joke getJokeById(Integer id);

    /**
     * @return a list of jokes ordered by the rating e.g. best jokes first
     */
    public List<Joke> getBestJokes();
}
