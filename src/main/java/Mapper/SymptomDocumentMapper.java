package Mapper;

import document.SymptomDocument;
import domain.Symptom;

public class SymptomDocumentMapper implements Mapper<Symptom, SymptomDocument> {
    public SymptomDocument fromDomain(Symptom obj) {
        return new SymptomDocument(
                obj.getId(),
                obj.getDate(),
                obj.getTime(),
                obj.getDescription(),
                obj.getDuration()
        );
    }

    public Symptom toDomain(SymptomDocument obj) {
        return new Symptom(
                obj.getId(),
                obj.getDate(),
                obj.getTime(),
                obj.getDescription(),
                obj.getDuration()
        );
    }
}
