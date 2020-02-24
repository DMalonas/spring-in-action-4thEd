import static org.mockito.Mockito.*;

import org.junit.Test;

import sia.knightsXmlConfig.BraveKnight;
import sia.knightsXmlConfig.Quest;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
