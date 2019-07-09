/*
 1)Create Employee class having 3 fields name as age , name and lastname.
  Generate constructor and getter/setter.
  Create LambdaDemoClass this class will create List objects of type Employees.
  Following implementation needs to be done

  a)Sort the list by lastname.
  b)print all employee whose lastname starts with ‘C’
 */
package main.stackroute.LambdaProgram;

public class Employee
{

    String name;
    String lastname;
    int age;

    public Employee(String name, String lastname, int age)
    {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
