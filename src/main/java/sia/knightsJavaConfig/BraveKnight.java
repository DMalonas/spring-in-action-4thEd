package sia.knightsJavaConfig;

import org.aspectj.lang.annotation.Pointcut;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public BraveKnight(String s) {
    }

    @Pointcut("execution(* embarkOnQuest(..))")
    public void embarkOnQuest() {
        quest.embark();
    }

}