package guru.springframework.norrisChuck.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteServiceImpl implements ChuckNorrisQuoteService{
    @Override
    public String getQuote() {
        ChuckNorrisQuotes chuckQuotes = new ChuckNorrisQuotes();
        return chuckQuotes.getRandomQuote();
    }
}
