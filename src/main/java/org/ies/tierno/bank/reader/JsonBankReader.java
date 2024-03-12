package org.ies.tierno.bank.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.ies.tierno.bank.model.Bank;

import java.io.File;

public class JsonBankReader implements Reader<Bank> {
    @Override
    public Bank read() {
        ObjectMapper om = new ObjectMapper();
        try {
            Bank bank = om
                    .readValue(
                            new File(getClass().getResource("/data.json").toURI()),
                            Bank.class
                    );
            return bank;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
