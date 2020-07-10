package ua.com.alevel.stream.stream.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

/**
 * @author Iehor Funtusov, created 10/07/2020 - 7:27 PM
 */

@Getter
@Setter
@ToString
public class DataClassOptional {

    private Optional<Integer> integer;
    private Optional<String> string;

    public DataClassOptional() {
        this.integer = Optional.empty();
        this.string = Optional.empty();
    }
}
