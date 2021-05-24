package pl.sda.mybudget.converter;


// TODO: use mapstruct
public interface DataConverter <E, D> {
    D fromEntity (E entity);
    E fromDto (D dto);




}
