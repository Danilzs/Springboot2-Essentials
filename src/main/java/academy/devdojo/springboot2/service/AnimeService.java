package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    public List<Anime> ListAll(){

        return List.of(new Anime(1L, "One piece"), new Anime(2L, "Naruto"));
    }

}
