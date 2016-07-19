package be.jidoka.clean.code.meaningful.names.encodings.avoid.domain;

// Don't encode the fact that this is an interface! That should be an implementation detail!
public interface ICarRepository {

    void save(Car car);

}
