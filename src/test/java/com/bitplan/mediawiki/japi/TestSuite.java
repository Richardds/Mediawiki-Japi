/**
 * Copyright (C) 2015 BITPlan GmbH
 *
 * Pater-Delp-Str. 1
 * D-47877 Willich-Schiefbahn
 *
 * http://www.bitplan.com
 * 
 */
package com.bitplan.mediawiki.japi;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Testsuite for Mediawiki-Japi
 * 
 * @author wf
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ TestIssue23.class, TestApiJaxb.class, TestAPI_Query.class,
    TestAPI_Meta.class, TestAPI_Recentchanges.class, TestAPI_Login.class,
    TestAPI_Edit.class, TestAPI_Parse.class, TestAPI_Allpages.class,
    TestProtectionMarker.class, TestUsage.class, TestCommandLine.class,
    TestGetCSV.class,TestPageTitle.class, org.wikipedia.WikiUnitTest.class })
public class TestSuite {

}
