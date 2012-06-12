package org.jtalks.tests.jcommune.tests.topic;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.CollectionHelp;

import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.clickOnRandomBranchFromSectionPage;
import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.clickOnRandomSection;
import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.createPostsForTest;
import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.createTopicForTest;
import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.driver;
import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.logOut;
import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.postPage;
import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.signIn;

/**
 * author: erik
 */
public class JC118PaginationForRegisteredUserCountsOfPosts {
	Boolean wasValueChanged = false;
	String value;
	String topicLink;

	@BeforeMethod
	@Parameters({"app-url", "uUsername", "uPassword"})
	public void setUp(String appUrl, String username, String password) {
		driver.get(appUrl);
		signIn(username, password);
		clickOnRandomSection();
		clickOnRandomBranchFromSectionPage();
		createTopicForTest();
		topicLink = driver.getCurrentUrl();
		createPostsForTest(5, 50);
	}

	@AfterMethod
	@Parameters({"app-url", "uUsername"})
	public void back(String appUrl, String username) {
		logOut(appUrl);
	}

	@Test
	public void paginationTest() {
		driver.get(topicLink);
		if (postPage.getPostsList().size() != 5) {
			Assert.fail("Post page contains count of posts that not equals 5");
		}

		CollectionHelp.getWebElementFromCollectionByIndex(postPage.getPagesButtons(), 2).click();
		if (postPage.getPostsList().size() != 1) {
			Assert.fail("Post page contains count of posts that not equals 1");
		}
	}

}
