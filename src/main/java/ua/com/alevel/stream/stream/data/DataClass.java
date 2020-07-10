package ua.com.alevel.stream.stream.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

/**
 * @author Iehor Funtusov, created 10/07/2020 - 7:20 PM
 */

@Getter
@Setter
@ToString
public class DataClass {

    private String blaBla;
    private Optional<String> blaOptional;
    private Optional<DataClassOptional> dataClassOptional;

    public DataClass() {
        blaOptional = Optional.empty();
        dataClassOptional = Optional.empty();
    }
}
