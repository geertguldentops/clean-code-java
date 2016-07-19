package be.jidoka.clean.code.meaningful.names.encodings.doinstead.domain;

// Clients can not tell from the name that this is an interface, and they should not care in a good design!
public interface CarRepository {

    void save(Car car);

}
