package Chapter02.BONUS_1_SpringAndJavaRecords.src.main.java.modern.challenge.record;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Book(@JsonProperty("title") String title, 
@JsonProperty("isbn") String isbn) {}
