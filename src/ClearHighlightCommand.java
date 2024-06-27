public class ClearHighlightCommand implements Command{

    private HighlightManager highlightManager;

    public ClearHighlightCommand(HighlightManager highlightManager){
        this.highlightManager = highlightManager;
    }

    @Override
    public void execute(){
        highlightManager.clearHighlight();
    }
}
