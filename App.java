public abstract class App {
    private MenuFile appFile = new MenuFile();
    private Applications type;

    public IDocument ClickFileOpen()
    {
        return appFile.Open(type.typoOf);
    }

    public IDocument ClickFileNew()
    {
        return appFile.New(type.typoOf);
    }

    public void ClickFileSave()
    {
        appFile.Save();
    }

    public void ClickFileExit()
    {
        appFile.Exit();
    }
}
