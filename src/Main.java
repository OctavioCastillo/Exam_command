//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HighlightManager highlightManager = new HighlightManager();

        Command addHighlight = new AddHighlightCommand(highlightManager);
        Command removeHighlight = new RemoveHighlightCommand(highlightManager);
        Command clearHighlight = new ClearHighlightCommand(highlightManager);

        EbookReader reader = new EbookReader();

        reader.setCommand(addHighlight);
        reader.executeCommand();

        reader.setCommand(removeHighlight);
        reader.executeCommand();

        reader.setCommand(clearHighlight);
        reader.executeCommand();
    }
}