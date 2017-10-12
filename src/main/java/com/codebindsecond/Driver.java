package com.codebindsecond;

import java.util.ArrayList;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import com.codebind.Cours_Programmes2;
import com.codebind.Module;
import com.codebind.Student;

public class Driver {

		  public static void main(String[] args) {
			  
			  Student stu1 = new Student("Ronan", "18/08/96",21);
			  Student stu2 = new Student("John", "08/12/96",20);
			  Student stu3 = new Student("Paul", "02/10/96",20);

			  ArrayList<Student> s = new ArrayList<Student>();
			  s.add(stu1);
			  s.add(stu2);
			  s.add(stu3);
			 
			  Module mod1 = new Module("System on Chip","EE415",s );
			  Module mod2 = new Module("Digital Signal Processing","EE445",s );
			  
			  ArrayList<Module> m = new ArrayList<Module>();
			  m.add(mod1);
			  m.add(mod2);
			  
			DateTimeFormatter start = DateTimeFormat.forPattern("MM/dd/yyyy");
			DateTimeFormatter end = DateTimeFormat.forPattern("MM/dd/yyyy");

			
			Cours_Programmes2 cp1 = new Cours_Programmes2("Electronic and Computer Engineering", m, start.parseDateTime("09/01/2017"),end.parseDateTime("05/15/2018"));
			
			System.out.println("The Course Programme " + " " + cp1.getCourseName()+ " is "+"\nStarting "+cp1.getStartDate().toDate()+"\nEnding "+cp1.getEndDate().toDate());
			System.out.print("\n" +"Modules offered by "+cp1.getCourseName()+" are: ");
			
			for(int i=0;i<m.size();i++){
				System.out.println("\n" + m.get(i).getModuleName()+ "\n" );
			}
				System.out.println("Students enrolled for this module are:");
				for(int j=0;j<s.size();j++){
				System.out.println(s.get(j).getName());
				}
			}
		  }

			
			
		  
