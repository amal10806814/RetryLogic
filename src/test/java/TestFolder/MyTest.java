package TestFolder;

import Analyzer.RetryAnalyzer;
import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

// @Test level , retry logic uisng IRetryAnalyzer

public class MyTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void Test1()
    {
        Assert.assertEquals(false,  true );
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void Test2()
    {
        Assert.assertEquals(false, true);
    }

}
