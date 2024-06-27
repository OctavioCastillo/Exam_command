public class RemoveHighlightCommand implements Command{

    private HighlightManager highlightManager;

    public RemoveHighlightCommand(HighlightManager highlightManager){
        this.highlightManager = highlightManager;
    }

    @Override
    public void execute(){
        highlightManager.removeHighlight();
    }
}
