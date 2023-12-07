package com.ebanking.master;

import org.testng.annotations.Test;

public class BranchNg extends Base
{
    @Test
	public void Br() throws InterruptedException 
	{
		LB.BranchCre("Mqsysy","Sr Nagar","12345","INDIA","GOA","GOA");
	}
	
}
