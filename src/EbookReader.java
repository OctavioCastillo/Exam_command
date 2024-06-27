public class EbookReader {

    private Command command;

    //public EbookReader(Command command){
        //this.command = command;
    //}

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
