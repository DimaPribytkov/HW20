public class Main {
    public static void main(String[] args) {
    Musician musician = new Musician();

    Piano piano = new Piano();
    Guitar guitar = new Guitar();
    Flute flute = new Flute();

    musician.performe(piano);
    musician.performe(guitar);
    musician.performe(flute);
    }
}