public enum Applications {

    MUSIC("MusicApplication"), IMAGE("ImageApplication"), TEXT("TextApplication");
    String typoOf;

    Applications(String typoOf)
    {
        this.typoOf = typoOf;
    }
}
