import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test

 @Slf4j
class PersonTest {

     private Person person = null;

    @Before
    public void init(){
        person = new Person();

        person.setId(1);
        person.setName("LiSi");
    }

    @Test
    public void test(){

        Assert.assertEquals("Hello!",person.say());
    }
}
