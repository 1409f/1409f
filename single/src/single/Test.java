﻿/**
 * 
 */
package single;

/**
 * @作者：Administrator
 * @时间：下午1:31:41
 */李祥阳
public class Test {

	private static Test test;
	private Test(){}
	public static Test getTest(){
		if(test == null)
		{
			test = new Test();
		}
		return test;
	}

}