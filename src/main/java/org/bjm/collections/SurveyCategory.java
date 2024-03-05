package org.bjm.collections;

import org.bson.types.ObjectId;

/**
 *
 * @author singh
 */
public class SurveyCategory {
    
    private ObjectId _id;
    private String type;
    private String subtype;
    private String description;

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
