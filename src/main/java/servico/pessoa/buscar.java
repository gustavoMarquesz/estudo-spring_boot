package servico.pessoa;


import domain.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import repository.CategoriaRepository;

import java.util.Optional;

@Service

public class buscar {

    @Autowired //com essa anotação, ela se auto instancia pelo proprio spring
    private CategoriaRepository achar;


    public Pessoa find(Integer id){
        Optional<Pessoa> obj = achar.findById(id);//procurar um objeto no banco de dados pelo ID
        return obj.orElse(null);//retorno o obj/ else: null
    }



}
