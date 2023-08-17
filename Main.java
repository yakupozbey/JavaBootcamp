package ucuncuÖdev;

import ucuncuÖdev.business.CategoryManager;
import ucuncuÖdev.business.CourseManager;
import ucuncuÖdev.business.InstructorManager;
import ucuncuÖdev.core.logger.BaseLogger;
import ucuncuÖdev.core.logger.DataBaseLogger;
import ucuncuÖdev.core.logger.FileLogger;
import ucuncuÖdev.core.logger.MailLogger;
import ucuncuÖdev.dataaccess.hibarnateDao.HibarnateCategoryName;
import ucuncuÖdev.dataaccess.jdbcDao.JdbcCategoryDao;
import ucuncuÖdev.dataaccess.jdbcDao.JdbcCourseDao;
import ucuncuÖdev.dataaccess.jdbcDao.JdbcInstructorDao;
import ucuncuÖdev.entities.Category;
import ucuncuÖdev.entities.Course;
import ucuncuÖdev.entities.Instructor;

public class Main {
	//COURSE VE CATEGORY İSMİ TEKRAR EDEMEZ KODUNU YAZAMADIM. DİSCORDAN YARDIM AL!!!!

	public static void main(String[] args) throws Exception {
		BaseLogger[] loggers = { new FileLogger(), new MailLogger(), new DataBaseLogger() };
		System.out.println("*************");

		Course course1 = new Course("Java", 150);
		Course course2 = new Course("C#", 150);
		Course[] courses = { course1, course2 };

		

		

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), courses, loggers);
		courseManager.add(course1);
		courseManager.prise(course1);
		courseManager.add(course2);
		courseManager.prise(course2);
		
		System.out.println("*************");
		Category category = new Category("Programlama", 1);

		CategoryManager categoryManager = new CategoryManager(new HibarnateCategoryName(), loggers);
		categoryManager.add(category);

		System.out.println("*************");
		Instructor instructor = new Instructor("Engin", "Demirog");

		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor);

	}
}
