import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class BemMeQuerTest {

    @Test
    public void retornaBemMeQuerQuandoRecebeNumeroPar() {
        BemMeQuer bemMeQuer = new BemMeQuer(); // arrange

        String result = bemMeQuer.isBemMeQuer(4); // act

        assertThat(result, is("Bem me Quer")); // assert
    }
}

//primeiro fizemos compilar
//depois fizemos ficar vermelho
//agora vamos pensar na coisa mais fácil que podemos fazer para ele passar
// agora vamos tentar refatorar, para ficar correto

// https://xp123.com/articles/3a-arrange-act-assert/

// depois posso te explicar melhor esses detalhes.

