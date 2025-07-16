package net.engineeringdigest.journalApp.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@Document(collection = "journal_entries")
@Data
// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
// @ToString
// @EqualsAndHashCode
// @Builder
 
public class JournalEntry {

    @Id
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;
    // public LocalDateTime getDate() {
    //     return date;
    // }
    // public void setDate(LocalDateTime date) {
    //     this.date = date;
    // }
    // public ObjectId getId() {
    //     return id;
    // }
    // public void setId(ObjectId id) {
    //     this.id = id;
    // }
    // public String getTitle() {
    //     return title;
    // }
    // public void setTitle(String title) {
    //     this.title = title;
    // }
    // public String getContent() {
    //     return content;
    // }
    // public void setContent(String content) {
    //     this.content = content;
    // }


}
