package at.tuwien.domain.services.iml;

import at.tuwien.domain.Joke;
import at.tuwien.domain.services.JokeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by geoHeil on 07.03.16.
 */
@Service
public class JokeServiceImpl implements JokeService {

    private static final Logger LOG = LoggerFactory.getLogger(JokeServiceImpl.class);

    @Override
    public Collection<Joke> getAllJokes() {
        return null;
    }

    @Override
    public Joke getJokeById(Integer id) {
        return null;
    }

    @Override
    public List<Joke> getBestJokes() {
        return null;
    }
}
