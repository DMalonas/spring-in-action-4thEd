package sia.knightsXmlConfig;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public BraveKnight(String s) {
    }

    public void embarkOnQuest() {
        quest.embark();
    }

}