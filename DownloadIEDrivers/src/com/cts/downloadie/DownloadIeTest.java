package com.cts.downloadie;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cts.base.LaunchWebDriver;

public class DownloadIeTest extends LaunchWebDriver
{
	@Test
	public void downloadIeDriver()
	{
		driver.findElement(By.linkText("Downloads")).click();
		driver.findElement(By.partialLinkText("32 bit Windows IE")).click();
		String username = System.getProperty("user.name");
		System.out.println(username);
		String fileDetails = "C:\\Users\\"+username+"\\Downloads\\IEDriverServer_Win32_3.150.1.zip";
		System.out.println(fileDetails);
		File file = new File(fileDetails);
		boolean check = file.exists();
		Assert.assertTrue(check, "Not Downloaded");
	}
}
