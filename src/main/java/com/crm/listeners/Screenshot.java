package com.crm.listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.baseClass.BaseClass;

public class Screenshot extends BaseClass implements ITestListener {
	ExtentReports report;
	ExtentSparkReporter spark;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		Reporter.log(testName + " is executed");
		test = report.createTest(testName);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		test.log(Status.PASS, testName + " is success");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		String testName = result.getMethod().getMethodName();
		test.log(Status.FAIL, testName + " is failure");
		TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(screenshot);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		test.log(Status.SKIP, testName + " is skipped");

	}

	@Override
	public void onStart(ITestContext context) {

		spark = new ExtentSparkReporter("./Reports/ViewLockedMessage.html");
		spark.config().setDocumentTitle("SampleReport");
		spark.config().setReportName("Vaibhav");
		spark.config().setTheme(Theme.DARK);

		report = new ExtentReports();
		report.setSystemInfo("Os", "Window-10");
		report.attachReporter(spark);

	}

	@Override
	public void onFinish(ITestContext context) {

		report.flush();
	}

}
