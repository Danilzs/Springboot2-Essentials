package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//Representa o que temos como banco de dados.
public class Anime {
    private Long id;
    private String name;

}
