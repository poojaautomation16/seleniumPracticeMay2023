package SeleniumSession;

import org.openqa.selenium.By;

public class CustomCSSConcepts {

	public static void main(String[] args) {
		//if there is an id--> #id  #input-email
		// tag#id  input#input-email
		
		//class --> .class   input.form-control
		//tagname.class
		//input.form-control.private-form__control.login-email
		//By.cssSelector(input.form-control)
		//input.login-email
		
		
		//id and class
		//#id.class  #username.login-email
		//.class#id   .login-email#username
		//tag#id.class  input#username.form-control.private-form__control.login-email
		//input.form-control.private-form__control.login-email#username
		
		
		//other attribute:
		// tagname[attr='value']  input[type='email'] css  input[@type='email'] xapth
		//input[id='input-email']
		
		//more than 1 attribute:
		//tagname [attr1='value'] [attr2='value'][attr3='value']
		
		//input[type][name][placeholder]
		//[id]--css --give all the element which have id
		//*[@id] --xapth--give all the element which have id
		
		//text in css : not supported 
		
		//contains in css: (*)
		//tagname[att*='value']  input[placeholder*='Address']--css
		//input[contains(@placeholder,'Address')]
		//input[contains(@placeholder,'Address')][id='input-email']
		
		//starts with in css: (^)
		//css--input[placeholder^='E-Mail']  xapth--//input[starts-with(@placeholder,'E-Mail')]
		
		//ends with in css:($)
		//css--input[placeholder$='Address']  xapth-- //input[ends-with(@placeholder,'Address')] it has been removed, not supported
		
		//parent to child:(>)
		//select#Form_getForm_Country > option --direct child element
		//select#Form_getForm_Country option -- direct and indirect elements
		//form > div -- 8 child divs(direct only
		//form div  -- 22child divs(both direct and indirect childs)
		
		//child to parent: does not support.
		//child to grandparent: does not support.
		//preceding-sibling: does not support.
		
		//following-sibling : yes
		//label[for='input-email'] + input --immediate following siblings
		//label[for='input-email'] ~ input -- all following sibling
		
		//indexing concepts in css:
		//select#Form_getForm_Country option:first-child
		//select#Form_getForm_Country option:last-child
		//select#Form_getForm_Country option:nth-child(5)
		//select#Form_getForm_Country option:nth-last-child(5) 5element from last (5th last element)
		//select#Form_getForm_Country option:nth-child(odd) gives all the odd elements
		//select#Form_getForm_Country option:nth-child(even) gives all even elements
		//select#Form_getForm_Country option:nth-child(n) selects all the child elements
		//select#Form_getForm_Country option:nth-child(n+4) starts from the 4th elements and go on
		//select#Form_getForm_Country option:nth-child(4n) all the child at index*4 4 8 12 16... index
		
		
		//not in css:
		//input.form-control:not(.input-lg)
		//input.form-control:not(.input-lg):not(#input-password)
		
		//comma in css:
		//input#username, button#loginBtn, input#remember, div.signup-link allows us to combine different elements in one css. we can varify all the elements using this feature(can be used for quick sanity or smoke check)
		
		
		
		

	}

}
