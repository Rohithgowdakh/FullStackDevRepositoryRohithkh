package com.gentech.demo.factorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/f1")
public class Factorial {
	@GetMapping("/fact")
	public int getFact( )
	{
		int num=5;
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
			
		}
		return fact;
	}
	@GetMapping("/fact/{num}")
	public int getFact1(@PathVariable int num )
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
			
		}
		return fact;
	}
	@GetMapping("/fact2")
	public int getFact2(@RequestParam int num )
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
			
		}
		return fact;
	}
}
