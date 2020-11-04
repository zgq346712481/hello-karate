import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Runner类编写
 *
 * 建议放在用例文件同级目录下
 *
 * 我们可以通过将Karate与JUnit4集成来运行我们的测试
 *
 * 我们将使用@CucumberOptions注解指定Feature文件的具体位置
 */

@RunWith(Karate.class)
@CucumberOptions(features = "classpath:features")

public class TestRunnerByJunit4 {

}
