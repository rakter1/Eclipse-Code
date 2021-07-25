package com.Interface;

public interface CCInter extends  FFInter,DDInte, KKInter {
	
	public static final int a = 10;
	
	public  abstract void  CC() ;

	public default  void  display() {
	System.out.println("Im implemented method with default modifier"); }
		
	
	public static   void  run() {
	System.out.println("Im implemented method with static keyword ");}
	
	private void TT() {
		System.out.println("Im implemented method with  ");}	
		
	
	
	
}
