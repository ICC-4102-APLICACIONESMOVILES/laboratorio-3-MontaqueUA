package carril.ignacio.labtry123;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.Date;

/**
 * Created by Jorge on 03-04-2018.
 */
@Entity
public class Forms {
    @NonNull
    public String getFormId() {
        return formId;
    }

    public void setFormId(@NonNull String formId) {
        this.formId = formId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    @NonNull
    @PrimaryKey
    private String formId;
    private Date date;
    private String category;
    private String commentary;

    public Forms (){

    }

}
