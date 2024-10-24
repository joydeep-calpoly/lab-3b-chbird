import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {

@Test
public void testGetDatabaseID() {
    
    Database mockDatabase = Mockito.mock(Database.class);
    
    Mockito.when(mockDatabase.getUniqueId()).thenReturn(123);
    
    Service service = new Service(mockDatabase);
    
    String expected = "Using database with id: 123";
    String actual = service.getDatabaseID();
    
    assertEquals(expected, actual);
    
    Mockito.verify(mockDatabase).getUniqueId();
}
}
