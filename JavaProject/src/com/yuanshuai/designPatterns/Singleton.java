package com.yuanshuai.designPatterns;

/**
 * 单例模式
 * 
 * 单例模式就是说系统中对于某类的只能有一个对象，不可能出来第二个。
 * 单例模式也是23中设计模式中在面试时少数几个会要求写代码的模式之一。主要考察的是多线程下面单例模式的线程安全性问题。
 * 
 * @author YuanShuai
 * 
 */
public class Singleton {

	private static Singleton instance;

	private Singleton() {
		
	}

	// 对获取实例的方法进行同步
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null)
					instance = new Singleton();
			}
		}
		return instance;
	}

}
