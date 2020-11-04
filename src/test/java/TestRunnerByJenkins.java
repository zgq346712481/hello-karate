
import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * 借助于jenkins完成自动化测试并且jenkins提供插件cucumber-reports可以展示可读性强的自动化测试报告
 * jenkins中cucumber-reports配置请参考网络资源
 */
@RunWith(Karate.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"},
    features = "classpath:features",
    glue = {"classpath:com.youlu.api"}
)

public class TestRunnerByJenkins   {
}
