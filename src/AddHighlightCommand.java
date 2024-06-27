public class AddHighlightCommand implements Command{

    private HighlightManager highlightManager;

    public AddHighlightCommand(HighlightManager highlightManager){
        this.highlightManager = highlightManager;
    }

    @Override
    public void execute(){
        highlightManager.addHighlight();
    }
}
